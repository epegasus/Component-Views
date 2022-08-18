package dev.pegasus.componentviewsettings

import android.graphics.drawable.Drawable

data class Setting(
    var title: String?,
    val subTitle: String?,
    val switchChecked: Boolean = false,
    val switchVisibility: Boolean = false,
    val iconDrawable: Drawable?,
    val divider: Boolean = false
)
