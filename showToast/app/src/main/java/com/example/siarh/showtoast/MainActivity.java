package com.example.siarh.showtoast;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Siarh on 10.03.2018.
 */

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    public void onShow(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "hello", Toast.LENGTH_SHORT);
        toast.show();
    }
}
