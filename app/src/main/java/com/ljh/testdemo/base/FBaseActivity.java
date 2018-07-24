package com.ljh.testdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.blankj.utilcode.util.ToastUtils;
import com.ljh.testdemo.R;

import butterknife.ButterKnife;

/**
 * Created by ljh on 2018/7/21.
 */

public abstract class FBaseActivity<T extends IBaseContract.IBasePresenter> extends AppCompatActivity implements IBaseContract.IBaseView
{
    protected T mPresenter;
    protected abstract int getLayoutId();
    protected abstract void initView();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        int layoutId = getLayoutId();
        setContentView(layoutId);
        ButterKnife.bind(this);
        initPresenter();
        attachView();
        initView();
    }
    protected abstract void initPresenter();
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
    protected void onDestroy()
    {
        super.onDestroy();
        detachView();
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
