package com.ljh.testdemo.mvp;

import com.ljh.testdemo.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by ljh on 2018/2/27.
 */

public class MvpPresenter extends BasePresenter<IMvpContract.IView> implements IMvpContract.IPresenter
{
    @Inject
    public MvpPresenter(){}
    @Override
    public void loadData()
    {
        mView.showLoading();
        mView.setTitle("MVP模式 --- load");
        new Thread(){
            @Override
            public void run()
            {
                super.run();
                try
                {
                    Thread.sleep(1000);
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
        mView.setTitle("MVP模式 --- refresh");
//        new Thread(){
//            @Override
//            public void run()
//            {
//                super.run();
//                try
//                {
//                    Thread.sleep(1000);
//
//                    mView.hideLoading();
//                } catch (InterruptedException e)
//                {
//                    e.printStackTrace();
//                }
//            }
//        }.start();
    }
}
