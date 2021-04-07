package com.jy.login.model;

import com.jy.login.base.BaseModel;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.car.ICar;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.CarBean;
import com.jy.login.model.bean.DingdanBean;
import com.jy.login.net.CommonSubscriber;
import com.jy.login.net.HttpManager;
import com.jy.login.utils.RxUtils;

import java.util.Map;

public class CarModel extends BaseModel implements ICar.Model {
    @Override
    public void getCar(CallBack callBack, Map<String, String> map) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getCar(map)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<CarBean>(callBack) {
                            @Override
                            public void onNext(CarBean carBean) {
                                callBack.onSuccess(carBean);
                            }
                        })
        );
    }

    @Override
    public void getdingdan(CallBack callBack, String type, String token) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getdingdan(type, token)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<DingdanBean>(callBack) {
                            @Override
                            public void onNext(DingdanBean dingdanBean) {
                                callBack.onSuccess(dingdanBean);
                            }
                        })
        );
    }
}
