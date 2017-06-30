package com.example.viewpager_mvp.home;

import android.util.Log;

import com.example.viewpager_mvp.model.Meizi;
import com.example.viewpager_mvp.api.NetWorkManager;
import com.example.viewpager_mvp.model.PictureModel;

import java.util.ArrayList;
import java.util.List;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by HASEE on 2017/6/22 10:33
 */

public class PresenterImpl implements Ipresenter {

    private Subscription subscription;
    private IView iView;
    private List<PictureModel> pictureModels;

    public PresenterImpl(IView iView) {
        this.iView = iView;
        pictureModels = new ArrayList<>();
    }

    public List<PictureModel> getPictureModels() {
        return pictureModels;
    }

    @Override
    public void unSubscribe() {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }

    @Override
    public void subscribe() {
        getBannerData();

    }

    @Override
    public void getBannerData() {
        subscription = NetWorkManager.getGankApi()
                .getMeiZi("福利", "10", 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Meizi>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("PresenterImpl", e.getMessage());
                        iView.showBannerFail(e.getMessage());
                    }

                    @Override
                    public void onNext(Meizi meizi) {
                        if (meizi != null) {
                            List<Meizi.ResultsBean> results = meizi.getResults();
                            List<String> list = new ArrayList<>();
                            for (Meizi.ResultsBean result : results) {
                                PictureModel pictureModel = new PictureModel();
                                list.add(result.getUrl());
                                pictureModel.url = result.getUrl();
                                pictureModel.createdAt = result.getCreatedAt();
                                pictureModels.add(pictureModel);
                            }
                            iView.setBannerData(list);
                        } else {
                            iView.showBannerFail("失败");
                        }
                    }
                });
//                .subscribe(new Observer<Meizi>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        Log.e("PresenterImpl", e.getMessage());
//                        iView.showBannerFail(e.getMessage());
//                    }
//
//                    @Override
//                    public void onNext(Meizi meizi) {
//                        if (meizi != null) {
//                            List<Meizi.ResultsBean> results = meizi.getResults();
//                            List<String> list = new ArrayList<>();
//                            for (Meizi.ResultsBean result : results) {
//                                PictureModel pictureModel = new PictureModel();
//                                list.add(result.getUrl());
//                                pictureModel.url = result.getUrl();
//                                pictureModel.createdAt = result.getCreatedAt();
//                                pictureModels.add(pictureModel);
//                            }
//                            iView.setBannerData(list);
//                        } else {
//                            iView.showBannerFail("失败");
//                        }
//                    }
//                });
    }
}
