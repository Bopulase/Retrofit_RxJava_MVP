package com.example.y.mvp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.y.mvp.NewsDetailInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "NEWS_DETAIL_INFO".
*/
public class NewsDetailInfoDao extends AbstractDao<NewsDetailInfo, Integer> {

    public static final String TABLENAME = "NEWS_DETAIL_INFO";

    /**
     * Properties of entity NewsDetailInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Tag = new Property(0, Integer.class, "tag", true, "TAG");
        public final static Property Id = new Property(1, Integer.class, "id", false, "ID");
        public final static Property Count = new Property(2, Integer.class, "count", false, "COUNT");
        public final static Property Description = new Property(3, String.class, "description", false, "DESCRIPTION");
        public final static Property Fcount = new Property(4, Integer.class, "fcount", false, "FCOUNT");
        public final static Property Fromname = new Property(5, String.class, "fromname", false, "FROMNAME");
        public final static Property Img = new Property(6, String.class, "img", false, "IMG");
        public final static Property Keywords = new Property(7, String.class, "keywords", false, "KEYWORDS");
        public final static Property Message = new Property(8, String.class, "message", false, "MESSAGE");
        public final static Property Rcount = new Property(9, Integer.class, "rcount", false, "RCOUNT");
        public final static Property Title = new Property(10, String.class, "title", false, "TITLE");
        public final static Property Topclass = new Property(11, Integer.class, "topclass", false, "TOPCLASS");
        public final static Property Fromurl = new Property(12, String.class, "fromurl", false, "FROMURL");
        public final static Property Time = new Property(13, Long.class, "time", false, "TIME");
    };


    public NewsDetailInfoDao(DaoConfig config) {
        super(config);
    }
    
    public NewsDetailInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"NEWS_DETAIL_INFO\" (" + //
                "\"TAG\" INTEGER PRIMARY KEY ," + // 0: tag
                "\"ID\" INTEGER," + // 1: id
                "\"COUNT\" INTEGER," + // 2: count
                "\"DESCRIPTION\" TEXT," + // 3: description
                "\"FCOUNT\" INTEGER," + // 4: fcount
                "\"FROMNAME\" TEXT," + // 5: fromname
                "\"IMG\" TEXT," + // 6: img
                "\"KEYWORDS\" TEXT," + // 7: keywords
                "\"MESSAGE\" TEXT," + // 8: message
                "\"RCOUNT\" INTEGER," + // 9: rcount
                "\"TITLE\" TEXT," + // 10: title
                "\"TOPCLASS\" INTEGER," + // 11: topclass
                "\"FROMURL\" TEXT," + // 12: fromurl
                "\"TIME\" INTEGER);"); // 13: time
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"NEWS_DETAIL_INFO\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, NewsDetailInfo entity) {
        stmt.clearBindings();
 
        Integer tag = entity.getTag();
        if (tag != null) {
            stmt.bindLong(1, tag);
        }
 
        Integer id = entity.getId();
        if (id != null) {
            stmt.bindLong(2, id);
        }
 
        Integer count = entity.getCount();
        if (count != null) {
            stmt.bindLong(3, count);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(4, description);
        }
 
        Integer fcount = entity.getFcount();
        if (fcount != null) {
            stmt.bindLong(5, fcount);
        }
 
        String fromname = entity.getFromname();
        if (fromname != null) {
            stmt.bindString(6, fromname);
        }
 
        String img = entity.getImg();
        if (img != null) {
            stmt.bindString(7, img);
        }
 
        String keywords = entity.getKeywords();
        if (keywords != null) {
            stmt.bindString(8, keywords);
        }
 
        String message = entity.getMessage();
        if (message != null) {
            stmt.bindString(9, message);
        }
 
        Integer rcount = entity.getRcount();
        if (rcount != null) {
            stmt.bindLong(10, rcount);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(11, title);
        }
 
        Integer topclass = entity.getTopclass();
        if (topclass != null) {
            stmt.bindLong(12, topclass);
        }
 
        String fromurl = entity.getFromurl();
        if (fromurl != null) {
            stmt.bindString(13, fromurl);
        }
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(14, time);
        }
    }

    /** @inheritdoc */
    @Override
    public Integer readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public NewsDetailInfo readEntity(Cursor cursor, int offset) {
        NewsDetailInfo entity = new NewsDetailInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0), // tag
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // id
            cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2), // count
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // description
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // fcount
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // fromname
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // img
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // keywords
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // message
            cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9), // rcount
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // title
            cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11), // topclass
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // fromurl
            cursor.isNull(offset + 13) ? null : cursor.getLong(offset + 13) // time
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, NewsDetailInfo entity, int offset) {
        entity.setTag(cursor.isNull(offset + 0) ? null : cursor.getInt(offset + 0));
        entity.setId(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setCount(cursor.isNull(offset + 2) ? null : cursor.getInt(offset + 2));
        entity.setDescription(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setFcount(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setFromname(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setImg(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setKeywords(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMessage(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setRcount(cursor.isNull(offset + 9) ? null : cursor.getInt(offset + 9));
        entity.setTitle(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setTopclass(cursor.isNull(offset + 11) ? null : cursor.getInt(offset + 11));
        entity.setFromurl(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setTime(cursor.isNull(offset + 13) ? null : cursor.getLong(offset + 13));
     }
    
    /** @inheritdoc */
    @Override
    protected Integer updateKeyAfterInsert(NewsDetailInfo entity, long rowId) {
        return entity.getTag();
    }
    
    /** @inheritdoc */
    @Override
    public Integer getKey(NewsDetailInfo entity) {
        if(entity != null) {
            return entity.getTag();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}