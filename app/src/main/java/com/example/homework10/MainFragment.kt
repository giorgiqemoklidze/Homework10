package com.example.homework10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.viewpager.widget.ViewPager
import com.example.homework10.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    internal lateinit var viewPager : ViewPager
    private val images = arrayOf(R.drawable.android,R.drawable.tree,R.drawable.car)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater,container,false)
        viewPager = binding.viewPager
        val adapter =context?.let { ViewPagerAdapter(it,images) }
        viewPager.adapter = adapter


        return binding.root
    }

}