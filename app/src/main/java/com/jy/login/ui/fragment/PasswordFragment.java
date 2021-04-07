package com.jy.login.ui.fragment;

import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.jy.login.MainActivity;
import com.jy.login.R;
import com.jy.login.base.BaseFragment;
import com.jy.login.interfaces.login.ILogin;
import com.jy.login.model.bean.LoginBean;
import com.jy.login.model.bean.MeBean;
import com.jy.login.persenter.LoginPersenter;
import com.jy.login.utils.LoadingDailog;
import com.jy.login.utils.SpUtils;
import com.jy.login.utils.TxtUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class PasswordFragment extends BaseFragment<LoginPersenter> implements ILogin.View {


    @BindView(R.id.et_username)
    EditText etUsername;
    @BindView(R.id.et_password)
    EditText etPassword;
    @BindView(R.id.bt_login)
    Button btLogin;
    @BindView(R.id.tv_forget)
    TextView tvForget;
    @BindView(R.id.tv_register)
    TextView tvRegister;
    @BindView(R.id.tv_loginactivity_else)
    TextView tvLoginactivityElse;
    private String name;
    private String password;
    private LoadingDailog.Builder loadBuilder;
    private LoadingDailog loadingDailog;

    @Override
    public int getLatout() {
        return R.layout.fragment_password;
    }

    @Override
    public void initView() {
        loadBuilder = new LoadingDailog.Builder(getActivity())
                .setMessage("加载中...")
                .setCancelable(true)
                .setCancelOutside(true);
    }

    @Override
    public LoginPersenter createPresenter() {
        return new LoginPersenter(this);
    }

    @Override
    public void initData() {

    }

    @OnClick(R.id.bt_login)
    public void onViewClicked() {
        loadingDailog = loadBuilder.create();
        loadingDailog.show();
        name = etUsername.getText().toString();
        password = etPassword.getText().toString();
        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(password)) {
            presenter.getlogin(name, password);
        } else {
            Toast.makeText(getActivity(), "请输入你的用户名或密码", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void getlogin(LoginBean loginBean) {
        if (loginBean.getMsg().equals("请求成功！")) {
            loadingDailog.dismiss();
            SpUtils.getInstance().setValue("Token", loginBean.getData().getKey());
            Toast.makeText(getActivity(), "登录成功", Toast.LENGTH_SHORT).show();
            Log.d("TAG", "initView: " + SpUtils.getInstance().getString("Token"));
            startActivity(new Intent(getActivity(), MainActivity.class));
            loadingDailog.dismiss();
        }else{
            Toast.makeText(getActivity(), "账号或密码错误", Toast.LENGTH_SHORT).show();
            loadingDailog.dismiss();
        }
    }

    @Override
    public void getme(MeBean meBean) {

    }
}