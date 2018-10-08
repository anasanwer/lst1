package com.example.anas.jawabebhook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv,tv2;
        Button btn1,btn2;
        btn1=(Button)findViewById(R.id.btnnew);
        btn2=(Button)findViewById(R.id.btnsignup);
         tv=(TextView)findViewById(R.id.tvtitle);
        tv.setText("JAWAB E BHOOK");
         tv2=(TextView)findViewById(R.id.tvwelcome);
        tv2.setText("Welcome");
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2=new Intent(MainActivity.this,NewUser.class);
                startActivity(it2);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it3=new Intent(MainActivity.this,Ihavebeen.class);
                startActivity(it3);
            }
        });




    }

    public void submitOrder(View view) {
    }

    public void decreament2(View view) {
    }

    public void increament2(View view) {
    }

    public void decreament(View view) {
    }

    public void increament(View view) {
    }}
