package com.example.drawlayout.netease.module.music.nbalive;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.allen.library.SuperTextView;
import com.bumptech.glide.Glide;
import com.example.drawlayout.R;
import com.example.drawlayout.netease.model.NBALive;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/7/4 10:37
 */

public class NBALiveRecyclerAdapter extends RecyclerView.Adapter {

    private List<NBALive.ResultBean.ListBean.TrBean> mData;
    private Context context;
    private OnItemClickListener onItemClickListener;

    public interface OnItemClickListener {
        void onClick();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public NBALiveRecyclerAdapter(Context context) {
        mData = new ArrayList<>();
        this.context = context;
    }

    public void setList(List<NBALive.ResultBean.ListBean.TrBean> list) {
        if (list != null) {
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
        NBALive.ResultBean.ListBean.TrBean subNBA = mData.get(position);
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.superTv.setLeftTopString(subNBA.getScore());
        viewHolder.superTv.setLeftBottomString(subNBA.getLink2text());
        viewHolder.superTv.setLeftBottomString2(subNBA.getLink1text());

        Glide.with(context).load(subNBA.getPlayer1logo()).into(viewHolder.imageView);

        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.onClick();
            }
        });

        /**
         * 使用了自定义控件，设置linearLayout的监听事件并不起作用。
         * 如果使用了ImageView+TextView等组合控件确有用，暂时不知道为什么
         */
//        viewHolder.superTv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onItemClickListener.onClick();
//            }
//        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.super_tv)
        SuperTextView superTv;
        @Bind(R.id.imageView)
        ImageView imageView;
        @Bind(R.id.linearLayout)
        RelativeLayout linearLayout;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }

}