package com.android.demo.palette.legacy;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

public class ListViewActivity extends AppCompatActivity {
    private static final String TAG = "list_view";
    private static final String[] DATA = {"Apple", "Banana","Orange","Watermelon", "Pear","Grape","Pineapple"};

    private ListView mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_legacy_list_view);
        } catch (RuntimeException e) {
            Log.i(TAG, "ListViewActivity setContentView exception");
            e.printStackTrace();
            finish();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListViewActivity.this, android.R.layout.simple_list_item_1, DATA);
        mListView = findViewById(R.id.list_view);
        mListView.setAdapter(adapter);
        Log.i(TAG, "ListViewActivity onCreate end");
    }
}
