package com.zxsoft.example.model.data.home;

import com.zxsoft.example.HomeApplication;
import com.zxsoft.example.api.ApiRequest;
import com.zxsoft.example.contract.HomeContract;


public class HomeRemoteDataSource implements HomeContract.HomeDataSourc{

    private static HomeRemoteDataSource INSTANCE;


    public static HomeRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HomeRemoteDataSource();
        }
        return INSTANCE;
    }

    private HomeRemoteDataSource() {
    }

    @Override
    public void getNews(final HomeCallback callback,int id) {
        ApiRequest.getInstance(HomeApplication.getContext()).getNews(callback,id);
    }
}
