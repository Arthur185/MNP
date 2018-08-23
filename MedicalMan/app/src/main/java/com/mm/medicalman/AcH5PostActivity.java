package com.mm.medicalman;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;

import static com.mm.medicalman.Tool.MoudleUtils.NoBgWebView;

/**
 * Created by NiPing and Airr Wang
 * Copyright  © 2017年 Hyperspace Technology(Beijing)Co.,Ltd. All rights reserved.
 * 普通h5跳转
 */
public class AcH5PostActivity extends AppCompatActivity {
    private WebView webViewLicense;
    private String url = "";//加载的h5页面的网址
    private ProgressBar progressBar;
    private String urlParameter = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_h5);
        initToolbar();
        initId();
        NoBgWebView(webViewLicense);
        initGetUrl();
        initSet();
    }

    private TextView textView;

    /**
     * 页面标题
     */
    private void initToolbar() {

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        textView = (TextView) findViewById(R.id.toolbar_title);
        textView.setText("超空");
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);//显示返回键，有时需要不带返回键
            actionBar.setDisplayShowTitleEnabled(false);//不显示toolbar自带标题
        }

    }

    /**
     * 接收传递过来的url
     */
    private void initGetUrl() {
        Intent intent = getIntent();
        url = intent.getStringExtra("acurl");
        urlParameter = intent.getStringExtra("urlParameter");
    }

    /**
     * h5页面的进度条加载
     */
    private void initSet() {
        webViewLicense.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                return true;
            }
        });
        webViewLicense.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                progressBar.setVisibility(View.VISIBLE);
                progressBar.setProgress(newProgress);
                if (newProgress >= 100) {
                    progressBar.setVisibility(View.GONE);
                }
//                super.onProgressChanged(view, newProgress);
            }

            @Override
            public void onReceivedTitle(WebView view, String title) {
                textView.setText(title);//
            }
        });
        initWeb();
    }

    /**
     * 页面返回键返回操作
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {

            if (webViewLicense.canGoBack()) {
                webViewLicense.goBack();// 返回前一个页面
                return true;
            } else {
                this.finish();
            }
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * findViewById
     */
    private void initId() {

        webViewLicense = (WebView) findViewById(R.id.webViewLicense);
        progressBar = (ProgressBar) findViewById(R.id.index_progressBar);
        webViewLicense.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);

    }

    /**
     * 手机返回键方法重写返回键操作进行返回前一个h5页面
     *
     * @param keyCode
     * @param event
     * @return
     */
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && webViewLicense.canGoBack()) {
            webViewLicense.goBack();// 返回前一个页面
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    /**
     * webView的JS交互配置
     */
    @SuppressLint("SetJavaScriptEnabled")
    private void initWeb() {
        webViewLicense.setWebViewClient(new WebViewClient());
        WebSettings settings = webViewLicense.getSettings();
        settings.setJavaScriptEnabled(true);

        webViewLicense.postUrl(url,urlParameter.getBytes());

        webViewLicense.onResume();
    }
}
