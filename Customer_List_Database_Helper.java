package com.bignerdranch.android.customer_management.Customer_List_Database_Package;

import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.bignerdranch.android.customer_management.Customer_List_Database_Package.Customer_List_Database.CustomerListTable;

public class Customer_List_Database_Helper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "Customer_List_Database.db";
    public Customer_List_Database_Helper(Context context) {
        super (context, DATABASE_NAME, null, VERSION);
    }

@Override
    public void onCreate(SQLiteDatabase db) {

    db.execSQL(" create table " + CustomerListTable.NAME + "(" +
            " integer primary key autoincrement, " +
            CustomerListTable.cols.UUID + ", " +
            CustomerListTable.cols.NAMES + ", " +
            CustomerListTable.cols.PICTURES + ")"
    );








        ;

}

@Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion) {


}



}
