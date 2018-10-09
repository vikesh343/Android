package com.example.niikesh.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.niikesh.fragment.R;

/**
 * Created by niikesh on 6/19/2017.
 */

public class login extends Fragment {
    View view;
    EditText e1,e2;
    Button b1;
    TextView t1,t2,t3;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.login,container,false);
        e1=(EditText)view.findViewById(R.id.e1);
        e2=(EditText)view.findViewById(R.id.e2);
        t1=(TextView)view.findViewById(R.id.t1);
        t2=(TextView)view.findViewById(R.id.t2);
        t3=(TextView)view.findViewById(R.id.t3);
        b1=(Button)view.findViewById(R.id.b1);
        //6home1 h=new home1();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home1 h=new home1();
                getFragmentManager().beginTransaction().replace(R.id.container,h).commit();

            }
        });

        return view;

    }
}
