package com.android.demo.palette.widgets;

import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

import java.net.MalformedURLException;
import java.net.URL;

public class ImageViewActivity extends AppCompatActivity {
    private ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_image_view);
        mImageView = findViewById(R.id.image_view);
        mImageView.setImageResource(R.drawable.image1);
    }
}
