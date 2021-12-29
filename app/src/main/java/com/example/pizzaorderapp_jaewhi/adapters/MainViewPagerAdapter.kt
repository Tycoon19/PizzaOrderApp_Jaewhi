package com.example.pizzaorderapp_jaewhi.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.pizzaorderapp_jaewhi.fragments.ChickenStoreListFragment
import com.example.pizzaorderapp_jaewhi.fragments.PizzaStoreListFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {

        return 2

    }

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> PizzaStoreListFragment()
            1 -> ChickenStoreListFragment()
        }

    }
}