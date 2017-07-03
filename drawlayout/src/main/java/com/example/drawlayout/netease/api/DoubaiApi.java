package com.example.drawlayout.netease.api;

import com.example.drawlayout.netease.model.Meizi;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by HASEE on 2017/7/3 15:37
 */

public interface DoubaiApi {

    @GET("data/{cagetory}/{page}/{number}")
        //http://gank.io/api/data/%E7%A6%8F%E5%88%A9/10/1
    Observable<Meizi> getMeizi(@Path("cagetory") String cagetory, @Path("page") int page, @Path("number") int number);

}
