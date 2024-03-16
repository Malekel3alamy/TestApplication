package com.example.testapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {
    Context context;
    int resource ;
    ArrayList<String> data;
    public MyAdapter (Context context , int resource , ArrayList<String> data){
        this.context = context;
        this.resource = resource;
        this.data = data;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        TextView tv;
        if(v==null){
          v =  LayoutInflater.from(context).inflate(resource,
                    null,false);

        }
        tv = v.findViewById(android.R.id.text1);
        tv.setText(data.get(position));

        return v;
    }
}
