package com.zhihao.asus.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.gson.Gson;
import com.lidroid.xutils.HttpUtils;
import com.lidroid.xutils.exception.HttpException;
import com.lidroid.xutils.http.ResponseInfo;
import com.lidroid.xutils.http.callback.RequestCallBack;
import com.lidroid.xutils.http.client.HttpRequest;
import com.zhihao.asus.bean.TitleBean;
import com.zhihao.asus.newtitle.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2016/12/28.
 */

public class Fragment1 extends Fragment {
    private View view;
    private TabLayout tablayout;
    private ViewPager viewpager;
    private String[] title = new String[]{"推荐", "热点", "北京", "视频", "社会", "科技", "汽车", "体育", "财经", "娱乐"};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment1, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //找控件
        infind();
        // 设置标题
        initData();
    }

    private void initData() {
        tablayout.addTab(tablayout.newTab().setText(title[0]), true);
        for (int i = 1; i < title.length; i++) {
            tablayout.addTab(tablayout.newTab().setText(title[i]), false);
        }
        viewpager.setAdapter(new FragmentPagerAdapter(getActivity().getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return CuiFragment.getFragment(title[position]);
            }

            @Override
            public int getCount() {
                return title.length;
            }
        });
        /**
         * viewpaget
         * 滑动监听
         */
        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                tablayout.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        /**
         * tablayout点击滑动
         */
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                viewpager.setCurrentItem(position);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    private void infind() {
        tablayout = (TabLayout) view.findViewById(R.id.tablayout);
        viewpager = (ViewPager) view.findViewById(R.id.viewpager);

    }

}
