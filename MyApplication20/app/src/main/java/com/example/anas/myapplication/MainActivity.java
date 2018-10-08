package com.example.anas.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstnumber;
    EditText secondnumber;
    TextView addnumber;
    Button btnadd;


    double num1,num2,sum;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstnumber = (EditText)findViewById(R.id.first);
        secondnumber =(EditText)findViewById(R.id.second);
        addnumber = (TextView)findViewById(R.id.textView);
        btnadd =(Button)findViewById(R.id.ADD);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(firstnumber.getText().toString());
              num2 = Double.parseDouble(secondnumber.getText().toString());
              sum=num1+num2;
              addnumber.setText(Double.toString(sum));
            }
        });






    }
}
