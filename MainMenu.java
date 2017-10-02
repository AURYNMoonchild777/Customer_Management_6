package com.bignerdranch.android.customer_management;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.EditText;

import android.view.View;
import android.widget.Toast;

import static android.icu.text.Collator.getInstance;

public class MainMenu extends AppCompatActivity{

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        menu.findItem(R.id.new_customer_entry).setIntent(new Intent(MainMenu.this, NewCustomerEntryActivity.class));
        menu.findItem(R.id.session_page_title).setIntent(new Intent(MainMenu.this, SessionActivity.class));
        menu.findItem(R.id.customer_list_title).setIntent(new Intent(MainMenu.this, CustomerList.class));
        menu.findItem(R.id.take_photo).setIntent(new Intent(MainMenu.this, CameraActivity.class));
        menu.findItem(R.id.payment_and_billing).setIntent(new Intent(MainMenu.this, CustomerpaymentActivity.class));


        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.new_customer_entry || id == R.id.session_page_title|| id == R.id.customer_list_title || id == R.id.take_photo || id == R.id.payment_and_billing) {
            super.onOptionsItemSelected(item);
            Intent intent = new Intent(MainMenu.this, NewCustomerEntryActivity.class);
            startActivity(item.getIntent());
        }


        return true;





}






































}
