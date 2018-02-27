package com.ljh.testdemo.mvp;

import com.ljh.testdemo.base.BasePresenter;

/**
 * Created by ljh on 2018/2/27.
 */

public class MvpPresenter extends BasePresenter<IMvpContract.IView> implements IMvpContract.IPresenter
{

    @Override
    public void loadData()
    {
        mView.showLoading();
        new Thread(){
            @Override
            public void run()
            {
                super.run();
                try
                {
                    Thread.sleep(1000);
                    mView.setTitle("MVP模式 --- load");
                    mView.hideLoading();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override
    public void refresh()
    {
        mView.showLoading();
        new Thread(){
            @Override
            public void run()
            {
                super.run();
                try
                {
                    Thread.sleep(1000);
                    mView.setTitle("MVP模式 --- refresh");
                    mView.hideLoading();
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }.start();
    }
}
