package com.example.hasee.myapplication;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by HASEE on 2017/4/10.
 */

public interface BlueService {
    @GET("book/search")
    Call<BookSearchResponse> getSearchBooks(@Query("q")String name,
                                            @Query("tag")String tag,
                                            @Query("start")int start,
                                            @Query("count")int count);


    @GET("book/search")
    Call<BookSearchResponse> getSearchBooks1(@QueryMap Map<String, String> map);

//    @POST("book/reviews")
//    Call<String> addReviews()

}
