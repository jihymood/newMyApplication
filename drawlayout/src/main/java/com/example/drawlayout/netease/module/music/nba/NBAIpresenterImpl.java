package com.example.drawlayout.netease.module.music.nba;

import com.example.drawlayout.netease.model.NBA;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import io.reactivex.disposables.Disposable;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by HASEE on 2017/7/7 17:29
 */

public class NBAIpresenterImpl implements NBAIpresenter {
    private NBAIview iview;
    private Disposable disposable;

    public NBAIpresenterImpl(NBAIview iview) {
        this.iview = iview;
    }

    @Override
    public void subscribe() {
        getNbaData();
    }

    @Override
    public void unSubscribe() {
        if (disposable != null && !disposable.isDisposed()) {
            disposable.dispose();
        }
    }

//    @Override
//    public void getNbaData() {
//        ApiManager.getNbAapi1()
//                .getNBA1("ffe36f382253dde1ead7a592178a9454")
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Observer<NBA>() {
//                    @Override
//                    public void onSubscribe(Disposable d) {
//
//                    }
//
//                    @Override
//                    public void onNext(NBA nba) {
//                        NBA.ResultBean result = nba.getResult();
//                        iview.setDataToAdapter(result);
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        e.printStackTrace();
//                        iview.showDialog();
//                        Log.e("NBAIpresenterImpl", e.getMessage());
//                    }
//
//                    @Override
//                    public void onComplete() {
//
//                    }
//                });
//    }

    @Override
    public void getNbaData() {
        String url = "http://api.m.mtime.cn/PageSubArea/TrailerList.api";
        String url2 = "http://op.juhe.cn/onebox/basketball/nba?key=98020a1e920819b8ff4fcfbdd7747f8c";
        String url3 = "http://v.juhe.cn/nba/all_team_info.php?key=ffe36f382253dde1ead7a592178a9454";

        //创建okHttpClient对象
        OkHttpClient mOkHttpClient = new OkHttpClient();
        //创建一个Request
        final Request request = new Request.Builder()
                .url(url3)
                .build();
        //new call
        okhttp3.Call call = mOkHttpClient.newCall(request);
        //请求加入调度
        call.enqueue(new okhttp3.Callback() {
            @Override
            public void onFailure(okhttp3.Call call, IOException e) {
//                text.setText(e.getMessage().toString());
                iview.showDialog();
            }

            @Override
            public void onResponse(okhttp3.Call call, okhttp3.Response response) throws IOException {
                final String json = response.body().string();
                Gson gson = new Gson();
                NBA nba = gson.fromJson(json, NBA.class);
                NBA.ResultBean result = nba.getResult();
                if (result != null) {

                    NBA.ResultBean._$1Bean list_$1 = result.get_$1();
                    NBA.ResultBean._$2Bean list_$2 = result.get_$2();
                    NBA.ResultBean._$4Bean list_$4 = result.get_$4();

                    List<Object> list = new ArrayList<>();
                    list.add(list_$1);
                    list.add(list_$2);
                    list.add(list_$4);
                    iview.setDataToAdapter(list);
                }
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Log.e(TAG, "onResponse:" + json);
//                        Gson gson = new Gson();
//                        NBA nba ;
//                        nba = gson.fromJson(json, NBA.class);
//                        text.setText(nba.getReason());
//                    }
//                });
//                runOnUiThread(new Runnable() {
//                    @Override
//                    public void run() {
//                        Log.e(TAG, "onResponse:" + json);
//                        Gson gson = new Gson();
//                        DoubanBook doubanBook ;
//                        doubanBook = gson.fromJson(json, DoubanBook.class);
//                        text.setText(doubanBook.getTrailers().get(0).getSummary());
//                    }
//                });
            }
        });
    }
}
