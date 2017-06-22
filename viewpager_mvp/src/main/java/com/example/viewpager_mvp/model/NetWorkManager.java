package com.example.viewpager_mvp.model;

import com.example.viewpager_mvp.api.GankiApi;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HASEE on 2017/6/22 10:47
 */

public class NetWorkManager {

    private static GankiApi gankiApi;

    public static GankiApi getGankApi() {
        if (gankiApi == null) {
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl("http://gank.io/api/")
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            gankiApi = retrofit.create(GankiApi.class);
        }
        return gankiApi;
    }
}
