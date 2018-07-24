package com.ljh.testdemo;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ljh.testdemo.base.BaseActivity;
import com.ljh.testdemo.mvp.MvpActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class MainActivity extends BaseActivity
{

    @BindView(R.id.tv_content)
    TextView tvContent;
    @BindView(R.id.btn_mvp)
    Button btn_mvp;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected int getLayoutId()
    {
        return R.layout.act_main;
    }

    @Override
    protected void initView()
    {
        MainActivity mainActivity = MainActivity.this;
//        DevicePolicyManager.getInstance(this);
    }

    @Override
    protected void initInjector()
    {
    }

    @OnClick({R.id.btn_mvp,R.id.btn})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_mvp:
                startActivity(new Intent(this, MvpActivity.class));
                break;
            case R.id.btn:
                startActivity(new Intent(this, ContractActivity.class));
                break;
        }
    }
}
