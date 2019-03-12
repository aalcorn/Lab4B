package com.example.lab4b;

import android.support.v4.app.*;
public class TabPagerAdapter extends FragmentPagerAdapter {
    int tabCount;
    public TabPagerAdapter(FragmentManager fm, int numTabs) {
        super(fm);
        this.tabCount = numTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new TipCalculator();
            case 1: return new FtoCconverter();
            case 2: return new MtoKmConverter();
            default: return null;
        }
    }
    @Override
    public int getCount() {
        return tabCount;
    }
}