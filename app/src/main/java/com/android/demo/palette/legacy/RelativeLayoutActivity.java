package com.android.demo.palette.legacy;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

public class RelativeLayoutActivity extends AppCompatActivity {
    private static final String TAG = "relative_layout";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_legacy_relative_layout);
        } catch (RuntimeException e) {
            Log.i(TAG, "RelativeLayoutActivity setContentView exception");
            e.printStackTrace();
            finish();
        }
    }
}
