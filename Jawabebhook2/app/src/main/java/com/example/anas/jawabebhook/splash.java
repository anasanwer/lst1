package com.example.anas.jawabebhook;

import android.content.Intent;
import android.net.MailTo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ImageView img=(ImageView)findViewById(R.id.splash);

        Thread td=new Thread(){
            @Override
            public void run(){
                super.run();
                try{
sleep(3000);

                }catch(Exception ex)
                {

                    ex.printStackTrace();


                }finally {
                    Intent it=new Intent(splash.this,MainActivity.class);
                    startActivity(it);
                }
            }
        };td.start();
    }
}
