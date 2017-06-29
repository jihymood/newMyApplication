package com.example.drawlayout;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.nav_view1)
    NavigationView navView1;
    @Bind(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    private MyListener mListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); //在setContentView上面
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, toolbar, R.string.open_drawlayout, R.string.close_drawlayout);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, mDrawerLayout, null, R.string.open_drawlayout, R.string.close_drawlayout);
        assert mDrawerLayout != null;
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();  //设置左上角的图标


        mListener = new MyListener();
        initDrawerLayout();

    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        assert drawer != null;
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    public void initDrawerLayout() {
        navView1.inflateHeaderView(R.layout.layout_main_nav);
        View headerView = navView1.getHeaderView(0);
        headerView.findViewById(R.id.ll_nav_homepage).setOnClickListener(mListener);
        headerView.findViewById(R.id.ll_nav_scan_address).setOnClickListener(mListener);
        headerView.findViewById(R.id.ll_nav_deedback).setOnClickListener(mListener);
        headerView.findViewById(R.id.ll_nav_login).setOnClickListener(mListener);
        headerView.findViewById(R.id.ll_nav_exit).setOnClickListener(mListener);
        headerView.findViewById(R.id.ll_nav_donation).setOnClickListener(mListener);
    }

    private class MyListener implements View.OnClickListener {

        @Override
        public void onClick(final View v) {
            mDrawerLayout.closeDrawer(GravityCompat.START);
            mDrawerLayout.post(new Runnable() {
                @Override
                public void run() {
                    switch (v.getId()) {
                        case R.id.ll_nav_homepage: // 项目主页
                            Toast.makeText(MainActivity.this, "我被点击啦", Toast.LENGTH_SHORT).show();
                            break;
                        case R.id.ll_nav_scan_address: // 关于我们
                            break;
                        case R.id.ll_nav_deedback: // 问题反馈
                            break;
                        case R.id.ll_nav_donation: // 捐赠开发者
                            break;
                        case R.id.ll_nav_login: // 登录github账号
                            break;
                        case R.id.ll_nav_exit:
                            finish();
                            break;
                        default:
                            break;
                    }
                }
            });
        }
    }

    public void hh() {

    }

}
