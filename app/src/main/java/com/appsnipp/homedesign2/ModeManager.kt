package com.appsnipp.homedesign2

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor

class ModeManager(_context: Context) {

    var pref: SharedPreferences
    var editor: Editor

    fun setDarkMode(isFirstTime: Boolean) {
        editor.putBoolean(IS_NIGHT_MODE, isFirstTime)
        editor.commit()
    }

    val isNightMode: Boolean
        get() = pref.getBoolean(IS_NIGHT_MODE, true)

    companion object {
        private const val PREF_NAME = "education-dark-mode"
        private const val IS_NIGHT_MODE = "IsNightMode"
    }

    init {
        pref = _context.getSharedPreferences(PREF_NAME, 0)
        editor = pref.edit()
    }

}