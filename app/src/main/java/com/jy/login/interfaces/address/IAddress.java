package com.jy.login.interfaces.address;

import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.IBasePresenter;
import com.jy.login.interfaces.IBaseView;
import com.jy.login.interfaces.IModel;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.TabDetailBean;
import com.jy.login.model.bean.ViewPagerBean;

public interface IAddress {
    interface View extends IBaseView {
        //定义一个被推荐页实现的View层接口方法
        void getaddress(AddressBean addressBean);

        void getviewpager(ViewPagerBean viewPagerBean);
    }

    interface Persenter extends IBasePresenter<View> {
        //定义一个首页推荐页面V层调用的接口
        void getaddress(String token);

        void getviewpager(String pid);
    }

    interface Model extends IModel {
        //定义一个加载推荐数据的接口方法 被P层
        void getaddress(CallBack callBack,String token);

        void getviewpager(CallBack callBack, String pid);
    }
}
