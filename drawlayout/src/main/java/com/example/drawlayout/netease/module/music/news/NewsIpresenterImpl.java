package com.example.drawlayout.netease.module.music.news;

import android.util.Log;

import com.example.drawlayout.netease.api.ApiManager;
import com.example.drawlayout.netease.model.News;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by HASEE on 2017/7/9 09:48
 */

public class NewsIpresenterImpl implements NewsIpresenter {

    private NewsIView iView;
    private Disposable disposable;

    public NewsIpresenterImpl(NewsIView iView) {
        this.iView = iView;
    }

    @Override
    public void subscribe() {
        getNews();
    }

    @Override
    public void unSubscribe() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }

    @Override
    public void getNews() {
        disposable = ApiManager.getNewsApi()
                .getNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<News>() {
                    @Override
                    public void accept(@NonNull News news) throws Exception {
                        List<News.T1348647909107Bean> newList = news.getT1348647909107();
                        iView.setData(newList);
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        Log.e("NewsIpresenterImpl", throwable.getMessage());
                        iView.showDialog();
                    }
                });
    }
}
