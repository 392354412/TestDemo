package com.ljh.testdemo;

import android.widget.TextView;

import com.ljh.testdemo.base.BaseActivity;

import butterknife.BindView;

public class MainActivity extends BaseActivity
{

    @BindView(R.id.tv_content)
    TextView tvContent;

    @Override
    protected int getLayoutId()
    {
        return R.layout.act_main;
    }

    @Override
    protected void initView()
    {

    }

}
