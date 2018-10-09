package com.example.niikesh.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {

    String name[]={"gear2","luffy","luffy1","op","zoro"};
    String add[]={"res","win","set","fun","run"};
    Integer number[]={R.drawable.zoro,R.drawable.gear2,R.drawable.luffy,R.drawable.luffy1,R.drawable.op};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customAdaptor ca=new customAdaptor(this,name,add,number);

        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(ca);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApp,"you clicked "+ name[i],Toast.LENGTH_SHORT).show();
            }
        });
    }
}
