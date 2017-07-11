package com.example.drawlayout.netease.module.music.news;

import android.content.Context;
import android.graphics.Color;
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

    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClick(String url);
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, null);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final ViewHolder viewHolder = (ViewHolder) holder;
        News.T1348647909107Bean bean = mData.get(position);
        viewHolder.tvNameChinease.setText(bean.getLtitle());
        viewHolder.tvNameEnglish.setText(bean.getPtime());
        Glide.with(context).load(bean.getImgsrc()).into(viewHolder.ivAvatar);
        viewHolder.tv_name.setText(bean.getSource());

        final String url = bean.getUrl();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewHolder.tv_name.setTextColor(Color.GRAY);
                viewHolder.tvNameEnglish.setTextColor(Color.GRAY);
                viewHolder.tvNameChinease.setTextColor(Color.GRAY);
                onItemClickListener.onClick(url);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.iv_avatar)
        ImageView ivAvatar;
        @Bind(R.id.tv_name_chinease)
        TextView tvNameChinease;
        @Bind(R.id.tv_name_english)
        TextView tvNameEnglish;
        @Bind(R.id.tv_name)
        TextView tv_name;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
