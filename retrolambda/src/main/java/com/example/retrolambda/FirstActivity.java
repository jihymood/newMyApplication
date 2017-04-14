package com.example.retrolambda;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class FirstActivity extends AppCompatActivity {
    private ImageView imageview;
    List<File> folders = new ArrayList<>();
    private int drawable=R.mipmap.ic_launcher_round;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        imageview = (ImageView) findViewById(R.id.imageview);
        imageview.setOnClickListener(v -> {
            Toast.makeText(this, "我被点击了", Toast.LENGTH_SHORT).show();
        });

//        printNames();
        getDrawable();
    }


    public void fileTest1() {
        Observable.from(folders)
                .flatMap(new Func1<File, Observable<File>>() {
                    @Override
                    public Observable<File> call(File file) {
                        return Observable.from(file.listFiles());
                    }
                })
                .filter(new Func1<File, Boolean>() {
                    @Override
                    public Boolean call(File file) {
                        return file.getName().endsWith(".png");
                    }
                })
                .map(new Func1<File, Bitmap>() {
                    @Override
                    public Bitmap call(File file) {
                        return BitmapFactory.decodeFile(file.getPath());
                    }
                })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Subscriber<Bitmap>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(Bitmap bitmap) {
//
//                    }
//                });
                .subscribe(new Action1<Bitmap>() {
                    @Override
                    public void call(Bitmap bitmap) {
                        imageview.setImageBitmap(bitmap);
                    }
                });
//                .subscribe(new Observer<Bitmap>() {
//                    @Override
//                    public void onCompleted() {
//
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//
//                    }
//
//                    @Override
//                    public void onNext(Bitmap bitmap) {
//
//                    }
//                });

    }

    public void rxJavaTest() {
        Observer observer = new Observer() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Object o) {

            }
        };

        Subscriber<String> subscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(String s) {

            }
        };

        Observable observable = Observable.create(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello");
                subscriber.onNext("Hi");
                subscriber.onNext("Aloha");
                subscriber.onCompleted();
            }
        });

        Action1<String> onNextAction=new Action1<String>() {
            @Override
            public void call(String s) {

            }
        };

        Action1<Throwable> onErrorAction=new Action1<Throwable>() {
            @Override
            public void call(Throwable throwable) {

            }
        };

        Action0 onCompletedAction=new Action0() {
            @Override
            public void call() {

            }
        };

        observable.subscribe(onNextAction);
        observable.subscribe(onNextAction,onErrorAction);
        observable.subscribe(onNextAction, onErrorAction, onCompletedAction);
    }


    public void printNames() {
        String[] names = {"南京","北京","天津","河北","河南","黑龙江"};
        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                Log.e("FirstActivity", s);
            }
        });
    }

    public void getDrawable() {
        Observable.create(new Observable.OnSubscribe<Drawable>() {
            @Override
            public void call(Subscriber<? super Drawable> subscriber) {
                Drawable drawable=getTheme().getDrawable(R.mipmap.ic_launcher_round);
                subscriber.onNext(drawable);
                subscriber.onCompleted();
            }
        })
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
//          .subscribe(new Action1<Drawable>() {
//            @Override
//            public void call(Drawable drawable) {
//                imageview.setImageDrawable(drawable);
//            }
//        });
//        .subscribe(new Observer<Drawable>() {
//            @Override
//            public void onCompleted() {
//                Log.e("FirstActivity", "完成");
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(Drawable drawable) {
//                imageview.setImageDrawable(drawable);
//            }
//        });
        .subscribe(new Subscriber<Drawable>() {
            @Override
            public void onCompleted() {
                Log.e("FirstActivity", "完成");
            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(Drawable drawable) {
                imageview.setImageDrawable(drawable);
            }
        });
    }


















}
