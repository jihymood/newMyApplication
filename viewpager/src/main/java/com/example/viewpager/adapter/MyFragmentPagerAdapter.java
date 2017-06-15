package com.example.viewpager.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.viewpager.Fragment.ElementaryFragment;
import com.example.viewpager.Fragment.MapFragment;
import com.example.viewpager.Fragment.ZipFragment;


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

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "基本";
            case 1:
                return "转换";
            case 2:
                return "压合";
            default:
                return "基本";
        }
    }
}
