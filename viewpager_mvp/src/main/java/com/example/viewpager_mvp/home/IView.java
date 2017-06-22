package com.example.viewpager_mvp.home;

import java.util.List;

/**
 * Created by HASEE on 2017/6/22 10:33
 */

public interface IView {

    void showBannerFail(String failMessage);

    void setBannerData(List<String> list);

}
