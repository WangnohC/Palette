package com.android.demo.palette;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "main_activity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.containers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from MainActivity to ContainersActivity");
                startActivity(new Intent(MainActivity.this, ContainersActivity.class));
            }
        });
        findViewById(R.id.layouts).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from MainActivity to LayoutsActivity");
                startActivity(new Intent(MainActivity.this, LayoutsActivity.class));
            }
        });
        findViewById(R.id.legacy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from MainActivity to LegacyActivity");
                startActivity(new Intent(MainActivity.this, LegacyActivity.class));
            }
        });
        findViewById(R.id.widgets).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from MainActivity to WidgetsActivity");
                startActivity(new Intent(MainActivity.this, WidgetsActivity.class));
            }
        });
    }
}