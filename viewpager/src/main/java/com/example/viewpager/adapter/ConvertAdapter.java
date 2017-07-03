package com.example.viewpager.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.viewpager.R;
import com.example.viewpager.bean.ZhuangBi;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by HASEE on 2017/6/14 14:26
 */

public class ConvertAdapter extends RecyclerView.Adapter {

    private List<ZhuangBi> list;
    public ConvertAdapter(List<ZhuangBi> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        myViewHolder.imageView = (ImageView) view.findViewById(R.id.imageIv);
        myViewHolder.textView1 = (TextView) view.findViewById(R.id.descriptionTv);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        ZhuangBi zhuangBi = list.get(position);
        Glide.with(holder.itemView.getContext()).load(zhuangBi.getImage_url()).into(myViewHolder.imageView);
        myViewHolder.textView1.setText(zhuangBi.getDescription());

//        Bitmap bitmap = returnBitmap(zhuangBi.getImage_url());
//        memoryCacheUtils.setBitmapToMemory(zhuangBi.getImage_url(),bitmap);

    }

    private Bitmap returnBitmap(String url) {
        URL fileUrl = null;
        Bitmap bitmap = null;

        try {
            fileUrl = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            HttpURLConnection conn = (HttpURLConnection) fileUrl
                    .openConnection();
            conn.setDoInput(true);
            conn.connect();
            InputStream is = conn.getInputStream();
            bitmap = BitmapFactory.decodeStream(is);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bitmap;

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }

        ImageView imageView;
        TextView textView1;
    }
}
