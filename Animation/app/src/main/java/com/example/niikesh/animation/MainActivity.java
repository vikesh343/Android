package com.example.niikesh.animation;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logo);

        image=(ImageView)findViewById(R.id.image);
        image.setBackgroundResource(R.drawable.animation);


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        AnimationDrawable draw=(AnimationDrawable)image.getBackground();
        if(hasFocus){
            draw.start();
        }else{
            draw.stop();
        }
    }
}
