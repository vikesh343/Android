package com.example.niikesh.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.niikesh.fragment.R;

import org.w3c.dom.Text;

/**
 * Created by niikesh on 6/19/2017.
 */

public class home1 extends Fragment {
    View view;

    TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.login,container,false);
        text=(TextView)view.findViewById(R.id.text);

        return view;
    }
}
