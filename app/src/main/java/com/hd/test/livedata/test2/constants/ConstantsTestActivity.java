package com.hd.test.livedata.test2.constants;

import android.view.ViewGroup;

import com.hd.test.livedata.test2.BaseActivity;
import com.hd.test.livedata.test2.databinding.ActivityConstantsTestBinding;

public class ConstantsTestActivity extends BaseActivity {

    private ActivityConstantsTestBinding binding;
    @Override
    public void setData() {

    }

    @Override
    public ViewGroup getLayout() {
        binding = ActivityConstantsTestBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
}