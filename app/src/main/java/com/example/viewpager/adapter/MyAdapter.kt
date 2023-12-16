package com.example.viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.MainActivity
import com.example.viewpager.fragments.*

class MyAdapter (mainActivity: MainActivity): FragmentStateAdapter(mainActivity) {

    private val fragmentAmount = 3

    override fun getItemCount(): Int {
        return this.fragmentAmount
    }

    override fun createFragment(position: Int): Fragment {
        when (position){
            0 -> {
                return Fragment1()
            }
            1 -> {
                return Fragment2()
            }
            2 -> {
                return Fragment3()
            }
        }
        return Fragment1()
    }

}