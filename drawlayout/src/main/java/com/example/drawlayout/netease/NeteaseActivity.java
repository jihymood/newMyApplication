package com.example.drawlayout.netease;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.drawlayout.R;
import com.example.drawlayout.first.FirstFragment;
import com.example.drawlayout.netease.book.BookFragment;
import com.example.drawlayout.second.SecondFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class NeteaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener,
        RadioGroup.OnCheckedChangeListener, ViewPager.OnPageChangeListener {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.id_navigationview)
    NavigationView navigationview;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.rb_home)
    RadioButton rbHome;
    @Bind(R.id.rb_dynamic)
    RadioButton rbDynamic;
    @Bind(R.id.rb_message)
    RadioButton rbMessage;
    @Bind(R.id.radiogroup)
    RadioGroup radiogroup;
    @Bind(R.id.viewpager)
    ViewPager viewpager;

    private MyViewPagerAdapter adapter;
    private List<Fragment> list;
    private int currentFragment;
    private String[] mTitles = {"热映榜", "TOP250"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_netease);
        ButterKnife.bind(this);

//        toolbar.setTitle("设置标题");
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawlayout, R.string.close_drawlayout);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        assert navigationview != null;
        navigationview.setNavigationItemSelectedListener(this);

        initFragment();
        adapter = new MyViewPagerAdapter(getSupportFragmentManager(), this, list);
        viewpager.setAdapter(adapter);

        radiogroup.setOnCheckedChangeListener(this); //如果没有这个监听事件，点击radiogroup的radiobutton没有效果
        viewpager.addOnPageChangeListener(this);

    }

    private void initFragment() {
        list = new ArrayList<>();
        list.add(new BookFragment());
        list.add(new FirstFragment());
        list.add(new SecondFragment());
    }

    @Override
    public void onBackPressed() {
        assert drawerLayout != null;
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            //将这句放在else语句中，否则会出现点击返回键drawerLayout关闭同时app退出
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_menu_home:
                break;
            case R.id.nav_camera:
                Toast.makeText(this, "我是第一行", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_gallery:
                break;
            case R.id.nav_slideshow:
                break;
            case R.id.nav_manage:
                break;
            case R.id.nav_share:
                break;
            case R.id.nav_send:
                break;
            default:
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.rb_home:
                currentFragment = 0;
                break;
            case R.id.rb_dynamic:
                currentFragment = 1;
                break;
            case R.id.rb_message:
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
                radiogroup.check(R.id.rb_home);
                break;
            case 1:
                radiogroup.check(R.id.rb_dynamic);
                break;
            case 2:
                radiogroup.check(R.id.rb_message);
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    /**
     *  一：如果没有radiogroup.setOnCheckedChangeListener(this);这个监听事件，
     *  点击radiogroup的radiobutton没有效果
     *
     *  二：或者直接对radiobutton进行点击监听，效果一样
     *
     * @param view
     */
//    @OnClick({R.id.rb_home, R.id.rb_dynamic, R.id.rb_message})
//    public void onViewClicked(View view) {
//        switch (view.getId()) {
//            case R.id.rb_home:
//                currentFragment = 0;
//                break;
//            case R.id.rb_dynamic:
//                currentFragment = 1;
//                break;
//            case R.id.rb_message:
//                currentFragment = 2;
//                break;
//        }
//        viewpager.setCurrentItem(currentFragment);
//    }
}
