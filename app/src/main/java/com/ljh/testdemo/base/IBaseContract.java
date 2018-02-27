package com.ljh.testdemo.base;

/**
 * P层与V层的基类接口
 * 将同一事务的P、V接口写在同一类中便于维护
 * 这些接口都被BaseActivity实现，所有继承BaseActivity的Act都能在P层调用
 */
public interface IBaseContract
{
    /**
     * P层基类接口
     * @param <T>
     */
    interface IBasePresenter<T extends IBaseView>
    {
        /**
         * 为P层注入V层
         * @param view view层
         */
        void attachView(T view);

        /**
         * 销毁P中的V层
         */
        void detachView();
    }
    /**
     * View层基类接口
     */
    interface IBaseView
    {
        /**
         * 显示加载中
         */
        void showLoading();

        /**
         * 隐藏加载
         */
        void hideLoading();

        /**
         *  请求成功
         * @param msg 成功信息
         */
        void showSuccess(String msg);

        /**
         * 请求失败
         * @param msg 失败信息
         */
        void showFail(String msg);
        /**
         * 无网络
         */
        void showNoNet();

        /**
         * 重试
         */
        void onRetry();
    }
}
