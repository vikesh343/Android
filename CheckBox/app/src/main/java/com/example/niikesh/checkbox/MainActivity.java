package com.example.niikesh.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button1;
    CheckBox burger,pizza,noodles,french;
    TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        textview1=(TextView)findViewById(R.id.textview1);
        burger=(CheckBox)findViewById(R.id.burger);
        pizza=(CheckBox)findViewById(R.id.pizza);
        french=(CheckBox)findViewById(R.id.french);
        noodles=(CheckBox)findViewById(R.id.noodles);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int totalamount=0;
                StringBuilder result=new StringBuilder();
                result.append("selected items");
                if(pizza.isChecked()){
                    result.append("\n pizza 10rs");
                    totalamount+=10;
                }
                if(french.isChecked()){
                    result.append("\n french fries 10rs");
                    totalamount+=10;}
                if(burger.isChecked()){
                    result.append("\n burger 10rs");
                    totalamount+=10;}
                if(noodles.isChecked()){
                    result.append("\n noodles 10rs");
                    totalamount+=10;}
                result.append("total:"+totalamount+"Rs");
                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_SHORT).show();
            }

        });


    }
}
