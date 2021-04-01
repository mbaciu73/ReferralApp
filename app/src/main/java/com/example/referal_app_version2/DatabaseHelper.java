package com.example.referal_app_version2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "referral";
    public static final String DATABASE_TABLE = "Users";
    public static final int DATABASE_VERSION = 1;

    public static final String KEY_ROWID = "_id";
    public static final String KEY_USERNAME = "user_name";
    public static final String KEY_USEREMAIL = "user_email";
    public static final String KEY_USERAGE = "user_age";
    public static final String KEY_USERGENDER = "user_gender";
    public static final String KEY_USERPASSWORD = "user_password";
    public static final String KEY_EMERGENCYEMAIL = "emergency_email";
    public static final String KEY_EMERGENCYPHONE = "emergency_phone";





    private static final String DATABASE_CREATE = "create table " + DATABASE_TABLE +
            "(_id integer primary key autoincrement," + "user_name text not null," +
            "user_email text not null," + "user_age text not null," + "user_gender text not null,"+ "user_password text not null," +
            "emergency_email text not null," + "emergency_phone text not null);";



    public DatabaseHelper (Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop Table if EXISTS " + DATABASE_TABLE);
        onCreate(db);
    }

}
