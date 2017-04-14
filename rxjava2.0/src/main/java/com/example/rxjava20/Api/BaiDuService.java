package com.example.rxjava20.Api;

import com.example.rxjava20.bean.Book;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by HASEE on 2017/4/14 09:31
 */

public interface BaiDuService {
    @GET("v2/book/{id}")
    Call<Book> getText(@Path("id")String id);//Call类型是默认支持的(内部由DefaultCallAdapterFactory支持)

    @GET("book/{id}")
    Flowable<Book> getText1(@Path("id")String id);

    @GET("/")
    Flowable<ResponseBody> getText();  //如果是返回Flowable，则必须加上addCallAdapterFactory适配器支持

    @GET("book/{id}")
    Observable<Book> getBook(@Path("id") String id);//如果是返回Observable，则必须加上addCallAdapterFactory适配器支持
}
