package com.ljh.testdemo.mvp;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ljh.testdemo.R;
import com.ljh.testdemo.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * MVP模式示例
 */
public class MvpActivity extends BaseActivity<MvpPresenter> implements IMvpContract.IView
{
    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.btn_load)
    Button btnLoad;
    @BindView(R.id.btn_refresh)
    Button btnRefresh;

    @Override
    protected int getLayoutId()
    {
        return R.layout.act_mvp;
    }

    @Override
    protected void initView()
    {

    }

    @Override
    public void showLoading()
    {
        super.showLoading();
    }


    @Override
    public void setTitle(String title)
    {
        tvTitle.setText(title);
    }

    @OnClick({R.id.btn_load, R.id.btn_refresh})
    public void onViewClicked(View view)
    {
        switch (view.getId())
        {
            case R.id.btn_load:
                mPresenter.loadData();
                break;
            case R.id.btn_refresh:
                mPresenter.refresh();
                break;
        }
    }
}
