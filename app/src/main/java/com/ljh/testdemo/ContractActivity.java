package com.ljh.testdemo;

import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.ljh.testdemo.base.FBaseActivity;
import com.ljh.testdemo.mvp.IMvpContract;
import com.ljh.testdemo.mvp.MvpPresenter;

import butterknife.BindView;

public class ContractActivity extends FBaseActivity<MvpPresenter> implements IMvpContract.IView
{

    @BindView(R.id.button)
    Button button;

    @Override
    protected int getLayoutId()
    {
        return R.layout.activity_contract;
    }

    @Override
    protected void initView()
    {
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                mPresenter.refresh();
            }
        });
    }

    @Override
    protected void initPresenter()
    {
        mPresenter = new MvpPresenter();
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
    public void onRetry()
    {

    }

    @Override
    public void setTitle(String title)
    {
        Log.d("MVP","我的"+title);
//        ToastUtils.showShort("我的"+title);
    }
}
