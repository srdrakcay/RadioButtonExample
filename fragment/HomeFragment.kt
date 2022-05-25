package com.serdar.deneme.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.serdar.deneme.R
import com.serdar.deneme.databinding.FragmentHomeBinding
import com.serdar.deneme.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private lateinit var deneme  : FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        deneme = FragmentHomeBinding.inflate(inflater,container,false)
        
        return deneme.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        radioButton.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                button2.setOnClickListener {
                    Navigation.findNavController(it)
                        .navigate(R.id.action_homeFragment_to_trueFragment)

                }
            } else {
                button2.setOnClickListener {
                    Navigation.findNavController(it)
                        .navigate(R.id.action_homeFragment_to_falseFragment)

                }
            }

            super.onViewCreated(view, savedInstanceState)
        }


    }
}