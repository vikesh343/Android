package com.example.niikesh.json;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String TAG=MainActivity.class.getSimpleName();
    ArrayList<HashMap<String,String>> contactList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList=new ArrayList<>();
        listview =(ListView)findViewById(R.id.listview);

        new GetContacts().execute();
    }

    private class GetContacts extends AsyncTask<Void,Void,Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Httphandler sh=new Httphandler();
            String url= "http://api.androidhive.info/contacts/";
            String jsonStr=sh.makeStringCall(url);

            Log.e(TAG,"response from url: "+jsonStr);
            if(jsonStr!=null){
                try {
                    JSONObject jo=new JSONObject(jsonStr);
                    JSONArray contacts=jo.getJSONArray("contacts");
                    for(int i=0;i<contacts.length();i++)
                    {
                        JSONObject c=contacts.getJSONObject(i);
                        String id=c.getString("id");
                        String name=c.getString("name");
                        String email=c.getString("email");
                        String address=c.getString("address");
                        String gender=c.getString("gender");

                        JSONObject phone =c.getJSONObject("phone");
                        String mobile=c.getString("mobile");
                        String home=c.getString("home");
                        String office=c.getString("office");

                        HashMap<String,String> contacts new HashMap<>();
                        contacts.put("id",id);
                        contacts.put("name",name);
                        contacts.put("email",email);
                        contacts.put("mobile",mobile);
                        contactList.add(contacts);

                    }
                } catch (JSONException e) {
                    Log.e(TAG,"json parsing error : "+ e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(MainActivity.this,"json parsing error ",Toast.LENGTH_SHORT).show();

                        }
                    });
                }
            }else {
                Log.e(TAG,"Couldn't get jason from server");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(MainActivity.this, "couldn't get json from server ", Toast.LENGTH_SHORT).show();
                    }
                });
            }
            return  null;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Toast.makeText(MainActivity.this, "json data is downloading", Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            ListAdapter adapter =new SimpleAdapter(MainActivity.this,contactList,R.layout.listitem,new String[]{"email","mobile"},new int[]{R.id.text1,R.id.text2});
            listview.setAdapter(adapter);
        }
    }
}
