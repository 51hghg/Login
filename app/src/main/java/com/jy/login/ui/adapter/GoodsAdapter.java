package com.jy.login.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jy.login.R;
import com.jy.login.base.BaseAdapter;
import com.jy.login.model.bean.GoodBean;

import java.util.List;

public class GoodsAdapter extends BaseAdapter {

    Context context;

    public GoodsAdapter(List mData, Context context) {
        super(mData, context);
        this.context = context;
    }

    @Override
    protected int getLayout() {
        return R.layout.item_goods;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        GoodBean.DataBean.GoodsListBean bean = (GoodBean.DataBean.GoodsListBean) data;

        ImageView img = (ImageView) vh.getViewByid(R.id.img);
        TextView tvTitle = (TextView) vh.getViewByid(R.id.tv_title);
        TextView tvMoney = (TextView) vh.getViewByid(R.id.tv_money);
        TextView tvPing = (TextView) vh.getViewByid(R.id.text_ping);
        TextView tvGood = (TextView) vh.getViewByid(R.id.text_good);

        Glide.with(context).load(bean.getImg()).into(img);
        tvTitle.setText(bean.getName());
        tvMoney.setText(bean.getSprice());
        tvGood.setText(bean.getCommnet_count()+"万+评论");
        tvGood.setText(bean.getGood_score()+"%"+"好评");

        vh.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener != null) {
                    onItemClickListener.onClick(vh.getLayoutPosition());
                }
            }
        });
    }

    OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(int pos);
    }
}
