package com.example.niikesh.gmap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.ui.PlaceAutocomplete;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);
        text=(TextView)findViewById(R.id.text);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent i=new PlaceAutocomplete.IntentBuilder(PlaceAutocomplete.MODE_FULLSCREEN).build(MainActivity.this);
                    startActivityForResult(i,1);
                }catch (GooglePlayServicesRepairableException e){
                    //to handle error
                }catch (GooglePlayServicesNotAvailableException e){
                    //to handle error
                }

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode==1){
            if (requestCode==RESULT_OK){
                Place place=PlaceAutocomplete.getPlace(this,data);
                Log.e("Tag","Place: "+ place.getAddress()+place.getPhoneNumber()+place.getLatLng().latitude);

                Intent intent=new Intent(MainActivity.this, Gmap.class);
                intent.putExtra("Latitude",place.getLatLng().latitude);
                intent.putExtra("Longitute",place.getLatLng().longitude);
                intent.putExtra("Name",place.getName());
                intent.putExtra("Address",place.getAddress());
                startActivity(intent);
            }else if(resultCode == PlaceAutocomplete.RESULT_ERROR){
                Status status= PlaceAutocomplete.getStatus(this,data);
                //to handle error
                Log.e("Tag", status.getStatusMessage());
            }else if (resultCode==RESULT_CANCELED){
                //user cancle the operation
            }
        }

    }
}
