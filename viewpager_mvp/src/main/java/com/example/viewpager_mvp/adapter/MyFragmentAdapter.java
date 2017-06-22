package com.example.viewpager_mvp.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.viewpager_mvp.fragment.FirstFragment;

import java.util.List;

/**
 * Created by HASEE on 2017/6/22 11:39
 */

public class MyFragmentAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;
    private String[] titles = {"一一", "二二", "三三"};


    public MyFragmentAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FirstFragment();
            case 1:
                return new FirstFragment();
            default:
                return new FirstFragment();
        }
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
