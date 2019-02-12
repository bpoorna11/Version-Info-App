package com.balakrishnan.poorna.buttontoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity6 extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3;
    ListView lv;
    TextView tv;
    EditText ed;
   // ArrayList<String> val=new ArrayList<String>();
    ArrayList<Contacts> con=new ArrayList<Contacts>();
   // ArrayAdapter<Contacts> adapter;
    MyAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        Contacts contacts =new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.applepie),"Apple Pie, Android 1.0, 1 September 23, 2008");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.banana),"Banana Bread, Android 1.1 ,2 ,February 9, 2009");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.cupcake),"Cupcake, Android 1.5, 3,April 27, 2009");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.donut),"Donut,Android 1.6,4,September 15, 2009");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.eclair),"Eclair,Android 2.0, 5,October 26, 2009");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.froyo),"Froyo, Android 2.2, 8,May 20, 2010");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.gingerbread),"Gingerbread, Android 2.3, 9,December 6, 2010");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.honeycomb),"Honeycomb,Android 3.0,11,February 22, 2011");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.icecream),"Ice Cream Sandwich, Android 4.0, 14,October 18, 2011");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.jellybean),"Jelly Bean, Android 4.2, 16,July 9, 2012");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.kitkat),"Kitkat, Android 4.4, 19,October 31, 2013");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.lollipop),"Lollipop,Android 5.0,21,November 12, 2014");
        con.add(contacts);
        contacts=new Contacts(getApplicationContext().getResources().getDrawable(R.drawable.marshmallow),"Marshmallow Android 6.0 23,October 5, 2015");
        con.add(contacts);
        adapter=new MyAdapter(this,con);

        lv=findViewById(R.id.list);
        lv.setAdapter(adapter);


    }
    @Override
    public void onClick(View v){
        String str=ed.getText().toString();

        //adapter.add(str);
       // adapter.notifyDataSetChanged();


    }
private class Mylistener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            String c=ed.getText().toString();
            //adapter.remove(c);
            //adapter.notifyDataSetChanged();

        }
}
}
