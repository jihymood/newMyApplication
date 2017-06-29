package com.example.viewpager_mvp.otherTest.coordinatorLayout.second;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.viewpager_mvp.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CoordinatorLayoutActivity extends AppCompatActivity {

    @Bind(R.id.main_toolbar)
    Toolbar mToolbar;
    @Bind(R.id.main_appbar)
    AppBarLayout mainAppbar;
    @Bind(R.id.main_vp)
    ViewPager mainVp;
    @Bind(R.id.main_tab)
    TabLayout mainTab;

    private MyViewPagerAdapter adapter;
    private String[] mTitles = {"Android", "iOS", "前端", "拓展资源"};
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator_layout2);
        ButterKnife.bind(this);

        StatusBarUtil.setTranslucentForImageView(this, 50, mToolbar);

        initFragment();
        adapter = new MyViewPagerAdapter(getSupportFragmentManager(), list, mTitles);
        mainVp.setAdapter(adapter);
        mainTab.setupWithViewPager(mainVp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


    public void initFragment() {
        list = new ArrayList<>();
        for (String mTitle : mTitles) {
            BlankFragment secondFragment = BlankFragment.getInstance(mTitle);
            list.add(secondFragment);
        }
    }
}
