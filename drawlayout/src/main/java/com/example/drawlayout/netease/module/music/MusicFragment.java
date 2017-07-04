package com.example.drawlayout.netease.module.music;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawlayout.R;
import com.example.drawlayout.netease.base.constants;
import com.kekstudio.dachshundtablayout.DachshundTabLayout;
import com.kekstudio.dachshundtablayout.indicators.LineMoveIndicator;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends Fragment {


    @Bind(R.id.tabLayout1)
    DachshundTabLayout tabLayout1;
    @Bind(R.id.viewpager)
    ViewPager viewpager;

    private String[] mTitles = constants.BASKETBALL;
    private List<Fragment> list;
    private MusicViewPagerAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_music, container, false);
        ButterKnife.bind(this, view);

        LineMoveIndicator lineMoveIndicator = new LineMoveIndicator(tabLayout1);
        tabLayout1.setAnimatedIndicator(lineMoveIndicator);
        initFragment();
        adapter = new MusicViewPagerAdapter(getChildFragmentManager(), getActivity(), list, mTitles);
        viewpager.setAdapter(adapter);
        tabLayout1.setupWithViewPager(viewpager);


        return view;
    }

    public void initFragment() {
        list = new ArrayList<>();
        list.add(new NBAFragment());
        list.add(new CBAFragment());

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
