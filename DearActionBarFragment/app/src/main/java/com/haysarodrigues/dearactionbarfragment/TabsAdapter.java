package com.haysarodrigues.dearactionbarfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Haysa on 04/08/17.
 */

class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager supportFragmentManager){

        super(supportFragmentManager);
    }


    @Override
    public Fragment getItem(int position) {

        if (position == 0){
            return new Fragment1();
        }
        return new Fragment2();
    }

    @Override
    public int getCount() {

        return 2;
    }
}
