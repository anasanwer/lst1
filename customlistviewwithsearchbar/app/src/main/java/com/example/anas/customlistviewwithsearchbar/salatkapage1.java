package com.example.anas.customlistviewwithsearchbar;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class salatkapage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salatkapage1);
        ActionBar actionBar=getSupportActionBar();
        TextView mdetail=findViewById(R.id.itemdetail);

        Intent intent= getIntent();
        String mactionbatitle= intent.getStringExtra("ActionbarTitle");
        String mcontentTv = intent.getStringExtra("contentTv");

        actionBar.setTitle(mactionbatitle);
        mdetail.setText(mcontentTv);


    }
}


