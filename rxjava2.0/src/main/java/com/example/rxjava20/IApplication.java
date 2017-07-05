package com.example.rxjava20;

import android.app.Application;


/**
 * Created by HASEE on 2017/4/17 11:34
 */

public class IApplication extends Application {
    public static IApplication mInstance = null;

    public static synchronized IApplication getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

    }



}
