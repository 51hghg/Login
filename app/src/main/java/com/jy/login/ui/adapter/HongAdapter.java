package com.jy.login.ui.adapter;

import android.content.Context;
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

        tvTitle.setText(bean.getGoods_name());
        tvMoney.setText(bean.getMin_price_format());
    }
}
