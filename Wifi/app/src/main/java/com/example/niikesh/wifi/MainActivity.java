package com.example.niikesh.wifi;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button enable,disable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enable=(Button)findViewById(R.id.enable);
        disable=(Button)findViewById(R.id.disable);

        enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(true);

            }
        });

        disable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WifiManager wifi=(WifiManager)getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);

            }
        });
    }
}
