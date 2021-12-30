package com.hd.test.livedata.test2.activity;

import android.view.View;
import android.view.ViewGroup;

import com.hd.test.livedata.test2.BaseActivity;
import com.hd.test.livedata.test2.databinding.ActivitySingleInstanceBinding;

public class SingleInstanceActivity extends BaseActivity {

    private ActivitySingleInstanceBinding binding;

    @Override
    public void setData() {

    }

    @Override
    public ViewGroup getLayout() {
        binding = ActivitySingleInstanceBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void setKeyListener() {
        binding.instanceBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleTopActivity(mContext);
            }
        });

        binding.instanceBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleTaskActivity(mContext);
            }
        });

        binding.instanceBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleInstanceActivity(mContext);
            }
        });
    }
}