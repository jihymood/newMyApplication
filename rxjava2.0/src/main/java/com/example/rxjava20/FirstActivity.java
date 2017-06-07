package com.example.rxjava20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rxjava20.Api.PBikeService;
import com.example.rxjava20.bean.Bike;
import com.example.rxjava20.bean.News;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Flowable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class FirstActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        text = (TextView) findViewById(R.id.text);
//        getBike();
//        getBike1();
//        getBike2();
//        getNews();
//        getNews1();
        getNew2();
    }


    public void getBike() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.k780.com:88/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PBikeService service = retrofit.create(PBikeService.class);
        Call<Bike> call = service.getBike("pbike.state", "zhongshan", "10003", "b59bc3ef6191eb9f747dd4e83c99f2a4",
                "json");
        call.enqueue(new Callback<Bike>() {
            @Override
            public void onResponse(Call<Bike> call, Response<Bike> response) {
                Toast.makeText(FirstActivity.this, "获取成功" + response.body(), Toast.LENGTH_SHORT).show();
                text.setText(response.body().getResult().get_$100000().getAddress());
            }

            @Override
            public void onFailure(Call<Bike> call, Throwable t) {

            }
        });
    }

    public void getBike1() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.k780.com:88/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PBikeService service = retrofit.create(PBikeService.class);
        Flowable<Bike> flowable = service.getBike1("pbike.state", "zhongshan", "10003",
                "b59bc3ef6191eb9f747dd4e83c99f2a4",
                "json");
        flowable
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Bike>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Bike bike) {
                        Toast.makeText(FirstActivity.this, "获取成功" + bike.getResult().get_$100000().getAddress(), Toast
                                .LENGTH_SHORT).show();
                        text.setText(bike.getResult().get_$100000().getAddress());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        Toast.makeText(FirstActivity.this, "获取失败，请检查网络是否畅通", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    private void getBike2() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.k780.com:88/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PBikeService service = retrofit.create(PBikeService.class);
        Flowable<Bike> flowable = service.getBike2("pbike.state", "zhongshan", "10003",
                "b59bc3ef6191eb9f747dd4e83c99f2a4",
                "json");
        flowable.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Bike>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Bike bike) {
                        Toast.makeText(FirstActivity.this, "获取成功" + bike.getResult().get_$100000().getAddress(), Toast
                                .LENGTH_SHORT).show();
                        text.setText(bike.getResult().get_$100000().getAddress());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        Toast.makeText(FirstActivity.this, "获取失败，请检查网络是否畅通", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void getNews() {
        final long start = System.currentTimeMillis();
        Log.e("FirstActivity", "System.currentTimeMillis():" + start);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://litchiapi.jstv.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PBikeService service = retrofit.create(PBikeService.class);
        Call<News> call = service.getNews(3, 20, 1, "100511D3BE5301280E0992C73A9DEC41");
        call.enqueue(new Callback<News>() {
            @Override
            public void onResponse(Call<News> call, Response<News> response) {
                Toast.makeText(FirstActivity.this, "获取成功" + response.body().toString(), Toast
                        .LENGTH_SHORT).show();
                text.setText(response.body().getParamz().getFeeds().get(0).getCategory());
                long end = System.currentTimeMillis();
                long jian = end - start;
                Log.e("FirstActivity", "System.currentTimeMillis():" + jian / 1000);
            }

            @Override
            public void onFailure(Call<News> call, Throwable t) {

            }
        });
    }

    public void getNews1() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://litchiapi.jstv.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PBikeService service = retrofit.create(PBikeService.class);
        service.getNews1(3, 20, 1, "100511D3BE5301280E0992C73A9DEC41")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<News>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(News news) {
                        Toast.makeText(FirstActivity.this, "获取成功" + news.getStatus(), Toast
                                .LENGTH_SHORT).show();
                        text.setText(news.getStatus());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        Toast.makeText(FirstActivity.this, "获取失败，请检查网络是否畅通",
                                Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void getNew2() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://litchiapi.jstv.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PBikeService service = retrofit.create(PBikeService.class);
        Map<String, Object> map = new HashMap<>();
        map.put("column", 3);
        map.put("PageSize", 20);
        map.put("pageIndex", 1);
        map.put("val", "100511D3BE5301280E0992C73A9DEC41");
        service.getNews2(map)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<News>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(News news) {
                        Toast.makeText(FirstActivity.this, "获取成功" + news.getStatus(), Toast
                                .LENGTH_SHORT).show();
                        text.setText(news.getStatus());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        Toast.makeText(FirstActivity.this, "获取失败，请检查网络是否畅通",
                                Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


}
