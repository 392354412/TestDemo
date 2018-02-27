package com.ljh.testdemo.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.ljh.testdemo.R;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 基类Act，实现P、V基类接口
 */
public abstract class BaseActivity<T extends IBaseContract.IBasePresenter> extends AppCompatActivity implements IBaseContract.IBaseView
{
    @NonNull //可以为null，便于无需MVP模式的Act继承
    protected T mPresenter;
    protected abstract int getLayoutId();

    protected abstract void initView();
    private Unbinder mBind;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        int layoutId = getLayoutId();
        setContentView(layoutId);
         mBind = ButterKnife.bind(this);
        attachView();
        initView();
    }

    @Override
    public void showLoading()
    {

    }

    @Override
    public void hideLoading()
    {

    }

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
    private void attachView()
    {
        if (mPresenter != null)
        {
            mPresenter.attachView(this);
        }
    }

    /**
     * 分离view
     */
    private void detachView()
    {
        if (mPresenter != null)
        {
            mPresenter.detachView();
        }
    }
}
