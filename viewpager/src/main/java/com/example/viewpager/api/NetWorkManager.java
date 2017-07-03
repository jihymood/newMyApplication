package com.example.viewpager.api;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HASEE on 2017/6/7 16:14
 */

public class NetWorkManager {

    private static NetWorkManager instance;
    private static ZhuangBiApi zhuangbiApi;
    private static GankApi gankApi;

    public NetWorkManager getInstance(Context context) {
        if (instance == null) {
            instance = new NetWorkManager();
        }
        return instance;
    }

    public static ZhuangBiApi zhuangBiApi() {
        if (zhuangbiApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://www.zhuangbi.info/")
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            zhuangbiApi = retrofit.create(ZhuangBiApi.class);
        }
        return zhuangbiApi;
    }

    public static GankApi gankApi() {
        if (gankApi == null) {
            gankApi = new Retrofit.Builder()
                    .baseUrl("http://gank.io/api/")
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
                    .create(GankApi.class);
        }
        return gankApi;
    }

}
