package com.rifqimfahmi.foorballapps.custom

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

/**
 * Created by mahmoud_ashraf on 19,04,2019
 */
 
class NonSwipeAbleViewPager(context: Context, attrs: AttributeSet?) : ViewPager(context, attrs) {

    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(ev: MotionEvent?): Boolean = false

    override fun onInterceptTouchEvent(ev: MotionEvent?): Boolean = false
}