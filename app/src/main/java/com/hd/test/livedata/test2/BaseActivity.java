package com.hd.test.livedata.test2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LifecycleOwner;

public abstract class BaseActivity extends AppCompatActivity {

    public final String TAG = getClass().getSimpleName();

    public Context mContext;
    public LifecycleOwner mOwner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayout());

        Log.i(TAG, "onCreate: " + this.getTaskId() + "  this = " + this);

        mContext = this;
        mOwner = this;

        setData();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: " + this.getTaskId());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: " + this.getTaskId());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: " + this.getTaskId());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: " + this.getTaskId());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: " + this.getTaskId());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.i(TAG, "onNewIntent: " + this.getTaskId());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: " + this.getTaskId());
    }

    public abstract void setData();

    public abstract ViewGroup getLayout();

}
