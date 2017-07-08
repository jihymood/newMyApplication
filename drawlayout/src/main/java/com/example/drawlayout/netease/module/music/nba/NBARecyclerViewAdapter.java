package com.example.drawlayout.netease.module.music.nba;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drawlayout.R;
import com.example.drawlayout.netease.model.SubNBA;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/7/8 10:35
 */

public class NBARecyclerViewAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<Object> mData;

    public NBARecyclerViewAdapter(Context context) {
        this.context = context;
        mData = new ArrayList<>();  //list集合一定要初始化
    }

    /**
     * 数据是不变的，所以不需要动态加载更新，不像列表那样
     */
    public void setData(List<Object> list) {

        if (list != null) {
            mData.clear();
            mData.addAll(list);
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_nba, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SubNBA subNBA = (SubNBA) mData.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.text1.setText(subNBA.getLink2text());
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
