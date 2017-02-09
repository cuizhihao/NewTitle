package com.zhihao.asus.fragment;

import android.app.Application;
import android.graphics.Color;
import android.util.Log;

import com.zhihao.asus.newtitle.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ASUS on 2016/12/30.
 */

public class Apps extends Application {
    public static Map<String, Integer> list = new HashMap<>();

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public static void color(int tag) {
        switch (tag) {
            case 0:
                list.put("text", Color.BLACK);
                list.put("img_phone", R.drawable.cellphoneicon_login_profileabc);
                list.put("img_weixing", R.drawable.wixinicon_login_profiless);
                list.put("img_qq", R.drawable.qqicon_login_profile);
                list.put("img_night", R.drawable.nighticon_profile);
                list.put("lin",Color.WHITE);


                break;
            case 1:
                list.put("text", Color.WHITE);
                list.put("img_phone", R.drawable.cellphoneicon_login_profiles);
                list.put("img_weixing", R.drawable.wixinicon_login_profile);
                list.put("img_qq", R.drawable.qqicon_login_profileaa);
                list.put("img_night", R.drawable.dayicon_profile);
                list.put("lin",Color.parseColor("#80000000"));
                break;
        }
    }
}
