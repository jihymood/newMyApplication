package com.example.rxjava20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rxjava20.Api.DituService;
import com.example.rxjava20.Api.TestService;
import com.example.rxjava20.bean.BasePointModel;
import com.example.rxjava20.bean.Map;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

import java.util.List;
import java.util.Observer;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ThreeActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        text = (TextView) findViewById(R.id.textView);

//        getDitu();
//        getDitu1();
//        getDitu3();
//        getaaa();
        getPoint();
    }

    public void getDitu() {
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

    public void getDitu1() {
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

    public void getDitu2() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gc.ditu.aliyun.com/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        DituService dituService = retrofit.create(DituService.class);
        Observer observer = dituService.getDitu2("regeocoding", "39.938133,116.395739", "001");


    }

    public void getDitu3() {
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

    public void getaaa() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.214.24:10002/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestService testService = retrofit.create(TestService.class);
        testService.getCom()
                .enqueue(new Callback<ResponseObj<String>>() {
                    @Override
                    public void onResponse(Call<ResponseObj<String>> call, Response<ResponseObj<String>> response) {
                        Toast.makeText(ThreeActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().data);
                    }

                    @Override
                    public void onFailure(Call<ResponseObj<String>> call, Throwable t) {
                        Toast.makeText(ThreeActivity.this, "获取失败", Toast.LENGTH_SHORT).show();
                        text.setText(t.toString());
                    }
                });
    }

    public void getPoint() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://172.16.108.137:10002/")
//                .baseUrl("http://172.16.214.24:10002/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestService testService = retrofit.create(TestService.class);
        testService.getBase()
                .enqueue(new Callback<ResponseObj<List<BasePointModel>>>() {
                    @Override
                    public void onResponse(Call<ResponseObj<List<BasePointModel>>> call,
                                           Response<ResponseObj<List<BasePointModel>>> response) {
                        Toast.makeText(ThreeActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().data.get(0).getAz());
                    }

                    @Override
                    public void onFailure(Call<ResponseObj<List<BasePointModel>>> call, Throwable t) {
//                        Toast.makeText(ThreeActivity.this, "获取失败:"+t.toString(), Toast.LENGTH_SHORT).show();
                        Log.d("ThreeActivity", "获取失败:" + t.toString());
                        text.setText(t.toString());
                    }

                });

    }
}
