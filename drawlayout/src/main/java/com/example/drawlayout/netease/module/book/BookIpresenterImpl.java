package com.example.drawlayout.netease.module.book;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

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
    private int mPage;
    private Context context;

    public BookIpresenterImpl(Context context, IBookView iBookView) {
        this.iBookView = iBookView;
        this.context = context;
    }

    @Override
    public void subscribe() {
        getHotList(true);
    }

    @Override
    public void unSubscribe() {
        if (!subscription.isDisposed() && subscription != null) {
            subscription.dispose();
        }
    }

    @Override
    public void getHotList(final boolean isFresh) {
        if (isFresh) {
            mPage = 1;
            iBookView.showSwipeLoading();
        } else {
            mPage++;
        }

        subscription = ApiManager.getDoubaiApi()
                .getMeizi("福利", 10, mPage)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Meizi>() {
                    @Override
                    public void accept(@NonNull Meizi meizi) throws Exception {
                        iBookView.hideSwipeLoading();
                        iBookView.setBookHotList(meizi.getResults());
                        iBookView.setLoading();
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(@NonNull Throwable throwable) throws Exception {
                        iBookView.hideSwipeLoading();
                        Toast.makeText(context, iBookView.getCategoryName() + " 列表数据获取失败！", Toast.LENGTH_SHORT).show();
                        Log.e("BookIpresenterImpl", throwable.getMessage());
                    }
                });
    }
}
