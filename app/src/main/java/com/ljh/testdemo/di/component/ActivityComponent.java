package com.ljh.testdemo.di.component;

import android.app.Activity;
import android.content.Context;

import com.ljh.testdemo.di.module.ActivityModule;
import com.ljh.testdemo.di.scope.ContextLife;
import com.ljh.testdemo.di.scope.PerActivity;
import com.ljh.testdemo.mvp.MvpActivity;

import dagger.Component;

/**
 * Created by lw on 2017/1/19.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

    void inject(MvpActivity activity);

}
