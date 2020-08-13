package com.zidian.hellomvvm.ui.activity;


import androidx.databinding.library.baseAdapters.BR;

import com.zidian.hellomvvm.R;
import com.zidian.hellomvvm.base.BaseActivity;
import com.zidian.hellomvvm.bean.UserBean;
import com.zidian.hellomvvm.databinding.ActivityMainBinding;
import com.zidian.hellomvvm.viewmodle.MainViewModel;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {
    private UserBean mUserBean;

    @Override
    protected MainViewModel initViewModel() {
        return createViewModel(MainViewModel.class);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void bindingVariable(ActivityMainBinding mDataBinding) {
        mUserBean = new UserBean("Dog", "666", 1);
        mDataBinding.setVariable(BR.user, mUserBean);
    }
    @Override
    protected void afterOnCreate() {
        mUserBean.setName("Cat");
        mUserBean.setPassword("777");
        mUserBean.setType(2);
    }
}
