package com.kocerlabs.paparauiclone.util

import android.app.Activity
import android.content.Context
import android.graphics.Rect
import android.util.TypedValue
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController


fun Fragment.goToOtherFragment(action: NavDirections) {
    findNavController().navigate(action)
}

fun Fragment.goToBack() {
    findNavController().popBackStack()  // Gerideki fragment'a dön
}


