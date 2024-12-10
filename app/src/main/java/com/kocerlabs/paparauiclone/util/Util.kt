package com.kocerlabs.paparauiclone.util

import androidx.fragment.app.Fragment
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController

fun Fragment.navigateToOtherFragment(action: NavDirections) {
    findNavController().navigate(action)
}