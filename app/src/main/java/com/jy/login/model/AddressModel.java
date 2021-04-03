package com.jy.login.model;

import com.jy.login.base.BaseModel;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.address.IAddress;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.net.CommonSubscriber;
import com.jy.login.net.HttpManager;
import com.jy.login.utils.RxUtils;

public class AddressModel extends BaseModel implements IAddress.Model {

    @Override
    public void getaddress(CallBack callBack) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getaddress()
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<AddressBean>(callBack) {
                            @Override
                            public void onNext(AddressBean addressBean) {
                                callBack.onSuccess(addressBean);
                            }
                        })
        );
    }
}
