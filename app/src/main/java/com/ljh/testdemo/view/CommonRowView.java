package com.ljh.testdemo.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.fanwe.library.utils.SDViewUtil;
import com.fanwe.library.view.CircleImageView;
import com.fanwe.library.view.SDAppView;
import com.ljh.testdemo.R;


/**
 */

public class CommonRowView extends SDAppView
{
  private TextView tv_left;
  private TextView tv_right;
  private CircleImageView civ_right;
  private ImageView iv_right_action_img;
  private ImageView iv_bottom_divider;

  public CommonRowView(Context context) {
    this(context, null);
  }

  public CommonRowView(Context context, AttributeSet attrs) {
    this(context, attrs, 0);
  }

  public CommonRowView(Context context, AttributeSet attrs,
                       int defStyle) {
    super(context, attrs, defStyle);
    TypedArray ta =
        context.getTheme().obtainStyledAttributes(attrs, R.styleable.CommonRowView, 0, 0);
    final boolean crvShowLeftTxt = ta.getBoolean(R.styleable.CommonRowView_crvShowLeftTxt, true);
    final boolean crvShowRightTxt = ta.getBoolean(R.styleable.CommonRowView_crvShowRightTxt, true);
    final boolean crvShowRightActionImg =
        ta.getBoolean(R.styleable.CommonRowView_crvShowRightActionImg, true);
    final boolean crvShowRightDra = ta.getBoolean(R.styleable.CommonRowView_crvShowRightDra, false);
    final boolean crvShowBottomDivider =
        ta.getBoolean(R.styleable.CommonRowView_crvShowBottomDivider, true);

    final String crvLeftTxt = ta.getString(R.styleable.CommonRowView_crvLeftTxt);
    final String crvRightTxt = ta.getString(R.styleable.CommonRowView_crvRightTxt);

    final Drawable crvRightDrawable = ta.getDrawable(R.styleable.CommonRowView_crvRightDrawable);
    final Drawable crvRightActionImg = ta.getDrawable(R.styleable.CommonRowView_crvRightActionImg);
    final int color = ta.getColor(R.styleable.CommonRowView_crvBottomDivider,
        getResources().getColor(R.color.gray_press));
    final int rightTvColor = ta.getColor(R.styleable.CommonRowView_crvRightTvColor,
        getResources().getColor(R.color.gray_press));
    final int leftTvColor = ta.getColor(R.styleable.CommonRowView_crvLeftTvColor,
        getResources().getColor(R.color.text_black_xx));
    ta.recycle();

    showTv_left(crvShowLeftTxt);
    if (crvShowLeftTxt) {
      setTv_left(crvLeftTxt);
    }
    showTv_right(crvShowRightTxt);
    if (crvShowRightTxt) {
      setTv_right(crvRightTxt);
    }
    showCiv_right(crvShowRightDra);
    if (crvShowRightDra) {
      setCiv_right(crvRightDrawable);
    }
    showIv_right_action_img(crvShowRightActionImg);
    if (crvShowRightActionImg) {
      setIv_right_action_img(crvRightActionImg);
    }
    showIv_bottom_divider(crvShowBottomDivider);
    if (crvShowBottomDivider) {
      setIv_bottom_dividerColorInt(color);
    }
    if(rightTvColor != -1){
      tv_right.setTextColor(rightTvColor);
    }
    if(leftTvColor != -1){
      tv_left.setTextColor(leftTvColor);
    }
  }

  @Override
  protected void onBaseInit()
  {
    super.onBaseInit();
    initView();
  }

  @Override
  protected int onCreateContentView()
  {
    return R.layout.view_common_row_view;
  }

  private void initView() {
    tv_left = findViewById(R.id.tv_left);
    tv_right = findViewById(R.id.tv_right);
    civ_right = findViewById(R.id.civ_right);
    iv_right_action_img = findViewById(R.id.iv_right_action_img);
    iv_bottom_divider = findViewById(R.id.iv_bottom_divider);
  }

  public CommonRowView showTv_left(boolean isShow) {
    tv_left.setVisibility(isShow ? VISIBLE : INVISIBLE);
    return this;
  }

  public CommonRowView setTv_left(String txt) {
    tv_left.setText(txt);
    return this;
  }

  public CommonRowView setTv_leftTxtColor(@ColorRes int resId) {
    tv_left.setTextColor(getResources().getColor(resId));
    return this;
  }
  public CommonRowView setTv_leftTextColor(int resId) {
    tv_left.setTextColor(resId);
    return this;
  }

  public CommonRowView setTv_leftTxtSize(float size) {
    tv_left.setTextSize(size);
    return this;
  }

  public CommonRowView showTv_right(boolean isShow) {
    tv_right.setVisibility(isShow ? VISIBLE : INVISIBLE);
    return this;
  }

  public CommonRowView setTv_right(String txt) {
    tv_right.setText(txt);
    tv_right.clearComposingText();
    return this;
  }


  public CommonRowView setTv_rightTxtSize(float size) {
    tv_right.setTextSize(size);
    return this;
  }

  public CommonRowView setTv_rightTxtColor(@ColorRes int resId) {
    tv_right.setTextColor(getResources().getColor(resId));
    return this;
  }


  public CommonRowView showCiv_right(boolean isShow) {
    civ_right.setVisibility(isShow ? VISIBLE : INVISIBLE);
    return this;
  }

  public CommonRowView setCiv_right(Drawable drawable) {
    civ_right.setImageDrawable(drawable);
    return this;
  }

  public CommonRowView setCiv_right(@DrawableRes int resId) {
    civ_right.setImageResource(resId);
    return this;
  }


  public CommonRowView showIv_right_action_img(boolean isShow) {
    iv_right_action_img.setVisibility(isShow ? VISIBLE : INVISIBLE);
    if(!isShow){
      ViewGroup.LayoutParams lp = iv_right_action_img.getLayoutParams();
      lp.width = 0;
      iv_right_action_img.setLayoutParams(lp);
    }
    return this;
  }

  public CommonRowView setIv_right_action_img(Drawable drawable) {
    SDViewUtil.setBackgroundDrawable(iv_right_action_img, drawable);
    return this;
  }

  public CommonRowView setIv_right_action_img(@DrawableRes int resId) {
    SDViewUtil.setBackgroundResource(iv_right_action_img, resId);
    return this;
  }

  public CommonRowView showIv_bottom_divider(boolean isShow) {
    iv_bottom_divider.setVisibility(isShow ? VISIBLE : INVISIBLE);
    return this;
  }

  public CommonRowView setIv_bottom_dividerColorInt(@ColorInt int color) {
    iv_bottom_divider.setBackgroundColor(color);
    return this;
  }

  public CommonRowView setIv_bottom_dividerColorRes(@ColorRes int resId) {
    SDViewUtil.setBackgroundColorResId(iv_bottom_divider, resId);
    return this;
  }
}
