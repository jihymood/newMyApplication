package com.example.drawlayout.netease.book;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by HASEE on 2017/7/3 16:22
 */

public class BookViewpagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<Fragment> list;
    private String[] mTitles;

    public BookViewpagerAdapter(FragmentManager fm, Context context, List<Fragment> list,String[] mTitles) {
        super(fm);
        this.context = context;
        this.list = list;
        this.mTitles = mTitles;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return mTitles[position];
    }
}
