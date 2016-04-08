package com.uniquedu.myviewpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.uniquedu.myviewpager.adapter.MyFragmentAdapter;
import com.uniquedu.myviewpager.fragment.FragmentFirst;
import com.uniquedu.myviewpager.fragment.FragmentSec;
import com.uniquedu.myviewpager.fragment.FragmentThird;

import java.util.ArrayList;
import java.util.List;

public class MainPagerActivity extends AppCompatActivity {

    private ViewPager viewpager;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_pager);
        this.viewpager = (ViewPager) findViewById(R.id.viewpager);
        fragments = new ArrayList<>();
        fragments.add(new FragmentFirst());
        fragments.add(new FragmentSec());
        fragments.add(new FragmentThird());
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager(), fragments);
        viewpager.setAdapter(adapter);
    }

}
