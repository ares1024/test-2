package com.hd.test.livedata.test2.activity;

import android.view.View;
import android.view.ViewGroup;

import com.hd.test.livedata.test2.BaseActivity;
import com.hd.test.livedata.test2.databinding.ActivitySingleTopBinding;

public class SingleTopActivity extends BaseActivity {

    private ActivitySingleTopBinding binding;

    @Override
    public void setData() {
        setKeyListener();
    }

    @Override
    public ViewGroup getLayout() {
        binding = ActivitySingleTopBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void setKeyListener() {
        binding.topBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleTopActivity(mContext);
            }
        });

        binding.topBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleTaskActivity(mContext);
            }
        });

        binding.topBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleInstanceActivity(mContext);
            }
        });
    }
}