package com.example.viewpager;

import com.example.viewpager.bean.GankBeautyResult;
import com.example.viewpager.bean.ZhuangBi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import rx.functions.Func1;

/**
 * Created by HASEE on 2017/6/15 18:25
 */

public class GankBeautyResultToItemsMapper implements Func1<GankBeautyResult, List<ZhuangBi>> {

    private static GankBeautyResultToItemsMapper instance;

    public static GankBeautyResultToItemsMapper getInstance() {
        if (instance == null) {
            instance = new GankBeautyResultToItemsMapper();
        }
        return instance;
    }

    @Override
    public List<ZhuangBi> call(GankBeautyResult gankBeautyResult) {
        List<GankBeautyResult.ResultsBean> results = gankBeautyResult.getResults();
        List<ZhuangBi> zhuangBis = new ArrayList<ZhuangBi>();
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        SimpleDateFormat outputFormat = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        for (GankBeautyResult.ResultsBean result : results) {
            ZhuangBi zhuangBi = new ZhuangBi();
            String createdAt = result.getCreatedAt();
            try {
                Date parse = inputFormat.parse(createdAt);
                String format = outputFormat.format(parse);
                zhuangBi.setDescription(format);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            zhuangBi.setImage_url(result.getUrl());
            zhuangBis.add(zhuangBi);
        }
        return zhuangBis;
    }
}
