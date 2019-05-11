package com.example.android.mobiledevelopment7_1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class PresidentAdapter extends RecyclerView.Adapter<PresidentAdapter.ViewHolder> {
    private Context mContext;
    private ArrayList<President> mPresidents;
    private LayoutInflater mInflater;

    public PresidentAdapter(Context context, List<President>presidents) {
        this.mPresidents = (ArrayList<President>)presidents;
        this.mContext = context;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = mInflater.inflate(R.layout.item_list_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Glide.with(mContext)
                .load(mPresidents.get(i).getPhotoURL())
                .placeholder(R.drawable.ic_launcher_background)
                .into(viewHolder.mImageView);
    }

    @Override
    public int getItemCount() {
        return mPresidents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.item_photo);
        }
    }
}
