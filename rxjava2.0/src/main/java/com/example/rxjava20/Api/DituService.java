package com.example.rxjava20.Api;

import com.example.rxjava20.bean.Map;

import java.util.Observer;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by HASEE on 2017/5/12 14:30
 */

public interface DituService {

    /*http://gc.ditu.aliyun.com/regeocoding?l=39.938133,116.395739&type=001*/
    @GET("/{ding}")
    Call<Map> getDitu(@Path("ding")String ding,@Query("l")String lat,@Query("type")String type);

    @GET("/")
//    Call<Map> getDitu1();
    Call<Map> getDitu1(@Query("l")String lat,@Query("type")String type);

    @GET("/{ding}")
    Observer getDitu2(@Path("ding") String ding, @Query("l") String lat, @Query("type") String type);

    @GET("/{ding}")
    Flowable<Map> getDitu3(@Path("ding") String ding, @Query("l") String lat, @Query("type") String type);


}
