package com.android.demo.palette;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.legacy.GridViewActivity;
import com.android.demo.palette.legacy.ListViewActivity;
import com.android.demo.palette.legacy.RelativeLayoutActivity;

public class LegacyActivity extends AppCompatActivity {
    private static final String TAG = "legacy_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legacy);
        findViewById(R.id.grid_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from LegacyActivity to GridViewActivity");
                startActivity(new Intent(LegacyActivity.this, GridViewActivity.class));
            }
        });
        findViewById(R.id.list_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from LegacyActivity to ListViewActivity");
                startActivity(new Intent(LegacyActivity.this, ListViewActivity.class));
            }
        });
        findViewById(R.id.relative_layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from LegacyActivity to RelativeLayoutActivity");
                startActivity(new Intent(LegacyActivity.this, RelativeLayoutActivity.class));
            }
        });
    }
}
