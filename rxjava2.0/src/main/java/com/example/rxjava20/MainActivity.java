package com.example.rxjava20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rxjava20.Api.BaiDuService;
import com.example.rxjava20.bean.Book;
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
        getBaidu();
//        getBook();
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

    public void getDouban() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/")
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())// 添加RxJava2的适配器支持
                .addConverterFactory(GsonConverterFactory.create())
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

    public void getBaidu() {
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

    public void getBook() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")//https://api.douban.com/v2/book/1220562
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())// 添加RxJava2的适配器支持
                .addConverterFactory(GsonConverterFactory.create()) //也必不可少
                .build();
        BaiDuService service=retrofit.create(BaiDuService.class);
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
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
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

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }


}
