package com.zidian.hellomvvm.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/19
 * @Description: This is BaseActivity
 */
public abstract class BaseActivity<VBD extends ViewDataBinding, VM extends ViewModel> extends AppCompatActivity {
    protected VBD mDataBinding;
    protected VM mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewModel = initViewModel();
        mDataBinding = DataBindingUtil.setContentView(this, getLayoutId());
        mDataBinding.setLifecycleOwner(this);
        bindingVariable(mDataBinding);
        afterOnCreate();
    }

    protected abstract VM initViewModel();

    protected abstract int getLayoutId();

    protected abstract void bindingVariable(VBD mDataBinding);

    protected abstract void afterOnCreate();

    public <T extends ViewModel> T createViewModel(Class<T> cls) {
        return new ViewModelProvider(this).get(cls);
    }

}
