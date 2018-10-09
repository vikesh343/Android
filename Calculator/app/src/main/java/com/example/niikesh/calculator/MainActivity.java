package com.example.niikesh.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, badd, bsub, bmul, bdiv, bdot, bequal;
    TextView e1, e2;
    double v1, v2;
    boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        badd = (Button) findViewById(R.id.badd);
        bsub = (Button) findViewById(R.id.bsub);
        bdiv = (Button) findViewById(R.id.bdiv);
        bmul = (Button) findViewById(R.id.bmul);
        bdot = (Button) findViewById(R.id.bdot);
        bequal = (Button) findViewById(R.id.bequal);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + "9");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e2.setText(e2.getText() + ".");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Double.parseDouble(e2.getText()+"");
                add=true;
                e2.setText(null);
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Double.parseDouble(e2.getText()+"");
                sub=true;
                e2.setText(null);
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Double.parseDouble(e2.getText()+"");
                div=true;
                e2.setText(null);
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v1=Double.parseDouble(e2.getText()+"");
                mul=true;
                e2.setText(null);
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v2=Double.parseDouble(e2.getText()+"");

                if(add==true)
                {
                    e2.setText(v1+v2+"");
                    add=false;
                }
                if (sub==true)
                {
                    e2.setText(v1-v2+"");
                    sub=false;
                }
                if (div==true)
                {
                    e2.setText(v1/v2+"");
                    div=false;
                }
                if (mul=true)
                {
                    e2.setText(v1*v2+"");
                    mul=false;
                }
            }
        });
    }
}
