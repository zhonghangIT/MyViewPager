package com.uniquedu.myviewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

import com.uniquedu.myviewpager.adapter.MyPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapterActivity extends AppCompatActivity {
    private ViewPager mViewpager;
    private List<View> mPagers;
    private LayoutInflater mInflater;
    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_adapter);
        mViewpager = (ViewPager) findViewById(R.id.viewpager);
        mInflater = getLayoutInflater();
        mPagers = new ArrayList<>();
        mPagers.add(mInflater.inflate(R.layout.pager1, null));
        mPagers.add(mInflater.inflate(R.layout.pager2, null));
        mPagers.add(mInflater.inflate(R.layout.pager3, null));
        mPagers.add(mInflater.inflate(R.layout.pager4, null));
        myPagerAdapter = new MyPagerAdapter(mPagers);
        mViewpager.setAdapter(myPagerAdapter);
        mViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(getApplicationContext(), "翻到第" + position + "页", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
