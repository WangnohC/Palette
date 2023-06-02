package com.android.demo.palette.widgets;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

public class VideoViewActivity extends AppCompatActivity {
    private VideoView mVideoView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_video_view);
        mVideoView = findViewById(R.id.video_view);
        mVideoView.setMediaController(new MediaController(this));
        String videoUrl = "http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4";
        Uri videoUri = Uri.parse(videoUrl);
        mVideoView.setVideoURI(videoUri);
        findViewById(R.id.video_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVideoView.start();
            }
        });
        findViewById(R.id.video_pause).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mVideoView.pause();
            }
        });
    }
}
