package com.example.mahmoud_ashraf.koraapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mahmoud_ashraf.koraapp.fragments.MatchesListFragment

/**
 * Created by mahmoud_ashraf on 19,04,2019
 */

class MatchesPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> MatchesListFragment.newInstance()
            1 -> MatchesListFragment.newInstance()
            else -> error("Cannot create more than two fragment")
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "NEXT"
            1 -> "LAST"
            else -> super.getPageTitle(position)
        }
    }

    override fun getCount(): Int = 2

}