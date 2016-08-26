package com.lxy.pager.state;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by user on 2016/8/25.
 */
public class FragmentAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> mFragmentList;
    private ArrayList<String> mTitleList;

    public FragmentAdapter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String> titles) {
        super(fm);
        mFragmentList = fragments;
        mTitleList = titles;

    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitleList.get(position);
    }
}
