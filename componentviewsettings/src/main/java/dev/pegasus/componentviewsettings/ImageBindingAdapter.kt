package dev.pegasus.componentviewsettings

import android.graphics.drawable.Drawable
import androidx.databinding.BindingAdapter
import com.google.android.material.imageview.ShapeableImageView

@BindingAdapter("iconDrawable")
fun ShapeableImageView.setIconDrawable(iconDrawable: Drawable?) {
    this.setImageDrawable(iconDrawable)
}