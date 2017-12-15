package com.example.ramya.mvvm_example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DataDetailsActivity extends AppCompatActivity {

    private ArrayList<Data> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_details);
        dataList = new ArrayList<>();

        Data data = new Data();
        data.setAge("123");
        data.setName("abcd");

        Data data1 = new Data();
        data1.setAge("1234");
        data1.setName("ramya");

        Data data2 = new Data();
        data2.setAge("12345");
        data2.setName("abcdeft");

        dataList.add(data1);
        dataList.add(data1);
        dataList.add(data1);
        dataList.add(data1);

        RecyclerView rvDataList = (RecyclerView) findViewById(R.id.rv_data_list);
        DataDetailsAdapter adapter = new DataDetailsAdapter(dataList);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);
        rvDataList.setLayoutManager(manager);
        rvDataList.setAdapter(adapter);
    }
}
