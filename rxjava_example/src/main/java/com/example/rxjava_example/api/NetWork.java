package com.example.rxjava_example.api;

import android.content.Context;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HASEE on 2017/6/7 16:14
 */

public class NetWork {

    private static NetWork instance;
    private static ZhuangBiApi zhuangbiApi;

    public NetWork getInstance(Context context) {
        if (instance == null) {
            instance = new NetWork();
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
}
