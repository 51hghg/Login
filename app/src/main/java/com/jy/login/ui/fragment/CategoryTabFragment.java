package com.jy.login.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jy.login.R;
import com.jy.login.base.BaseFragment;
import com.jy.login.interfaces.address.IAddress;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.ViewPagerBean;
import com.jy.login.persenter.AddressPersenter;
import com.jy.login.ui.adapter.CurrentAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class CategoryTabFragment extends BaseFragment<AddressPersenter> implements IAddress.View {

    @BindView(R.id.recy_tab)
    RecyclerView recyTab;
    private ArrayList<ViewPagerBean.DataBean> currentlist;
    private CurrentAdapter currentAdapter;
    private String pid;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pid = getArguments().getString("id");
    }

    @Override
    public int getLatout() {
        return R.layout.fragment_category_tab;
    }

    @Override
    public void initView() {
        currentlist = new ArrayList<>();

        recyTab.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        currentAdapter = new CurrentAdapter(currentlist, getActivity());
        recyTab.setAdapter(currentAdapter);
    }

    @Override
    public AddressPersenter createPresenter() {
        return new AddressPersenter(this);
    }

    @Override
    public void initData() {
        presenter.getviewpager(pid);
    }

    @Override
    public void getaddress(AddressBean addressBean) {

    }

    @Override
    public void getviewpager(ViewPagerBean viewPagerBean) {
        if (viewPagerBean.getData() != null) {
            initViewpager(viewPagerBean.getData());
        }
    }

    private void initViewpager(List<ViewPagerBean.DataBean> list) {
        currentlist.addAll(list);
        currentAdapter.notifyDataSetChanged();
    }
}