package com.rishi.nomnom.ui;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.rishi.nomnom.R;
import com.rishi.nomnom.databinding.RecyclerPhotoBinding;
import com.rishi.nomnom.model.Photo;
import com.squareup.picasso.Picasso;

/**
 * Created by rishi on 10/7/17.
 *
 * Holder for loading images for photos URL
 */

public class PhotoHolder extends RecyclerView.ViewHolder {
    private static final String TAG = PhotoHolder.class.getSimpleName();
    private Context mContext;
    private RecyclerPhotoBinding mDataBinding;

    public PhotoHolder(Context context, View itemView) {
        super(itemView);
        mContext = context;
        mDataBinding = DataBindingUtil.bind(itemView);
    }

    public void bindItem(Photo photo) {
        mDataBinding.setPhoto(photo);
    }

    @BindingAdapter({"rest_photos"})
    public static void loadProfileImage(ImageView view, String url) {
        Picasso.with(view.getContext())
                .load(url)
                .error(R.drawable.place_holder)
                .placeholder(R.drawable.place_holder)
                .into(view);
    }
}
