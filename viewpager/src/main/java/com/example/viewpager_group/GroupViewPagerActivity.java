package com.example.viewpager_group;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.viewpager.Fragment.ElementaryFragment;
import com.example.viewpager.Fragment.MapFragment;
import com.example.viewpager.Fragment.ZipFragment;
import com.example.viewpager.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


public class GroupViewPagerActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener,
        ViewPager.OnPageChangeListener {

    @Bind(R.id.button1)
    RadioButton button1;
    @Bind(R.id.button2)
    RadioButton button2;
    @Bind(R.id.button3)
    RadioButton button3;
    @Bind(R.id.viewpager)
    ViewPager viewpager;
    @Bind(R.id.group)
    RadioGroup group;

    private MyViewPagerAdapter adapter;
    private List<Fragment> list;

    private int currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_view_pager);
        ButterKnife.bind(this);

        initFragment();
        adapter = new MyViewPagerAdapter(getSupportFragmentManager(), this, list);
        viewpager.setAdapter(adapter);

        group.setOnCheckedChangeListener(this);
//        viewpager.setOnPageChangeListener(this); //方法过时
        viewpager.addOnPageChangeListener(this);
    }

    public void initFragment() {
        list = new ArrayList<>();
        list.add(new ElementaryFragment());
        list.add(new MapFragment());
        list.add(new ZipFragment());
    }


    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.button1:
                currentFragment = 0;
                break;
            case R.id.button2:
                currentFragment = 1;
                break;
            case R.id.button3:
                currentFragment = 2;
                break;
        }
        viewpager.setCurrentItem(currentFragment);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
                group.check(R.id.button1);
                break;
            case 1:
                group.check(R.id.button2);
                break;
            case 2:
                group.check(R.id.button3);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
