package com.example.niikesh.customlist;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.niikesh.customlist.R;

import static android.R.attr.resource;

/**
 * Created by niikesh on 7/3/2017.
 */

public class customAdaptor extends ArrayAdapter {

    private String[] name;
    private String[] add;
    private Integer[] number;
    private Activity context;

    public customAdaptor(Activity context, String[] names,String[] add,Integer[] number ) {
        super(context, R.layout.listitem,names);
        this.context=context;
        this.name=names;
        this.add=add;
        this.number=number;
    }

    public  View getView(int position, View counterView, ViewGroup parent){
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.listitem,null,true);
        TextView textViewname=(TextView)listViewItem.findViewById(R.id.name);
        TextView textViewadd=(TextView)listViewItem.findViewById(R.id.add);
        ImageView image=(ImageView)listViewItem.findViewById(R.id.img);

        textViewname.setText(name[position]);
        textViewadd.setText(add[position]);
        image.setImageResource(number[position]);
        return listViewItem;
    }


}
