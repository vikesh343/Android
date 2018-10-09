package com.example.niikesh.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText nam,mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nam= (EditText)findViewById(R.id.name);
        mail=(EditText)findViewById(R.id.email);
        EditText mobile=(EditText)findViewById(R.id.mobile);
        EditText address=(EditText)findViewById(R.id.address);
        EditText pincode=(EditText)findViewById(R.id.pin);
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        DatePicker datapicker=(DatePicker)findViewById(R.id.datepicker);
        RadioGroup radiogroup=(RadioGroup)findViewById(R.id.radiogroup);
        RadioButton male=(RadioButton)findViewById(R.id.male);
        RadioButton female=(RadioButton)findViewById(R.id.female);
        Button save=(Button)findViewById(R.id.save);
        Button cancel=(Button)findViewById(R.id.cancel);
        final Bean bean=new Bean();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s2=mail.getText().toString();
                String s1=nam.getText().toString();
                bean.setName(s1);
                bean.setEmail(s2);
                Profiledb db=new Profiledb(getApplicationContext());
            }
        });
    }
}

