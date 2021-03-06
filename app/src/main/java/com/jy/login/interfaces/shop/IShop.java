package com.jy.login.interfaces.shop;

import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.IBasePresenter;
import com.jy.login.interfaces.IBaseView;
import com.jy.login.interfaces.IModel;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.TabDetailBean;

public interface IShop {
    interface View extends IBaseView {
        //定义一个被推荐页实现的View层接口方法
        void getbanner(BannerBean bannerBean);
        void getgoods(GoodsBean goodsBean);
        void getgood(GoodBean goodBean);
        void gettab(TabBean tabBean);
        void getshop(ShopBean shopBean);
        void gethong(HongBean hongBean);
        void getTabDetaile(TabDetailBean tabDetailBean);
    }

    interface Persenter extends IBasePresenter<View> {
        //定义一个首页推荐页面V层调用的接口
        void getbanner();
        void getgoods();
        void getgood();
        void gettab();
        void getshop(String id);
        void gethong(String id);
        void getTabDetaile(String id);
    }

    interface Model extends IModel {
        //定义一个加载推荐数据的接口方法 被P层
        void getbanner(CallBack callBack);
        void getgoods(CallBack callBack);
        void getgood(CallBack callBack);
        void gettab(CallBack callBack);
        void getshop(CallBack callBack,String id);
        void gethong(CallBack callBack,String id);
        void getTabDetaile(String  id, CallBack callBack);
    }
}
