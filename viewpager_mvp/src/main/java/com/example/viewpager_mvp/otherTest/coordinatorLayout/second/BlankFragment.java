package com.example.viewpager_mvp.otherTest.coordinatorLayout.second;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager_mvp.R;
import com.example.viewpager_mvp.otherTest.coordinatorTabLayout.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 *
 *
 * 注：经过测试，如果Fragment里没有数据，即使布局是SwipeRefreshLayout+RecyclerView
 * 往上滑动时候失效，只有有数据了才有效果
 *
 */
public class BlankFragment extends Fragment {

    @Bind(R.id.recyclerview)
    RecyclerView recyclerview;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    private RecyclerAdapter adapter;
    List<String> mDatas;
    private static final String ARG_TITLE = "title";
    private String mTitle;

    public static BlankFragment getInstance(String title) {
        BlankFragment blank = new BlankFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG_TITLE,title);
        blank.setArguments(bundle);
        return blank;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        ButterKnife.bind(this, view);

        Bundle bundle = getArguments();
        mTitle  = bundle.getString(ARG_TITLE);

        initData();
        adapter = new RecyclerAdapter(getActivity(), mDatas);
        recyclerview.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerview.setAdapter(adapter);

        return view;
    }

    protected void initData() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i < 'z'; i++) {
            mDatas.add(mTitle + (char) i);
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
