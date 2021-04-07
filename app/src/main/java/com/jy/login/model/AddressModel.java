package com.jy.login.model;

import com.jy.login.base.BaseModel;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.address.IAddress;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.ViewPagerBean;
import com.jy.login.net.CommonSubscriber;
import com.jy.login.net.HttpManager;
import com.jy.login.utils.RxUtils;

public class AddressModel extends BaseModel implements IAddress.Model {

    @Override
    public void getaddress(CallBack callBack, String token) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getaddress(token)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<AddressBean>(callBack) {
                            @Override
                            public void onNext(AddressBean addressBean) {
                                callBack.onSuccess(addressBean);
                            }
                        })
        );
    }

    @Override
    public void getviewpager(CallBack callBack, String pid) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getviewpager(pid)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<ViewPagerBean>(callBack) {
                            @Override
                            public void onNext(ViewPagerBean viewPagerBean) {
                                callBack.onSuccess(viewPagerBean);
                            }
                        })
        );
    }
}
