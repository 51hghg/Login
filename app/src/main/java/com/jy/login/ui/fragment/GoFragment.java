package com.jy.login.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

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
import com.jy.login.ui.adapter.FragTabAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import q.rorbin.verticaltablayout.VerticalTabLayout;

public class GoFragment extends BaseFragment<ShopPersenter> implements IShop.View {

    @BindView(R.id.tab)
    VerticalTabLayout tab;
    @BindView(R.id.vp)
    ViewPager vp;

    @Override
    public int getLatout() {
        return R.layout.fragment_go;
    }

    @Override
    public void initView() {

    }

    @Override
    public ShopPersenter createPresenter() {
        return new ShopPersenter(this);
    }

    @Override
    public void initData() {
        presenter.gettab();
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
        final ArrayList<String> tabName = new ArrayList<>();
        final ArrayList<Fragment> fragments = new ArrayList<>();
        List<TabBean.DataBean.CateListBean> categoryList = tabBean.getData().getCate_list();

        for (int i = 0; i < categoryList.size(); i++) {
            CategoryTabFragment categoryTabFragment = new CategoryTabFragment();
            Bundle bundle = new Bundle();
            bundle.putString("id", categoryList.get(i).getId());
            categoryTabFragment.setArguments(bundle);
            fragments.add(categoryTabFragment);
            tabName.add(categoryList.get(i).getName());
        }
        FragTabAdapter fragTabAdapter = new FragTabAdapter(getChildFragmentManager(), fragments,
                tabName);
        vp.setAdapter(fragTabAdapter);
        tab.setupWithViewPager(vp);
    }

    @Override
    public void getshop(ShopBean shopBean) {

    }

    @Override
    public void gethong(HongBean hongBean) {

    }

    @Override
    public void getTabDetaile(TabDetailBean tabDetailBean) {

    }
}