package com.example.daggerexample.ui.screen1

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.daggerexample.R
import kotlinx.android.synthetic.main.fragment1.*

class Fragment1 : Fragment(R.layout.fragment1) {
    private val navController by lazy(LazyThreadSafetyMode.NONE) { findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab_forward.setOnClickListener { navController.navigate(R.id.fragment2) }
    }
}