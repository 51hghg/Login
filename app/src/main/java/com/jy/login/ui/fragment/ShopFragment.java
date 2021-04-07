package com.jy.login.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.google.android.material.tabs.TabLayout;
import com.jy.login.R;
import com.jy.login.base.BaseFragment;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.loginActivity;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.TabDetailBean;
import com.jy.login.persenter.ShopPersenter;
import com.jy.login.ui.activity.ShopActivity;
import com.jy.login.ui.adapter.GoodsAdapter;
import com.jy.login.utils.LoadingDailog;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class ShopFragment extends BaseFragment<ShopPersenter> implements IShop.View {

    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.tablayout)
    TabLayout tablayout;
    @BindView(R.id.viewpager)
    ViewPager viewpager;
    @BindView(R.id.recygoods)
    RecyclerView recygoods;

    private LoadingDailog loadingDailog;
    //    private ArrayList<GoodsBean.DataBean.YRinitlistBean._$10Bean.ContentBean.GoodslistBean> goodslist;
    private GoodsAdapter goodsAdapter;
    private ArrayList<GoodBean.DataBean.GoodsListBean> goodlist;
    private LoadingDailog.Builder builder;

    @Override
    public int getLatout() {
        return R.layout.fragment_shop;
    }

    @Override
    public void initView() {
        builder= new LoadingDailog.Builder(getActivity())
                .setMessage("加载中...")
                .setCancelable(true)
                .setCancelOutside(true);
//        goodslist = new ArrayList<>();
        goodlist = new ArrayList<>();

        recygoods.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        goodsAdapter = new GoodsAdapter(goodlist, getActivity());
        recygoods.setAdapter(goodsAdapter);

        goodsAdapter.setOnItemClickListener(new GoodsAdapter.OnItemClickListener() {


            @Override
            public void onClick(int pos) {
                loadingDailog = builder.create();
                loadingDailog.show();
                Intent intent = new Intent(getActivity(), ShopActivity.class);
                intent.putExtra("id", goodlist.get(pos).getId());
                getActivity().startActivity(intent);
                loadingDailog.dismiss();
            }
        });


    }

    @Override
    public ShopPersenter createPresenter() {
        return new ShopPersenter(this);
    }

    @Override
    public void initData() {
        presenter.getbanner();
//        presenter.getgoods();
        presenter.gettab();
        presenter.getgood();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void getbanner(BannerBean bannerBean) {
        if (bannerBean.getData() != null) {
            initBanner(bannerBean.getData().getYRinitlist().get(0).getContent().getNav_list());
        }
    }

    @Override
    public void getgoods(GoodsBean goodsBean) {
//        if (goodsBean.getData() != null) {
//            initGoods(goodsBean.getData().getYRinitlist().get_$10().getContent().getGoodslist());
//        }
    }

    @Override
    public void getgood(GoodBean goodBean) {
        initGood(goodBean.getData().getGoods_list());
    }

    private void initGood(List<GoodBean.DataBean.GoodsListBean> list) {
        goodlist.addAll(list);
        goodsAdapter.notifyDataSetChanged();
    }

    @Override
    public void gettab(TabBean tabBean) {
        List<TabBean.DataBean.DrageListBean> list = tabBean.getData().getDrage_list();
        List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            final String id = list.get(i).getId();
            SubFragment subFragment = new SubFragment(id);
            fragments.add(subFragment);
        }

        viewpager.setAdapter(new FragmentPagerAdapter(getChildFragmentManager()) {
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

        for (int i = 0; i < list.size(); i++) {
            tablayout.getTabAt(i).setText(list.get(i).getName());
        }

        final TextView inflate = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.main_top_item, null);
        inflate.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorPrimary));
        inflate.setTextSize(20);
        inflate.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//加粗
        inflate.setText(tablayout.getTabAt(0).getText());
        tablayout.getTabAt(0).setCustomView(inflate).select();
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                final TextView inflate = (TextView) LayoutInflater.from(getActivity()).inflate(R.layout.main_top_item, null);
                inflate.setTextColor(ContextCompat.getColor(getActivity(), R.color.colorPrimary));
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
    public void getshop(ShopBean shopBean) {

    }

    @Override
    public void gethong(HongBean hongBean) {

    }

    @Override
    public void getTabDetaile(TabDetailBean tabDetailBean) {

    }

//    private void initGoods(List<GoodsBean.DataBean.YRinitlistBean._$10Bean.ContentBean.GoodslistBean> list) {
//        goodslist.addAll(list);
//        goodsAdapter.notifyDataSetChanged();
//    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void initBanner(List<BannerBean.DataBean.YRinitlistBean.ContentBean.NavListBean> list) {
        banner.setImages(list).setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                BannerBean.DataBean.YRinitlistBean.ContentBean.NavListBean bean = (BannerBean.DataBean.YRinitlistBean.ContentBean.NavListBean) path;
                Glide.with(context).load(bean.getImg()).into(imageView);
            }
        }).start();

        banner.setOutlineProvider(new ViewOutlineProvider() {
            @Override
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 30);
            }
        });

        banner.setClipToOutline(true);
    }
}