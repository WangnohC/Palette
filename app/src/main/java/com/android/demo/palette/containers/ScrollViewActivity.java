package com.android.demo.palette.containers;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

public class ScrollViewActivity extends AppCompatActivity {
    private static final String TAG = "scroll_view";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_containers_scroll_view);
        } catch (RuntimeException e) {
            Log.i(TAG, "ScrollViewActivity setContentView exception");
            e.printStackTrace();
            finish();
        }
        Log.i(TAG, "ScrollViewActivity onCreate end");
    }
}
