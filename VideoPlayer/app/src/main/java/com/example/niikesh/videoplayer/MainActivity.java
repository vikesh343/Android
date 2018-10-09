package com.example.niikesh.videoplayer;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
 VideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video=(VideoView)findViewById(R.id.video);
        MediaController media= new MediaController(this);
        media.setAnchorView(video);

        Uri uri=Uri.parse("/storage/9016-4EF8/Videos/Naruto.mp4");

        video.setMediaController(media);
        video.setVideoURI(uri);
        video.requestFocus();
        video.start();

    }

}
