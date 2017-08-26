package com.haysarodrigues.dearactionbarfragment;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

        @Override
        protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);

            // o cara que gerencia o SWIPE

            viewPager = (ViewPager) findViewById(R.id.viewPager);
            viewPager.setAdapter(new TabsAdapter(getSupportFragmentManager()));

            final ActionBar actionBar = getSupportActionBar();

            actionBar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);

            /* TAB 1*/
            actionBar.addTab(actionBar.newTab().setText("Fragment 1").
                    setTabListener(new MyTabListener(viewPager, 0)));

            // Tab 2
            actionBar.addTab(actionBar.newTab().setText("Fragment 2").
                    setTabListener(new MyTabListener(viewPager, 1)));


            viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    actionBar.setSelectedNavigationItem(position);
                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });
        }


}
