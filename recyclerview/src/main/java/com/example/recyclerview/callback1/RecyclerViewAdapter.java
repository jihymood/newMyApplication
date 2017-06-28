package com.example.recyclerview.callback1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.R;

import java.util.List;

/**
 * Created by HASEE on 2017/6/8 10:25
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter {

    private List<Integer> images;
    private Context context;

    /**
     * 为RecyclerView添加OnItemClickListener回调
     * 虽然它没有提供，但是添加个OnItemClickListener对我们来说还不是小菜一碟~
     * 我决定在Adapter中添加这个回调接口：该接口方法不能是private，因为要在avtivity中具体实现
     */
    public interface onItemClickListener {
        void onItemClick();
    }

    private onItemClickListener mOnItemClickListener;

    public void setOnItemClickListener(onItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }


    public RecyclerViewAdapter(List<Integer> images, Context context) {
        this.images = images;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        myViewHolder.idIndexGalleryItemImage = (ImageView) view.findViewById(R.id.id_index_gallery_item_image);
        myViewHolder.idIndexGalleryItemText = (TextView) view.findViewById(R.id.id_index_gallery_item_text);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.idIndexGalleryItemImage.setImageResource(images.get(position));
        myViewHolder.idIndexGalleryItemText.setText("我是傻逼");

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnItemClickListener.onItemClick();
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }

        ImageView idIndexGalleryItemImage;
        TextView idIndexGalleryItemText;

    }

}
