package com.example.rxjava20;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rxjava20.Api.TestService;
import com.example.rxjava20.bean.TestOther;
import com.example.rxjava20.bean.TestStr;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 与IDEA后台对接测试
 */
public class ZhabServerActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhab_server);

        text = (TextView) findViewById(R.id.textView);

//        getPointList();
//        getOldPoint();
//        getStringList();
//        getStrs(); //成功

        test();
    }


    public void test() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.155.1:8080/SZWGServices/attachment/query.ws/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestService testService = retrofit.create(TestService.class);
        testService.test("21eaaa33-9565-4441-9212-96338bfc8cff", "admin")
                .enqueue(new Callback<TestOther>() {
                    @Override
                    public void onResponse(Call<TestOther> call, Response<TestOther> response) {
                        Toast.makeText(ZhabServerActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().getResultCode());
                    }

                    @Override
                    public void onFailure(Call<TestOther> call, Throwable t) {
                        Toast.makeText(ZhabServerActivity.this, "获取失败", Toast.LENGTH_SHORT).show();
                        text.setText(t.toString());
                    }
                });
    }

    public void getaaa() {
        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://172.16.214.24:10002/")
                .baseUrl("http://172.16.108.137:10002/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestService testService = retrofit.create(TestService.class);
        testService.getCom()
                .enqueue(new Callback<ResponseObj<String>>() {
                    @Override
                    public void onResponse(Call<ResponseObj<String>> call, Response<ResponseObj<String>> response) {
                        Toast.makeText(ZhabServerActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().data);
                    }

                    @Override
                    public void onFailure(Call<ResponseObj<String>> call, Throwable t) {
                        Toast.makeText(ZhabServerActivity.this, "获取失败", Toast.LENGTH_SHORT).show();
                        text.setText(t.toString());
                    }
                });
    }

    public void getPointList() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.108.137:10002/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestService testService = retrofit.create(TestService.class);
        testService.getPointList()
                .enqueue(new Callback<ResponseObj<Map<String, List<Map<String, Object>>>>>() {
                    @Override
                    public void onResponse(Call<ResponseObj<Map<String, List<Map<String, Object>>>>> call,
                                           Response<ResponseObj<Map<String, List<Map<String, Object>>>>> response) {
                        Toast.makeText(ZhabServerActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().data.get("layerId").get(0).get("selfWeak").toString());
                    }

                    @Override
                    public void onFailure(Call<ResponseObj<Map<String, List<Map<String, Object>>>>> call, Throwable t) {
                        Log.d("ZhabServerActivity", "获取失败:" + t.toString());
                        text.setText(t.toString());
                    }
                });
    }

    public void getOldPoint() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("http://172.16.108.137:10002/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestService testService = retrofit.create(TestService.class);
        testService.getOldPoint()
                .enqueue(new Callback<ResponseObj<Map<String, List<Map<String, Object>>>>>() {
                    @Override
                    public void onResponse(Call<ResponseObj<Map<String, List<Map<String, Object>>>>> call,
                                           Response<ResponseObj<Map<String, List<Map<String, Object>>>>> response) {
                        Toast.makeText(ZhabServerActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().data.get("layerId").get(0).get("selfWeak").toString());
                    }

                    @Override
                    public void onFailure(Call<ResponseObj<Map<String, List<Map<String, Object>>>>> call, Throwable t) {
                        Log.d("ZhabServerActivity", "获取失败:" + t.toString());
                        text.setText(t.toString());
                    }
                });
    }

    public void getStringList() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.108.137:10002/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestService testService = retrofit.create(TestService.class);
        testService.getStringList()
                .enqueue(new Callback<ResponseObj<List<TestStr>>>() {
                    @Override
                    public void onResponse(Call<ResponseObj<List<TestStr>>> call,
                                           Response<ResponseObj<List<TestStr>>> response) {
                        Toast.makeText(ZhabServerActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().data.get(0).getStr());
                    }

                    @Override
                    public void onFailure(Call<ResponseObj<List<TestStr>>> call, Throwable t) {
                        Log.d("ZhabServerActivity", "获取失败:" + t.toString());
                        text.setText(t.toString());
                    }
                });
    }

    public void getStrs() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://172.16.108.137:10002/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        TestService testService = retrofit.create(TestService.class);
        testService.getStrs()
                .enqueue(new Callback<ResponseObj<String>>() {
                    @Override
                    public void onResponse(Call<ResponseObj<String>> call,
                                           Response<ResponseObj<String>> response) {
                        Toast.makeText(ZhabServerActivity.this, "获取成功", Toast.LENGTH_SHORT).show();
                        text.setText(response.body().data);
                    }

                    @Override
                    public void onFailure(Call<ResponseObj<String>> call, Throwable t) {
                        Log.d("ZhabServerActivity", "获取失败:" + t.toString());
                        text.setText(t.toString());
                    }

                });

    }


}
