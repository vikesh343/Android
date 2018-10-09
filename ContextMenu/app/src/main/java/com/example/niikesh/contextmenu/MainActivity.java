package com.example.niikesh.contextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview1;
    String contacts[]={"sandeep","hemant","santhosh","pankaj","rudra"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview1=(ListView)findViewById(R.id.listview1);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,contacts);
        listview1.setAdapter(adapter);

        registerForContextMenu(listview1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("select any");
        menu.add(0,v.getId(),0,"call");//groupId,itemId,order,Title      //creating items dynamically
        menu.add(0,v.getId(),0,"sms");
        //group id & ORDER WILL BE SAME and cann be assign any no.
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        if (item.getTitle()=="call"){
            Toast.makeText(getApplicationContext(),"calling code",Toast.LENGTH_LONG).show();
        }
        else if(item.getTitle()=="sms"){

            Toast.makeText(getApplicationContext(),"sending sms code",Toast.LENGTH_LONG).show();
        }
        else{
            return  false;
        }

        return true;
    }
}
