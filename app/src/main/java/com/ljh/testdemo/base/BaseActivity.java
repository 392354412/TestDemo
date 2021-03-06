package com.ljh.testdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.ljh.testdemo.R;
import com.ljh.testdemo.di.component.ActivityComponent;
import com.ljh.testdemo.di.component.DaggerActivityComponent;
import com.ljh.testdemo.di.module.ActivityModule;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 基类Act，实现P、V基类接口
 */
public abstract class BaseActivity<T extends IBaseContract.IBasePresenter> extends AppCompatActivity implements IBaseContract.IBaseView
{
    @Nullable //可以为null，便于无需MVP模式的Act继承
    @Inject
    protected T mPresenter;
    protected ActivityComponent mActivityComponent;

    protected abstract int getLayoutId();
    protected abstract void initView();
    private Unbinder mBind;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        initActivityComponent();
        int layoutId = getLayoutId();
        setContentView(layoutId);
        initInjector();
        mBind = ButterKnife.bind(this);
        attachView();
        initView();
    }
    /**
     * 初始化ActivityComponent
     */
    private void initActivityComponent() {
        mActivityComponent = DaggerActivityComponent.builder()
                .applicationComponent(((App) getApplication()).getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .build();
    }
    @Override
    public void showLoading()
    {

    }

    @Override
    public void hideLoading()
    {

    }

    protected abstract void initInjector();

    @Override
    public void showSuccess(String msg)
    {
        ToastUtils.showShort(msg);
    }

    @Override
    public void showFail(String msg)
    {
        ToastUtils.showShort(msg);
    }

    @Override
    public void showNoNet()
    {
        ToastUtils.showShort(R.string.str_no_network);
    }

    @Override
    public void onRetry()
    {

    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        detachView();
        mBind.unbind();
    }

    /**
     * 绑定view
     */
    protected void attachView()
    {
        if (mPresenter != null)
        {
            mPresenter.attachView(this);
        }
    }

    /**
     * 分离view
     */
    protected void detachView()
    {
        if (mPresenter != null)
        {
            mPresenter.detachView();
        }
    }
}
