package com.ljh.testdemo.di.component;

import android.content.Context;

import com.ljh.testdemo.di.module.ServiceModule;
import com.ljh.testdemo.di.scope.ContextLife;
import com.ljh.testdemo.di.scope.PerService;

import dagger.Component;


/**
 * Created by lw on 2017/1/19.
 */
@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {
    @ContextLife("Service")
    Context getServiceContext();

    @ContextLife("Application")
    Context getApplicationContext();
}
