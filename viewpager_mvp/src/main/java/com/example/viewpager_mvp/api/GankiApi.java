package com.example.viewpager_mvp.api;

import com.example.viewpager_mvp.model.Meizi;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

//import io.reactivex.Observable;

/**
 * Created by HASEE on 2017/6/22 10:42
 */

public interface GankiApi {

    @GET("data/{category}/{number}/{page}")
        //http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/1
    Observable<Meizi> getMeiZi(@Path("category") String category,
                               @Path("number") String number,
                               @Path("page") int page);
}
