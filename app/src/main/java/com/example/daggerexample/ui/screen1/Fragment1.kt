package com.example.daggerexample.ui.screen1

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.daggerexample.R
import com.example.daggerexample.domain.Fragment1Object
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment1.*
import javax.inject.Inject

class Fragment1 : Fragment(R.layout.fragment1) {
    private val navController by lazy(LazyThreadSafetyMode.NONE) { findNavController() }
    @Inject
    lateinit var fragment1: Fragment1Object

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv.text = fragment1.printMessage()
        fab_forward.setOnClickListener { navController.navigate(R.id.fragment2) }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }
}