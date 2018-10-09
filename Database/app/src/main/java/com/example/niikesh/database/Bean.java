package com.example.niikesh.database;

import android.widget.EditText;

/**
 * Created by niikesh on 6/30/2017.
 */

public class Bean extends MainActivity
{
    String name,email;
   /* EditText nam= (EditText)findViewById(R.id.name);
    EditText mial=(EditText)findViewById(R.id.email);
*/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
