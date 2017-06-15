package com.example.rxjava20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.rxjava20.Api.DituService;
import com.example.rxjava20.bean.Map;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ThreeActivity extends AppCompatActivity {

    private TextView text;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        text = (TextView) findViewById(R.id.textView);
        imageView = (ImageView) findViewById(R.id.image);
        Glide.with(this).load("http://192.168.155.1:8080/SZWGServices/attachment/queryById.ws")
                .into(imageView);
//        getDitu();
//        getDitu1();
//        getDitu2();
//        getDitu3();

    }

    public void getDitu() { //成功
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gc.ditu.aliyun.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final DituService dituService = retrofit.create(DituService.class);
        final Call<Map> regeocoding = dituService.getDitu("regeocoding", "39.938133,116.395739", "001");
        regeocoding.enqueue(new Callback<Map>() {
            @Override
            public void onResponse(Call<Map> call, Response<Map> response) {
                Toast.makeText(ThreeActivity.this, "获取成功" + response.body().toString(), Toast
                        .LENGTH_SHORT).show();
                text.setText(response.body().getQueryLocation() + "");
            }

            @Override
            public void onFailure(Call<Map> call, Throwable t) {

            }
        });
    }

    public void getDitu1() { //失败
        /*http://gc.ditu.aliyun.com/regeocoding?l=39.938133,116.395739&type=001*/
        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://gc.ditu.aliyun.com/regeocoding?l=39.938133,116.395739&type=001"+"/")
                .baseUrl("http://gc.ditu.aliyun.com/regeocoding/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DituService dituService = retrofit.create(DituService.class);
//        Call<Map> ditu1 = dituService.getDitu1();
        Call<Map> ditu1 = dituService.getDitu1("39.938133,116.395739", "001");
        ditu1.enqueue(new Callback<Map>() {
            @Override
            public void onResponse(Call<Map> call, Response<Map> response) {
                Toast.makeText(ThreeActivity.this, "获取成功" + response.body().toString(), Toast
                        .LENGTH_SHORT).show();
                text.setText(response.body().getQueryLocation() + "");
            }

            @Override
            public void onFailure(Call<Map> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

    public void getDitu2() { //成功
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gc.ditu.aliyun.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DituService dituService = retrofit.create(DituService.class);
        dituService.getDitu2("regeocoding", "39.938133,116.395739", "001")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<Map>() {
                    @Override
                    public void accept(@NonNull Map map) throws Exception {
                        Toast.makeText(ThreeActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(map.getQueryLocation() + "");
                    }
                });

    }

    public void getDitu3() { //成功
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gc.ditu.aliyun.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DituService dituService = retrofit.create(DituService.class);
        dituService.getDitu3("regeocoding", "39.938133,116.395739", "001")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<Map>() {
                    @Override
                    public void onSubscribe(Subscription s) {
                        s.request(Long.MAX_VALUE);
                    }

                    @Override
                    public void onNext(Map map) {
                        Toast.makeText(ThreeActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(map.getQueryLocation() + "");
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
