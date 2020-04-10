package com.zidian.hellomvvm.utils;

import android.Manifest;
import android.app.Activity;

import pub.devrel.easypermissions.EasyPermissions;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/1
 * @Description: This is PermissionUtils
 */
public class PermissionUtils {
    private static final String PERMISSION_STORAGE_MSG = "请授予权限，否则影响部分使用功能";
    private static final int PERMISSION_STORAGE_CODE = 10001;
    private static String[] PERMS = {Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE};

    public static void requsetPermission(Activity context){
        EasyPermissions.hasPermissions(context, PERMS);
        EasyPermissions.requestPermissions(context, PERMISSION_STORAGE_MSG, PERMISSION_STORAGE_CODE, PERMS);
    }

}
