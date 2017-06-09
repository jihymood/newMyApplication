package com.example.rxjava20.Api;

import com.example.rxjava20.ResponseObj;
import com.example.rxjava20.bean.BasePointModel;
import com.example.rxjava20.bean.News;
import com.example.rxjava20.bean.TestStr;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by HASEE on 2017/5/2 14:39
 */

public interface TestService {

    @FormUrlEncoded
    @POST("/")
    Call<News> example(@Field("name") String name, @Field("ocupation") String ocupation);

    @GET("user1/getCom")
    Call<ResponseObj<String>> getCom();

    @GET("user1/getPointList")
    Call<ResponseObj<List<BasePointModel>>> getPointList();

    @GET("user1/getStringList")
    Call<ResponseObj<List<TestStr>>> getStringList();

    @GET("user1/getStrs")
    Call<ResponseObj<String>> getStrs();




}
