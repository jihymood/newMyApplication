package com.example.rxjava_example.Fragment;

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

import com.example.rxjava_example.R;
import com.example.rxjava_example.adapter.ZhuangbiListAdapter;
import com.example.rxjava_example.api.NetWork;
import com.example.rxjava_example.bean.ZhuangBi;

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
                search(searchRb1.getText().toString());
                break;
            case R.id.searchRb2:
                break;
            case R.id.searchRb3:
                break;
            case R.id.searchRb4:
                break;
        }
    }

    private void search(String key) {
        NetWork.zhuangBiApi()
                .search(key)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<List<ZhuangBi>>() {
                    @Override
                    public void call(List<ZhuangBi> zhuangBis) {
                        Log.e("ElementaryFragment", "zhuangBis:" + zhuangBis.size());
                        gridRv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
                        gridRv.setAdapter(new ZhuangbiListAdapter(getActivity(),zhuangBis));

//                        swipeRefreshLayout.setColorSchemeColors(Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW);
//                        swipeRefreshLayout.setEnabled(false);
                    }
                });
    }
}
