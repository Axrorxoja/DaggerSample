package com.example.daggerexample.ui.screen2

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.daggerexample.R
import kotlinx.android.synthetic.main.fragment2.*

class Fragment2 : Fragment(R.layout.fragment2) {
    private val navController by lazy(LazyThreadSafetyMode.NONE) { findNavController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fab_back.setOnClickListener { navController.popBackStack() }
        fab_forward.setOnClickListener { navController.navigate(R.id.fragment3) }
    }
}