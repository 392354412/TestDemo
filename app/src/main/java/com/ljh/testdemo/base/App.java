package com.ljh.testdemo.base;

import android.app.Application;

import com.ljh.testdemo.di.component.ApplicationComponent;
import com.ljh.testdemo.di.component.DaggerApplicationComponent;
import com.ljh.testdemo.di.module.ApplicationModule;


public class App extends Application
{
    private static App mInstance;
    private ApplicationComponent mApplicationComponent;
    @Override
    public void onCreate()
    {
        super.onCreate();
        mInstance = this;
        initApplicationComponent();
    }

    public static App getInstance()
    {
        return mInstance;
    }
    /**
     * 初始化ApplicationComponent
     */
    private void initApplicationComponent() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }

}
