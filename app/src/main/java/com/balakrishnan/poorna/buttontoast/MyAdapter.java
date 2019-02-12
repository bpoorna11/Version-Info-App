package com.balakrishnan.poorna.buttontoast;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.balakrishnan.poorna.buttontoast.Contacts;
import com.balakrishnan.poorna.buttontoast.R;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Contacts> {
    private Context context;
    private ArrayList<Contacts> list;
     public MyAdapter(Context context,ArrayList<Contacts> list){
        super(context, R.layout.mylayout,list);
        this.context=context;
        this.list=list;

    }
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater =(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView =inflater.inflate(R.layout.mylayout,parent,false);
        TextView textView=(TextView)rowView.findViewById(R.id.textView2);
        textView.setText(list.get(position).getName());
        Button button=(Button)rowView.findViewById(R.id.button4);
        button.setBackground(list.get(position).getId());
        return rowView;
    }
}
