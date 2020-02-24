package com.example.daggerexample.ui.screen2

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.daggerexample.R
import com.example.daggerexample.domain.Fragment2Object
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.fragment2.*
import javax.inject.Inject

class Fragment2 : Fragment(R.layout.fragment2) {
    private val navController by lazy(LazyThreadSafetyMode.NONE) { findNavController() }
    @Inject
    lateinit var fragment2: Fragment2Object

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tv.text = fragment2.printMessage()
        fab_back.setOnClickListener { navController.popBackStack() }
        fab_forward.setOnClickListener { navController.navigate(R.id.fragment3) }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        AndroidSupportInjection.inject(this)
    }
}