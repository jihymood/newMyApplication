package com.example.recyclerview.three;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.R;

import java.util.List;

/**
 * Created by HASEE on 2017/6/13 18:30
 */

public class RecylerViewAdapter2 extends RecyclerView.Adapter {

    private List<Integer> list;

    public RecylerViewAdapter2(List<Integer> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        myViewHolder.textView = (TextView) view.findViewById(R.id.id_index_gallery_item_text);
        myViewHolder.imageView = (ImageView) view.findViewById(R.id.id_index_gallery_item_image);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        MyViewHolder myViewHolder = (MyViewHolder) holder;
        myViewHolder.textView.setText("小呆比");
        myViewHolder.imageView.setBackgroundResource(R.mipmap.ic_launcher);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }

        TextView textView;
        ImageView imageView;
    }
}
