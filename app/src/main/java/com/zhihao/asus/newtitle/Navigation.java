package com.zhihao.asus.newtitle;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.zhihao.asus.fragment.Fragment1;
import com.zhihao.asus.fragment.Fragment2;
import com.zhihao.asus.fragment.Fragment3;
import com.zhihao.asus.fragment.Fragment4;

import java.util.ArrayList;
import java.util.List;

public class Navigation extends AppCompatActivity {
    private FragmentManager manager;
    private RadioGroup radioGroup;
    private ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        //找控件
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        vp = (ViewPager) findViewById(R.id.vp);
       vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
           @Override
           public Fragment getItem(int position) {
               Fragment f1=FragmentFactory.getFragment(position);
               return f1;
           }

           @Override
           public int getCount() {
               return 4;
           }
       });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                for (int i = 0; i < radioGroup.getChildCount(); i++) {
                    RadioButton rb = (RadioButton) radioGroup.getChildAt(i);
                    if(rb.getId()==checkedId)
                    {
                        vp.setCurrentItem(i);
                        rb.setTextColor(Color.RED);
                    }else
                    {
                        rb.setTextColor(Color.BLACK);
                    }
                }
            }
        });




    }



}
