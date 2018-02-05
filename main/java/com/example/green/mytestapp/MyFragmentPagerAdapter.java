package com.example.green.mytestapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Green on 2018/2/1.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter{

    List<Fragment> fragmentList = new ArrayList<Fragment>();

    public MyFragmentPagerAdapter(FragmentManager supportFragmentManager, List<Fragment> mFragmentList) {
        super(supportFragmentManager);
        this.fragmentList = mFragmentList;
    }


    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
