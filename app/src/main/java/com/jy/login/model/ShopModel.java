package com.jy.login.model;

import com.jy.login.base.BaseModel;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.TabDetailBean;
import com.jy.login.net.CommonSubscriber;
import com.jy.login.net.HttpManager;
import com.jy.login.utils.RxUtils;

public class ShopModel extends BaseModel implements IShop.Model {
    @Override
    public void getbanner(CallBack callBack) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getbanner()
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<BannerBean>(callBack) {
                            @Override
                            public void onNext(BannerBean bannerBean) {
                                callBack.onSuccess(bannerBean);
                            }
                        })
        );
    }

    @Override
    public void getgoods(CallBack callBack) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getgoods()
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<GoodsBean>(callBack) {
                            @Override
                            public void onNext(GoodsBean goodsBean) {
                                callBack.onSuccess(goodsBean);
                            }
                        })
        );
    }

    @Override
    public void getgood(CallBack callBack) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getgood()
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<GoodBean>(callBack) {
                            @Override
                            public void onNext(GoodBean goodBean) {
                                callBack.onSuccess(goodBean);
                            }
                        })
        );
    }

    @Override
    public void gettab(CallBack callBack) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().gettab()
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<TabBean>(callBack) {
                            @Override
                            public void onNext(TabBean tabBean) {
                                callBack.onSuccess(tabBean);
                            }
                        })
        );
    }

    @Override
    public void getshop(CallBack callBack, String id) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getshop(id)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<ShopBean>(callBack) {
                            @Override
                            public void onNext(ShopBean shopBean) {
                                callBack.onSuccess(shopBean);
                            }
                        })
        );
    }

    @Override
    public void gethong(CallBack callBack, String id) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().gethong(id)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<HongBean>(callBack) {
                            @Override
                            public void onNext(HongBean hongBean) {
                                callBack.onSuccess(hongBean);
                            }
                        })
        );
    }

    @Override
    public void getTabDetaile(String id, CallBack callBack) {
        addDisposable(HttpManager.getHttpManager().getShopApi().getTabDetail(id)
                .compose(RxUtils.rxScheduler())
                .subscribeWith(new CommonSubscriber<TabDetailBean>(callBack) {
                    @Override
                    public void onNext(TabDetailBean tabDetailBean) {
                        callBack.onSuccess(tabDetailBean);
                    }
                }));
    }
}
