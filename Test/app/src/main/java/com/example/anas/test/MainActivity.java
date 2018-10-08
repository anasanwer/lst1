package com.example.anas.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button =(Button)findViewById(R.id.btnnext);
        EditText name=(EditText)findViewById(R.id.editTextname);
        EditText pass=(EditText)findViewById(R.id.editTextpass);
        EditText confirm=(EditText)findViewById(R.id.editTextconfirm);
        EditText phone=(EditText)findViewById(R.id.editTextphone);
        if(pass.getText().toString() == confirm.getText().toString()){

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    button_sms_click();

                }
            });

        }
private void btn_sms_click(){

            Intent myintent =new Intent();
                  Bundle data = new Bundle();
                  data.putString("NAME",name.get);
            )

        }



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.);
                String name="name:"+editTextname.getText().toString();
                intent.setData(Uri.parse(name));
                String email="name:"+editTextemail.getText().toString();
                sendIntent.putExtra("email_body",editTextemail.getText().toString());
                intent.setData(Uri.parse(email));
                String password="name:"+editTextpass.getText().toString();
                sendIntent.putExtra("email_body",editTextemail.getText().toString());
                intent.setData(Uri.parse(email));


            }
        });
    }
}


