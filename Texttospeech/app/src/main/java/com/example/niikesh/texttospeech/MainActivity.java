package com.example.niikesh.texttospeech;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener{

    TextView text;
    Button button;
    EditText edit;
    TextToSpeech t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text=(TextView)findViewById(R.id.text);
        edit=(EditText)findViewById(R.id.edit);
        button=(Button)findViewById(R.id.button);
        t=new TextToSpeech(this,this);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    protected void onDestroy() {
        if(t!=null){
        t.stop() ;
            t.shutdown();
        }
        super.onDestroy();
    }

    @Override
    public void onInit(int status) {
        if(status==TextToSpeech.SUCCESS){
            int result=t.setLanguage(Locale.US);
            if(result==TextToSpeech.LANG_MISSING_DATA||result==TextToSpeech.LANG_NOT_SUPPORTED){

                Log.e("t","this language is not supported");

            }else{
                button.setEnabled(true);
                speakOut();
            }
        }else{
            Log.e("t","Initialsiation failed");
        }
    }

    private void speakOut() {
        String text=edit.getText().toString();
        t.speak(text,TextToSpeech.QUEUE_FLUSH,null);
    }
}
