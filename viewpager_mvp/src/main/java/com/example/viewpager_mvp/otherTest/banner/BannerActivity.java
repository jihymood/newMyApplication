package com.example.viewpager_mvp.otherTest.banner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.viewpager_mvp.R;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.listener.OnBannerListener;

import java.util.ArrayList;
import java.util.List;

/**
 * 轮播图框架快速使用
 */
public class BannerActivity extends AppCompatActivity implements OnBannerListener {


    private Banner banner, banner1;
    private List<String> imagesList, images,titles;
    private static final String TRANSITION_URL_01 = "http://ojyz0c8un.bkt.clouddn.com/b_1.jpg";
    private static final String TRANSITION_URL_02 = "http://ojyz0c8un.bkt.clouddn.com/b_2.jpg";
    private static final String TRANSITION_URL_04 = "http://ojyz0c8un.bkt.clouddn.com/b_4.jpg";
    private static final String TRANSITION_URL_05 = "http://ojyz0c8un.bkt.clouddn.com/b_5.jpg";
    private static final String TRANSITION_URL_06 = "http://ojyz0c8un.bkt.clouddn.com/b_6.jpg";
    private static final String TRANSITION_URL_07 = "http://ojyz0c8un.bkt.clouddn.com/b_7.jpg";
    private static final String TRANSITION_URL_08 = "http://ojyz0c8un.bkt.clouddn.com/b_8.jpg";
    private static final String TRANSITION_URL_09 = "http://ojyz0c8un.bkt.clouddn.com/b_9.jpg";
    private static final String TRANSITION_URL_10 = "http://ojyz0c8un.bkt.clouddn.com/b_10.jpg";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banner);

        imagesList = new ArrayList<>();
        imagesList.add(TRANSITION_URL_01);
        imagesList.add(TRANSITION_URL_02);
        imagesList.add(TRANSITION_URL_04);
        imagesList.add(TRANSITION_URL_05);
        imagesList.add(TRANSITION_URL_06);
        imagesList.add(TRANSITION_URL_07);
        imagesList.add(TRANSITION_URL_08);
        imagesList.add(TRANSITION_URL_09);
        imagesList.add(TRANSITION_URL_10);

        banner = (Banner) findViewById(R.id.banner);
        banner.setIndicatorGravity(BannerConfig.RIGHT);
        banner.setOnBannerListener(this);
        banner.setImages(imagesList).setImageLoader(new GlideImageLoader());
        banner.start();


        /*另一个*/
        images = new ArrayList<>();
        images.add("http://img.zcool.cn/community/0166c756e1427432f875520f7cc838.jpg");
        images.add("http://img.zcool.cn/community/018fdb56e1428632f875520f7b67cb.jpg");
        images.add("http://img.zcool.cn/community/01c8dc56e1428e6ac72531cbaa5f2c.jpg");
        images.add("http://img.zcool.cn/community/01fda356640b706ac725b2c8b99b08.jpg");
        images.add("http://img.zcool.cn/community/01fd2756e142716ac72531cbf8bbbf.jpg");
        images.add("http://img.zcool.cn/community/0114a856640b6d32f87545731c076a.jpg");

        titles = new ArrayList<>();
        titles.add("十大星级品牌联盟，全场2折起");
        titles.add("十大星级品牌联盟");
        titles.add("嗨购5折不要停");
        titles.add("12趁现在");
        titles.add("嗨购5折不要停，12.12趁现在");
        titles.add("实打实大顶顶顶顶");

        banner1 = (Banner) findViewById(R.id.banner1);
        //设置样式,默认为:Banner.NOT_INDICATOR(不显示指示器和标题)
        //可选样式如下:
        //1. Banner.CIRCLE_INDICATOR    显示圆形指示器
        //2. Banner.NUM_INDICATOR    显示数字指示器
        //3. Banner.NUM_INDICATOR_TITLE    显示数字指示器和标题
        //4. Banner.CIRCLE_INDICATOR_TITLE    显示圆形指示器和标题
        banner1.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE);
        //设置轮播样式（没有标题默认为右边,有标题时默认左边）
        //可选样式:
        //Banner.LEFT    指示器居左
        //Banner.CENTER    指示器居中
        //Banner.RIGHT    指示器居右
        banner1.setIndicatorGravity(BannerConfig.CENTER);
        //设置轮播要显示的标题和图片对应（如果不传默认不显示标题）
        banner1.setBannerTitles(titles);
        //设置是否自动轮播（不设置则默认自动）
        banner1.isAutoPlay(true);
        //设置轮播图片间隔时间（不设置默认为2000）
        banner1.setDelayTime(5000);
        //设置图片资源:可选图片网址/资源文件，默认用Glide加载,也可自定义图片的加载框架
        //所有设置参数方法都放在此方法之前执行
        banner1.setImages(images).setImageLoader(new GlideImageLoader());
        banner1.start();


    }

    @Override
    public void OnBannerClick(int position) {

    }
}
