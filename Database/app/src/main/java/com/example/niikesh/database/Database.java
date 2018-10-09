package com.example.niikesh.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by niikesh on 6/30/2017.
 */

public class Database extends SQLiteOpenHelper {

    public Database(Context context) {
        super(context, "data.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
         db.execSQL("create table tb1Profile(id integer primary key autoincrement,name varchar,email varchar)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("drop table if exists th1profile");

    }
}
