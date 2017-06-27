package com.example.viewpager_mvp.otherTest.coordinatorLayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.viewpager_mvp.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import cn.hugeterry.coordinatortablayout.CoordinatorTabLayout;

public class CoordinatorLayoutActivity extends AppCompatActivity {

    @Bind(R.id.vp)
    ViewPager mViewPager;
    @Bind(R.id.coordinatortablayout)
    CoordinatorTabLayout coordinatortablayout;

    private List<Fragment> fragments;
    private MyViewPagerAdapter adapter;
    private String[] mTitles = {"Android", "iOS", "前端", "拓展资源"};
    private int[] mImageArray, mColorArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_coordinator_layout);
        ButterKnife.bind(this);

        initFragment();

        mImageArray = new int[]{
                R.mipmap.bg_android,
                R.mipmap.bg_ios,
                R.mipmap.bg_js,
                R.mipmap.bg_other};
        mColorArray = new int[]{
                android.R.color.holo_blue_light,
                android.R.color.holo_red_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_green_light};

        adapter = new MyViewPagerAdapter(getSupportFragmentManager(), fragments, mTitles);
        mViewPager.setAdapter(adapter);
        coordinatortablayout.setTitle("Demo")
                .setBackEnable(true)
                .setImageArray(mImageArray, mColorArray)
                .setupWithViewPager(mViewPager);

    }

    private void initFragment() {
        fragments = new ArrayList<>();
        for (int i = 0; i < mTitles.length; i++) {
//            SecondFragment fragment = new SecondFragment();
//            fragments.add(fragment);
            BlankFragment fragment = BlankFragment.getInstance(mTitles[i]);
            fragments.add(fragment);
        }
    }






}
