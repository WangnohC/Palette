package com.android.demo.palette.legacy;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.demo.palette.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GridViewActivity extends AppCompatActivity {
    private static final String TAG = "grid_view";
    private static final int IMAGE[] = { R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4 };

    private GridView mGridView;
    private List<Map<String, Object>> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_legacy_grid_view);
        } catch (RuntimeException e) {
            Log.i(TAG, "GridViewActivity setContentView exception");
            e.printStackTrace();
            finish();
        }
        mGridView = findViewById(R.id.grid_view);
        mList = new ArrayList<>();
        for (int i = 0; i < IMAGE.length; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("image", IMAGE[i]);
            map.put("text", "图片" + i);
            mList.add(map);
        }
        MyAdapter adapter = new MyAdapter();
        mGridView.setAdapter(adapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(GridViewActivity.this,
                        mList.get(position).get("text").toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        Log.i(TAG, "GridViewActivity onCreate end");
    }

    class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return mList.size();
        }

        @Override
        public Object getItem(int position) {
            return mList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder = null;
            if (convertView == null) {
                convertView = LayoutInflater.from(GridViewActivity.this).inflate(R.layout.grid_view_item, null);
                holder = new ViewHolder();
                holder.imageView = (ImageView) convertView.findViewById(R.id.grid_img);
                holder.textView = (TextView) convertView.findViewById(R.id.grid_tv);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }
            holder.imageView.setImageResource((Integer) mList.get(position).get("image"));
            holder.textView.setText((String) mList.get(position).get("text"));
            return convertView;
        }
    }

    class ViewHolder {
        ImageView imageView;
        TextView textView;
    }
}
