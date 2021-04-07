package com.jy.login.interfaces.login;

import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.IBasePresenter;
import com.jy.login.interfaces.IBaseView;
import com.jy.login.interfaces.IModel;
import com.jy.login.interfaces.address.IAddress;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.LoginBean;
import com.jy.login.model.bean.MeBean;
import com.jy.login.model.bean.ViewPagerBean;

import java.util.Map;

public interface ILogin {
    interface View extends IBaseView {
        //定义一个被推荐页实现的View层接口方法
        void getlogin(LoginBean loginBean);

        void getme(MeBean meBean);
    }

    interface Persenter extends IBasePresenter<ILogin.View> {
        //定义一个首页推荐页面V层调用的接口
        void getlogin(String username, String pw);

        void getme(String token);
    }

    interface Model extends IModel {
        //定义一个加载推荐数据的接口方法 被P层
        void getlogin(CallBack callBack, String username, String pw);

        void getme(CallBack callBack, String token);
    }
}
