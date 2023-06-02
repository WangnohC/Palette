package com.android.demo.palette.widgets;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

public class WebViewActivity extends AppCompatActivity {
    private static final String TAG = "web_view";

    private WebView mBaseWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_web_view);
        mBaseWebView = findViewById(R.id.web_view);
        mBaseWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        mBaseWebView.getSettings().setJavaScriptEnabled(true);
        mBaseWebView.loadUrl("http://www.baidu.com");
        Log.i(TAG, "WebViewActivity onCreate end");
    }
}
