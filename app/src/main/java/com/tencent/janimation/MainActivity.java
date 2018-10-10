package com.tencent.janimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tencent.janimation.pathmeasure.PathMeasureActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * PathMeasure
     */
    public void onClickPathMeasure(View view) {
        startActivity(new Intent(this, PathMeasureActivity.class));
    }
}
