package com.example.recyclerview;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.recyclerview.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FirstActivity extends AppCompatActivity {

    @Bind(R.id.recycleView)
    RecyclerView recycleView;
    @Bind(R.id.refresh)
    SwipeRefreshLayout refresh;
    RecyclerViewAdapter recyclerViewAdapter;
    private List<Integer> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButterKnife.bind(this);

        initData();
        recyclerViewAdapter = new RecyclerViewAdapter(list, this);
        recycleView.setLayoutManager(new GridLayoutManager(this, 3));
        recycleView.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.setOnItemClickListener(new RecyclerViewAdapter.onItemClickListener() {
            @Override
            public void onItemClick() {
                Toast.makeText(FirstActivity.this, "点我的是傻逼", Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void initData() {
        list = new ArrayList<>();
        list.add(R.mipmap.ic_launcher);
        list.add(R.mipmap.ic_launcher);
        list.add(R.mipmap.ic_launcher);
        list.add(R.mipmap.ic_launcher);
    }
}
