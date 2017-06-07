package com.example.myapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapp.fragment.FirstFragment;
import com.example.myapp.fragment.SecondFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * app中的四个任务模块
 */
public class MainActivity extends AppCompatActivity {

    private Class<?> fragmentArray[] = {FirstFragment.class, SecondFragment.class};

    private int imageArrayOff[] = {R.mipmap.home, R.mipmap.task};
    private int imageArrayOn[] = {R.mipmap.home_click, R.mipmap.task_click};
    private String[] names = {"首页", "任务"};
    private List<ViewGroup> items = new ArrayList<>();
    private int lastIndex = 0;
    private int openIndex = 0;
    private boolean isChange = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        /**
         * 默认进来选中第一个fragment
         */
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragmentManager.getFragments() == null || fragmentManager.getFragments().size() <= 0) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.realcontent, Fragment.instantiate(this, fragmentArray[openIndex].getName())
            );
            transaction.commit();
        }
        isChange = false;
    }

    public void init() {
        items.add((ViewGroup) findViewById(R.id.item0));
        items.add((ViewGroup) findViewById(R.id.item1));

        for (int i = 0; i < items.size(); i++) {
            ViewGroup ivg = items.get(i);
            ((ImageView) ivg.findViewById(R.id.imageview)).setImageResource(
                    imageArrayOff[i]);
            TextView text = ((TextView) ivg.findViewById(R.id.textview));
            text.setTextColor(Color.BLACK);
            text.setText(names[i]);

            ivg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ViewGroup view = (ViewGroup) v;
                    int currentIndex = items.indexOf(view);
                    if (lastIndex != currentIndex) {
                        ((ImageView) view.findViewById(R.id.imageview)).setImageResource(
                                imageArrayOn[currentIndex]);
                        ((TextView) view.findViewById(R.id.textview)).setTextColor(
                                Color.GREEN);


                        ViewGroup lastView = items.get(lastIndex);
                        ((ImageView) lastView.findViewById(R.id.imageview)).setImageResource(
                                imageArrayOff[lastIndex]);
                        ((TextView) lastView.findViewById(R.id.textview)).setTextColor(
                                Color.BLACK
                        );

                        lastIndex = currentIndex;
                        openIndex = currentIndex;

                        FragmentManager manager = getSupportFragmentManager();
                        FragmentTransaction transAction = manager.beginTransaction();
                        transAction.replace(R.id.realcontent,
                                Fragment.instantiate(MainActivity.this, fragmentArray[currentIndex].getName()));
                        transAction.commit();

                    }
                }
            });


        }
    }

    @Override
    public void onResume() {

        super.onResume();

        if (isChange) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.realcontent, Fragment.instantiate(this, fragmentArray[openIndex].getName())
            );

            transaction.commit();
            isChange = false;
        }

        View lastView = items.get(lastIndex);
        ((ImageView) lastView.findViewById(R.id.imageview))
                .setImageResource(imageArrayOff[lastIndex]);
        ((TextView) lastView.findViewById(R.id.textview))
                .setTextColor(Color.BLACK);


        ViewGroup vgg = items.get(openIndex);
        ((ImageView) vgg.findViewById(R.id.imageview)).setImageResource(imageArrayOn[openIndex]);
        ((TextView) vgg.findViewById(R.id.textview)).setTextColor(Color.GREEN);

        lastIndex = openIndex;
    }
}
