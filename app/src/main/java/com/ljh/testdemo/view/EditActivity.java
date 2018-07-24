package com.ljh.testdemo.view;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.fanwe.library.customview.SDGridLinearLayout;
import com.ljh.testdemo.R;
import com.rengwuxian.materialedittext.MaterialEditText;

import butterknife.BindView;

/**
 * Created by ljh on 2018/7/24.
 */

public class EditActivity extends Activity
{
    /**
     * 团购、商品 - 门店
     */
    @BindView(R.id.crv_store)
    CommonRowView crv_store;
    /**
     * 团购、商品 - 分类
     */
    @BindView(R.id.crv_kind)
    CommonRowView crv_kind;
    @BindView(R.id.met_title)
    MaterialEditText met_title;
    /**
     * 团购、商品 - 简称
     */
    @BindView(R.id.met_abbr)
    MaterialEditText met_abbr;
    /**
     * 团购、商品 - 生效时间
     */
    @BindView(R.id.crv_time_start)
    CommonRowView crv_time_start;
    /**
     * 团购、商品 - 失效时间
     */
    @BindView(R.id.crv_time_stop)
    CommonRowView crv_time_stop;
    /**
     * 团购券 - 是否发券
     */
    @BindView(R.id.crv_ticket_enable)
    CommonRowView crv_ticket_enable;
    @BindView(R.id.sv_ticket_enable)
    SwitchView sv_ticket_enable;
    @BindView(R.id.view_line)
    View view_line;
    /**
     * 团购券 - 类型
     */
    @BindView(R.id.crv_ticket_type)
    CommonRowView crv_ticket_type;
    /**
     * 团购券 - 生效时间
     */
    @BindView(R.id.crv_ticket_start)
    CommonRowView crv_ticket_start;
    /**
     * 团购券 - 失效时间
     */
    @BindView(R.id.crv_ticket_stop)
    CommonRowView crv_ticket_stop;
    /**
     * 团购券 - 有效期类型
     */
    @BindView(R.id.crv_term_type)
    CommonRowView crv_term_type;
    /**
     * 团购券 - 有效天数
     */
    @BindView(R.id.et_day_count)
    EditText et_day_count;
    /**
     * 团购券 - 有效天数父布局
     */
    @BindView(R.id.rl_day_count)
    RelativeLayout rl_day_count;
    /**
     * 团购券 - 父布局
     */
    @BindView(R.id.ll_group_ticket)
    LinearLayout ll_group_ticket;
    /**
     * 结算费率
     */
    @BindView(R.id.crv_rate)
    CommonRowView crv_rate;
    /**
     * 销售价
     */
    @BindView(R.id.et_current)
    EditText et_current;
    @BindView(R.id.tv_current)
    TextView tv_current;
    /**
     * 原价
     */
    @BindView(R.id.et_origin)
    EditText et_origin;
    @BindView(R.id.rl_origin)
    RelativeLayout rl_origin;
    /**
     * 结算价
     */
    @BindView(R.id.crv_balance)
    CommonRowView crv_balance;
    /**
     * 商品 - 规格
     */
    @BindView(R.id.crv_deal)
    CommonRowView crv_deal;
    /**
     * 商品 - 库存
     */
    @BindView(R.id.et_stock)
    EditText et_stock;
    @BindView(R.id.rl_stock)
    RelativeLayout rl_stock;
    /**
     * 商品 - 料号
     */
    @BindView(R.id.rl_goods_barcode)
    RelativeLayout rl_goods_barcode;
    /**
     * 商品 - 料号
     */
    @BindView(R.id.et_goods_barcode)
    EditText et_goods_barcode;
    /**
     * 虚拟件数
     */
    @BindView(R.id.et_buy_count)
    EditText et_buy_count;
    /**
     * 商品 - 配送方式
     */
    @BindView(R.id.crv_delivery_type)
    CommonRowView crv_delivery_type;
    /**
     * 商品 - 自提
     */
    @BindView(R.id.crv_pick)
    CommonRowView crv_pick;
    /**
     * 商品 - 运费模板
     */
    @BindView(R.id.crv_carriage)
    CommonRowView crv_carriage;
    /**
     * 商品 - 是否退款
     */
    @BindView(R.id.crv_refund)
    CommonRowView crv_refund;
    /**
     * 商品 - 配送、退款父布局
     */
    @BindView(R.id.ll_goods_delivery)
    LinearLayout ll_goods_delivery;
    /**
     * 购买须知
     */
    @BindView(R.id.met_notes)
    MaterialEditText met_notes;
    /**
     * 图文详情
     */
    @BindView(R.id.crv_phone_description)
    CommonRowView crv_phone_description;
    @BindView(R.id.scrollView)
    ScrollView scrollView;
    @BindView(R.id.gl_photo)
    SDGridLinearLayout gl_photo;
    @BindView(R.id.tv_line)
    View tvLine;
    /**
     * 运费信息
     */
    @BindView(R.id.tv_carriage_info)
    TextView tv_carriage_info;
}
