package com.jy.login.persenter;

import com.jy.login.base.BasePresenter;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.car.ICar;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.CarModel;
import com.jy.login.model.ShopModel;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.CarBean;
import com.jy.login.model.bean.DingdanBean;

import java.util.Map;

public class CarPersenter extends BasePresenter<ICar.View> implements ICar.Persenter {

    ICar.Model model;
    ICar.View view;

    public CarPersenter(ICar.View view) {
        this.view = view;
        model = new CarModel();
    }

    @Override
    public void getCar(Map<String, String> map) {
        model.getCar(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getCar((CarBean) o);
                }
            }
        }, map);
    }

    @Override
    public void getdingdan(String type, String token) {
        model.getdingdan(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getdingdan((DingdanBean) o);
                }
            }
        }, type, token);
    }
}
