package com.example.drawlayout.netease.module.book;


import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawlayout.R;
import com.example.drawlayout.netease.model.Meizi;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
@RequiresApi(api = Build.VERSION_CODES.M)
public class BookReadingFragment extends Fragment implements IBookView, OnRefreshListener {

    @Bind(R.id.recyleView)
    RecyclerView recyleView;
    @Bind(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;

    private BookIpresenterImpl ipresenter;
    private MyRecyclerAdapter adapter;
    private String categoryName;

    public static BookReadingFragment getInstance(String title) {
        BookReadingFragment bookReadingFragment = new BookReadingFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        bookReadingFragment.setArguments(bundle);
        return bookReadingFragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_book_reading, container, false);
        ButterKnife.bind(this, view);

        swipeRefresh.setOnRefreshListener(this);

        Bundle bundle = getArguments();
        categoryName = bundle.getString("title");

        adapter = new MyRecyclerAdapter(getActivity());
        ipresenter = new BookIpresenterImpl(getActivity(), this);
        recyleView.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyleView.setAdapter(adapter);
        ipresenter.subscribe();

        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @Override
    public void showSwipeLoading() {
        swipeRefresh.setRefreshing(true);
    }

    @Override
    public void hideSwipeLoading() {
        swipeRefresh.setRefreshing(false);
    }

    @Override
    public void setBookHotList(List<Meizi.ResultsBean> list) {
        adapter.setData(list);
    }

    @Override
    public String getCategoryName() {
        return categoryName;
    }

    @Override
    public void setLoading() {
//        recyleView.setLayoutManager();
    }

    @Override
    public void onRefresh() {
        ipresenter.subscribe();
    }

}
