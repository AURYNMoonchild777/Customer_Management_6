package com.bignerdranch.android.customer_management;

import android.content.Intent;
import android.os.StrictMode;
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





public class TrainerActivity extends AppCompatActivity {

    Button b1;
    EditText ed1, ed2;

    TextView tx1;


    private static final String TAG = "TrainerActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());

        setContentView(R.layout.activity_trainer);
        Log.d(TAG, "onCreate(Bundle) called");

        EditText jdoe = (EditText) findViewById(R.id.editText);
        EditText welcome1 = (EditText) findViewById(R.id.editText2);

        b1 = (Button) findViewById(R.id.button);

        ed1 = (EditText) findViewById(R.id.editText);

        ed2 = (EditText) findViewById(R.id.editText2);


        tx1 = (TextView) findViewById(R.id.textview);
        tx1.setVisibility(View.GONE);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("jdoe") &&
                        ed2.getText().toString().equals("welcome1")) {
                    Toast.makeText(getApplicationContext(),
                            "Login successful!", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(getApplicationContext(), "Login unsuccessful.", Toast.LENGTH_SHORT).show();

                    tx1.setVisibility(View.VISIBLE);
                    tx1.setBackgroundColor(Color.RED);

                }
            }
        });


    }
    public void onClick(View view) {
        Intent intent = new Intent(TrainerActivity.this, MainMenu.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        menu.findItem(R.id.new_customer_entry).setIntent(new Intent(TrainerActivity.this, NewCustomerEntryActivity.class));
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.new_customer_entry) {
            super.onOptionsItemSelected(item);
            Intent intent = new Intent(TrainerActivity.this, NewCustomerEntryActivity.class);
            startActivity(item.getIntent());
        }


        return true;




    }





    }

