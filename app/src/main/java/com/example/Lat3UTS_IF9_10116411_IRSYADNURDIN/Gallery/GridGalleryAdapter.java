/**
 * TANGGAL PENGERJAAN   : 03 MEI 2019
 * NIM                  : 10116411
 * NAMA                 : IRSYAD NURDIN
 * KELAS                : IF9 / AKB9
 */

package com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.Gallery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.GetterSetter;
import com.example.Lat3UTS_IF9_10116411_IRSYADNURDIN.R;

import java.util.ArrayList;

public class GridGalleryAdapter extends RecyclerView.Adapter<GridGalleryAdapter.GridViewHolder> {
    private Context context;
    private ArrayList<GetterSetter> listGetterSetter;

    public GridGalleryAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<GetterSetter> getListGetterSetter() {
        return listGetterSetter;
    }

    public void setListGetterSetter(ArrayList<GetterSetter> listGetterSetter) {
        this.listGetterSetter = listGetterSetter;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_daily_activity, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        Glide.with(context)
                .load(getListGetterSetter().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListGetterSetter().size();
    }

    class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        GridViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
