package com.example.counts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.database.DatabaseUtilsCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.counts.databinding.FragmentAboutBinding

class AboutFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentAboutBinding>(inflater, R.layout.fragment_about, container, false)

        return binding.root

    }

}