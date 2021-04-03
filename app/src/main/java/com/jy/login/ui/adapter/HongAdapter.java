package com.jy.login.ui.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;

import com.jy.login.R;
import com.jy.login.base.BaseAdapter;
import com.jy.login.model.bean.HongBean;

import java.util.List;

public class HongAdapter extends BaseAdapter {
    Context context;

    public HongAdapter(List mData, Context context) {
        super(mData, context);
        this.context=context;
    }

    @Override
    protected int getLayout() {
        return R.layout.item_hong;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        HongBean.GoodsInfoBean bean = (HongBean.GoodsInfoBean) data;
        TextView tvTitle = (TextView) vh.getViewByid(R.id.tv_title);
        TextView tvType = (TextView) vh.getViewByid(R.id.tv_type);
        TextView tvMoney = (TextView) vh.getViewByid(R.id.tv_money);
        TextView text_Old_Price = (TextView) vh.getViewByid(R.id.text_old_price);

        text_Old_Price.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
        text_Old_Price.setText(bean.getMarket_price_format());
        tvType.setText("已售"+bean.getGoods_number());
        tvTitle.setText(bean.getGoods_name());
        tvMoney.setText(bean.getMin_price_format());
    }
}
