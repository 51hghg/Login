package com.jy.login.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jy.login.R;
import com.jy.login.base.BaseAdapter;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.TabDetailBean;

import java.util.ArrayList;
import java.util.List;

public class GoodsChildAdapter extends BaseAdapter {
    Context context;
    public GoodsChildAdapter(List mData, Context context) {
        super(mData, context);
        this.context = context;
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_goodschild;
    }

    @Override
    protected void bindData(Object data, VH vh) {

        TabDetailBean.DataBean.YRinitlistBean.ContentBean.NavListBean bean= (TabDetailBean.DataBean.YRinitlistBean.ContentBean.NavListBean) data;

        final ImageView img = (ImageView) vh.getViewByid(R.id.img_goodschilde);
        final TextView text = (TextView) vh.getViewByid(R.id.txt_goodschild);

        Glide.with(context).load(bean.getImg()).into(img);
        text.setText(bean.getTitle());
    }
}
