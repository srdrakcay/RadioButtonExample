package com.serdar.deneme.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.deneme.R
import com.serdar.deneme.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var deneme  : FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        deneme = FragmentMainBinding.inflate(inflater,container,false)
        deneme.button.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.action_mainFragment_to_homeFragment)
        }
        return deneme.root
    }







    }