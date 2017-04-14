package com.example.hasee.myapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by HASEE on 2017/4/11.
 */

public interface WeatherService {
    @GET("/")
    Call<WeatherResponse> getWeather(@Query("app") String app,
                                     @Query("weaid") int weaid,
                                     @Query("appkey") int appkey,
                                     @Query("sign") String sign,
                                     @Query("format") String format
    );

}
