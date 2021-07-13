package com.example.facebook_clone.viewPager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.facebook_clone.ui.MainActivity

class ViewPagerAdapter(
    mainActivity: MainActivity
) :
    FragmentStateAdapter(mainActivity) {

    private var fragmentList: ArrayList<Fragment> = ArrayList()

    override fun getItemCount() = fragmentList.size

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]

    }

    fun addFragment(fragment: Fragment) {
        fragmentList.add(fragment)
        notifyItemInserted (fragmentList.size - 1)
    }

}