package com.example.iknownothing.gestures;

import android.annotation.SuppressLint;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnDoubleTapListener,GestureDetector.OnGestureListener{
GestureDetectorCompat gestureDetector;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.text);
        this.gestureDetector=new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);



    }
//Gestures Calls whenever there is any MotionEvent happens...

    @SuppressLint("SetTextI18n")
    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        Log.d("gesture","onSingleTapConfirmed");
        textView.setText("onSingleTapConfirmed");
        return true;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onDoubleTap(MotionEvent e) {
        Log.d("gesture","onDoubleTap");
        textView.setText("onDoubleTap");
        return true;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        Log.d("gesture","onDoubleTapEvent");
        textView.setText("onDoubleTapEvent");
        return true;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onDown(MotionEvent e) {
        Log.d("gesture","onDown");
        textView.setText("onDown");
        return true;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onShowPress(MotionEvent e) {
        Log.d("gesture","onShowPress");
        textView.setText("onShowPress");

    }
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        Log.d("gesture","onSingleTapUp");
        textView.setText("onSingleTapUp");
        return true;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        Log.d("gesture","onScroll");
        textView.setText("onScroll");
        return true;
    }
    @SuppressLint("SetTextI18n")
    @Override
    public void onLongPress(MotionEvent e) {
        Log.d("gesture","onLongPress");
        textView.setText("onLongPress");

    }
    @SuppressLint("SetTextI18n")
    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        Log.d("gesture","onFling");
        textView.setText("onFling");
        return true;
        }


        @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
