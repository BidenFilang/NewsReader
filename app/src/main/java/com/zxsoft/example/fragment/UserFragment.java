package com.zxsoft.example.fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zxsoft.example.Activity.LoginActivity;
import com.zxsoft.example.R;

public class UserFragment extends Fragment implements View.OnClickListener {

    private TextView mLoginTV;
    private ImageView mLoginIV;
    private ImageView mCollectIV;
    private ImageView mAttentionIV;
    private ImageView mCacheIV;
    private ImageView mSignIV;
    private TextView mMessage;
    private TextView mMoney;
    private TextView mStore;
    private TextView mSetting;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_user, null);

        mLoginTV = (TextView) view.findViewById(R.id.my_head_btn);
        mLoginTV.setOnClickListener(this);
        mLoginIV = (ImageView) view.findViewById(R.id.my_head);
        mLoginIV.setOnClickListener(this);
        mCollectIV = (ImageView) view.findViewById(R.id.user_collect);
        mAttentionIV = (ImageView) view.findViewById(R.id.user_attention);
        mCacheIV = (ImageView) view.findViewById(R.id.user_cache);
        mSignIV = (ImageView) view.findViewById(R.id.user_sign);
        mMessage = (TextView) view.findViewById(R.id.my_msg);
        mMoney = (TextView) view.findViewById(R.id.my_money);
        mStore = (TextView) view.findViewById(R.id.my_store);
        mSetting = (TextView) view.findViewById(R.id.my_setting);

        return view;
    }

//    @Override
//    public void onClick(View view){
//        switch(view.id){
//          case R.id.my_head:
//          case R.id.my_head_btn:{
//              Intent intent = new Intent();
//              intent.setClass(getContext(),LoginActivity.class);
//              startActivity(intent);
//                          }
//                      }
//              }

    @Override
    public void onClick(View view){
        Intent intent = new Intent();
        intent.setClass(getContext(),LoginActivity.class);
        startActivity(intent);
    }
}

