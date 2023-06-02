package com.android.demo.palette.layouts;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

public class TableLayoutActivity extends AppCompatActivity {
    private static final String TAG = "table_layout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_layouts_table_layout);
        } catch (RuntimeException e) {
            Log.i(TAG, "TableLayoutActivity setContentView exception");
            e.printStackTrace();
            finish();
        }
        Log.i(TAG, "TableLayoutActivity onCreate end");
    }
}
