package com.example.siarh.swapactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.siarh.swapactivity.R;

/**
 * Created by Siarh on 07.03.2018.
 */

public class LastActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.last_layout);
    }

    public void onBack (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
