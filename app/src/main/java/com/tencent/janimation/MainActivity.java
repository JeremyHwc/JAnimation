package com.tencent.janimation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.tencent.janimation.bezier.BezierActivity;
import com.tencent.janimation.pathmeasure.PathMeasureActivity;
import com.tencent.janimation.vectordrawable.VectorDrawableActivity;

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

    public void onClickBezier(View view) {
        startActivity(new Intent(this, BezierActivity.class));
    }

    public void onClickVectorDrawable(View view) {
        startActivity(new Intent(this, VectorDrawableActivity.class));
    }
}
