package com.example.siarh.messege.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import com.example.siarh.messege.util.RequestCode;

import com.example.siarh.messege.R;

/**
 * Created by Siarh on 17.03.2018.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void onShow(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnToIntroduction:
                intent = new Intent(this,PresentedActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_INTRODUCTION);
                break;
            case R.id.btnToLanguageSelection:
                intent = new Intent(this,LanguageActivity.class);
                startActivityForResult(intent, RequestCode.REQUEST_CODE_lANGUAGE);
                break;
        }
    }
}
