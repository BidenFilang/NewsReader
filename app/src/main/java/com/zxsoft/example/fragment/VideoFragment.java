package com.zxsoft.example.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zxsoft.example.R;

public class VideoFragment extends Fragment {
    private View view;
    private TabLayout tab_video;
    private ViewPager vp_video;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_video, container, false);
        return view;
    }
}
