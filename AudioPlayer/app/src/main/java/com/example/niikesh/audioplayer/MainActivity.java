package com.example.niikesh.audioplayer;

import android.media.MediaPlayer;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text=(TextView)findViewById(R.id.text);
        Button stop=(Button)findViewById(R.id.stop);
        Button pause=(Button)findViewById(R.id.pause);
        Button start=(Button)findViewById(R.id.start);

        final MediaPlayer mp=new MediaPlayer();
        try{
            mp.setDataSource("/storage/emulated/0/SmashMouth.mp3");
        } catch (Exception e) {
            e.printStackTrace();
        }
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
            }
        });
        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
            }
        });
    }
}
