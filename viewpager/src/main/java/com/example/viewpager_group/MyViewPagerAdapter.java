package com.example.viewpager_group;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by HASEE on 2017/7/3 10:56
 *
 * 绑定滑动页，有几个tab就有几个fragment，数据是固定的所以直接在构造函数中初始化数据
 *
 */

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    private Context context;
    private List<Fragment> list;

    public MyViewPagerAdapter(FragmentManager fm, Context context, List<Fragment> list) {
        super(fm);
        this.context=context;
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
