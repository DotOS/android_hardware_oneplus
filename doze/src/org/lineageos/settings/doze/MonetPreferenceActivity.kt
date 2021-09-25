package org.lineageos.settings.doze

import android.content.res.ColorStateList
import android.os.Bundle
import android.preference.PreferenceActivity

open class MonetPreferenceActivity : PreferenceActivity() {
    override 
    protected fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        var monetBackground: Int = getColor(android.R.color.monet_background_device_default)
        getWindow().getDecorView().setBackgroundColor(monetBackground)
        getWindow().getDecorView().setBackgroundTintList(ColorStateList.valueOf(monetBackground))
    }
}