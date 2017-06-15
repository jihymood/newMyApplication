package com.example.viewpager.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager.GankBeautyResultToItemsMapper;
import com.example.viewpager.R;
import com.example.viewpager.adapter.ConvertAdapter;
import com.example.viewpager.api.NetWorkManager;
import com.example.viewpager.bean.ZhuangBi;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func2;
import rx.schedulers.Schedulers;

/**
 * Created by HASEE on 2017/6/7 14:55
 */

public class ZipFragment extends BaseFragment {

    @Bind(R.id.gridRv)
    RecyclerView gridRv;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    private ConvertAdapter convertAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zip, null);
        ButterKnife.bind(this, view);

        swipeRefreshLayout.setRefreshing(true);
        getZip();

        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    public void getZip() {

        Observable.zip(NetWorkManager.zhuangBiApi().search("装逼"),
                NetWorkManager.gankApi().getBeauties(10, 1).map(GankBeautyResultToItemsMapper.getInstance())
                , new Func2<List<ZhuangBi>, List<ZhuangBi>, List<ZhuangBi>>() { //前一个，后一个，混合在一起
                    @Override
                    public List<ZhuangBi> call(List<ZhuangBi> zhuangBis, List<ZhuangBi> zhuangBis2) {
                        /**
                         * List<ZhuangBi> call(List<ZhuangBi> zhuangBis, List<ZhuangBi> zhuangBis2)
                         * 对应：混合在一起 ，前一个，后一个
                         * 最后返回"混合在一起"
                         */
                        List<ZhuangBi> zipItemList = new ArrayList<ZhuangBi>();
                        for (int i = 0; i < zhuangBis.size() && i < zhuangBis2.size(); i++) {
                            zipItemList.add(zhuangBis.get(i)); //添加第一个集合的长度
                            zipItemList.add(zhuangBis2.get(i)); //添加第二个集合的长度
                            ZhuangBi zhuangBiItem = new ZhuangBi(); //混合的
                            zhuangBiItem.setImage_url(zhuangBis2.get(i).getImage_url());
                            zhuangBiItem.setDescription(zhuangBis2.get(i).getDescription());
                            zipItemList.add(zhuangBiItem);
                        }
                        return zipItemList;
                    }

                })
                .subscribeOn(Schedulers.newThread())
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
                        gridRv.setLayoutManager(new GridLayoutManager(getActivity(), 4));
                        convertAdapter = new ConvertAdapter(zhuangBis);
                        gridRv.setAdapter(convertAdapter);
                    }
                });
    }


}


