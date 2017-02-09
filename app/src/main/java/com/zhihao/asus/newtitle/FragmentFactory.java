package com.zhihao.asus.newtitle;

import android.support.v4.app.Fragment;

import com.zhihao.asus.fragment.Fragment1;
import com.zhihao.asus.fragment.Fragment2;
import com.zhihao.asus.fragment.Fragment3;
import com.zhihao.asus.fragment.Fragment4;

import java.util.HashMap;


/**
 * Created by asus on 2016/11/28.
 */
public class FragmentFactory {

    public static HashMap<Integer, Fragment> fragmentHashMap = new HashMap<>();

    public static Fragment getFragment(int position) {

        Fragment fragment = fragmentHashMap.get(position);
        switch (position) {
            case 0:
                fragment = new Fragment1();
                break;
            case 1:
                fragment = new Fragment2();
                break;
            case 2:
                fragment = new Fragment3();
                break;
            case 3:
                fragment = new Fragment4();
                break;
        }
        fragmentHashMap.put(position, fragment);
        return fragment;
    }
}
