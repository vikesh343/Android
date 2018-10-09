package com.example.niikesh.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radiogroup;
    RadioButton male, female, transgender;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radiogroup = (RadioGroup) findViewById(radiogroup);
        male=(RadioButton)findViewById(male);
        female=(RadioButton)findViewById(female);
        transgender=(RadioButton)findViewById(transgender);
        button=(Button)findViewById(button);


    }
}