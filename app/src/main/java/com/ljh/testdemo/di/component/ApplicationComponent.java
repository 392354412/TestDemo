package com.ljh.testdemo.di.component;

import android.content.Context;

import com.ljh.testdemo.di.module.ApplicationModule;
import com.ljh.testdemo.di.scope.ContextLife;
import com.ljh.testdemo.di.scope.PerApp;

import dagger.Component;


/**
 * Created by lw on 2017/1/19.
 */
@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ContextLife("Application")
    Context getApplication();
}