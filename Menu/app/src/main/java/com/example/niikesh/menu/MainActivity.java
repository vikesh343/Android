package com.example.niikesh.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"first item",Toast.LENGTH_SHORT).show();
                return  true;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"second item",Toast.LENGTH_SHORT).show();
                return true;
            case  R.id.item3:
                Toast.makeText(getApplicationContext(),"third item",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(getApplicationContext(),"fourth item",Toast.LENGTH_SHORT).show();
                return  true;
            default:return  true;
        }
    }
}
