package com.android.demo.palette;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.layouts.LinearLayoutActivity;
import com.android.demo.palette.layouts.TableLayoutActivity;

public class LayoutsActivity extends AppCompatActivity {
    private static final String TAG = "layouts_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layouts);
        findViewById(R.id.linear_layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from LayoutsActivity to LinearLayoutActivity");
                startActivity(new Intent(LayoutsActivity.this, LinearLayoutActivity.class));
            }
        });
        findViewById(R.id.table_layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from LayoutsActivity to TableLayoutActivity");
                startActivity(new Intent(LayoutsActivity.this, TableLayoutActivity.class));
            }
        });
    }
}
