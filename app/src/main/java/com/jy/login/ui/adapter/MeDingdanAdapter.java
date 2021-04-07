package com.jy.login.ui.adapter;

import android.content.Context;

import com.jy.login.R;
import com.jy.login.base.BaseAdapter;

import java.util.List;

public class MeDingdanAdapter extends BaseAdapter {
    Context context;
    public MeDingdanAdapter(List mData, Context context) {
        super(mData, context);
        this.context=context;
    }

    @Override
    protected int getLayout() {
        return R.layout.item_medingdan;
    }

    @Override
    protected void bindData(Object data, VH vh) {

    }
}
