package com.example.stepview.banner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.stepview.R;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 轮播图框架快速使用
 */
public class BannerActivity extends AppCompatActivity implements OnBannerListener {


    private Banner banner;
    private List<String> images;
    private static final String TRANSITION_URL_01 = "http://ojyz0c8un.bkt.clouddn.com/b_1.jpg";
    private static final String TRANSITION_URL_02 = "http://ojyz0c8un.bkt.clouddn.com/b_2.jpg";
    private static final String TRANSITION_URL_04 = "http://ojyz0c8un.bkt.clouddn.com/b_4.jpg";
    private static final String TRANSITION_URL_05 = "http://ojyz0c8un.bkt.clouddn.com/b_5.jpg";
    private static final String TRANSITION_URL_06 = "http://ojyz0c8un.bkt.clouddn.com/b_6.jpg";
    private static final String TRANSITION_URL_07 = "http://ojyz0c8un.bkt.clouddn.com/b_7.jpg";
    private static final String TRANSITION_URL_08 = "http://ojyz0c8un.bkt.clouddn.com/b_8.jpg";
    private static final String TRANSITION_URL_09 = "http://ojyz0c8un.bkt.clouddn.com/b_9.jpg";
    private static final String TRANSITION_URL_10 = "http://ojyz0c8un.bkt.clouddn.com/b_10.jpg";

    public static final String[] TRANSITION_URLS = new String[]{
            TRANSITION_URL_01, TRANSITION_URL_02, TRANSITION_URL_03
            , TRANSITION_URL_04, TRANSITION_URL_05, TRANSITION_URL_06
            , TRANSITION_URL_07, TRANSITION_URL_08, TRANSITION_URL_09
            , TRANSITION_URL_10
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        images = new ArrayList<>();
        images.add(TRANSITION_URL_01);
        images.add(TRANSITION_URL_02);
        images.add(TRANSITION_URL_04);
        images.add(TRANSITION_URL_05);
        images.add(TRANSITION_URL_06);
        images.add(TRANSITION_URL_07);
        images.add(TRANSITION_URL_08);
        images.add(TRANSITION_URL_09);
        images.add(TRANSITION_URL_10);

        int i = new Random().nextInt(TRANSITION_URLS.length);

        banner = (Banner) findViewById(R.id.banner);
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        banner.setOnBannerListener(this);
        banner.setImages(images).setImageLoader(new GlideImageLoader());
        banner.start();


    }

    @Override
    public void OnBannerClick(int position) {

    }
}
