package com.android.demo.palette;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.widgets.ImageViewActivity;
import com.android.demo.palette.widgets.SearchViewActivity;
import com.android.demo.palette.widgets.VideoViewActivity;
import com.android.demo.palette.widgets.WebViewActivity;

public class WidgetsActivity extends AppCompatActivity {
    private static final String TAG = "widgets_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets);
        findViewById(R.id.image_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from WidgetsActivity to ImageViewActivity");
                startActivity(new Intent(WidgetsActivity.this, ImageViewActivity.class));
            }
        });
        findViewById(R.id.search_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from WidgetsActivity to SearchViewActivity");
                startActivity(new Intent(WidgetsActivity.this, SearchViewActivity.class));
            }
        });
        findViewById(R.id.video_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from WidgetsActivity to VideoViewActivity");
                startActivity(new Intent(WidgetsActivity.this, VideoViewActivity.class));
            }
        });
        findViewById(R.id.web_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "from WidgetsActivity to WebViewActivity");
                startActivity(new Intent(WidgetsActivity.this, WebViewActivity.class));
            }
        });
    }
}
