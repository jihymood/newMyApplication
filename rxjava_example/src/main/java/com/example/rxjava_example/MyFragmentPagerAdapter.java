package com.example.rxjava_example;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.rxjava_example.Fragment.ElementaryFragment;

/**
 * Created by HASEE on 2017/6/7 14:13
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    public MyFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ElementaryFragment();
            case 1:
                return new MapFragment();
            case 2:
                return new ZipFragment();
            default:
                return new ElementaryFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
