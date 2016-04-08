package com.uniquedu.myviewpager.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by ZhongHang on 2016/4/8.
 */
public class MyPagerAdapter extends PagerAdapter {
   private List<View> mPagers;//所有页面的view
    public MyPagerAdapter(List<View> pages) {
        mPagers = pages;
    }
    @Override
    public int getCount() {
        return mPagers.size();//返回页面的数量
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;//以此view当做key进行判断
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        container.addView(mPagers.get(position));//添加页面到viewpager
        return mPagers.get(position);//将此view返回
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(mPagers.get(position));//删除view
    }
}
