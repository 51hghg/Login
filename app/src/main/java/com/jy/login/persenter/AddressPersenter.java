package com.jy.login.persenter;

import com.jy.login.base.BasePresenter;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.address.IAddress;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.AddressModel;
import com.jy.login.model.ShopModel;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.BannerBean;

public class AddressPersenter extends BasePresenter<IAddress.View> implements IAddress.Persenter {

    IAddress.Model model;
    IAddress.View view;

    public AddressPersenter(IAddress.View view) {
        this.view = view;
        model = new AddressModel();
    }

    @Override
    public void getaddress() {
        model.getaddress(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getaddress((AddressBean) o);
                }
            }
        });
    }
}
