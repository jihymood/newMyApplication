package com.example.viewpager_mvp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager_mvp.R;
import com.example.viewpager_mvp.model.PictureModel;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/6/22 14:08
 */

public class FirstFragment extends Fragment implements IFragmentView {

    private static final String TITLE = "FirstFragment";
    @Bind(R.id.recyclerview)
    RecyclerView recyclerview;
    @Bind(R.id.swipe_refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;

    private String title;
    private PresenterImpl presenterImpl;
    private MyRecycleAdapter adapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, null);
        ButterKnife.bind(this, view);

        title = getArguments().getString(TITLE);

        adapter = new MyRecycleAdapter(getActivity());
        presenterImpl = new PresenterImpl(this);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerview.setAdapter(adapter);
        presenterImpl.subscribe();




        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public static FirstFragment getInstance(String title) {
        FirstFragment firstFragment = new FirstFragment();
        Bundle bundle = new Bundle();
        bundle.putString(TITLE, title);
        firstFragment.setArguments(bundle);
        return firstFragment;
    }


    @Override
    public void setCategoryItems(List<PictureModel> list) {
        adapter.addData(list);
    }


    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
