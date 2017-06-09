package com.example.rxjava20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rxjava20.Api.BaiDuService;
import com.example.rxjava20.bean.Book;
import com.example.rxjava20.bean.DoubanBook;
import com.example.rxjava20.bean.Weather;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.io.IOException;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.text);
//        getDouban();
//        getBaidu();
//        getBook();
        getDoubanBook();
//        getDoubanBook1();
//        getWeather();
//        getWeather1();




    }


    public void rxjava() {
//        Observable.create(new ObservableOnSubscribe<String>() {
//
//            @Override
//            public void subscribe(ObservableEmitter<String> e) throws Exception {
//
//            }
//        });

        Flowable<String> flowable = Flowable.create(new FlowableOnSubscribe<String>() {
            @Override
            public void subscribe(FlowableEmitter<String> e) throws Exception {
                e.onNext("hello RxJava 2");
                e.onComplete();
            }
        }, BackpressureStrategy.BUFFER);

        Subscriber subscriber = new Subscriber() {
            @Override
            public void onSubscribe(Subscription s) {
                System.out.println("onSubscribe");
                s.request(Long.MAX_VALUE);
            }

            @Override
            public void onNext(Object o) {
                System.out.println("onComplete");
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        };


        flowable.subscribe(subscriber);
    }

    public void getDouban() { //返回Call成功
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/")
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())// 添加RxJava2的适配器支持
                .addConverterFactory(GsonConverterFactory.create()) //必须要有这句
                .build();
        BaiDuService service = retrofit.create(BaiDuService.class);
        Call<Book> call = service.getText("1220562");
        call.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                Toast.makeText(MainActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                Log.e("MainActivity", response.body().toString());
                text.setText(response.body().getSummary());
            }

            @Override
            public void onFailure(Call<Book> call, Throwable t) {

            }
        });
    }

    public void getBaidu() { //成功
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://www.baidu.com/") //url最后面必须要有斜杠"/"
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())// 添加RxJava2的适配器支持
                .addConverterFactory(GsonConverterFactory.create()) //也必不可少
                .build();
        BaiDuService service = retrofit.create(BaiDuService.class);
        service.getText()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<ResponseBody>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(ResponseBody s) {
                        Toast.makeText(MainActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        try {
                            text.setText(s.string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        Toast.makeText(MainActivity.this, "获取失败，请检查网络是否畅通", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("任务结束");
                    }
                });
    }

    public void getBook() { //成功
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")//https://api.douban.com/v2/book/1220562
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())// 添加RxJava2的适配器支持
                .addConverterFactory(GsonConverterFactory.create()) //也必不可少
                .build();
        BaiDuService service = retrofit.create(BaiDuService.class);
//        service.getBook("1220562")
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<Book>() {
//                    @Override
//                    public void accept(@NonNull Book book) throws Exception {
//                        Toast.makeText(MainActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
//                        Log.e("MainActivity", "book");
//                    }
//                });
        service.getText1("1220562")
                .subscribeOn(Schedulers.newThread()) //也必不可少
                .observeOn(AndroidSchedulers.mainThread()) //也必不可少
                .subscribe(new Subscriber<Book>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Book book) {
                        Toast.makeText(MainActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(book.getSummary());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        Toast.makeText(MainActivity.this, "获取失败，请检查网络是否畅通", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    public void getDoubanBook() { //失败，可能是解析json出问题了?? response为空
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://api.m.mtime.cn/PageSubArea/TrailerList.api/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BaiDuService service=retrofit.create(BaiDuService.class);
        Call<DoubanBook> call=service.getDouban();
        call.enqueue(new Callback<DoubanBook>() {
            @Override
            public void onResponse(Call<DoubanBook> call, Response<DoubanBook> response) {
                Toast.makeText(MainActivity.this, "获取成功"+response.body(), Toast.LENGTH_SHORT).show();
//                text.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<DoubanBook> call, Throwable t) {

            }
        });
    }

    public void getDoubanBook1() { //失败
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.m.mtime.cn/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BaiDuService service = retrofit.create(BaiDuService.class);
        service.getDouban1("TrailerList.api")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Consumer<DoubanBook>() {
//                    @Override
//                    public void accept(@NonNull DoubanBook doubanBook) throws Exception {
//                        Toast.makeText(MainActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
//                        Log.e("MainActivity", doubanBook.toString());
//                    }
//                });
                .subscribe(new Subscriber<DoubanBook>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(DoubanBook doubanBook) {
                        Toast.makeText(MainActivity.this, "获取成功"+doubanBook.getTrailers(), Toast.LENGTH_SHORT).show();
//                        text.setText(doubanBook.toString());
//                        text.setText(doubanBook.getTrailers().get(0).getSummary());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        Toast.makeText(MainActivity.this, "获取失败，请检查网络是否畅通", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


    public void getWeather() { //Call返回成功
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.k780.com:88/")
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create()) //必须要加
                .build();
        BaiDuService service = retrofit.create(BaiDuService.class);
        service.getWeather("weather.future", "1", "10003", "b59bc3ef6191eb9f747dd4e83c99f2a4", "json")
                .enqueue(new Callback<Weather>() { //enqueue已经是异步操作了
                    @Override
                    public void onResponse(Call<Weather> call, Response<Weather> response) {
                        Toast.makeText(MainActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().getResult().get(0).getWeather());
                    }

                    @Override
                    public void onFailure(Call<Weather> call, Throwable t) {

                    }
                });
    }

    /**
     * 如果没有
     *   .subscribeOn(Schedulers.newThread()) //必须要有
     *   .observeOn(AndroidSchedulers.mainThread())//必须要有
     */
    public void getWeather1() { //  加Flowable+subscribeOn+observeOn返回成功，不加则返回失败
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.k780.com:88/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//必须要有
                .addConverterFactory(GsonConverterFactory.create())//必须要有
                .build();
        BaiDuService service = retrofit.create(BaiDuService.class);
        service.getWeather1("weather.future", "1", "10003", "b59bc3ef6191eb9f747dd4e83c99f2a4", "json")
                .subscribeOn(Schedulers.io()) //必须要有
                .observeOn(AndroidSchedulers.mainThread())//必须要有
                .subscribe(new Subscriber<Weather>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Weather weather) {
                        Toast.makeText(MainActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(weather.getResult().get(0).getWeather());
                    }

                    @Override
                    public void onError(Throwable t) {
                        t.printStackTrace();
                        Toast.makeText(MainActivity.this, "获取失败，请检查网络是否畅通", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {
                        Log.e("MainActivity", "失败");
                    }
                });
    }
}
