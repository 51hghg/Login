package com.jy.login.ui.adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MyPagerAdapter extends PagerAdapter {
    private Context context;
    private List<View> list;

    public MyPagerAdapter(Context context,List<View> list) {
        this.context=context;
        this.list = list;
    }

    //一共可以滑动多少个页面

    @Override

    public int getCount() {
        return list.size();
    }

    //查看索引与对象是否是同一个对象

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {

        return view == o;
    }

    @NonNull

    @Override

    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        View view = list.get(position);

        container.addView(view);


        return view;//  返回你要显示的view

    }

    // 滑动看不见的

    // position  要移除的  view 的下标
    @Override

    public void destroyItem(ViewGroup container, int position, Object object) {

        View view = list.get(position); // 要移除的view

        container.removeView(view);
    }
}