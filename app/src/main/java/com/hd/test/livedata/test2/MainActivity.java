package com.hd.test.livedata.test2;

import android.view.View;
import android.view.ViewGroup;

import com.hd.test.livedata.test2.activity.GoActivity;
import com.hd.test.livedata.test2.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding binding;

    @Override
    public void setData() {
        setKeyListener();
    }

    @Override
    public ViewGroup getLayout() {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    private void setKeyListener() {
        binding.mainBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleTopActivity(mContext);
            }
        });

        binding.mainBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleTaskActivity(mContext);
            }
        });

        binding.mainBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GoActivity.goSingleInstanceActivity(mContext);
            }
        });
    }
}