package com.example.rxjava20.Api;

import com.example.rxjava20.bean.Bike;
import com.example.rxjava20.bean.News;

import java.util.Map;

import io.reactivex.Flowable;
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
    Call<News> getNews(@Query("column")int column,@Query("PageSize")int pageSize,
                       @Query("pageIndex") int pageIndex,@Query("val")String val);


    @GET("/api/GetFeeds")
    Flowable<News> getNews1(@Query("column") int column, @Query("PageSize") int pageSize,
                            @Query("pageIndex") int pageIndex, @Query("val") String val);


    @GET("api/GetFeeds")
    Flowable<News> getNews2(@QueryMap Map<String, Object> map);
}
