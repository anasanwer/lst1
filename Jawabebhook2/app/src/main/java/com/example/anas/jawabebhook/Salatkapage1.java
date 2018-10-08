package com.example.anas.jawabebhook;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.NumberFormat;

public class Salatkapage1 extends AppCompatActivity {

    int quantity=1;
    int quantity2=1;
    int price;
    int price2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salatkapage1);
        Button btnincrement=(Button)findViewById(R.id.increament);
        Button btndecrement=(Button)findViewById(R.id.decreament);

        ActionBar actionBar=getSupportActionBar();

        Intent intent= getIntent();
        String mactionbatitle= intent.getStringExtra("ActionbarTitle");
        String mcontentTv = intent.getStringExtra("contentTv");

        actionBar.setTitle(mactionbatitle);
        //mdetail.setText(mcontentTv);





    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view)
    {
        displayPriceTotal(price+price2);

    }

    private void displayPriceTotal(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.total_amount);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_View);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_View);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increament(View view)
    {
        quantity=quantity+1;
        display(quantity);
        price=quantity*5;
        displayPrice(price);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decreament(View view)
    {
        if(quantity!=0) {
            quantity = quantity - 1;
            display(quantity);
            price=quantity*5;
            displayPrice(price);
        }

    }
    private void display2(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_View2);
        quantityTextView.setText("" + number);
    }
    private void displayPrice2(int number) {
        TextView priceTextView2 = (TextView) findViewById(R.id.price_text_View2);
        priceTextView2.setText(NumberFormat.getCurrencyInstance().format(number));
    }
    public void increament2(View view)
    {
        quantity2=quantity2+1;
        display2(quantity2);
        price2=quantity2*4;
        displayPrice2(price2);
    }

    public void decreament2(View view)
    {
        if(quantity2!=0) {
            quantity2 = quantity2 - 1;
            display2(quantity2);
            price2=quantity2*4;
            displayPrice2(price2);
        }

    }








    }


