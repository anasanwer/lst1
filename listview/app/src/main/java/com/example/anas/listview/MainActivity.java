package com.example.anas.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.FieldPosition;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ListView lst;
String[] months={"Janauary","Feb","March","April","May","June","July","August","September","October","November","December"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     lst =(ListView) findViewById(R.id.listvw) ;
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,months);
lst.setAdapter(arrayAdapter);
lst.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv=(TextView) view;
        Toast.makeText(this, "You click on" +tv.getText() +position , Toast.LENGTH_SHORT).show();
    }
}
