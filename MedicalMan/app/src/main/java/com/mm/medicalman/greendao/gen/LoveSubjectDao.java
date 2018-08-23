package com.mm.medicalman.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.mm.medicalman.DBBean.LoveSubject;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOVE_SUBJECT".
*/
public class LoveSubjectDao extends AbstractDao<LoveSubject, String> {

    public static final String TABLENAME = "LOVE_SUBJECT";

    /**
     * Properties of entity LoveSubject.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Q_id = new Property(0, String.class, "q_id", true, "Q_ID");
        public final static Property Is_love = new Property(1, String.class, "is_love", false, "IS_LOVE");
        public final static Property Is_love_up = new Property(2, String.class, "is_love_up", false, "IS_LOVE_UP");
    }


    public LoveSubjectDao(DaoConfig config) {
        super(config);
    }
    
    public LoveSubjectDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOVE_SUBJECT\" (" + //
                "\"Q_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: q_id
                "\"IS_LOVE\" TEXT," + // 1: is_love
                "\"IS_LOVE_UP\" TEXT);"); // 2: is_love_up
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOVE_SUBJECT\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LoveSubject entity) {
        stmt.clearBindings();
 
        String q_id = entity.getQ_id();
        if (q_id != null) {
            stmt.bindString(1, q_id);
        }
 
        String is_love = entity.getIs_love();
        if (is_love != null) {
            stmt.bindString(2, is_love);
        }
 
        String is_love_up = entity.getIs_love_up();
        if (is_love_up != null) {
            stmt.bindString(3, is_love_up);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LoveSubject entity) {
        stmt.clearBindings();
 
        String q_id = entity.getQ_id();
        if (q_id != null) {
            stmt.bindString(1, q_id);
        }
 
        String is_love = entity.getIs_love();
        if (is_love != null) {
            stmt.bindString(2, is_love);
        }
 
        String is_love_up = entity.getIs_love_up();
        if (is_love_up != null) {
            stmt.bindString(3, is_love_up);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public LoveSubject readEntity(Cursor cursor, int offset) {
        LoveSubject entity = new LoveSubject( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // q_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // is_love
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // is_love_up
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LoveSubject entity, int offset) {
        entity.setQ_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setIs_love(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIs_love_up(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final String updateKeyAfterInsert(LoveSubject entity, long rowId) {
        return entity.getQ_id();
    }
    
    @Override
    public String getKey(LoveSubject entity) {
        if(entity != null) {
            return entity.getQ_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LoveSubject entity) {
        return entity.getQ_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
