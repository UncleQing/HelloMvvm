package com.zidian.hellomvvm.base;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zidian.hellomvvm.utils.ToastUtils;
import com.zidian.hellomvvm.utils.dialog.BaseDialogFragment;
import com.zidian.hellomvvm.utils.dialog.DialogFragmentHelper;

import static com.zidian.hellomvvm.utils.dialog.DialogFragmentHelper.PROGRESS_TAG;

public abstract class BaseFragment extends Fragment {
    private BaseDialogFragment loadingDialog;   //加载进度条弹框

    protected abstract int getLayoutId();

    protected abstract void afterOnCreateView();


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        afterOnCreateView();
        return view;
    }

    public void showLoading() {
        if (loadingDialog == null) {
            loadingDialog = DialogFragmentHelper.showProgress(getFragmentManager(), null, false);
        } else {
            loadingDialog.show(getParentFragmentManager(), PROGRESS_TAG);
        }
    }

    public void hideLoading() {
        if (loadingDialog != null && loadingDialog.isVisible()) {
            loadingDialog.dismissAllowingStateLoss();
        }
    }

    public void showToast(String msg) {
        ToastUtils.showToast(getContext(), msg);
    }
}
