package com.example.niikesh.togglebutton;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ToggleButton toggle1= (ToggleButton)findViewById(R.id.toggle1);
        final ToggleButton toggle2=(ToggleButton)findViewById(R.id.toggle2);
        Button button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("togglebutton1 :").append(toggle1.getText());
                result.append("\ntogglebutton2 :").append(toggle2.getText());
                Toast.makeText(MainActivity.this,result.toString(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
