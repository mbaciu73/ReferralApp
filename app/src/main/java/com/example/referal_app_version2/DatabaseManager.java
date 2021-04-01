package com.example.referal_app_version2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;

import static com.example.referal_app_version2.DatabaseHelper.DATABASE_TABLE;
import static com.example.referal_app_version2.DatabaseHelper.KEY_ROWID;
import static com.example.referal_app_version2.DatabaseHelper.KEY_USERNAME;
import static com.example.referal_app_version2.DatabaseHelper.KEY_USEREMAIL;
import static com.example.referal_app_version2.DatabaseHelper.KEY_USERAGE;
import static com.example.referal_app_version2.DatabaseHelper.KEY_USERGENDER;
import static com.example.referal_app_version2.DatabaseHelper.KEY_USERPASSWORD;
import static com.example.referal_app_version2.DatabaseHelper.KEY_EMERGENCYEMAIL;
import static com.example.referal_app_version2.DatabaseHelper.KEY_EMERGENCYPHONE;


public class DatabaseManager {

    Context context;
    private DatabaseHelper myDatabaseHelper;
    private SQLiteDatabase myDatabase;

    public DatabaseManager(Context context){
        this.context = context;
    }

    public DatabaseManager open() throws SQLException{
        myDatabaseHelper = new DatabaseHelper(context);
        myDatabase = myDatabaseHelper.getWritableDatabase();
        return this;
    }

    // close the database
    public void close(){
        myDatabaseHelper.close();
    }


}