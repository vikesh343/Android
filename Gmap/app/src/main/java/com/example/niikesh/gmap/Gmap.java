package com.example.niikesh.gmap;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Gmap extends AppCompatActivity implements OnMapReadyCallback {

    Fragment frag;
    String title, address;
    double latitute,longitude;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmap);
        Intent intent= getIntent();
        latitute=intent.getDoubleExtra("Latitude",0d);
        longitude=intent.getDoubleExtra("Longitude",0d);
        title=intent.getStringExtra("Name");
        address=intent.getStringExtra("Address");

        SupportMapFragment map=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.frag);
        map.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng sydney=new LatLng(latitute,longitude);

        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney,13));
        googleMap.addMarker(new MarkerOptions()
                .title(title)
                .snippet(address)
                .position(sydney));
    }
}
