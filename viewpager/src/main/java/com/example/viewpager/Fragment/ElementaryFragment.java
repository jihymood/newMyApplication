package com.example.viewpager.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatRadioButton;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager.R;
import com.example.viewpager.adapter.ZhuangbiListAdapter;
import com.example.viewpager.api.NetWorkManager;
import com.example.viewpager.bean.ZhuangBi;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by HASEE on 2017/6/7 14:16
 */

public class ElementaryFragment extends BaseFragment {

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

    private ZhuangbiListAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_elementary, null);
        ButterKnife.bind(this, view);

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
                search(searchRb1.getText().toString());
                break;
            case R.id.searchRb2:
                swipeRefreshLayout.setRefreshing(true);
                search(searchRb2.getText().toString());
                break;
            case R.id.searchRb3:
                swipeRefreshLayout.setRefreshing(true);
                search(searchRb3.getText().toString());
                break;
            case R.id.searchRb4:
                swipeRefreshLayout.setRefreshing(true);
                search(searchRb4.getText().toString());
                break;
        }
    }

    private void search(String key) {
        NetWorkManager.zhuangBiApi()
                .search(key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<ZhuangBi>>() {
                    @Override
                    public void call(List<ZhuangBi> zhuangBis) {
                        swipeRefreshLayout.setRefreshing(false);
                        Log.e("ElementaryFragment", "zhuangBis:" + zhuangBis.size());
                        // 表格布局，第一个参数表示上下文，第二个参数表示表格有多少列
                        gridRv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
                        adapter = new ZhuangbiListAdapter(getActivity(), zhuangBis);
                        gridRv.setAdapter(adapter);

//                        swipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW);
//                        swipeRefreshLayout.setEnabled(false);
                    }
                });
    }

}
