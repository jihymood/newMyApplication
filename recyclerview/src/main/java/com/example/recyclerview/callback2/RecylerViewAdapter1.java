package com.example.recyclerview.callback2;

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

public class RecylerViewAdapter1 extends RecyclerView.Adapter {

    private List<Integer> list;
    private ICallBack iCallBack;

    public RecylerViewAdapter1(List<Integer> list,ICallBack iCallBack) {
        this.list = list;
        this.iCallBack = iCallBack;
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

        myViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iCallBack.onClick();
            }
        });
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
