package com.example.anas.jawabebhook;

import android.app.Dialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NewUser extends AppCompatActivity {

    sqlitedatabase db;
    EditText edtname,edtemail,edtpass;
    Button insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);

        edtname=(EditText)findViewById(R.id.edtname);
        edtemail=(EditText) findViewById(R.id.edtemail);
        edtpass=(EditText)findViewById(R.id.edtpass);
         db=new sqlitedatabase(this);

        insert=(Button)findViewById(R.id.btnkuchhona);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean fine = true;

try {
    String username = edtname.getText().toString();
    String email = edtemail.getText().toString();
    String password = edtpass.getText().toString();
    db.insertUser(username, email, password);
}catch (Exception e) {
    fine=false;
    String error=e.toString();
    Dialog d=new Dialog(NewUser.this);
    d.setTitle("sorry");
    TextView tv=new TextView(NewUser.this);
    tv.setText(error);
    d.setContentView(tv);
    d.show();


}
finally {
    if(fine){
        Dialog d=new Dialog(NewUser.this);
        d.setTitle("we did it");
        TextView tv=new TextView(NewUser.this);
        tv.setText("success");
        d.setContentView(tv);
        d.show();
        Intent it2=new Intent(NewUser.this,Mainimages.class);
        startActivity(it2);

    }
}


            }

        });

    }
}
