package com.example.drawlayout.netease.api;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HASEE on 2017/7/3 15:42
 */

public class ApiManager {

    private static DoubaiApi doubaiApi;
    private static NBAapi nbAapi;

    public static DoubaiApi getDoubaiApi() {

        if (doubaiApi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://gank.io/api/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            doubaiApi = retrofit.create(DoubaiApi.class);
        }
        return doubaiApi;
    }

    public static NBAapi getNbAapi() {

        if (nbAapi == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://op.juhe.cn/onebox/basketball/nba/")
//                    .baseUrl("http://v.juhe.cn/nba/all_team_info.php?key=ffe36f382253dde1ead7a592178a9454/")
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            nbAapi = retrofit.create(NBAapi.class);
        }
        return nbAapi;
    }


}
