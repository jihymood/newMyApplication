package com.example.recyclerview.callback1;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.recyclerview.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.example.recyclerview.R.id.refresh;

public class FirstActivity extends AppCompatActivity implements OnRefreshListener {

    @Bind(R.id.recycleView)
    RecyclerView recycleView;
    @Bind(refresh)
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerViewAdapter recyclerViewAdapter;
    private List<Integer> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButterKnife.bind(this);
        swipeRefreshLayout.setOnRefreshListener(this);
        /*******四种色彩变换的进度条样式********/
        swipeRefreshLayout.setColorSchemeResources(R.color.colorAccent, R.color.mediumSpringGreen,
                R.color.yellow, R.color.orangeRed);
        /**设置手指在屏幕下拉多少距离会触发下拉刷新**/
        swipeRefreshLayout.setDistanceToTriggerSync(100);
        /**设定下拉圆圈的背景**/
        swipeRefreshLayout.setProgressBackgroundColor(R.color.orangeRed);//圈的背景
        /**设置圆圈的大小**/
        swipeRefreshLayout.setSize(SwipeRefreshLayout.LARGE);

        initData();
        recyclerViewAdapter = new RecyclerViewAdapter(list, this);
//        recycleView.setLayoutManager(new GridLayoutManager(this, 3));
        recycleView.setLayoutManager(new LinearLayoutManager(this));
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

    @Override
    public void onRefresh() {
        Toast.makeText(this, "刷新", Toast.LENGTH_SHORT).show();
    }
}
