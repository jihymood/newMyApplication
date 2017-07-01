package com.example.drawlayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by HASEE on 2017/7/1 18:17
 */

public class ActivityUtils {

    public static void addFragment(FragmentManager fragmentManager, int layoutId, Fragment fragment) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(layoutId, fragment);
        transaction.commit();
    }
}
