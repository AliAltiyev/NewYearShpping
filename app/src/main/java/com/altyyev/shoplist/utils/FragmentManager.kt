package com.altyyev.shoplist.utils

import androidx.appcompat.app.AppCompatActivity
import com.altyyev.shoplist.R
import com.altyyev.shoplist.base.BaseFragment

object FragmentManager {

    var currentFragment: BaseFragment? = null

    fun setFragment(fragment: BaseFragment, activity: AppCompatActivity) {
        val transaction = activity.supportFragmentManager.beginTransaction()
        transaction.replace(R.id.placeholder, fragment)
        transaction.commitNow()
        currentFragment = fragment
    }

}