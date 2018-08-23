package com.mm.medicalman.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.mm.medicalman.DBBean.TopicRecord;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TOPIC_RECORD".
*/
public class TopicRecordDao extends AbstractDao<TopicRecord, String> {

    public static final String TABLENAME = "TOPIC_RECORD";

    /**
     * Properties of entity TopicRecord.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Q_id = new Property(0, String.class, "q_id", true, "Q_ID");
        public final static Property Right = new Property(1, String.class, "right", false, "RIGHT");
        public final static Property Error = new Property(2, String.class, "error", false, "ERROR");
        public final static Property Is_remove = new Property(3, String.class, "is_remove", false, "IS_REMOVE");
        public final static Property Is_up = new Property(4, String.class, "is_up", false, "IS_UP");
    }


    public TopicRecordDao(DaoConfig config) {
        super(config);
    }
    
    public TopicRecordDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TOPIC_RECORD\" (" + //
                "\"Q_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: q_id
                "\"RIGHT\" TEXT," + // 1: right
                "\"ERROR\" TEXT," + // 2: error
                "\"IS_REMOVE\" TEXT," + // 3: is_remove
                "\"IS_UP\" TEXT);"); // 4: is_up
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TOPIC_RECORD\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TopicRecord entity) {
        stmt.clearBindings();
 
        String q_id = entity.getQ_id();
        if (q_id != null) {
            stmt.bindString(1, q_id);
        }
 
        String right = entity.getRight();
        if (right != null) {
            stmt.bindString(2, right);
        }
 
        String error = entity.getError();
        if (error != null) {
            stmt.bindString(3, error);
        }
 
        String is_remove = entity.getIs_remove();
        if (is_remove != null) {
            stmt.bindString(4, is_remove);
        }
 
        String is_up = entity.getIs_up();
        if (is_up != null) {
            stmt.bindString(5, is_up);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TopicRecord entity) {
        stmt.clearBindings();
 
        String q_id = entity.getQ_id();
        if (q_id != null) {
            stmt.bindString(1, q_id);
        }
 
        String right = entity.getRight();
        if (right != null) {
            stmt.bindString(2, right);
        }
 
        String error = entity.getError();
        if (error != null) {
            stmt.bindString(3, error);
        }
 
        String is_remove = entity.getIs_remove();
        if (is_remove != null) {
            stmt.bindString(4, is_remove);
        }
 
        String is_up = entity.getIs_up();
        if (is_up != null) {
            stmt.bindString(5, is_up);
        }
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public TopicRecord readEntity(Cursor cursor, int offset) {
        TopicRecord entity = new TopicRecord( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // q_id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // right
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // error
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // is_remove
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // is_up
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TopicRecord entity, int offset) {
        entity.setQ_id(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setRight(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setError(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIs_remove(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setIs_up(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final String updateKeyAfterInsert(TopicRecord entity, long rowId) {
        return entity.getQ_id();
    }
    
    @Override
    public String getKey(TopicRecord entity) {
        if(entity != null) {
            return entity.getQ_id();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TopicRecord entity) {
        return entity.getQ_id() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
