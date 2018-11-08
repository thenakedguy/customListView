package com.example.hngdng.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    lv =(ListView)findViewById(R.id.lv1);
    ///////// Tạo danh sách
        List<HashMap<String,Object>> ds = new ArrayList<HashMap<String,Object>>();
        /// Tạo đối tượng
        HashMap<String,Object> hashMap = new HashMap<String,Object>();
        hashMap.put("hinh",R.drawable.ic_launcher_background);
        hashMap.put("ten","Dang");
        hashMap.put("tuoi",18);
        ds.add(hashMap);
        hashMap.put("hinh",R.drawable.ic_launcher_background);
        hashMap.put("ten","Hong");
        hashMap.put("tuoi",22);
        ds.add(hashMap);
        String[] from = {"hinh","ten","tuoi"};
        int[] to = {R.id.imageView, R.id.textView, R.id.textView2};
        SimpleAdapter adapter = new SimpleAdapter(this,ds,R.layout.sample_my_view,from,to);
        lv.setAdapter(adapter);

    }
}
