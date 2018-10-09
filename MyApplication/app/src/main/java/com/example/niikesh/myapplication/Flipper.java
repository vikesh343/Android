package com.example.niikesh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class Flipper extends AppCompatActivity {
    ViewFlipper v1;
    Button skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flipper);
        v1=(ViewFlipper)findViewById(R.id.v1);
        skip=(Button)findViewById(R.id.skip);
        v1.setFlipInterval(2000);
        v1.startFlipping();

        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(p);
                Flipper.this.finish();
            }
        });


    }
}
