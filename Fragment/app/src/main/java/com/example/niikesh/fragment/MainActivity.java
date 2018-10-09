package com.example.niikesh.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout f1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        f1=(FrameLayout)findViewById(R.id.container);
        login log=new login();
        getFragmentManager().beginTransaction().replace(R.id.container,log).commit();
    }
}
