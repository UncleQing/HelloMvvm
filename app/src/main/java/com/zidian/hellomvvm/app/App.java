package com.zidian.hellomvvm.app;

import android.app.Application;

import com.zidian.hellomvvm.BuildConfig;

import timber.log.Timber;

/**
 * @Author: UncleQing
 * @CreateDate: 2020/4/1
 * @Description: This is App
 */
public class App extends Application {
    private static App INSTACE;
    private static AppExecutors EXECUTORS;
    @Override
    public void onCreate() {
        super.onCreate();
        INSTACE = this;
        EXECUTORS = new AppExecutors();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    public static App getINSTACE() {
        return INSTACE;
    }

    public static AppExecutors getExecutors(){
        return EXECUTORS;
    }
}
