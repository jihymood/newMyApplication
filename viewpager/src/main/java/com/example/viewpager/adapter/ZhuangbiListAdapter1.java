package com.example.viewpager.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.viewpager.R;
import com.example.viewpager.bean.ZhuangBi;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/6/21 18:51
 */

public class ZhuangbiListAdapter1 extends RecyclerView.Adapter {

    private List<ZhuangBi> list;
    private Context context;

    public ZhuangbiListAdapter1(List<ZhuangBi> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ZhuangBi zhuangBi = list.get(position);
        ViewHolder viewHolder= (ViewHolder) holder;
        viewHolder.descriptionTv.setText(zhuangBi.getDescription());
        Glide.with(context).load(zhuangBi.getImage_url()).into(viewHolder.imageIv);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.imageIv)
        ImageView imageIv;
        @Bind(R.id.descriptionTv)
        TextView descriptionTv;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
