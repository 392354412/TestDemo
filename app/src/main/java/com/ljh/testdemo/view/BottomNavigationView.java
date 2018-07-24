package com.ljh.testdemo.view;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.ljh.testdemo.R;

import butterknife.BindView;


public class BottomNavigationView extends FrameLayout
{
    @BindView(R.id.tv_home)
    TextView tvHome;
    @BindView(R.id.tv_nearby)
    TextView tvNearby;
    @BindView(R.id.iv_live)
    ImageView ivLive;
    @BindView(R.id.tv_message)
    TextView tvMessage;
    @BindView(R.id.tv_me)
    TextView tvMe;

    public BottomNavigationView(@NonNull Context context)
    {
        super(context);
        init();
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(R.layout.view_main_tab, this, true);
    }
}
