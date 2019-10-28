package com.example.first;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;

public class ActivityList extends ListActivity {
    Handler handler;
    private ArrayList<HashMap<String,String>> listItem;
    private SimpleAdapter listItemAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initListView();
        this.setListAdapter(listItemAdapter);
    }
    private void initListView(){
        listItem =new ArrayList<HashMap<String,String>>();
        for(int i = 0;i<10;i++){
            HashMap<String,String> map = new HashMap<String,String>();
            map.put("ItemTitle","Rate:"+i);
            map.put("ItemTitle","detail:"+i);
            listItem.add(map);
        }
        listItemAdapter = new SimpleAdapter(this,listItem,R.layout.activity_list,
                new String[]{"ItemTitle","ItemDetail"},
                new int[]{R.id.open_list,R.id.setting});

    }
}

