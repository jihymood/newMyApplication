package com.example.viewpager.api;


import com.example.viewpager.bean.ZhuangBi;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by HASEE on 2017/6/7 16:13
 */

public interface ZhuangBiApi {

    @GET("search")
    Observable<List<ZhuangBi>> search(@Query("q") String query);


}
