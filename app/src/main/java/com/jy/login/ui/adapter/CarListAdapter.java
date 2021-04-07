package com.jy.login.ui.adapter;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.jy.login.R;
import com.jy.login.base.BaseAdapter;
import com.jy.login.model.bean.CarBean;
import com.jy.login.widget.NumberSelect;

import java.util.List;

public  class CarListAdapter extends BaseAdapter {
    Context context;
    private boolean isEdit; //是否是编辑状态
    private UpdateItem updateItem;

    public void setUpdateItem(UpdateItem item) {
        this.updateItem = item;
    }

    public void setEditState(boolean bool) {
        isEdit = bool;
    }

    public CarListAdapter(List mData, Context context) {
        super(mData, context);
        this.context=context;
    }

    @Override
    protected int getLayout() {
        return R.layout.item_car;
    }

    @Override
    protected void bindData(Object data, VH vh) {
        CarBean.ListBean._$1Bean.PromotListBeanX.GoodsListBean bean= (CarBean.ListBean._$1Bean.PromotListBeanX.GoodsListBean) data;
        CheckBox checkBox = (CheckBox) vh.getViewByid(R.id.checkbox);
        ImageView imgItem = (ImageView) vh.getViewByid(R.id.img_item);
        TextView txtName = (TextView) vh.getViewByid(R.id.txt_name);
        TextView txtPrice = (TextView) vh.getViewByid(R.id.txt_price);
        TextView txtNumber = (TextView) vh.getViewByid(R.id.txt_number);
        TextView txtEditTitle = (TextView) vh.getViewByid(R.id.txt_edit_title);
        NumberSelect numberSelect = (NumberSelect) vh.getViewByid(R.id.layout_change);

        txtName.setVisibility(isEdit ? View.GONE : View.VISIBLE);
        txtNumber.setVisibility(isEdit ? View.GONE : View.VISIBLE);
        txtEditTitle.setVisibility(isEdit ? View.VISIBLE : View.GONE);
        numberSelect.setVisibility(isEdit ? View.VISIBLE : View.GONE);

        // 设置选中状态
        checkBox.setChecked(isEdit ? bean.selectEdit : bean.selectOrder);
        Glide.with(imgItem).load(bean.getImg()).into(imgItem);
        txtName.setText(bean.getGoods_name());
        txtPrice.setText("￥" + bean.getGoods_shop_price());
        txtNumber.setText("X " + String.valueOf(bean.getGoods_num()));
        numberSelect.addPage(R.layout.layout_number_change);
        numberSelect.setNumber(Integer.parseInt(bean.getGoods_num()));
        numberSelect.addChangeNumber(new NumberSelect.ChangeNumber() {
            @Override
            public void change(int number) {
                //修改本地数据得值
                bean.setGoods_num(number+"");
                if (updateItem != null) {
                    updateItem.updateItemDate(bean);
                }
            }
        });

        checkBox.setTag(bean.getId());
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (iItemViewClick != null) {
                    int id = (int) buttonView.getTag();
                    iItemViewClick.itemViewClick(id, isChecked);
                }
            }
        });

       /* if(isEdit){
            txtName.setVisibility(View.GONE);
            txtNumber.setVisibility(View.GONE);
            txtEditTitle.setVisibility(View.VISIBLE);
            numberSelect.setVisibility(View.VISIBLE);
        }else{
            txtName.setVisibility(View.VISIBLE);
            txtNumber.setVisibility(View.VISIBLE);
            txtEditTitle.setVisibility(View.GONE);
            numberSelect.setVisibility(View.GONE);
        }*/

    }
    public interface UpdateItem {
        void updateItemDate(CarBean.ListBean._$1Bean.PromotListBeanX.GoodsListBean data);
    }

}
