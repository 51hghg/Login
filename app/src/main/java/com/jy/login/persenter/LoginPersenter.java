package com.jy.login.persenter;

import com.jy.login.base.BasePresenter;
import com.jy.login.interfaces.CallBack;
import com.jy.login.interfaces.login.ILogin;
import com.jy.login.model.LoginModel;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.LoginBean;
import com.jy.login.model.bean.MeBean;

public class LoginPersenter extends BasePresenter<ILogin.View> implements ILogin.Persenter {
    ILogin.Model model;
    ILogin.View view;

    public LoginPersenter(ILogin.View view) {
        this.view = view;
        model = new LoginModel();
    }

    @Override
    public void getlogin(String username, String pw) {
        model.getlogin(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getlogin((LoginBean) o);
                }
            }
        }, username, pw);
    }

    @Override
    public void getme(String token) {
        model.getme(new CallBack() {
            @Override
            public void onFaile(String msg) {
                if (view != null) {
                    view.tips(msg);
                }
            }

            @Override
            public void onSuccess(Object o) {
                if (view != null) {
                    view.getme((MeBean) o);
                }
            }
        }, token);
    }
}
