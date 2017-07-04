package com.example.drawlayout.netease.module.book;

import android.util.Log;

import com.example.drawlayout.netease.api.ApiManager;
import com.example.drawlayout.netease.model.Meizi;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;


/**
 * Created by HASEE on 2017/7/3 15:35
 */

public class BookIpresenterImpl implements BookIpresenter {

    private IBookView iBookView;  //通过构造函数传进来初始化才能在该类中使用
    private Disposable subscription;

    public BookIpresenterImpl(IBookView iBookView) {
        this.iBookView = iBookView;
    }

    @Override
    public void subscribe() {
        getHotList();
    }

    @Override
    public void unSubscribe() {
        if (!subscription.isDisposed()&&subscription != null) {
            subscription.dispose();
        }
    }

    @Override
    public void getHotList() {
        subscription = ApiManager.getDoubaiApi()
                .getMeizi("福利", 10, 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Meizi>() {
                    @Override
                    public void accept(@NonNull Meizi meizi) throws Exception {
                        iBookView.setBookHotList(meizi.getResults());
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e("BookIpresenterImpl", throwable.getMessage());
                    }
                });
    }
}
