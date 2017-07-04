package com.example.drawlayout.netease.module.music;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.allen.library.SuperTextView;
import com.example.drawlayout.R;
import com.example.drawlayout.netease.model.SubNBA;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/7/4 10:37
 */

public class NBARecyclerAdapter extends RecyclerView.Adapter {

    private List<Object> mData;

    public NBARecyclerAdapter() {
        mData = new ArrayList<>();
    }

    public void setList(List<Object> list) {
        if (list != null) {
            mData.addAll(list);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_nba, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        SubNBA subNBA = (SubNBA) mData.get(position);
        ViewHolder viewHolder= (ViewHolder) holder;
//        viewHolder.superTv.setLeftTopString(subNBA.getFull_name());
//        viewHolder.superTv.setLeftBottomString(subNBA.getCn_division());
//        viewHolder.superTv.setLeftBottomString2(subNBA.getHome());


    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.super_tv)
        SuperTextView superTv;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
