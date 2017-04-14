package com.example.hasee.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

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
//        getBook();
//        getData();
        getBook1();
    }

    public void getBook() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BlueService service = retrofit.create(BlueService.class);
        Call<BookSearchResponse> call = service.getSearchBooks("小王子", "", 0, 3);
        call.enqueue(new Callback<BookSearchResponse>() {
            @Override
            public void onResponse(Call<BookSearchResponse> call, Response<BookSearchResponse> response) {
                text.setText(response.body().getBooks().get(0).getAlt_title());
            }

            @Override
            public void onFailure(Call<BookSearchResponse> call, Throwable t) {

            }
        });

    }

    public void getBook1() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        BlueService service=retrofit.create(BlueService.class);
        Map<String, String> map = new HashMap<>();
        map.put("q", "小王子");
        map.put("tag", "");
        map.put("start", "0");
        map.put("count", "3");

        Call<BookSearchResponse> call=service.getSearchBooks1(map);
        call.enqueue(new Callback<BookSearchResponse>() {
            @Override
            public void onResponse(Call<BookSearchResponse> call, Response<BookSearchResponse> response) {
                text.setText(response.body().getBooks().get(0).getSummary());
            }

            @Override
            public void onFailure(Call<BookSearchResponse> call, Throwable t) {

            }
        });
    }

    public void getData() {
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("http://api.k780.com:88").
                build();
        WeatherService service = retrofit.create(WeatherService.class);
        Call<WeatherResponse> repos = service.getWeather("weather.future",
                1, 10003, "b59bc3ef6191eb9f747dd4e83c99f2a4", "json");
        repos.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                text.setText(response.body().toString());
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable t) {

            }
        });
    }
}
