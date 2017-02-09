package com.zhihao.asus.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

import com.zhihao.asus.newtitle.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 2016/12/28.
 */

public class Fragment4 extends Fragment {
    List<String> list=new ArrayList<>();
    private View view;
    private ImageView img_phone;
    private ImageView img_weixing;
    private ImageView img_qq;
    private ImageView img_chang;
    private CheckBox img_night;
    private ImageView img_se;
    private LinearLayout lin;
    private TextView text_chang;
    private TextView text_night;
    private TextView text_se;
    private TextView xiaoxi;
    private TextView huodong;
    private TextView toutiao;
    private TextView yonghu;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment4, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        //资源
        getdata();


        super.onActivityCreated(savedInstanceState);
    }

    private void getdata() {

        lin = (LinearLayout) view.findViewById(R.id.lin);
        img_phone = (ImageView) view.findViewById(R.id.img_phone);
        img_weixing = (ImageView) view.findViewById(R.id.img_weixing);
        img_qq = (ImageView) view.findViewById(R.id.img_qq);
        img_chang = (ImageView) view.findViewById(R.id.img_chang);
        img_night = (CheckBox) view.findViewById(R.id.img_night);
        img_se = (ImageView) view.findViewById(R.id.img_se);
        text_chang = (TextView) view.findViewById(R.id.text_chang);
        text_night = (TextView) view.findViewById(R.id.text_night);
        text_se = (TextView) view.findViewById(R.id.text_se);
        xiaoxi = (TextView) view.findViewById(R.id.xiaoxi);
        huodong = (TextView) view.findViewById(R.id.huodong);
        toutiao = (TextView) view.findViewById(R.id.toutiao);
        yonghu = (TextView) view.findViewById(R.id.yonghu);

        Apps.color(0);

   img_night.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
       @Override
       public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if (isChecked){
                   Apps.color(1);
                  text_night.setText("日间");
              }else{
                  Apps.color(0);
                  text_night.setText("夜间");
              }
           switchcolor();
       }


   });

    }

    private void switchcolor() {
        lin.setBackgroundColor(Apps.list.get("lin"));
        img_phone.setBackgroundResource(Apps.list.get("img_phone"));
        img_weixing.setBackgroundResource(Apps.list.get("img_weixing"));
        img_qq.setBackgroundResource(Apps.list.get("img_qq"));
        img_night.setBackgroundResource(Apps.list.get("img_night"));
        text_chang.setTextColor(Apps.list.get("text"));
        text_night.setTextColor(Apps.list.get("text"));
        text_se.setTextColor(Apps.list.get("text"));
        xiaoxi.setTextColor(Apps.list.get("text"));
        huodong.setTextColor(Apps.list.get("text"));
        toutiao.setTextColor(Apps.list.get("text"));
        yonghu.setTextColor(Apps.list.get("text"));



    }

}
