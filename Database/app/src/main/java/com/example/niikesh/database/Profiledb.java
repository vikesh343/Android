package com.example.niikesh.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by niikesh on 6/30/2017.
 */

public class Profiledb extends Database {
    public Profiledb(Context context) {
        super(context);
    }

    public void save(Bean bean){
        SQLiteDatabase db=getWritableDatabase();
        db.execSQL("insert or replace into tb1Profile(name,email)"+"values('"+ bean.getName()+"','"+ bean.getEmail()+"')");
    }
}
