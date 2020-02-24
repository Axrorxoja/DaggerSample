package com.example.daggerexample.ui.screen3

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.daggerexample.R
import com.example.daggerexample.domain.Fragment3Object
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment3.*
import javax.inject.Inject

class Fragment3 : Fragment(R.layout.fragment3) {
    private val navController by lazy(LazyThreadSafetyMode.NONE) { findNavController() }
    @Inject
    lateinit var fragment3: Fragment3Object

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv.text = fragment3.printMessage()
        fab_back.setOnClickListener { navController.popBackStack() }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }
}