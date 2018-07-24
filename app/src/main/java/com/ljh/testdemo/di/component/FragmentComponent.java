package com.ljh.testdemo.di.component;

import android.app.Activity;
import android.content.Context;

import com.ljh.testdemo.di.module.FragmentModule;
import com.ljh.testdemo.di.scope.ContextLife;
import com.ljh.testdemo.di.scope.PerFragment;

import dagger.Component;

/**
 * Created by lw on 2017/1/19.
 */
@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

//    void inject(HomeFragment fragment);
//
//    void inject(KnowledgeSystemFragment fragment);
//
//    void inject(MyFragment fragment);
//
//    void inject(ArticleListFragment fragment);
//
//    void inject(HotFragment fragment);
}
