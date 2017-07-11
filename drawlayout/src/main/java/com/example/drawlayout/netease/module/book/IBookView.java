package com.example.drawlayout.netease.module.book;

import com.example.drawlayout.netease.model.Meizi;

import java.util.List;

/**
 * Created by HASEE on 2017/7/3 15:31
 */

public interface IBookView {
    void showSwipeLoading();

    void hideSwipeLoading();

    void setBookHotList(List<Meizi.ResultsBean> list);

    String getCategoryName();

    void setLoading();

}
