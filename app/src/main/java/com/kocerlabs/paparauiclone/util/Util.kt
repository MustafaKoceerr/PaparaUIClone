package com.kocerlabs.paparauiclone.util

import android.app.Activity
import android.content.Context
import android.graphics.Rect
import android.util.TypedValue
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar


fun Fragment.goToOtherFragment(action: NavDirections) {
    findNavController().navigate(action)
}

fun Fragment.goToBack() {
    findNavController().popBackStack()  // Gerideki fragment'a dön
}

fun View.snackbar(message: String, action: (() -> Unit)? = null) {
    // snackbar'ın action button'u vardır.
    val snackbar = Snackbar.make(this, message, Snackbar.LENGTH_SHORT)
    action?.let { retry ->
        snackbar.setAction("Retry") {
            retry()
        }
    }
    snackbar.show()
}