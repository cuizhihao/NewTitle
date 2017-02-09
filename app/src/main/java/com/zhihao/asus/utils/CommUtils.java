package com.zhihao.asus.utils;

import android.content.SharedPreferences;

import com.zhihao.asus.app.MyApplication;

/*
 * Created by ASUS on 2017/1/7.
 */

public class CommUtils {

    private static SharedPreferences sharedPreferences;

    public static void setSave(String key, String value) {
        if (sharedPreferences == null) {
            sharedPreferences = MyApplication.applicationContext.getSharedPreferences("NewsTop", MyApplication.applicationContext.MODE_PRIVATE);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(key, value);
            edit.commit();
        }
    }

    public static String getSave(String key) {
        if (sharedPreferences == null) {
            sharedPreferences = MyApplication.applicationContext.getSharedPreferences("NewsTop", MyApplication.applicationContext.MODE_PRIVATE);
        }
        String string = sharedPreferences.getString(key, "");
        return string;
    }
}
