package com.example.viewpager_mvp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpager_mvp.R;

/**
 * Created by HASEE on 2017/6/22 14:08
 */

public class FirstFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, null);


        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Bundle bundle = new Bundle();
//        bundle.putString("ss", "傻逼1");
//        FirstFragment firstFragment = new FirstFragment();
//        firstFragment.setArguments(bundle);
//
//        String string = getArguments().getString("ss");
//        Log.e("FirstFragment", string);
    }
}