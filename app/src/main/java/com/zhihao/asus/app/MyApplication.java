package com.zhihao.asus.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by ASUS on 2017/1/7.
 */

public class MyApplication extends Application {

    public static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
    }
}
