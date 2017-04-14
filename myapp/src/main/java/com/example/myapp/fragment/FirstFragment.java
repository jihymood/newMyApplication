package com.example.myapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapp.R;

import java.util.List;

import rx.Observable;
import rx.Observer;

public class FirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {


        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void getData() {
        Observable<List<String>> listObservable= Observable.just(getColorList());
        listObservable.subscribe(new Observer<List<String>>() {

            @Override
            public void onCompleted() {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onNext(List<String> strings) {

            }
        });
    }

    private List<String> getColorList() {
        return
    }
}
