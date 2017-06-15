package com.example.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.recyclerview.adapter.RecyclerViewAdapter;
import com.example.recyclerview.adapter.RecyleViewAdapter1;
import com.jcodecraeer.xrecyclerview.LoadingMoreFooter;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.example.recyclerview.R.id.recyclerview_horizontal;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.xRecycleView)
    XRecyclerView xRecycleView;
    @Bind(R.id.load)
    LoadingMoreFooter load;
    private RecyclerView recyclerview;
    private RecyclerViewAdapter recyclerViewAdapter;
    private RecyleViewAdapter1 recyleViewAdapter1;
    private List<Integer> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initData();
        recyclerview = (RecyclerView) findViewById(recyclerview_horizontal);

        /*实现一*/
//        recyclerview.setLayoutManager(new GridLayoutManager(this, 3));
//        recyclerViewAdapter = new RecyclerViewAdapter(list, this);
//        recyclerview.setAdapter(recyclerViewAdapter);

        /*这个接口在MainActivity中实现（具体的实现）*/
//        recyclerViewAdapter.setOnItemClickListener(new RecyclerViewAdapter.onItemClickListener() {
//            @Override
//            public void onItemClick() {
//                Toast.makeText(MainActivity.this, "我被点击了", Toast.LENGTH_SHORT).show();
//            }
//        });

        /*实现二*/
//        recyclerview.setLayoutManager(new GridLayoutManager(this, 3));
//        recyleViewAdapter1 = new RecyleViewAdapter1(list);
//        recyclerview.setAdapter(recyleViewAdapter1);

        /*实现三*/
        recyleViewAdapter1 = new RecyleViewAdapter1(list);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        xRecycleView.setLayoutManager(layoutManager);
        xRecycleView.setAdapter(recyleViewAdapter1);

        xRecycleView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(MainActivity.this, "我是更新", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLoadMore() {
                xRecycleView.loadMoreComplete();
                Toast.makeText(MainActivity.this, "我是加载更多", Toast.LENGTH_SHORT).show();
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
