package com.example.drawlayout.netease.module.music.news;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.drawlayout.R;
import com.example.drawlayout.netease.model.News;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/7/9 09:54
 */

public class NewsRecyclerAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<News.T1348647909107Bean> mData;

    public NewsRecyclerAdapter(Context context) {
        this.context = context;
        mData = new ArrayList<>();
    }

    public void setmData(List<News.T1348647909107Bean> list) {
        if (list != null) { //判断错误，list为空才添加数据，本来是list != null
            mData.clear();
            mData.addAll(list);
            notifyDataSetChanged();
        }

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nba, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        News.T1348647909107Bean bean = mData.get(position);
        viewHolder.text1.setText(bean.getLtitle());
        viewHolder.text2.setText(bean.getPtime());
        Glide.with(context).load(bean.getImgsrc()).into(viewHolder.imageView);
        viewHolder.text3.setText(bean.getSource());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.imageView)
        ImageView imageView;
        @Bind(R.id.text1)
        TextView text1;
        @Bind(R.id.text2)
        TextView text2;
        @Bind(R.id.text3)
        TextView text3;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
