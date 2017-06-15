package com.example.viewpager.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager.R;
import com.example.viewpager.adapter.ConvertAdapter;
import com.example.viewpager.api.NetWorkManager;
import com.example.viewpager.bean.GankBeautyResult;
import com.example.viewpager.bean.ZhuangBi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by HASEE on 2017/6/7 14:55
 */

public class MapFragment extends BaseFragment {

    RecyclerView gridRv;
    SwipeRefreshLayout swipeRefreshLayout;

    private ConvertAdapter convertAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map, null);
        gridRv = (RecyclerView) view.findViewById(R.id.gridRv);
        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipeRefreshLayout);

        swipeRefreshLayout.setRefreshing(true);
        getImages(1);

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void getImages(int keky) {
        NetWorkManager.gankApi()
                .getBeauties(10, keky)
                .map(new Func1<GankBeautyResult, List<ZhuangBi>>() {
                    @Override
                    public List<ZhuangBi> call(GankBeautyResult gankBeautyResult) {
                        List<GankBeautyResult.ResultsBean> results = gankBeautyResult.getResults();
                        List<ZhuangBi> zhuangBis = new ArrayList<ZhuangBi>();
                        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                        SimpleDateFormat outputFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

                        for (GankBeautyResult.ResultsBean result : results) {
                            ZhuangBi zhuangBi = new ZhuangBi();
                            String createdAt = result.getCreatedAt();
                            try {
                                Date parse = inputFormat.parse(createdAt);
                                String format = outputFormat.format(parse);
                                zhuangBi.setDescription(format);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            zhuangBi.setImage_url(result.getUrl());
                            zhuangBis.add(zhuangBi);
                        }
                        return zhuangBis;
                    }
                })
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
                        gridRv.setLayoutManager(new GridLayoutManager(getActivity(), 2));
                        convertAdapter = new ConvertAdapter(zhuangBis);
                        gridRv.setAdapter(convertAdapter);

                    }
                });
    }


}
