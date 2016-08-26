package com.lxy.pager.state;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private FragmentAdapter mAdapter;
    private String[] mTabs = {"民谣", "摇滚", "电子", "流行", "爵士", "独立", "故事", "新世纪", "精品推荐", "原声", "乐评", "影评", "古典", "游记"};
    private ArrayList<String> mTabList;
    private ArrayList<Fragment> mFragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvents();
    }

    private void initView() {
        mFragmentList = new ArrayList<>();

        mTabList = new ArrayList<>();
        for (int i = 0; i < mTabs.length; i++) {
            mTabList.add(mTabs[i]);
            mFragmentList.add(BaseFragment.getInstance(mTabs[i]));
        }
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mAdapter = new FragmentAdapter(getSupportFragmentManager(), mFragmentList, mTabList);
        mTabLayout = (TabLayout) findViewById(R.id.tab_layout);
        mViewPager.setAdapter(mAdapter);
        //
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTabLayout));
        mTabLayout.setupWithViewPager(mViewPager);

    }

    private void initEvents() {

    }
}
