package com.example.drawlayout.netease.module.music;

import android.util.Log;

import com.example.drawlayout.netease.api.ApiManager;
import com.example.drawlayout.netease.model.NBA;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by HASEE on 2017/7/4 10:31
 */

public class NBAIpresenterImpl implements NBAIpresenter {

    private NBAIView nbaiView;
    private Disposable subscription;

    public NBAIpresenterImpl(NBAIView nbaiView) {
        this.nbaiView = nbaiView;
    }

    @Override
    public void subscribe() {
        getNba();
    }

    @Override
    public void unSubscribe() {
        if (subscription != null && !subscription.isDisposed()) {
            subscription.dispose();
        }
    }


    @Override
    public void getNba() {
        subscription = ApiManager.getNbAapi()
                .getNBA("98020a1e920819b8ff4fcfbdd7747f8c")
//                .getNBA()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<NBA>() {
                    @Override
                    public void accept(@NonNull NBA nba) throws Exception {
                        List<Object> list = new ArrayList<>();
                        List<NBA.ResultBean.ListBean> list1 = nba.getResult().getList();
                        for (NBA.ResultBean.ListBean listBean : list1) {
                            list.addAll(listBean.getTr());
                        }
                        nbaiView.setData(list);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e("NBAIpresenterImpl", throwable.getMessage());
                    }
                }, new Action() {
                    @Override
                    public void run() throws Exception {

                    }
                });
    }
}
