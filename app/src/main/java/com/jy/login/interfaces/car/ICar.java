package com.jy.login.interfaces.car;

import com.jy.login.base.BaseModel;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.IBasePresenter;
import com.jy.login.interfaces.IBaseView;
import com.jy.login.interfaces.IModel;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.bean.CarBean;
import com.jy.login.model.bean.DingdanBean;

import java.util.Map;

public interface ICar {
    interface View extends IBaseView {
        void getCar(CarBean carBean);

        void getdingdan(DingdanBean dingdanBean);
    }

    interface Persenter extends IBasePresenter<View> {
        void getCar(Map<String, String> map);

        void getdingdan(String type,String token);
    }

    interface Model extends IModel {
        void getCar(CallBack callBack, Map<String, String> map);

        void getdingdan(CallBack callBack, String type,String token);
    }
}
