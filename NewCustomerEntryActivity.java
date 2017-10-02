package com.bignerdranch.android.customer_management;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.bignerdranch.android.customer_management.Customer_List_Database_Package.Customer_List_Database_Helper;

import java.util.UUID;



public class NewCustomerEntryActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_customer_entry);

    }

    public void onClick(View view) {
        Intent intent = new Intent(NewCustomerEntryActivity.this, Log.class);
        startActivity(intent);
    }
    public CustomerList getCustomerList(UUID id) {
        return null;
    }






    public Context mContext;
    public SQLiteDatabase mDatabase;


    public Context getContext(Context context) {

      
        mDatabase = new Customer_List_Database_Helper(mContext)
                .getWritableDatabase();
        return mContext;
    }







}
















