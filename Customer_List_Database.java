package com.bignerdranch.android.customer_management.Customer_List_Database_Package;


import android.content.ContentValues;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.bignerdranch.android.customer_management.CustomerList;


public class Customer_List_Database {
    public static final class CustomerListTable {

        public static final String NAME = "Customer_List";

        public static final class cols {
            public static final String UUID = "ID";
            public static final String NAMES = "Names";
            public static final String PICTURES = "Pictures";

        }




    }
}