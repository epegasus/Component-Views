package dev.pegasus.componentviewsettings

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import androidx.core.content.withStyledAttributes
import dev.pegasus.componentviewsettings.databinding.SettingViewBinding

class SettingView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = -1,
    defStyleRes: Int = -1
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {

    init {
        val binding = SettingViewBinding.inflate(LayoutInflater.from(context), this, true)

        context.withStyledAttributes(attrs, R.styleable.SettingView) {
            val setting = Setting(
                getText(R.styleable.SettingView_settingTitle) as String?,
                getText(R.styleable.SettingView_settingSubTitle) as String?,
                getBoolean(R.styleable.SettingView_settingSwitchChecked, false),
                getBoolean(R.styleable.SettingView_settingSwitchVisibility, false),
                getDrawable(R.styleable.SettingView_settingIconDrawable),
                getBoolean(R.styleable.SettingView_settingDivider, false)
            )
            binding.setting = setting
        }
    }

}