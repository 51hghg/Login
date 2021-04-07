package com.jy.login.ui.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.jy.login.R;
import com.jy.login.base.BaseActivity;
import com.jy.login.interfaces.car.ICar;
import com.jy.login.model.bean.CarBean;
import com.jy.login.model.bean.DingdanBean;
import com.jy.login.persenter.CarPersenter;
import com.jy.login.ui.fragment.DaipingjiaFragment;
import com.jy.login.ui.fragment.DaishouhuoFragment;
import com.jy.login.ui.fragment.MeDingChildFragment;
import com.jy.login.ui.fragment.SubFragment;
import com.jy.login.ui.fragment.TuikuanFragment;
import com.jy.login.utils.SpUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MedingdanActivity extends BaseActivity<CarPersenter> implements ICar.View {


    @BindView(R.id.fan)
    ImageView fan;
    @BindView(R.id.tablayout)
    TabLayout tablayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;

    @Override
    protected int getLayout() {
        return R.layout.activity_medingdan;
    }

    @Override
    protected void initView() {
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new MeDingChildFragment());
        fragments.add(new DaishouhuoFragment());
        fragments.add(new DaipingjiaFragment());
        fragments.add(new TuikuanFragment());

        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });

        tablayout.setupWithViewPager(viewpager);


        tablayout.getTabAt(0).setText("待付款");
        tablayout.getTabAt(1).setText("待收货");
        tablayout.getTabAt(2).setText("待评价");
        tablayout.getTabAt(3).setText("退款/退货");


        final TextView inflate = (TextView) LayoutInflater.from(this).inflate(R.layout.main_top_item, null);
        inflate.setTextColor(ContextCompat.getColor(this, R.color.colorPrimary));
        inflate.setTextSize(20);
//        inflate.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//加粗
        inflate.setText(tablayout.getTabAt(0).getText());
        tablayout.getTabAt(0).setCustomView(inflate).select();
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                final TextView inflate = (TextView) LayoutInflater.from(MedingdanActivity.this).inflate(R.layout.main_top_item, null);
                inflate.setTextColor(ContextCompat.getColor(MedingdanActivity.this, R.color.colorPrimary));
                inflate.setTextSize(20);
                inflate.setText(tab.getText());
                inflate.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//加粗
                tab.setCustomView(inflate);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.setCustomView(null);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    protected CarPersenter createPersenter() {
        return new CarPersenter(this);
    }

    @Override
    protected void initData() {
        presenter.getdingdan("2", SpUtils.getInstance().getString("Token"));
    }

    @Override
    public void getCar(CarBean carBean) {

    }

    @Override
    public void getdingdan(DingdanBean dingdanBean) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}