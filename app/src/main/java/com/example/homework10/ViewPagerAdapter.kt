package com.example.homework10

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.os.Parcelable

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResultListener
import androidx.fragment.app.testing.launchFragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPagerAdapter(private val context: Context, images:Array<Int>) :PagerAdapter() {

    private var layoutInflater : LayoutInflater? = null
    private val images = images




    override fun isViewFromObject(view: View, `object`: Any): Boolean {

        return view == `object`
    }

    override fun getCount()= images.size

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        layoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val v = layoutInflater!!.inflate(R.layout.costum_layout, null)
        val image = v.findViewById<View>(R.id.imageView)as ImageView
        image.setImageResource(images[position])
        v.setOnClickListener(){
            val pos = position
            val bundle = bundleOf("position" to pos)
           v.findNavController().navigate(R.id.action_mainFragment_to_picFragment, bundle)

        }

        val vp = container as ViewPager
        vp.addView(v,0)
        return v
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        val vp = container as ViewPager
        val v = `object` as View
        vp.removeView(v)
    }
}