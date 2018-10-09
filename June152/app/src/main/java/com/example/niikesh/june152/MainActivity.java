package com.example.niikesh.june152;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.b1);
        e1=(EditText)findViewById(R.id.e1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e1.getText().toString();
                int a= s1.length();
                if(a>2 && a<13){
                    Intent i=new Intent(Intent.ACTION_CALL);
                    i.setData(Uri.parse("tel:"+s1));
                    startActivity(i);


                }


            }
        });

    }
}
