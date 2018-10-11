package com.tencent.janimation.bezier;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.tencent.janimation.R;

public class BezierActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bezier);
    }

    public void secondBezierTest(View view) {
        startActivity(new Intent(this, SecondBezierActivity.class));
    }

    public void thirdBezierTest(View view) {
        startActivity(new Intent(this, ThirdBezierActivity.class));
    }

    public void drawPadBezierTest(View view) {
        startActivity(new Intent(this, DrawPadActivity.class));
    }

    public void pathMorthingBezierTest(View view) {
        startActivity(new Intent(this, PathMorthingActivity.class));
    }

    public void waveBezierTest(View view) {
        startActivity(new Intent(this, WaveActivity.class));
    }

    public void pathBezierTest(View view) {
        startActivity(new Intent(this, PathBezierActivity.class));
    }
}
