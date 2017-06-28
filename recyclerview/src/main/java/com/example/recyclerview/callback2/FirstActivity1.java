package com.example.recyclerview.callback2;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FirstActivity1 extends AppCompatActivity implements ICallBack {

    @Bind(R.id.recycleView)
    RecyclerView recycleView;
    @Bind(R.id.refresh)
    SwipeRefreshLayout refresh;
    RecylerViewAdapter1 recyclerViewAdapter;
    private List<Integer> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first1);
        ButterKnife.bind(this);

        initData();
        //因为FirstActivity1实现了ICallBack接口，所以这里传入this
        recyclerViewAdapter = new RecylerViewAdapter1(list, this);
        recycleView.setLayoutManager(new GridLayoutManager(this, 3));
        recycleView.setAdapter(recyclerViewAdapter);


    }

    public void initData() {
        list = new ArrayList<>();
        list.add(R.mipmap.ic_launcher);
        list.add(R.mipmap.ic_launcher);
        list.add(R.mipmap.ic_launcher);
        list.add(R.mipmap.ic_launcher);
    }

    @Override
    public void onClick() {
        Toast.makeText(FirstActivity1.this, "点我的是傻逼hhhhhh", Toast.LENGTH_SHORT).show();
    }
}
