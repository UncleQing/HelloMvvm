package com.zidian.hellomvvm.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zidian.hellomvvm.utils.ToastUtils;
import com.zidian.hellomvvm.utils.dialog.BaseDialogFragment;
import com.zidian.hellomvvm.utils.dialog.DialogFragmentHelper;

import static com.zidian.hellomvvm.utils.dialog.DialogFragmentHelper.PROGRESS_TAG;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/19
 * @Description: This is BaseActivity
 */
public abstract class BaseActivity extends AppCompatActivity {
    private BaseDialogFragment loadingDialog;   //加载进度条弹框

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        afterOnCreate();
    }

    protected abstract int getLayoutId();

    protected abstract void afterOnCreate();

    public void showLoading() {
        if (loadingDialog == null) {
            loadingDialog = DialogFragmentHelper.showProgress(getSupportFragmentManager(), null, false);
        } else {
            loadingDialog.show(getSupportFragmentManager(), PROGRESS_TAG);
        }
    }

    public void hideLoading() {
        if (loadingDialog != null && loadingDialog.isVisible()) {
            loadingDialog.dismissAllowingStateLoss();
        }
    }

    public void showToast(String msg) {
        ToastUtils.showToast(this, msg);
    }
}
