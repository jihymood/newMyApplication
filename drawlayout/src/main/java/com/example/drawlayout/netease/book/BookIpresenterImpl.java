package com.example.drawlayout.netease.book;

import android.util.Log;

import com.example.drawlayout.netease.api.ApiManager;
import com.example.drawlayout.netease.model.Meizi;

import java.util.List;

import rx.Observer;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by HASEE on 2017/7/3 15:35
 */

public class BookIpresenterImpl implements BookIpresenter {

    private IBookView iBookView;  //通过构造函数传进来初始化才能在该类中使用
    private Subscription subscription;

    public BookIpresenterImpl(IBookView iBookView) {
        this.iBookView = iBookView;
    }

    @Override
    public void subscribe() {
        getHotList();
    }

    @Override
    public void unSubscribe() {
        if (!subscription.isUnsubscribed() && subscription != null) {
            subscription.unsubscribe();
        }
    }

    @Override
    public void getHotList() {
        subscription = ApiManager.getDoubaiApi()
                .getMeizi("福利", 10, 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Meizi>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("BookIpresenterImpl", e.getMessage());
                    }

                    @Override
                    public void onNext(Meizi meizi) {
                        iBookView.refresh();
                        List<Meizi.ResultsBean> results = meizi.getResults();
                        iBookView.setBookHotList(results);
                    }
                });
    }
}
