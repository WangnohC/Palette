package com.android.demo.palette;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.containers.ScrollViewActivity;
import com.android.demo.palette.containers.ViewPagerActivity;

public class ContainersActivity extends AppCompatActivity {
    private static final String TAG = "containers_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_containers);
        findViewById(R.id.scroll_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from ContainersActivity to ScrollViewActivity");
                startActivity(new Intent(ContainersActivity.this, ScrollViewActivity.class));
            }
        });
        findViewById(R.id.view_pager).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from ContainersActivity to ViewPagerActivity");
                startActivity(new Intent(ContainersActivity.this, ViewPagerActivity.class));
            }
        });
    }
}
