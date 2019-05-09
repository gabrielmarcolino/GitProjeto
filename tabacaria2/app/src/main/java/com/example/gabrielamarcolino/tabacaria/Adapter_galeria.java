package com.example.gabrielamarcolino.tabacaria;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class Adapter_galeria extends RecyclerView.Adapter<Adapter_galeria.myViewHolder> {

    Context mContext;
    List<Item_galeria> mData;

    public Adapter_galeria(Context mContext, List<Item_galeria> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View v = inflater.inflate(R.layout.content_galeria,parent, false);
        return new myViewHolder(v);
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        holder.background_img.setImageResource(mData.get(position).getBackground());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class  myViewHolder extends RecyclerView.ViewHolder {

        ImageView background_img;




        public myViewHolder(View itemView) {
            super(itemView);
            background_img = itemView.findViewById(R.id.card_background);

        }
    }
}
