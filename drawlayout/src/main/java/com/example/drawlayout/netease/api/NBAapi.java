package com.example.drawlayout.netease.api;

import com.example.drawlayout.netease.model.NBA;

//import rx.Observable;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by HASEE on 2017/7/4 11:19
 */

public interface NBAapi {


    @GET("/")
    Observable<NBA> getNBA(@Query("key") String key);

    @GET("/")
    Observable<NBA> getNBA();
}
