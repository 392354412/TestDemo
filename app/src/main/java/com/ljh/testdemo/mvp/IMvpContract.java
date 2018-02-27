package com.ljh.testdemo.mvp;

import com.ljh.testdemo.base.IBaseContract;

/**
 * 提取的MVP中V、P接口
 */
public interface IMvpContract
{
    /**
     * V层提供设置数据方法
     */
    interface IView extends IBaseContract.IBaseView{
        void setTitle(String title);
    }

    /**
     * P层获取数据
     */
    interface IPresenter extends IBaseContract.IBasePresenter<IView>{
        void loadData();
        void refresh();
    }
}
