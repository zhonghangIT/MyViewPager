package com.uniquedu.myviewpager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private android.widget.Button buttonpageradapter;
    private android.widget.Button buttonfragmentadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttonfragmentadapter = (Button) findViewById(R.id.button_fragmentadapter);
        this.buttonpageradapter = (Button) findViewById(R.id.button_pageradapter);
        buttonfragmentadapter.setOnClickListener(this);
        buttonpageradapter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_fragmentadapter:
                Intent intentFragment = new Intent(getApplicationContext(), MainPagerActivity.class);
                startActivity(intentFragment);
                break;
            case R.id.button_pageradapter:
                Intent intentPager = new Intent(getApplicationContext(), PagerAdapterActivity.class);
                startActivity(intentPager);
                break;
            default:
                break;
        }
    }
}
