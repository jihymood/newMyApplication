package com.example.drawlayout.first;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.drawlayout.ActivityUtils;
import com.example.drawlayout.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class FirstActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.nav_view)
    NavigationView navView;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        ButterKnife.bind(this);

        setToolbar();
//        setToolbar_other();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        assert navigationView != null;
        navigationView.setNavigationItemSelectedListener(this); //抽屉里的点击事件


        //替换掉布局中的FrameLayout
        FirstFragment firstFragment = new FirstFragment();
//        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
//        transaction.add(R.id.fragment_container, firstFragment);
//        transaction.commit();
        ActivityUtils.addFragment(getSupportFragmentManager(), R.id.fragment_container, firstFragment);


    }

    /**
     * 将toolbar作为参数传入到ActionBarDrawerToggle，则显示左上角图标很容易
     */
    public void setToolbar() {
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.open_drawlayout, R.string.close_drawlayout);
        assert drawerLayout != null;
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();  //设置左上角的图标
    }


    /**
     * 如果ActionBarDrawerToggle是4个参数，没有传入toolbar的话，需要多设置几步才能显示左上角图标
     */
    public void setToolbar_other() {
        toolbar.setNavigationIcon(R.mipmap.ic_launcher); //设置左上角的图标,在setSupportActionBar上面
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, R.string.open_drawlayout, R.string.close_drawlayout);
        assert drawerLayout != null;
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();  //设置左上角的图标,在这儿设置
//        toggle.setDrawerIndicatorEnabled(false);  //这两句是换掉默认的左上角图标
//        toggle.setHomeAsUpIndicator(R.drawable.ic_menu_gallery);//这两句是换掉默认的左上角图标
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { //如果没有这句，点击左上角图标无响应
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
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
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        assert drawer != null;
        drawer.closeDrawer(GravityCompat.START);
        return false;
    }
}
