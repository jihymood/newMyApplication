package com.example.viewpager_mvp.home;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.viewpager_mvp.R;
import com.example.viewpager_mvp.adapter.MyFragmentAdapter;
import com.example.viewpager_mvp.banner.GlideImageLoader;
import com.example.viewpager_mvp.fragment.FirstFragment;
import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class HomeActivity extends AppCompatActivity implements IView {

    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    private Ipresenter presenterImpl;
    private MyFragmentAdapter adapter;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        banner = (Banner) findViewById(R.id.banner);
        viewpager = (ViewPager) findViewById(R.id.viewpager);

        presenterImpl = new PresenterImpl(this);
        presenterImpl.subscribe();
        fragments = new ArrayList<>();
        fragments.add(new FirstFragment());
        fragments.add(new FirstFragment());
        adapter = new MyFragmentAdapter(getSupportFragmentManager(), fragments);
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);
    }


    @Override
    public void showBannerFail(String failMessage) {
        Toast.makeText(this, failMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setBannerData(List<String> list) {
        banner.setImages(list).setImageLoader(new GlideImageLoader()).start();
    }
}
