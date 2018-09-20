package com.zxsoft.example.Activity;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.zxsoft.example.R;
import com.zxsoft.example.ui.home.MainActivity;


public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.welcome_layout);
        ActionBar actionBar = getActionBar();
        if(actionBar != null){
            actionBar.hide();
        }
        Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);

        final TextView textView = (TextView) findViewById(R.id.welcome_page);
        CountDownTimer mCountDownTimer = new CountDownTimer(4*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                textView.setText(millisUntilFinished/1000+"秒");
            }

            @Override
            public void onFinish() {
                textView.setText("0秒");
                getHome();
            }
        }.start();

    }

    private Handler handler = new Handler(){

        @Override
        public void handleMessage(Message msg){
            getHome();
            super.handleMessage(msg);
        }
    };

    public void getHome(){
        Intent intent = new Intent(WelcomeActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}