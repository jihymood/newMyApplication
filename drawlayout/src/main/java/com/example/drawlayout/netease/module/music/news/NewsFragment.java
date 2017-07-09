package com.example.drawlayout.netease.module.music.news;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.drawlayout.R;
import com.example.drawlayout.netease.model.News;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment implements NewsIView{


    @Bind(R.id.recyleView)
    RecyclerView recyleView;
    @Bind(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;
    private NewsIpresenter newsIpresenter;
    private NewsRecyclerAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nba, container, false);
        ButterKnife.bind(this, view);


        adapter = new NewsRecyclerAdapter(getActivity());
        newsIpresenter = new NewsIpresenterImpl(this);
        newsIpresenter.subscribe();

        recyleView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyleView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyleView.setAdapter(adapter);


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void showDialog() {
//        swipeRefresh.setRefreshing(false);
        Toast.makeText(getActivity(), "失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setData(List<News.T1348647909107Bean> list) {
        adapter.setmData(list);
    }
}
