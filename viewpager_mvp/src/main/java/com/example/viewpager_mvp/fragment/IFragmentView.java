package com.example.viewpager_mvp.fragment;

import com.example.viewpager_mvp.model.PictureModel;

import java.util.List;

/**
 * Created by HASEE on 2017/6/30 09:40
 */

public interface IFragmentView {

    void setCategoryItems(List<PictureModel> list);

    String getTitle();

}
