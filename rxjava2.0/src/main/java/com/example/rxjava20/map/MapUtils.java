package com.example.rxjava20.map;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.baidu.location.LocationClientOption;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.BaiduMap.SnapshotReadyCallback;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.Circle;
import com.baidu.mapapi.map.CircleOptions;
import com.baidu.mapapi.map.Gradient;
import com.baidu.mapapi.map.HeatMap;
import com.baidu.mapapi.map.MapStatus;
import com.baidu.mapapi.map.MapStatusUpdate;
import com.baidu.mapapi.map.MapStatusUpdateFactory;
import com.baidu.mapapi.map.Marker;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.map.MyLocationData;
import com.baidu.mapapi.map.Overlay;
import com.baidu.mapapi.map.OverlayOptions;
import com.baidu.mapapi.map.Polygon;
import com.baidu.mapapi.map.PolygonOptions;
import com.baidu.mapapi.map.Polyline;
import com.baidu.mapapi.map.PolylineOptions;
import com.baidu.mapapi.map.Stroke;
import com.baidu.mapapi.map.WeightedLatLng;
import com.baidu.mapapi.map.offline.MKOLSearchRecord;
import com.baidu.mapapi.map.offline.MKOLUpdateElement;
import com.baidu.mapapi.map.offline.MKOfflineMap;
import com.baidu.mapapi.map.offline.MKOfflineMapListener;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.geocode.GeoCodeOption;
import com.baidu.mapapi.search.geocode.GeoCoder;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiCitySearchOption;
import com.baidu.mapapi.search.poi.PoiSearch;
import com.baidu.mapapi.search.route.DrivingRoutePlanOption;
import com.baidu.mapapi.search.route.OnGetRoutePlanResultListener;
import com.baidu.mapapi.search.route.PlanNode;
import com.baidu.mapapi.search.route.RoutePlanSearch;
import com.baidu.mapapi.search.sug.OnGetSuggestionResultListener;
import com.baidu.mapapi.search.sug.SuggestionSearch;
import com.baidu.mapapi.search.sug.SuggestionSearchOption;
import com.baidu.mapapi.utils.CoordinateConverter;
import com.baidu.mapapi.utils.CoordinateConverter.CoordType;
import com.baidu.mapapi.utils.DistanceUtil;
import com.baidu.mapapi.utils.SpatialRelationUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 百度地图工具类
 *
 * @author Liao_Yang
 * @Description
 * @data2015年12月28日 下午4:26:13
 */
public class MapUtils {
    /**
     * 开始定位
     */
    public static void initLocation(BaiduMap baiduMap, LocationClient locClient, BDLocationListener listener) {
        MapStatusUpdate msu = MapStatusUpdateFactory.zoomTo(15.0f); //缩放等级
        baiduMap.setMyLocationEnabled(true);// 开启定位图层
        // 普通地图
        baiduMap.setMapType(BaiduMap.MAP_TYPE_NORMAL);
        baiduMap.setMapStatus(msu);
        LocationClientOption option = new LocationClientOption();
        option.setOpenGps(true);// 打开gps
        option.setCoorType("bd09ll"); // 设置坐标类型
        option.setAddrType("all");
        option.setScanSpan(1000);
        locClient.setLocOption(option);
        locClient.registerLocationListener(listener);
        locClient.start();
    }

    /**
     * 切换地图俯仰角
     */
    public static void Map3D(BaiduMap baiduMap, int overlook) {
        MapStatus status = new MapStatus.Builder().overlook(overlook).build();
        baiduMap.animateMapStatus(MapStatusUpdateFactory.newMapStatus(status));
    }

    /**
     * 关闭定位
     */
    public static void stopLocation(BaiduMap baiduMap, LocationClient locClient) {
        if (null != locClient && null != baiduMap) {
            locClient.stop();
            baiduMap.setMyLocationEnabled(false);
        }
    }

    /**
     * 添加点位至定位图层
     */
    public static void addMyLocation(BaiduMap baiduMap, BDLocation location) {
        MyLocationData locData = new MyLocationData.Builder().accuracy(location.getRadius())
                .direction(location.getDirection()).latitude(location.getLatitude()).longitude(location.getLongitude())
                .build();
        baiduMap.setMyLocationData(locData);
    }

    /**
     * 移动地图至指定点位
     */
    public static void moveMapToNewLatLng(BaiduMap baiduMap, double lat, double lng) {
        LatLng ll = new LatLng(lat, lng);
        MapStatusUpdate u = MapStatusUpdateFactory.newLatLng(ll);
        baiduMap.animateMapStatus(u);
    }

    /**
     * 改变地图缩放等级 处理缩放 sdk 缩放级别范围： [3.0,19.0]
     */
    public static void setZoomLevel(BaiduMap baiduMap, float zoomLevel) {
        MapStatusUpdate u = MapStatusUpdateFactory.zoomTo(zoomLevel);
        baiduMap.animateMapStatus(u);
    }

    /**
     * 获取地图缩放等级
     */
    public static int getZoomLevel(BaiduMap baiduMap) {
        int zoom = Math.round(baiduMap.getMapStatus().zoom);
        return zoom;
    }

    public static void mapZoomIn(BaiduMap baiduMap) {
        int zoomLevel = getZoomLevel(baiduMap) + 1;
        if (zoomLevel <= 20) {
            setZoomLevel(baiduMap, zoomLevel);
        } else {
            setZoomLevel(baiduMap, 20);
        }
    }

    public static void mapZoomOut(BaiduMap baiduMap) {
        int zoomLevel = getZoomLevel(baiduMap) - 1;
        if (zoomLevel >= 3) {
            setZoomLevel(baiduMap, zoomLevel);
        } else {
            setZoomLevel(baiduMap, 3);
        }
    }

    /**
     * 获取屏幕截图 rect=null 为全屏
     */
    public static void getScreenshot(BaiduMap baiduMap, Rect rect, SnapshotReadyCallback callback) {
        baiduMap.snapshotScope(rect, callback);
    }

    /**
     * 改变地图状态为普通
     */
    public static void changeMapTypeNormall(BaiduMap baiduMap) {
        baiduMap.setMapType(BaiduMap.MAP_TYPE_NORMAL);
    }

    /**
     * 改变地图状态为卫星
     */
    public static void changeMapTypeSatellite(BaiduMap baiduMap) {
        baiduMap.setMapType(BaiduMap.MAP_TYPE_SATELLITE);
    }

    /**
     * 获取路线规划实例
     */
    public static RoutePlanSearch initRoutePlan(OnGetRoutePlanResultListener listener) {
        RoutePlanSearch search = RoutePlanSearch.newInstance();
        search.setOnGetRoutePlanResultListener(listener);
        return search;
    }

    /**
     * 线路规划
     */
    public static void routePlan(RoutePlanSearch search, LatLng stLL, LatLng enLL) {
        PlanNode stNode = PlanNode.withLocation(stLL);
        PlanNode enNode = PlanNode.withLocation(enLL);
        search.drivingSearch(new DrivingRoutePlanOption().from(stNode).to(enNode));
    }


    /**
     * 获取离线地图服务实例
     */
    public static MKOfflineMap initOffline(MKOfflineMapListener listener) {
        MKOfflineMap offline = new MKOfflineMap();
        offline.init(listener);
        return offline;
    }

    /**
     * 获取所有已下载地图列表
     */
    public static ArrayList<MKOLUpdateElement> getDownloadMapList(MKOfflineMap offline) {
        ArrayList<MKOLUpdateElement> array = null;
        array = offline.getAllUpdateInfo();
        return array;
    }

    /**
     * 获取所有可下载地图列表
     */
    public static ArrayList<MKOLSearchRecord> getAllCityList(MKOfflineMap offline) {
        ArrayList<MKOLSearchRecord> array = null;
        array = offline.getOfflineCityList();
        return array;
    }

    /**
     * 获取建议搜索服务实例
     */
    public static SuggestionSearch initSuggestionSearch(OnGetSuggestionResultListener listener) {
        SuggestionSearch suggesionSearch = SuggestionSearch.newInstance();
        suggesionSearch.setOnGetSuggestionResultListener(listener);
        return suggesionSearch;
    }

    /**
     * 使用建议搜索服务获取建议列表
     */
    public static void requestSuggestion(SuggestionSearch suggesionSearch, String city, String keyword) {
        suggesionSearch.requestSuggestion(new SuggestionSearchOption().city(city).keyword(keyword));
    }

    /**
     * 获取poi搜索服务实例
     */
    public static PoiSearch initPoiSearch(OnGetPoiSearchResultListener listener) {
        PoiSearch poiSearch = PoiSearch.newInstance();
        poiSearch.setOnGetPoiSearchResultListener(listener);
        return poiSearch;
    }

    /**
     * poi搜索
     */
    public static void requestPoiSearch(PoiSearch poiSearch, String city, String keyword, int capacity, int pageNum) {
        poiSearch.searchInCity(
                new PoiCitySearchOption().city(city).keyword(keyword).pageCapacity(capacity).pageNum(pageNum));
    }

//    /**
//     * 添加poi结果至地图
//     */
//    public static PoiOverlay addPoiResultOnMap(BaiduMap baiduMap, PoiResult result) {
//        PoiOverlay overlay = new PoiOverlay(baiduMap);
//        overlay.setData(result);
//        overlay.addToMap();
//        return overlay;
//    }

    /**
     * 添加覆盖物至地图
     */
    public static Marker addOverlayToMap(BaiduMap baiduMap, LatLng ll, BitmapDescriptor bitmap) {
        OverlayOptions options = new MarkerOptions().position(ll).icon(bitmap);
        Marker marker = (Marker) baiduMap.addOverlay(options);
        return marker;
    }

    public static Marker addOverlayToMap(BaiduMap baiduMap, LatLng ll, BitmapDescriptor bitmap, float rotate,
                                         int index) {
        OverlayOptions options = new MarkerOptions().position(ll).icon(bitmap).rotate(rotate).zIndex(index);
        Marker marker = (Marker) baiduMap.addOverlay(options);
        return marker;
    }

    public static Marker addOverlayToMap(BaiduMap baiduMap, LatLng ll, BitmapDescriptor bitmap, float rotate, int index,
                                         float anchorX) {
        OverlayOptions options = new MarkerOptions().position(ll).icon(bitmap).rotate(rotate).zIndex(index)
                .anchor(anchorX, 1f);
        Marker marker = (Marker) baiduMap.addOverlay(options);
        return marker;
    }

    public static Marker addOverlayToMap(BaiduMap baiduMap, LatLng ll, BitmapDescriptor bitmap, float rotate, int index,
                                         float anchorX, float anchorY) {
        OverlayOptions options = new MarkerOptions().position(ll).icon(bitmap).rotate(rotate).zIndex(index)
                .anchor(anchorX, anchorY);
        Marker marker = (Marker) baiduMap.addOverlay(options);
        return marker;
    }

    /**
     * 更新mark坐标
     */
    public static void updateMarkerLatLng(Marker marker, LatLng ll) {
        marker.setPosition(ll);
    }

    /**
     * 绘制折线
     */
    public static Polyline addPolylineToMap(BaiduMap baiduMap, List<LatLng> points, int width, int color) {
        OverlayOptions ooPolyline = new PolylineOptions().points(points).width(width).color(color);
        Polyline polyline = (Polyline) baiduMap.addOverlay(ooPolyline);
        return polyline;
    }

    /**
     * 更新折线数据
     */
    public static void setPolylinePoint(Polyline polyline, List<LatLng> points) {
        polyline.setPoints(points);
    }

    /**
     * 绘制多边形
     */
    public static Polygon addPolygonToMap(BaiduMap baiduMap, List<LatLng> points, int width, int color,
                                          int innerColor) {
        OverlayOptions ooPolygon = new PolygonOptions().points(points).stroke(new Stroke(width, color))
                .fillColor(innerColor);
        Polygon polygon = (Polygon) baiduMap.addOverlay(ooPolygon);
        return polygon;
    }

    /**
     * 绘制多边形
     */
    public static Polygon addPolygonToMap(BaiduMap baiduMap, List<LatLng> points, int width, int color, int innerColor,
                                          int index) {
        OverlayOptions ooPolygon = new PolygonOptions().points(points).stroke(new Stroke(width, color))
                .fillColor(innerColor).zIndex(index);
        Polygon polygon = (Polygon) baiduMap.addOverlay(ooPolygon);
        return polygon;
    }

    public static Circle addCircleToMap(BaiduMap baiduMap, LatLng center, int radius, int fillColor, int strokeColor) {
        Stroke stroke = new Stroke(1, strokeColor);
        CircleOptions circleOptions = new CircleOptions().center(center).radius(radius).fillColor(fillColor)
                .stroke(stroke);
        Circle circle = (Circle) baiduMap.addOverlay(circleOptions);
        return circle;
    }

    /**
     * 更新多边形数据
     */
    public static void setPolygonPoint(Polygon polygon, List<LatLng> points) {
        polygon.setPoints(points);
    }

    /**
     * 删除覆盖物
     */
    public static void removeOverlayFromMap(Overlay overlay) {
        if (null != overlay) {
            overlay.remove();
        }
    }

    /**
     * 保存信息至覆盖物
     */
    public static void saveDataWithOverlay(Overlay overlay, Bundle b) {
        overlay.setExtraInfo(b);
    }

    /**
     * 获取覆盖物保存信息
     */
    public static Bundle getDataWithOverlay(Overlay overlay) {
        return overlay.getExtraInfo();
    }

    /**
     * 获取两点间距离 单位：米
     */
    public static double getDistance(LatLng stLL, LatLng enLL) {
        return DistanceUtil.getDistance(stLL, enLL);
    }

    /**
     * 清空地图
     */
    public static void clearMap(BaiduMap baiduMap) {
        baiduMap.clear();
    }

    /**
     * 将屏幕坐标转换成经纬度
     */
    public static LatLng fromPointToLatLng(BaiduMap baiduMap, Point p) {
        LatLng ll = baiduMap.getProjection().fromScreenLocation(p);
        return ll;
    }

    /**
     * 获取地理编码查询实例
     */
    public static GeoCoder initGeoCoder(OnGetGeoCoderResultListener listener) {
        GeoCoder search = GeoCoder.newInstance();
        search.setOnGetGeoCodeResultListener(listener);
        return search;
    }

    /**
     * 反地理编码查询
     */
    public static void reverseGeoCode(GeoCoder search, LatLng ll) {
        search.reverseGeoCode(new ReverseGeoCodeOption().location(ll));
    }

    /**
     * 地理编码查询
     */
    public static void geocode(GeoCoder search, String address, String city) {
        search.geocode(new GeoCodeOption().address(address).city(city));
    }

    /**
     * GPS坐标转换百度坐标
     */
    public static LatLng fromGPSToBaidu(LatLng ll) {
        if (null != ll) {
            CoordinateConverter converter = new CoordinateConverter();
            converter.from(CoordType.GPS);
            converter.coord(ll);
            return converter.convert();
        }
        return null;
    }

    /**
     * 百度坐标转gps
     */
    public static LatLng fromBaiduToGPS(LatLng ll) {
        if (null != ll) {
            LatLng convertBaidu = fromGPSToBaidu(ll);
            double resultLat = 2 * ll.latitude - convertBaidu.latitude;
            double resultLong = 2 * ll.longitude - convertBaidu.longitude;
            return new LatLng(resultLat, resultLong);
        }
        return null;
    }

    /**
     * 获取地图信息
     */
    public static LatLng[] getMapBounds(BaiduMap baiduMap) {
        LatLng rt = baiduMap.getMapStatus().bound.northeast;
        LatLng lb = baiduMap.getMapStatus().bound.southwest;
        return new LatLng[]{rt, lb};
    }

    /**
     * 获取地图左上角和右下角的经纬度
     */
    public static LatLng[] getMapLTandRB(BaiduMap baiduMap) {
        LatLng rt = baiduMap.getMapStatus().bound.northeast;
        LatLng lb = baiduMap.getMapStatus().bound.southwest;
        return new LatLng[]{new LatLng(rt.latitude, lb.longitude), new LatLng(lb.latitude, rt.longitude)};
    }


    /**
     * 获取两点间角度
     */
    public static double getAngle(List<LatLng> points) {
        double angle = 0;

        LatLng stLL = points.get(0);
        LatLng enLL = points.get(1);

        double x = enLL.longitude - stLL.longitude;
        double y = enLL.latitude - stLL.latitude;

        if (y == 0 && x > 0) {
            angle = 90;
        } else if (y == 0 && x < 0) {
            angle = 270;
        } else if (x == 0 && y > 0) {
            angle = 0;
        } else if (x == 0 && y < 0) {
            angle = 180;
        } else if (x > 0 && y > 0) {
            angle = Math.atan((x) / (y)) * 180 / Math.PI;
        } else if (x > 0 && y < 0) {
            angle = 180 + Math.atan((x) / (y)) * 180 / Math.PI;
        } else if (x < 0 && y < 0) {
            angle = 180 + Math.atan((x) / (y)) * 180 / Math.PI;
        } else if (x < 0 && y > 0) {
            angle = 360 + Math.atan((x) / (y)) * 180 / Math.PI;
        }

        return angle;
    }

    /**
     * 添加热力图
     */
    public static HeatMap addHeatMap(BaiduMap baiduMap, List<WeightedLatLng> lls) {
        HeatMap heatmap = null;
        if (null != baiduMap) {
            int[] DEFAULT_GRADIENT_COLORS = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
            float[] DEFAULT_GRADIENT_START_POINTS = {0.2f, 1f};
            Gradient gradient = new Gradient(DEFAULT_GRADIENT_COLORS, DEFAULT_GRADIENT_START_POINTS);
            heatmap = new HeatMap.Builder().weightedData(lls).gradient(gradient).radius(20).build();
            baiduMap.addHeatMap(heatmap);
        }
        return heatmap;
    }

    /**
     * 移除热力图
     */
    public static void removeheatMap(HeatMap heatMap) {
        heatMap.removeHeatMap();
    }

    public static boolean isPolygonContainsPoint(List<LatLng> points, LatLng point) {
        boolean isInFlag = SpatialRelationUtil.isPolygonContainsPoint(points, point);
        return isInFlag;
    }
}
