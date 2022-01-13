package com.example.recyclerview2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerAdapter adapter;
    RecyclerView recyclerView;
    ArrayList<Data> data;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        Adddata("개포");
        Adddata("개포");
        Adddata("개포");
        Adddata("개포");
        Adddata("개포");
        Adddata("잠실");

    }

    private void init() {
        recyclerView = findViewById(R.id.recyclerView);
        data = new ArrayList<>();

        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerAdapter(data, MainActivity.this);
        recyclerView.setAdapter(adapter);


        adapter.notifyDataSetChanged();
    }

    public void Adddata(String searchname) {

        data.add(new Data(searchname));


    }


}