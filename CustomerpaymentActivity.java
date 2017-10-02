package com.bignerdranch.android.customer_management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class CustomerpaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerpayment);
    }

    public void onClick(View view) {
        Intent intent = new Intent(CustomerpaymentActivity.this, CustomerList.class);
        startActivity(intent);
    }




}
