package com.example.viewpager_mvp.otherTest.horizontal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.horizontalselectedviewlibrary.HorizontalselectedView;
import com.example.viewpager_mvp.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> list;
    private HorizontalselectedView horizontalselectedView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i + "00");
        }
        horizontalselectedView = (HorizontalselectedView) findViewById(R.id.hd_main);
        horizontalselectedView.setData(list);
        horizontalselectedView.setAnLeftOffset();

    }
}
