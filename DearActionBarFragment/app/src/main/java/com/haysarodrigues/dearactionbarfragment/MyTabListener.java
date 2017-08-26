package com.haysarodrigues.dearactionbarfragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.view.View;

/**
 * Created by Haysa on 03/08/17.
 */

class MyTabListener implements ActionBar.TabListener {

//    private Context context;
//    private Fragment fragment;
//
//    public MyTabListener(Context context, Fragment fragment){
//        this.context = context;
//        this.fragment = fragment;
//    }

    private ViewPager viewPager;
    private int position;

    public MyTabListener(ViewPager view, int position){
        this.viewPager = view;
        this.position = position;
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        //ft.replace(R.id.layoutFrag, this.fragment, null); // substituir o fragment ao receber clique em alguma TAB
        viewPager.setCurrentItem(position);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
