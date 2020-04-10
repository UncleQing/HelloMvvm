package com.zidian.hellomvvm.bean;

import androidx.databinding.BaseObservable;

import com.zidian.hellomvvm.BR;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/3/29
 * @Description: This is UserBean
 */
public class UserBean extends BaseObservable {
    private String name;
    private String password;
    private int type;

    public UserBean(String name, String password, int type) {
        this.name = name;
        this.password = password;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
//        notifyPropertyChanged(BR.name);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
