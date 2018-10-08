package com.example.anas.jawabebhook;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class sqlitedatabase extends SQLiteOpenHelper {
    SQLiteDatabase db;


    private static final String DATABASE_NAME="User_Sign";

    private static final int DATABASE_VERSION=1;
    private static final String TABLE_USER="User_info";

    public static final String KEY_ROW_USER="username";
public static final String KEY_EMAIL="email";
public static final String KEY_PASS="pass";


    public sqlitedatabase(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_USER_TABLE= "CREATE TABLE " +TABLE_USER+ "(" +KEY_ROW_USER+ " TEXT, "+
                KEY_EMAIL+ " TEXT, " + KEY_PASS+ " STRING);";
        db.execSQL(CREATE_USER_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS "+TABLE_USER);
        onCreate(db);

    }

    public long insertUser(String username, String email, String password) {




        db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put(KEY_EMAIL,email);
        cv.put(KEY_PASS,password);
        cv.put(KEY_ROW_USER,username);

        return db.insert(TABLE_USER,null,cv);




    }
}
