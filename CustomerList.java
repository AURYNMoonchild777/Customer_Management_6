package com.bignerdranch.android.customer_management;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Picture;
import android.net.LocalSocketAddress;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bignerdranch.android.customer_management.Customer_List_Database_Package.Customer_List_Database;
import com.bignerdranch.android.customer_management.Customer_List_Database_Package.Customer_List_Database_Helper;
import com.bignerdranch.android.customer_management.Customer_List_Database_Package.Customer_List_Database.CustomerListTable;

import java.util.jar.Attributes;

public class CustomerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_list);
    }



    private static ContentValues getContentValues() {

        ContentValues values = new ContentValues(3);
        values.put(CustomerListTable.cols.UUID, "ID");
        values.put(CustomerListTable.cols.NAMES, "Names");
        values.put(CustomerListTable.cols.PICTURES, "Pictures");

        return values;

    }
    private static NewCustomerEntryActivity sNewCustomerEntryActivity;

    private Context mContext;
    private SQLiteDatabase mDatabase;


    private CustomerList(Context context) {
        mContext = context.getApplicationContext();
        mDatabase = new Customer_List_Database_Helper(mContext)
                .getWritableDatabase();


    }

    public void addCustomer(CustomerList customer){
        ContentValues values = getContentValues();

        mDatabase.insert(CustomerListTable.NAME, null, values);
    }

    public void updateCustomerList(CustomerList customer) {
        String uuidString = customer.toString();
        ContentValues values = getContentValues();

        mDatabase.update(CustomerListTable.NAME, values,
                CustomerListTable.cols.UUID + " = ?",
                new String[] {uuidString});
    }





}
