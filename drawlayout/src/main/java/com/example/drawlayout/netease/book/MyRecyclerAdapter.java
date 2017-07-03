package com.example.drawlayout.netease.book;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.drawlayout.R;
import com.example.drawlayout.netease.model.Meizi;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/7/3 15:57
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<Meizi.ResultsBean> mData;

    public MyRecyclerAdapter(Context context) {
        this.context = context;
        mData = new ArrayList<>();//这里要初始化，否则报NullPointerException
    }

    public void setData(List<Meizi.ResultsBean> list) {
//        this.mData = list;
        mData.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        Meizi.ResultsBean resultsBean = mData.get(position);
        Glide.with(context).load(resultsBean.getUrl()).into(viewHolder.imageView);
        viewHolder.text.setText(resultsBean.getDesc());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.imageView)
        ImageView imageView;
        @Bind(R.id.text)
        TextView text;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
