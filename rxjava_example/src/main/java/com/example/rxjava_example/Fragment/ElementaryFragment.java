package com.example.rxjava_example.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.AppCompatRadioButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rxjava_example.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/6/7 14:16
 */

public class ElementaryFragment extends BaseFragment {

    @Bind(R.id.searchRb1)
    AppCompatRadioButton searchRb1;
    @Bind(R.id.searchRb2)
    AppCompatRadioButton searchRb2;
    @Bind(R.id.searchRb3)
    AppCompatRadioButton searchRb3;
    @Bind(R.id.searchRb4)
    AppCompatRadioButton searchRb4;
    @Bind(R.id.gridRv)
    android.support.v7.widget.RecyclerView gridRv;
    @Bind(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_elementary, null);


        ButterKnife.bind(this, view);
        return view;
    }

    public ElementaryFragment() {
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }
}
