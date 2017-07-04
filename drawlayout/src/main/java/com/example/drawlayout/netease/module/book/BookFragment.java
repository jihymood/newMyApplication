package com.example.drawlayout.netease.module.book;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawlayout.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class BookFragment extends Fragment {

    @Bind(R.id.tablayout)
    TabLayout tablayout;
    @Bind(R.id.viewpager)
    ViewPager viewpager;

    private BookViewpagerAdapter bookViewpagerAdapter;
    private List<Fragment> list;
    private String[] mTitles = {"热映榜", "TOP250"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book, container, false);
        ButterKnife.bind(this, view);

        initFragment();
        bookViewpagerAdapter = new BookViewpagerAdapter(getChildFragmentManager(), getActivity(), list, mTitles);
        viewpager.setAdapter(bookViewpagerAdapter);
        tablayout.setupWithViewPager(viewpager);

        return view;
    }

    public void initFragment() {
        list = new ArrayList<>();
        list.add(BookReadingFragment.getInstance(mTitles[0]));
        list.add(BookReadingFragment.getInstance(mTitles[1]));
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


}
