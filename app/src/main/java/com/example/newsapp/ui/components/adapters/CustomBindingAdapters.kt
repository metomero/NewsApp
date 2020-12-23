package com.example.newsapp.ui.components.adapters

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.example.newsapp.R
import com.example.newsapp.application.MainApplication

@BindingAdapter("loadImage")
fun setImage(imageView: ImageView, url: String?) {
    url?.let {
        Glide.with(MainApplication.appContext)
            .load(it)
            .placeholder(R.drawable.news)
            .error(R.drawable.news)
            .into(imageView)
    }
}
