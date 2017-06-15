package com.example.viewpager.api;

import com.example.viewpager.bean.GankBeautyResult;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by HASEE on 2017/6/14 15:18
 */

public interface GankApi {

    @GET("data/福利/{number}/{page}")
    Observable<GankBeautyResult> getBeauties(@Path("number") int number, @Path("page") int page);

}
