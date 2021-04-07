package com.jy.login.model;

import com.jy.login.base.BaseModel;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.login.ILogin;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.LoginBean;
import com.jy.login.model.bean.MeBean;
import com.jy.login.net.CommonSubscriber;
import com.jy.login.net.HttpManager;
import com.jy.login.utils.RxUtils;

public class LoginModel extends BaseModel implements ILogin.Model {

    @Override
    public void getlogin(CallBack callBack, String username, String pw) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().login(username, pw)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<LoginBean>(callBack) {
                            @Override
                            public void onNext(LoginBean loginBean) {
                                callBack.onSuccess(loginBean);
                            }
                        })
        );
    }

    @Override
    public void getme(CallBack callBack, String token) {
        addDisposable(
                HttpManager.getHttpManager().getShopApi().getMe(token)
                        .compose(RxUtils.rxScheduler())
                        .subscribeWith(new CommonSubscriber<MeBean>(callBack) {
                            @Override
                            public void onNext(MeBean meBean) {
                                callBack.onSuccess(meBean);
                            }
                        })
        );
    }
}
