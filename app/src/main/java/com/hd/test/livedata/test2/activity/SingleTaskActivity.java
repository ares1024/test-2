package com.hd.test.livedata.test2.activity;

import android.view.View;
import android.view.ViewGroup;

import com.hd.test.livedata.test2.BaseActivity;
import com.hd.test.livedata.test2.databinding.ActivitySingleTaskBinding;

public class SingleTaskActivity extends BaseActivity {

    private ActivitySingleTaskBinding binding;

    @Override
    public void setData() {
        setKeyListener();
    }

    @Override
    public ViewGroup getLayout() {
        binding = ActivitySingleTaskBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void setKeyListener() {
        binding.taskBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleTopActivity(mContext);
            }
        });

        binding.taskBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleTaskActivity(mContext);
            }
        });

        binding.taskBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleInstanceActivity(mContext);
            }
        });
    }
}