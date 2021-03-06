package com.jy.login.persenter;

import com.jy.login.base.BasePresenter;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.ShopModel;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.TabDetailBean;

public class ShopPersenter extends BasePresenter<IShop.View> implements IShop.Persenter {

    IShop.Model model;
    IShop.View view;

    public ShopPersenter(IShop.View view) {
        this.view = view;
        model = new ShopModel();
    }

    @Override
    public void getbanner() {

        model.getbanner(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getbanner((BannerBean) o);
                }
            }
        });
    }

    @Override
    public void getgoods() {
        model.getgoods(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getgoods((GoodsBean) o);
                }
            }
        });
    }

    @Override
    public void getgood() {
        model.getgood(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getgood((GoodBean) o);
                }
            }
        });
    }

    @Override
    public void gettab() {
        model.gettab(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view!=null){
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view!=null){
                    view.gettab((TabBean) o);
                }
            }
        });
    }

    @Override
    public void getshop(String id) {
        model.getshop(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view!=null){
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view!=null){
                    view.getshop((ShopBean) o);
                }
            }
        },id);
    }

    @Override
    public void gethong(String id) {
        model.gethong(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view!=null){
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view!=null){
                    view.gethong((HongBean) o);
                }
            }
        },id);
    }

    @Override
    public void getTabDetaile(String  id) {
        model.getTabDetaile(id, new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view!=null){
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getTabDetaile((TabDetailBean) o);
                }
            }
        });
    }
}
