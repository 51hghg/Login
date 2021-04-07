package com.jy.login.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.jy.login.R;
import com.jy.login.base.BaseAdapter;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.ViewPagerBean;

import java.util.List;

public class CurrentAdapter extends BaseAdapter {

    Context context;

    public CurrentAdapter(List mData, Context context) {
        super(mData, context);
        this.context = context;
    }

    @Override
    protected int getLayout() {
        return R.layout.item_cuttent;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        ViewPagerBean.DataBean bean = (ViewPagerBean.DataBean) data;
        TextView tvTitle = (TextView) vh.getViewByid(R.id.tv_title);
        ImageView img = (ImageView) vh.getViewByid(R.id.img);

        Glide.with(context).load(bean.getImg()).into(img);
        tvTitle.setText(bean.getName());
        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onClick(vh.getLayoutPosition());
                }
            }
        });
    }

    CurrentAdapter.OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(CurrentAdapter.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(int pos);
    }
}
