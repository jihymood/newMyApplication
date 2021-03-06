package com.example.rxjava20.Api;

import com.example.rxjava20.bean.Book;
import com.example.rxjava20.bean.DoubanBook;
import com.example.rxjava20.bean.Weather;

import io.reactivex.Flowable;
import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by HASEE on 2017/4/14 09:31
 */

public interface BaiDuService {
    /**
     * 返回Call类型是默认支持的(内部由DefaultCallAdapterFactory支持),
     * 但是需要addConverterFactory解析
     */
    @GET("v2/book/{id}")
    Call<Book> getText(@Path("id") String id);



    @GET("book/{id}")
    Flowable<Book> getText1(@Path("id") String id);

    /**
     * 如果是返回Flowable，则必须加上addCallAdapterFactory适配器支持
     */
    @GET("/")
    Flowable<ResponseBody> getText();

    @GET("book/{id}")
    Observable<Book> getBook(@Path("id") String id);//如果是返回Observable，则必须加上addCallAdapterFactory适配器支持


    @GET("/")
    Observable<DoubanBook> getDouban(); //失败

    @GET("PageSubArea/{address}")
    Observable<DoubanBook> getDouban1(@Path("address")String address); //成功

    @GET("PageSubArea/TrailerList.api")
    Observable<DoubanBook> getDouban2();  //成功

    @GET("TrailerList.api")
    Observable<DoubanBook> getDouban3();  //成功

//    @GET("/{address}") //如果这里参数，则最前面不要加斜杠
    @GET("{address}")
    Observable<DoubanBook> getDouban4(@Path("address")String address);  //成功

    @GET("/")
    Call<Weather> getWeather(@Query("app") String app, @Query("weaid") String weaid
            , @Query("appkey") String appkey, @Query("sign") String sign, @Query("format") String format);

    @GET("/")
    Flowable<Weather> getWeather1(@Query("app") String app, @Query("weaid") String weaid
            , @Query("appkey") String appkey, @Query("sign") String sign, @Query("format") String format);


}
