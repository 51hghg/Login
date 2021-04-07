package com.jy.login.ui.fragment;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jy.login.R;
import com.jy.login.base.BaseFragment;
import com.jy.login.interfaces.car.ICar;
import com.jy.login.model.bean.CarBean;
import com.jy.login.model.bean.DingdanBean;
import com.jy.login.persenter.CarPersenter;
import com.jy.login.ui.adapter.MeDingdanAdapter;
import com.jy.login.utils.SpUtils;

import java.util.ArrayList;

import butterknife.BindView;

public class MeDingChildFragment extends BaseFragment<CarPersenter> implements ICar.View {

    @BindView(R.id.recycler)
    RecyclerView recycler;
    private ArrayList<DingdanBean.DataBean> datalist;
    private MeDingdanAdapter meDingdanAdapter;

    @Override
    public int getLatout() {
        return R.layout.fragment_me_ding_child;
    }

    @Override
    public void initView() {
        datalist = new ArrayList<>();

        recycler.setLayoutManager(new LinearLayoutManager(getActivity()));
        meDingdanAdapter = new MeDingdanAdapter(datalist, getActivity());
        recycler.setAdapter(meDingdanAdapter);
    }

    @Override
    public CarPersenter createPresenter() {
        return new CarPersenter(this);
    }

    @Override
    public void initData() {
        presenter.getdingdan("2", SpUtils.getInstance().getString("Token"));
    }

    @Override
    public void getCar(CarBean carBean) {

    }

    @Override
    public void getdingdan(DingdanBean dingdanBean) {

    }
}