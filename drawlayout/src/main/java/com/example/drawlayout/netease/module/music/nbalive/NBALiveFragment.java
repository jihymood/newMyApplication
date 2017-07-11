package com.example.drawlayout.netease.module.music.nbalive;


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
import com.example.drawlayout.netease.model.NBALive;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class NBALiveFragment extends Fragment implements NBALiveIView {


    @Bind(R.id.recyleView)
    RecyclerView recyleView;
    @Bind(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;

    NBALiveIpresenterImpl ipresenter;
    NBALiveRecyclerAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nbalive, container, false);
        ButterKnife.bind(this, view);

        adapter = new NBALiveRecyclerAdapter(getActivity());
        ipresenter = new NBALiveIpresenterImpl(this);

        recyleView.setLayoutManager(new LinearLayoutManager(getActivity()));
//        recyleView.setLayoutManager(new GridLayoutManager(getActivity(),2));
        recyleView.setAdapter(adapter);
        ipresenter.subscribe();

        adapter.setOnItemClickListener(new NBALiveRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onClick() {
                Toast.makeText(getActivity(), "我被点击了额", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void setData(List<NBALive.ResultBean.ListBean.TrBean> list) {
        adapter.setList(list);
    }
}
