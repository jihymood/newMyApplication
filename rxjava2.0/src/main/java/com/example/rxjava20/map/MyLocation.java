package com.example.rxjava20.map;


import android.content.Context;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.mapapi.map.MapView;

/**
 * 我的定位信息类
 *
 * @author Liao_Yang
 * @Description
 * @data2015年12月30日 下午3:38:55
 */
public class MyLocation implements BDLocationListener {
    private LocationClient mLocClient;
    private Context context;
    private MapView mMapView;
    /**
     * 是否手动触发请求定位
     */
    boolean isRequest = false;
    /**
     * 是否需要定位后移动
     */
    boolean isNeed = true;
    /**
     * 我的位置
     */
    public static BDLocation MY_LOCATION = null;

    private OnLocationCallback mCallback;

    private double mLat;
    private double mLng;

    public MyLocation(MapView mMapView, Context context) {
        this.context = context;
        this.mMapView = mMapView;
    }

    public MyLocation(Context context) {
        this.context = context;
    }

    /**
     * 定位
     */
    public void getLocation(boolean isNeed) {
        this.isNeed = isNeed;
        if (mLocClient == null) {
            mLocClient = new LocationClient(context);
        }
        MapUtils.initLocation(mMapView.getMap(), mLocClient, this);
    }

    /**
     * 手动触发一次定位请求
     */
    public void requestLocClick() {
        isRequest = true;
        mLocClient.requestLocation();
    }


    /**
     * 定位SDK监听函数
     */
    @Override
    public void onReceiveLocation(BDLocation location) {
        if (location == null)
            return;
        MY_LOCATION = location;
        double lat = location.getLatitude();
        double lng = location.getLongitude();
        MapUtils.addMyLocation(mMapView.getMap(), location);
        // 首次定位或手动定位时，移动至定位位置
        if (isRequest || isNeed) {
            MapUtils.moveMapToNewLatLng(mMapView.getMap(), lat, lng);
            isRequest = false;
            isNeed = false;
        }
        if (null != mCallback) {
            mCallback.onLocation();
        }
        mLat = lat;
        mLng = lng;
    }

    /**
     * 销毁定位
     */
    public void stopLocationClient() {
        MapUtils.stopLocation(mMapView.getMap(), mLocClient);
    }

    public void setOnLocationCallback(OnLocationCallback callback) {
        mCallback = callback;
    }

    public interface OnLocationCallback {
        void onLocation();
    }
}
