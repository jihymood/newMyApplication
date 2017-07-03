package com.example.viewpager.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager.R;
import com.example.viewpager.adapter.ZhuangbiListAdapter1;
import com.example.viewpager.api.NetWorkManager;
import com.example.viewpager.bean.ZhuangBi;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by HASEE on 2017/6/21 18:45
 */

public class ElementaryFragment1 extends Fragment {


    @Bind(R.id.searchRb1)
    AppCompatRadioButton searchRb1;
    @Bind(R.id.searchRb2)
    AppCompatRadioButton searchRb2;
    @Bind(R.id.searchRb3)
    AppCompatRadioButton searchRb3;
    @Bind(R.id.searchRb4)
    AppCompatRadioButton searchRb4;
    @Bind(R.id.gridRv)
    RecyclerView gridRv;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;


    private ZhuangbiListAdapter1 adapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_elementary, null);
        ButterKnife.bind(this, super.onCreateView(inflater, container, savedInstanceState));
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @OnClick({R.id.searchRb1, R.id.searchRb2, R.id.searchRb3, R.id.searchRb4})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.searchRb1:
                swipeRefreshLayout.setRefreshing(true);
                getData(searchRb1.getText().toString());
                break;
            case R.id.searchRb2:
                getData(searchRb2.getText().toString());
                break;
            case R.id.searchRb3:
                getData(searchRb3.getText().toString());
                break;
            case R.id.searchRb4:
                getData(searchRb4.getText().toString());
                break;
        }
    }

    public void getData(String text) {
        NetWorkManager.zhuangBiApi()
                .search(text)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<ZhuangBi>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<ZhuangBi> zhuangBis) {
                        swipeRefreshLayout.setRefreshing(false);
                        adapter = new ZhuangbiListAdapter1(zhuangBis, getActivity());
                        gridRv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
                        gridRv.setAdapter(adapter);
                    }
                });
    }
}
