package com.example.viewpager_mvp.otherTest.coordinatorLayout;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by HASEE on 2017/6/27 15:53
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;
    private String[] mTitls;

    public MyViewPagerAdapter(FragmentManager fm, List<Fragment> fragments, String[] mTitls) {
        super(fm);
        this.fragments = fragments;
        this.mTitls = mTitls;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return mTitls[position];
    }
}
