package com.example.drawlayout.netease.module.music.nba;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.drawlayout.R;
import com.example.drawlayout.netease.model.NBA;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NBAFragment extends Fragment implements NBAIview {


    @Bind(R.id.recyleView)
    RecyclerView recyleView;
    @Bind(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;

    private NBA.ResultBean resultBean;
    private NBALiveRecyclerAdapter adapter;
    private NBAIpresenter ipresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nba, container, false);
        ButterKnife.bind(this, view);


//        adapter = new NBARecyclerViewAdapter(getActivity());
        adapter = new NBALiveRecyclerAdapter(getActivity());
        ipresenter = new NBAIpresenterImpl(this);

        recyleView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyleView.setAdapter(adapter);
        ipresenter.subscribe();  //根据情况来，如果数据不是动态设置给xxAdapter


        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void setDataToAdapter(List<Object> list) {

        adapter.setList(list);
    }

    @Override
    public void showDialog() {
        Toast.makeText(getActivity(), "失败鸟", Toast.LENGTH_SHORT).show();
    }
}
