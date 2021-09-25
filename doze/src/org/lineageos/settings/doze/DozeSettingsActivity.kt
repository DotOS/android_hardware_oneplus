/*
 * Copyright (C) 2021 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.settings.doze

import android.os.Bundle
import android.preference.PreferenceActivity
import org.lineageos.settings.doze.MonetPreferenceActivity

class DozeSettingsActivity : MonetPreferenceActivity() {
    override 
    fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        fragmentManager
            .beginTransaction()
            .replace(android.R.id.content, DozeSettingsFragment(), TAG)
            .commit()
    }

    companion object {
        private const val TAG = "DozeSettingsActivity"
    }
}