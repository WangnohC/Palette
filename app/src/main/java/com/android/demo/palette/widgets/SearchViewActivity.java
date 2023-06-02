package com.android.demo.palette.widgets;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

import java.util.ArrayList;

public class SearchViewActivity extends AppCompatActivity {
    private SearchView mSearchView;
    private ListView mListView;
    private ArrayList<String> mList;
    private ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_search_view);
        mSearchView = findViewById(R.id.search_view);
        mListView = findViewById(R.id.list_view);

        mList = new ArrayList<>();
        mList.add("Apple");
        mList.add("Banana");
        mList.add("Pineapple");
        mList.add("Orange");
        mList.add("Lychee");

        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mList);
        mListView.setAdapter(mAdapter);

        mSearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (mList.contains(query)) {
                    mAdapter.getFilter().filter(query);
                } else {
                    Toast.makeText(SearchViewActivity.this, "No Match found", Toast.LENGTH_LONG).show();
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }
}
