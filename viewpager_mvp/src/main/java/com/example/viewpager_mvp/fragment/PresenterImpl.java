package com.example.viewpager_mvp.fragment;

import android.util.Log;

import com.example.viewpager_mvp.api.NetWorkManager;
import com.example.viewpager_mvp.model.Meizi;
import com.example.viewpager_mvp.model.PictureModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by HASEE on 2017/6/30 09:45
 */

public class PresenterImpl implements IPresenter {

    private IFragmentView iFragmentView;

    public PresenterImpl(IFragmentView iFragmentView) {
        this.iFragmentView = iFragmentView;
    }

    @Override
    public void subscribe() {
        geItems();
    }

    @Override
    public void unSubscribe() {

    }

    @Override
    public void geItems() {

        NetWorkManager.getGankApi()
                .getMeiZi(iFragmentView.getTitle(), "10", 1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Meizi>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        e.printStackTrace();
                        Log.e("PresenterImpl", "失败");
                    }

                    @Override
                    public void onNext(Meizi meizi) {
                        List<Meizi.ResultsBean> results = meizi.getResults();
                        List<PictureModel> list = new ArrayList<PictureModel>();
                        for (Meizi.ResultsBean result : results) {
                            PictureModel pictureModel = new PictureModel();
                            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SS");
                            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date parse = null;
                            String format = null;
                            try {
                                parse = inputFormat.parse(result.getCreatedAt());
                                format = outputFormat.format(parse);
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                            pictureModel.createdAt = format;
                            pictureModel.url = result.getUrl();
                            pictureModel.desc = result.getDesc();
                            pictureModel.source = result.getSource();
                            pictureModel.who = result.getWho();
                            pictureModel.images=result.images;
                            list.add(pictureModel);
                        }
                        iFragmentView.setCategoryItems(list);
                    }
                });

    }
}
