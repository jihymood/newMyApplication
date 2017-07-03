package com.example.drawlayout.netease.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HASEE on 2017/7/3 15:42
 */

public class ApiManager {

    private static DoubaiApi doubaiApi;

    public static DoubaiApi getDoubaiApi() {

        if (doubaiApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://gank.io/api/")
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            doubaiApi = retrofit.create(DoubaiApi.class);
        }
        return doubaiApi;
    }


}
