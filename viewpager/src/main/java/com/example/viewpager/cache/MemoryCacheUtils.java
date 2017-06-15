package com.example.viewpager.cache;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;

/**
 * Created by HASEE on 2017/6/15 11:25
 */

public class MemoryCacheUtils {

    //LRU缓存
    private LruCache<String, Bitmap> mCache;

//    public MemoryCacheUtils() {
//        //返回Java虚拟机将尝试使用的最大内存
//        int maxMemory = (int) Runtime.getRuntime().maxMemory();
//        //指定缓存大小
//        int cacheSize = maxMemory / 4;
//        mCache = new LruCache<String, Bitmap>(cacheSize) {
//            @Override
//            protected int sizeOf(String key, Bitmap value) {
//                //Bitmap的实际大小 注意单位与maxMemory一致
//                return value.getByteCount();
//            }
//        };
//    }
//
//    /**
//     * 将Bitmap存入缓存
//     *
//     * @param url    Bitmap对象的key
//     * @param bitmap 对象的key
//     */
//    public void addBitmapToCache(String url, Bitmap bitmap) {
//        //如果缓存中没有
//        if (getBitmapFromCache(url) == null) {
//            //保存到缓存中
//            mCache.put(url, bitmap);
//        }
//    }
//
//    /**
//     * 从缓存中获取Bitmap对象
//     *
//     * @param url Bitmap对象的key
//     * @return 缓存中Bitmap对象
//     */
//    public Bitmap getBitmapFromCache(String url) {
//        return mCache.get(url);
//    }

    // private HashMap<String,Bitmap> mMemoryCache=new HashMap<>();//1.因为强引用,容易造成内存溢出，所以考虑使用下面弱引用的方法
    // private HashMap<String, SoftReference<Bitmap>> mMemoryCache = new HashMap<>();//2.因为在Android2.3+后,系统会优先考虑回收弱引用对象,官方提出使用LruCache
    private LruCache<String,Bitmap> mMemoryCache;

    public MemoryCacheUtils(){
        long maxMemory = Runtime.getRuntime().maxMemory()/8;//得到手机最大允许内存的1/8,即超过指定内存,则开始回收
        //需要传入允许的内存最大值,虚拟机默认内存16M,真机不一定相同
        mMemoryCache=new LruCache<String,Bitmap>((int) maxMemory){
            //用于计算每个条目的大小
            @Override
            protected int sizeOf(String key, Bitmap value) {
                int byteCount = value.getByteCount();
                return byteCount;
            }
        };

    }

    /**
     * 从内存中读图片
     * @param url
     */
    public Bitmap getBitmapFromMemory(String url) {
        //Bitmap bitmap = mMemoryCache.get(url);//1.强引用方法
            /*2.弱引用方法
            SoftReference<Bitmap> bitmapSoftReference = mMemoryCache.get(url);
            if (bitmapSoftReference != null) {
                Bitmap bitmap = bitmapSoftReference.get();
                return bitmap;
            }
            */
        Bitmap bitmap = mMemoryCache.get(url);
        return bitmap;

    }

    /**
     * 往内存中写图片
     * @param url
     * @param bitmap
     */
    public void setBitmapToMemory(String url, Bitmap bitmap) {
        //mMemoryCache.put(url, bitmap);//1.强引用方法
            /*2.弱引用方法
            mMemoryCache.put(url, new SoftReference<>(bitmap));
            */
        mMemoryCache.put(url,bitmap);
    }
}


