package com.mm.medicalman.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.mm.medicalman.DBBean.TitleRecordProfessionalPractice;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TITLE_RECORD_PROFESSIONAL_PRACTICE".
*/
public class TitleRecordProfessionalPracticeDao extends AbstractDao<TitleRecordProfessionalPractice, String> {

    public static final String TABLENAME = "TITLE_RECORD_PROFESSIONAL_PRACTICE";

    /**
     * Properties of entity TitleRecordProfessionalPractice.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property C_id = new Property(0, String.class, "c_id", false, "C_ID");
        public final static Property Q_id = new Property(1, String.class, "q_id", true, "Q_ID");
        public final static Property S1 = new Property(2, String.class, "s1", false, "S1");
        public final static Property S2 = new Property(3, String.class, "s2", false, "S2");
        public final static Property S3 = new Property(4, String.class, "s3", false, "S3");
        public final static Property S4 = new Property(5, String.class, "s4", false, "S4");
        public final static Property S5 = new Property(6, String.class, "s5", false, "S5");
        public final static Property Is_right = new Property(7, String.class, "is_right", false, "IS_RIGHT");
    }


    public TitleRecordProfessionalPracticeDao(DaoConfig config) {
        super(config);
    }
    
    public TitleRecordProfessionalPracticeDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TITLE_RECORD_PROFESSIONAL_PRACTICE\" (" + //
                "\"C_ID\" TEXT," + // 0: c_id
                "\"Q_ID\" TEXT PRIMARY KEY NOT NULL ," + // 1: q_id
                "\"S1\" TEXT," + // 2: s1
                "\"S2\" TEXT," + // 3: s2
                "\"S3\" TEXT," + // 4: s3
                "\"S4\" TEXT," + // 5: s4
                "\"S5\" TEXT," + // 6: s5
                "\"IS_RIGHT\" TEXT);"); // 7: is_right
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TITLE_RECORD_PROFESSIONAL_PRACTICE\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TitleRecordProfessionalPractice entity) {
        stmt.clearBindings();
 
        String c_id = entity.getC_id();
        if (c_id != null) {
            stmt.bindString(1, c_id);
        }
 
        String q_id = entity.getQ_id();
        if (q_id != null) {
            stmt.bindString(2, q_id);
        }
 
        String s1 = entity.getS1();
        if (s1 != null) {
            stmt.bindString(3, s1);
        }
 
        String s2 = entity.getS2();
        if (s2 != null) {
            stmt.bindString(4, s2);
        }
 
        String s3 = entity.getS3();
        if (s3 != null) {
            stmt.bindString(5, s3);
        }
 
        String s4 = entity.getS4();
        if (s4 != null) {
            stmt.bindString(6, s4);
        }
 
        String s5 = entity.getS5();
        if (s5 != null) {
            stmt.bindString(7, s5);
        }
 
        String is_right = entity.getIs_right();
        if (is_right != null) {
            stmt.bindString(8, is_right);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TitleRecordProfessionalPractice entity) {
        stmt.clearBindings();
 
        String c_id = entity.getC_id();
        if (c_id != null) {
            stmt.bindString(1, c_id);
        }
 
        String q_id = entity.getQ_id();
        if (q_id != null) {
            stmt.bindString(2, q_id);
        }
 
        String s1 = entity.getS1();
        if (s1 != null) {
            stmt.bindString(3, s1);
        }
 
        String s2 = entity.getS2();
        if (s2 != null) {
            stmt.bindString(4, s2);
        }
 
        String s3 = entity.getS3();
        if (s3 != null) {
            stmt.bindString(5, s3);
        }
 
        String s4 = entity.getS4();
        if (s4 != null) {
            stmt.bindString(6, s4);
        }
 
        String s5 = entity.getS5();
        if (s5 != null) {
            stmt.bindString(7, s5);
        }
 
        String is_right = entity.getIs_right();
        if (is_right != null) {
            stmt.bindString(8, is_right);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1);
    }    

    @Override
    public TitleRecordProfessionalPractice readEntity(Cursor cursor, int offset) {
        TitleRecordProfessionalPractice entity = new TitleRecordProfessionalPractice( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // c_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // q_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // s1
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // s2
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // s3
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // s4
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // s5
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7) // is_right
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TitleRecordProfessionalPractice entity, int offset) {
        entity.setC_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setQ_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setS1(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setS2(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setS3(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setS4(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setS5(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIs_right(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
     }
    
    @Override
    protected final String updateKeyAfterInsert(TitleRecordProfessionalPractice entity, long rowId) {
        return entity.getQ_id();
    }
    
    @Override
    public String getKey(TitleRecordProfessionalPractice entity) {
        if(entity != null) {
            return entity.getQ_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TitleRecordProfessionalPractice entity) {
        return entity.getQ_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
