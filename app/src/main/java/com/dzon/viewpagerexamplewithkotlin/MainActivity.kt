package com.dzon.viewpagerexamplewithkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.dzon.viewpagerexamplewithkotlin.fragments.GamesFragment
import com.dzon.viewpagerexamplewithkotlin.fragments.MovieFragment

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.appbar_main.*


class MainActivity : AppCompatActivity() {

    //Now setting up pageradapter

    var pagerAdapter:CostompagerAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)

        pagerAdapter = CostompagerAdapter(supportFragmentManager)
        pagerAdapter!!.addFragments(GamesFragment(),"Games")
        pagerAdapter!!.addFragments(MovieFragment(),"Movies")

       //adding pageradapter to viewpager
        costomViewPager.adapter = pagerAdapter
        //Now setting up viewpager with tablayout
        costomTabLayout.setupWithViewPager(costomViewPager)

    }
}
