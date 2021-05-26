package com.example.homework10

import android.os.Bundle
import android.os.Parcelable
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.Navigation
import com.example.homework10.databinding.FragmentPicBinding


class PicFragment : Fragment() {

    private lateinit var binding: FragmentPicBinding
    private val images = arrayOf(R.drawable.android,R.drawable.tree,R.drawable.car)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        binding = FragmentPicBinding.inflate(inflater,container,false)
        back()
        val position = arguments?.getInt( "position")as Int

        binding.imageView.setImageResource(images[position])

        return binding.root
    }

    private fun back(){
        binding.button.setOnClickListener(){
            Navigation.findNavController(it).navigateUp()
        }
    }


}