package com.zhihao.asus.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zhihao.asus.newtitle.R;

import java.nio.BufferUnderflowException;

/**
 * Created by ASUS on 2017/1/7.
 */

public class CuiFragment extends Fragment {

    private TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cui_fragment, null);
        textView = (TextView) view.findViewById(R.id.tv_name);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        String name = getArguments().getString("name");
        textView.setText(name);

    }

    public static Fragment getFragment(String name) {
        CuiFragment fragment = new CuiFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", name);
        fragment.setArguments(bundle);
        return fragment;
    }
}
