package com.example.niikesh.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Chat1 extends AppCompatActivity {
    TextView text1;
    EditText edit1;
    Button logout1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat1);

        text1=(TextView)findViewById(R.id.text1);
        edit1=(EditText)findViewById(R.id.edit1);
        logout1=(Button)findViewById(R.id.logout1);

        logout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
