package com.jy.login.ui.fragment;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.jy.login.R;
import com.jy.login.base.BaseFragment;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.TabDetailBean;
import com.jy.login.persenter.ShopPersenter;
import com.jy.login.ui.adapter.GoodsChildAdapter;

import java.util.ArrayList;

import butterknife.BindView;

public class SubFragment extends BaseFragment<ShopPersenter> implements IShop.View {
    @BindView(R.id.recycler)
    RecyclerView recycler;
    private String id="23";
    private ArrayList<TabDetailBean.DataBean.YRinitlistBean.ContentBean.NavListBean> goodslist;
    private GoodsChildAdapter goodsChildAdapter;

    public SubFragment(String id) {
        this.id = id;
    }


    @Override
    public int getLatout() {
        return R.layout.fragment_sub;
    }

    @Override
    public void initView() {
        goodslist = new ArrayList<>();
        recycler.setLayoutManager(new StaggeredGridLayoutManager(4, StaggeredGridLayoutManager.VERTICAL));
        goodsChildAdapter = new GoodsChildAdapter(goodslist, getActivity());
        recycler.setAdapter(goodsChildAdapter);
    }

    @Override
    public ShopPersenter createPresenter() {
        return new ShopPersenter(this);
    }

    @Override
    public void initData() {
        presenter.getTabDetaile(id);
    }

    @Override
    public void getbanner(BannerBean bannerBean) {

    }

    @Override
    public void getgoods(GoodsBean goodsBean) {

    }

    @Override
    public void getgood(GoodBean goodBean) {

    }

    @Override
    public void gettab(TabBean tabBean) {

    }

    @Override
    public void getshop(ShopBean shopBean) {

    }

    @Override
    public void gethong(HongBean hongBean) {

    }

    @Override
    public void getTabDetaile(TabDetailBean tabDetailBean) {
        goodslist.addAll(tabDetailBean.getData().getYRinitlist().get(0).getContent().getNav_list());
        goodsChildAdapter.notifyDataSetChanged();
    }
}