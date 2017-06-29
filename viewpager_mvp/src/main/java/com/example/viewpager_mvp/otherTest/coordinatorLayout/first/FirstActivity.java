package com.example.viewpager_mvp.otherTest.coordinatorLayout.first;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.viewpager_mvp.R;

/**
 * 布局里如果没有ViewPager，使用NestedScrollView也可以
 */
public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }
}
