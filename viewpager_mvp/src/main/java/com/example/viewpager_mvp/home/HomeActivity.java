package com.example.viewpager_mvp.home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.viewpager_mvp.R;
import com.example.viewpager_mvp.adapter.MyFragmentAdapter;
import com.example.viewpager_mvp.fragment.FirstFragment;
import com.example.viewpager_mvp.otherTest.banner.GlideImageLoader;
import com.kekstudio.dachshundtablayout.DachshundTabLayout;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class HomeActivity extends AppCompatActivity implements IView {
    @Bind(R.id.tabLayout)
    TabLayout tabLayout;  //指示器
    @Bind(R.id.tabLayout1)
    DachshundTabLayout tabLayout1;
    @Bind(R.id.banner)
    Banner banner;
    @Bind(R.id.viewpager)
    ViewPager viewpager;

    private Ipresenter presenterImpl;
    private MyFragmentAdapter adapter;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);  //ButterKnife有问题，报空指针异常

//        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
//        banner = (Banner) findViewById(R.id.banner);
//        viewpager = (ViewPager) findViewById(R.id.viewpager);

        presenterImpl = new PresenterImpl(this);
        presenterImpl.subscribe();
        fragments = new ArrayList<>();
        fragments.add(new FirstFragment());
        fragments.add(new FirstFragment());

        adapter = new MyFragmentAdapter(getSupportFragmentManager(), fragments);
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
        tabLayout1.setupWithViewPager(viewpager);
    }


    @Override
    public void showBannerFail(String failMessage) {
        Toast.makeText(this, failMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setBannerData(List<String> list) {
        banner.setImages(list).setImageLoader(new GlideImageLoader()).start();
    }


    @OnClick({R.id.tabLayout, R.id.tabLayout1})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tabLayout:
                break;
            case R.id.tabLayout1:
                break;
        }
    }
}
