package com.jy.login.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jy.login.R;
import com.jy.login.base.BaseAdapter;
import com.jy.login.base.BaseFragment;
import com.jy.login.model.bean.AddressBean;

import java.util.List;

public class AddressAdapter extends BaseAdapter {

    Context context;

    public AddressAdapter(List mData, Context context) {
        super(mData, context);
        this.context = context;
    }

    @Override
    protected int getLayout() {
        return R.layout.item_address;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        AddressBean.DataBean bean = (AddressBean.DataBean) data;

        TextView Address = (TextView) vh.getViewByid(R.id.address);
        TextView Name = (TextView) vh.getViewByid(R.id.name);
        TextView Phone = (TextView) vh.getViewByid(R.id.phone);
//        Button btnDelete = (Button) vh.getViewByid(R.id.btnDelete);

        Address.setText(bean.getRegion());
        Name.setText(bean.getUsername());
        Phone.setText(bean.getMobile());
    }
}
