package com.example.niikesh.june15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button b1;
    TextView t1;
    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        t1=(TextView)findViewById(R.id.t1);
        e1=(EditText)findViewById(R.id.e1);
       // t1.setVisibility(View.INVISIBLE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //t1.setVisibility(View.VISIBLE);
                /*int i;
                i=t1.getVisibility();
                if(i==0){
                    t1.setVisibility(View.INVISIBLE);
                }
                else
                    t1.setVisibility(View.VISIBLE);
*/
                Random r=new Random();
                int i;
                i=r.nextInt(2);
                if(i==0){
                    t1.setText("Head");
                }
                else{
                    t1.setText("Tail");}
            }
        });
    }
}
