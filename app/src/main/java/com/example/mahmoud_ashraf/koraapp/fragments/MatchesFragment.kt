package com.example.mahmoud_ashraf.koraapp.fragments


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

import com.example.mahmoud_ashraf.koraapp.R
import com.example.mahmoud_ashraf.koraapp.adapters.MatchesPagerAdapter
import kotlinx.android.synthetic.main.fragment_matches.*

class MatchesFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_matches, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setHasOptionsMenu(true)
        setupViewPagerAndTab()

    }

    private fun setupViewPagerAndTab() {
        vpMatches.adapter = MatchesPagerAdapter(childFragmentManager)
        tabMatches.setupWithViewPager(vpMatches)
    }


    override fun onCreateOptionsMenu(menu: Menu?, inflater: MenuInflater?) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.main, menu)
    }


    companion object {
        fun newInstance() =
            MatchesFragment()

    }
}
