package com.example.rxjava20.Api;

import com.example.rxjava20.bean.Bike;
import com.example.rxjava20.bean.NBA;
import com.example.rxjava20.bean.News;

import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by HASEE on 2017/4/28 11:04
 */

public interface PBikeService {

    @GET("/")
    Call<Bike> getBike(@Query("app") String app, @Query("city") String city, @Query("appkey") String appkey
            , @Query("sign") String sign, @Query("format") String format);

    @GET("/")
    Flowable<Bike> getBike1(@Query("app") String app, @Query("city") String city, @Query("appkey") String appkey
            , @Query("sign") String sign, @Query("format") String format);


    @GET("/")
    Flowable<Bike> getBike2(@Query("app") String app, @Query("city") String city,
                            @Query("appkey") String appkey, @Query("sign") String sign,
                            @Query("format") String fotmat);

    @GET("/api/GetFeeds")
    Call<News> getNews(@Query("column") int column, @Query("PageSize") int pageSize,
                       @Query("pageIndex") int pageIndex, @Query("val") String val);


    @GET("/api/GetFeeds")
    Flowable<News> getNews1(@Query("column") int column, @Query("PageSize") int pageSize,
                            @Query("pageIndex") int pageIndex, @Query("val") String val);


    @GET("api/GetFeeds")
    Flowable<News> getNews2(@QueryMap Map<String, Object> map);

    @GET("/")
    Observable<NBA> getNBA();  //失败

    @GET("/")
    Observable<NBA> getNBA1(@Query("key") String key);  //失败

    @GET("onebox/basketball/nba?key=98020a1e920819b8ff4fcfbdd7747f8c")  //成功
    Observable<NBA> getNBA2();

    @GET("onebox/basketball/nba")
    Observable<NBA> getNBA3(@Query("key") String key);

//    @GET("/")
//    Observable<NBA> getNBA4();

}
