package com.example.listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    ArrayList<CountryDTO> list;
    LayoutInflater inflater;


    public Adapter(ArrayList<CountryDTO> list, LayoutInflater inflater) {
        this.list = list;
        this.inflater = inflater;
    }



    @Override
    public int getCount() {

        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View v, ViewGroup parent) {

       v = inflater.inflate(R.layout.list_item,parent,false);

        ImageView image = v.findViewById(R.id.image);
        TextView tv1 = v.findViewById(R.id.tv1);
        TextView tv2 = v.findViewById(R.id.tv2);

       image.setImageResource(list.get(position).getImage());
       tv1.setText(list.get(position).getName_k());
       tv2.setText(list.get(position).getName_e());

        return v;
    }
}
