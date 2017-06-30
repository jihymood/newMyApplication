package com.example.viewpager_mvp.fragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.viewpager_mvp.R;
import com.example.viewpager_mvp.model.PictureModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by HASEE on 2017/6/30 09:49
 */

public class MyRecycleAdapter extends RecyclerView.Adapter {

    private Context context;
    private List<PictureModel> mData;
    private LayoutInflater inflater;
    private View view;

    public MyRecycleAdapter(Context context) {
        this.context = context;
        mData = new ArrayList<>(); //先初始化
        inflater = LayoutInflater.from(context);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        view = inflater.inflate(R.layout.item_category, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        PictureModel pictureModel = mData.get(position);
        List<String> images = pictureModel.images;

        if (images != null && images.size() > 0) {
            Glide.with(context)
                    .load(images.get(0))
                    .placeholder(R.mipmap.image_default)
                    .error(R.mipmap.image_default)
                    .into(viewHolder.categoryItemImg);
        }else{
            Glide.with(context)
                    .load(R.mipmap.image_default)
                    .into(viewHolder.categoryItemImg);
        }

        viewHolder.categoryItemAuthor.setText(pictureModel.who);
        viewHolder.categoryItemTime.setText(pictureModel.createdAt);
        viewHolder.categoryItemDesc.setText(pictureModel.desc);
        viewHolder.categoryItemSrc.setText(pictureModel.source);



    }

    public void addData(List<PictureModel> list) {
        if (list != null) {
            mData.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder{
        @Bind(R.id.category_item_img)
        ImageView categoryItemImg;
        @Bind(R.id.category_item_desc)
        TextView categoryItemDesc;
        @Bind(R.id.category_item_author)
        TextView categoryItemAuthor;
        @Bind(R.id.category_item_src)
        TextView categoryItemSrc;
        @Bind(R.id.category_item_time)
        TextView categoryItemTime;

        ViewHolder(View view) {
            super(view);
            ButterKnife.bind(this, view);
        }
    }
}
