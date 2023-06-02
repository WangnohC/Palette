package com.android.demo.palette.containers;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.android.demo.palette.R;

public class ViewPagerActivity extends AppCompatActivity {
    private static final String TAG = "view_pager";
    private ViewPager2 mViewPager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_containers_view_pager);
        } catch (RuntimeException e) {
            Log.i(TAG, "ViewPagerActivity setContentView exception");
            e.printStackTrace();
            finish();
        }

        mViewPager = findViewById(R.id.view_pager);
        mViewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                super.onPageScrollStateChanged(state);
            }
        });
        mViewPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);
        mViewPager.setAdapter(new ViewPagerAdapter(this));
        Log.i(TAG, "ViewPagerActivity onCreate end");
    }
}
