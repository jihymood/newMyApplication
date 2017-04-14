package com.example.retrolambda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;

import rx.Observable;
import rx.Subscriber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }

    public void test() {
        Observable.from(Arrays.asList(1, 2, 4, 3, 5, 6, 7, 8, 9));
//                .flatMap(new Func1<Integer, Observable<?>>() {
//                    @Override
//                    public Observable<?> call(Integer integer) {
//                        return integer % 2 == 0;
//                    }
//                });
//                .filter(new Func1<Integer, Boolean>() {
//                    @Override
//                    public Boolean call(Integer integer) {
//                        return integer % 2 == 0;
//                    }
//                })
//                .map(new Func1<Integer, Integer>() {
//                    @Override
//                    public Integer call(Integer integer) {
//                        return integer * integer;
//                    }
//                })
//                .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<Integer>() {
//                    @Override
//                    public void call(Integer integer) {
//                        System.out.println(integer);
//                        Log.e("MainActivity", "integer");
//                    }
//                });
    }


    public void observalbeTest() {
        Observable observable=Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello");
                subscriber.onNext("Hi");
                subscriber.onNext("Aloha");
                subscriber.onCompleted();
            }
        });
    }

    private void observalbeTest1() {
        Observable observable1 = Observable.create(subscriber ->{

        });
    }


}
