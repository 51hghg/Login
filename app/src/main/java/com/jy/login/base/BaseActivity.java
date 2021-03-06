package com.jy.login.base;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.jy.login.interfaces.IBaseView;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * activity基类
 *
 * @param <P>
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView {
    //p层关联
    protected P presenter;
    private Unbinder unbinder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //需要界面view
        int layout = getLayout();
        if (layout > 0) {
            setContentView(getLayout());
        } else {
            new RuntimeException("layout id not allow 0 or <0");
        }

        unbinder = ButterKnife.bind(this);
        //初始化界面
        initView();
        presenter = createPersenter();
        if (presenter != null) {
            presenter.attachView(this);
        }
        //初始化界面数据
        initData();
    }

    @Override
    public void tips(String tip) {

    }

    @Override
    public void loading(int visible) {

    }

    //定义一个获取当前界面的方法  由子类提供的
    protected abstract int getLayout();

    //初始化界面
    protected abstract void initView();

    //初始化p层的方法
    protected abstract P createPersenter();

    //初始化界面数据
    protected abstract void initData();

    /**
     * 界面销毁
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (unbinder != null) {
            unbinder.unbind();
        }
        //释放p关联的v的引用
        if (presenter != null) {
            presenter.unArrachView();
        }
    }
}
