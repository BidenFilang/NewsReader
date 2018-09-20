package com.zxsoft.example.ui.home;

import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.zxsoft.example.SqliteDataBase.DataBaseHelper;
import com.zxsoft.example.contract.HomeContract;
import com.zxsoft.example.model.data.home.HomeLocalDataSource;
import com.zxsoft.example.model.data.home.HomeRemoteDataSource;
import com.zxsoft.example.model.data.home.HomeRepository;
import com.zxsoft.example.BaseActivity;
import com.zxsoft.example.HomeApplication;
import com.zxsoft.example.R;
import com.zxsoft.example.model.bean.News;
import com.zxsoft.example.presenter.HomePresenter;

import java.util.List;

public class MainActivity extends BaseActivity implements HomeContract.View {
    private MainAdapter adapter;
    public HomePresenter homePresenter;
    //private FragmentManager mFragmentManager;


    @Override
    protected int getLayoutId() {

        return R.layout.activity_main;
    }


    @Override
    protected void init() {
        //initData();
    }

    @Override
    protected void setListener() {
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {

    }

    @Override
    public void getNewsSuccess(List<News.DataBean> message,int id) {

    }

    @Override
    public void error(String msg) {
        dismissLoading();
        toast(msg);
    }

}
