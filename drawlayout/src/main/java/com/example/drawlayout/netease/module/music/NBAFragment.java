package com.example.drawlayout.netease.module.music;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawlayout.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NBAFragment extends Fragment implements NBAIView{


    @Bind(R.id.recyleView)
    RecyclerView recyleView;
    @Bind(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;

    NBAIpresenterImpl ipresenter;
    NBARecyclerAdapter adapter;

    public NBAFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nba, container, false);
        ButterKnife.bind(this, view);

        adapter = new NBARecyclerAdapter();
        ipresenter = new NBAIpresenterImpl(this);
        recyleView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyleView.setAdapter(adapter);
        ipresenter.subscribe();




        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void setData(List<Object> list) {
        adapter.setList(list);
    }
}
