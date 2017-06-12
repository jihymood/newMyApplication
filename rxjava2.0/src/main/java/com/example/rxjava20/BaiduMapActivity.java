package com.example.rxjava20;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapView;
import com.baidu.mapapi.model.LatLng;
import com.example.rxjava20.map.MapUtils;
import com.example.rxjava20.map.MyLocation;


public class BaiduMapActivity extends AppCompatActivity {
    /**
     * 定位相关类
     */
    private MyLocation myLocation;
    /**
     * Baidu地图
     */
    private MapView mMapView;
    /**
     * Baidu地图控制器
     */
    private BaiduMap mBaiduMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baidu_map);

        mMapView = (MapView) findViewById(R.id.mapView);
        mBaiduMap = mMapView.getMap();
        myLocation = new MyLocation(mMapView, this);
        myLocation.getLocation(true);
        myLocation.requestLocClick();

        /**
         * 在这里求屏幕左上角点在百度地图中的坐标，会报错。（定位到了非洲，不知道为什么）
         */
//        LatLng[] pts = MapUtils.getMapLTandRB(mBaiduMap);
//        pts[0] = MapUtils.fromBaiduToGPS(pts[0]);
//        pts[1] = MapUtils.fromBaiduToGPS(pts[1]);
//        Log.e("MainActivity", "latLng0:" + pts[0]);

        /**
         *需要加上手势操作的监听，然后在listener中进行操作，正确的
         */
        mBaiduMap.setOnMapStatusChangeListener(listener);

    }

    BaiduMap.OnMapStatusChangeListener listener = new BaiduMap.OnMapStatusChangeListener() {
        /**
         * 手势操作地图，设置地图状态等操作导致地图状态开始改变。
         * @param status 地图状态改变开始时的地图状态
         */
        public void onMapStatusChangeStart(MapStatus status) {
        }

        /**
         * 地图状态变化中
         * @param status 当前地图状态
         */
        public void onMapStatusChange(MapStatus status) {
        }

        /**
         * 地图状态改变结束
         */
        @Override
        public void onMapStatusChangeFinish(MapStatus mapStatus) {
            //左上角经纬度
            Point pt = new Point();
            pt.x = 0;
            pt.y = 0;
            LatLng ll = mBaiduMap.getProjection().fromScreenLocation(pt);
            //右下角经纬度
            DisplayMetrics dm = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(dm);
            Point pty = new Point();
            pty.x = dm.widthPixels;
            pty.y = dm.heightPixels;
            LatLng lly = mBaiduMap.getProjection().fromScreenLocation(pty);

            //这里能正确显示坐标
            LatLng[] pts = MapUtils.getMapLTandRB(mBaiduMap);
            pts[0] = MapUtils.fromBaiduToGPS(pts[0]);
            pts[1] = MapUtils.fromBaiduToGPS(pts[1]);
            Log.e("MainActivity", "latLng0:" + pts[0]);
        }
    };


}
