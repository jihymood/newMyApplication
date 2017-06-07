package com.example.rxjava_example;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * 滑动页
 */
public class MainActivity extends AppCompatActivity {

    @Bind(R.id.viewpager)
    ViewPager viewpager;
    @Bind(R.id.tableLayout)
    TabLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        viewpager.setAdapter(new MyFragmentPagerAdapter(getSupportFragmentManager()));
        tableLayout.setupWithViewPager(viewpager);

    }
}
