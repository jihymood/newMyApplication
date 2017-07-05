package com.example.rxjava20.Api;

import android.content.Context;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HASEE on 2017/6/7 16:14
 */

public class NetWorkManager {

    private static NetWorkManager instance;
    private static ZhuangBiApi zhuangbiApi;

    public NetWorkManager getInstance(Context context) {
        if (instance == null) {
            instance = new NetWorkManager();
        }
        return instance;
    }

//    public static ZhuangBiApi zhuangBiApi() {
//        if (zhuangbiApi == null) {
//            Retrofit retrofit = new Retrofit.Builder()
//                    .baseUrl("http://www.zhuangbi.info/")
//                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .build();
//            zhuangbiApi = retrofit.create(ZhuangBiApi.class);
//        }
//        return zhuangbiApi;
//    }

    public static ZhuangBiApi zhuangBiApi() {
        if (zhuangbiApi == null) {
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl("http://www.zhuangbi.info/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            zhuangbiApi = retrofit.create(ZhuangBiApi.class);
        }
        return zhuangbiApi;
    }

}
