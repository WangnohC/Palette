package com.android.demo.palette.layouts;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

public class LinearLayoutActivity extends AppCompatActivity {
    private static final String TAG = "linear_layout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_layouts_linear_layout);
        } catch (RuntimeException e) {
            Log.i(TAG, "LinearLayoutActivity setContentView exception");
            e.printStackTrace();
            finish();
        }
        Log.i(TAG, "LinearLayoutActivity onCreate end");
    }
}
