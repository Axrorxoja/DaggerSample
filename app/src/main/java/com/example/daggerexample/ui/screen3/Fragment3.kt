package com.example.daggerexample.ui.screen3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.daggerexample.R
import kotlinx.android.synthetic.main.fragment3.*

class Fragment3 : Fragment(R.layout.fragment3) {
    private val navController by lazy(LazyThreadSafetyMode.NONE) { findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab_back.setOnClickListener { navController.popBackStack() }
    }
}