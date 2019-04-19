package com.example.mahmoud_ashraf.koraapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.mahmoud_ashraf.koraapp.fragments.FavoritesFragment
import com.example.mahmoud_ashraf.koraapp.fragments.MatchesFragment
import com.example.mahmoud_ashraf.koraapp.fragments.TeamsFragment

/**
 * Created by mahmoud_ashraf on 19,04,2019
 */

class MainPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> MatchesFragment.newInstance()
            1 -> TeamsFragment.newInstance()
            2 -> FavoritesFragment.newInstance()
            else -> error("Cannot place more than 3 fragments")
        }
    }

    override fun getCount(): Int = 3
}