package com.ljh.testdemo.base;

/**
 * P层基类
 * 实现P层基础接口
 */
public class BasePresenter<T extends IBaseContract.IBaseView> implements IBaseContract.IBasePresenter<T>
{
    protected T mView;
    @Override
    public void attachView(T view)
    {
        mView = view;
    }

    @Override
    public void detachView()
    {
        if (mView != null)
        {
            mView = null;
        }
    }
}
