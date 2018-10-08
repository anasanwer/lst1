package com.example.anas.jawabebhook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Ihavebeen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ihavebeen);
        EditText edtmail,edtpassword;
        edtmail=(EditText)findViewById(R.id.editemailnew);
        edtpassword=(EditText)findViewById(R.id.editpassnew);
        Button btn;
        btn=(Button)findViewById(R.id.signin);
    btn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent it=new Intent(Ihavebeen.this,Mainimages.class);
            startActivity(it);
        }
    });

    }
}
