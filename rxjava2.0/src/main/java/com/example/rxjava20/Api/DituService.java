package com.example.rxjava20.Api;

import com.example.rxjava20.bean.Map;

import io.reactivex.Flowable;
import io.reactivex.Observable;
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

    /**
     * 注意：这里是Observable,不是Observer
     * @param ding
     * @param lat
     * @param type
     * @return
     */
    @GET("/{ding}")
//    Observer getDitu2(@Path("ding") String ding, @Query("l") String lat, @Query("type") String type); //错误的
    Observable<Map> getDitu2(@Path("ding") String ding, @Query("l") String lat, @Query("type") String type);

    @GET("/{ding}")
    Flowable<Map> getDitu3(@Path("ding") String ding, @Query("l") String lat, @Query("type") String type);


}
