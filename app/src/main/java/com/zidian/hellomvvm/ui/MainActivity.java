package com.zidian.hellomvvm.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;

import com.zidian.hellomvvm.R;
import com.zidian.hellomvvm.databinding.ActivityMainBinding;
import com.zidian.hellomvvm.databinding.ActivityMainBindingImpl;

import java.io.File;
import java.util.List;
import java.util.Timer;

import pub.devrel.easypermissions.AfterPermissionGranted;
import pub.devrel.easypermissions.EasyPermissions;
import timber.log.Timber;

public class MainActivity extends AppCompatActivity{

    private static final String PERMISSION_STORAGE_MSG = "请授予权限，否则影响部分使用功能";
    private static final int PERMISSION_STORAGE_CODE = 10001;
    private static String[] PERMS = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EasyPermissions.requestPermissions(this, PERMISSION_STORAGE_MSG, PERMISSION_STORAGE_CODE, PERMS);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        EasyPermissions.onRequestPermissionsResult(requestCode, permissions, grantResults, this);
    }

    @AfterPermissionGranted(PERMISSION_STORAGE_CODE)
    public void onPermissionsSuccess(){
        Timber.e("onPermissionsSuccess");
        //TODO

    }
}
