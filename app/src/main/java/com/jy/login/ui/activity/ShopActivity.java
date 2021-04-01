package com.jy.login.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jy.login.R;
import com.jy.login.base.BaseActivity;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.persenter.ShopPersenter;
import com.jy.login.ui.adapter.BigAdapter;
import com.jy.login.ui.adapter.HongAdapter;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShopActivity extends BaseActivity<ShopPersenter> implements IShop.View {

    @BindView(R.id.webView)
    RecyclerView webView;
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.recy_hong)
    RecyclerView recyHong;
    private String h5 = "<html>\n" +
            "            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\"/>\n" +
            "            <head>\n" +
            "                <style>\n" +
            "                    p{\n" +
            "                        margin:0px;\n" +
            "                    }\n" +
            "                    img{\n" +
            "                        width:100%;\n" +
            "                        height:auto;\n" +
            "                    }\n" +
            "                </style>\n" +
            "            </head>\n" +
            "            <body>\n" +
            "                word\n" +
            "            </body>\n" +
            "        </html>";
    private String id;
    private ArrayList<String> listUrl;
    private BigAdapter bigAdapter;
    private ArrayList<HongBean.GoodsInfoBean> goodslist;
    private HongAdapter hongAdapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_shop;
    }

    @Override
    protected void initView() {
        goodslist = new ArrayList<>();

        recyHong.setLayoutManager(new LinearLayoutManager(this));
        hongAdapter = new HongAdapter(goodslist,this);
        recyHong.setAdapter(hongAdapter);
    }

    @Override
    protected ShopPersenter createPersenter() {
        return new ShopPersenter(this);
    }

    @Override
    protected void initData() {
        id = getIntent().getStringExtra("id");
        presenter.getshop(id);
        presenter.gethong(id);
    }

    @Override
    public void getbanner(BannerBean bannerBean) {

    }

    @Override
    public void getgoods(GoodsBean goodsBean) {

    }

    @Override
    public void gettab(TabBean tabBean) {

    }

    @Override
    public void getshop(ShopBean shopBean) {
        initGood(shopBean.getData());
    }

    @Override
    public void gethong(HongBean hongBean) {
        initHong(hongBean.getGoods_info());
        initBanner(hongBean.getGoods_info().getGoods_imgs());
    }

    private void initBanner(List<HongBean.GoodsInfoBean.GoodsImgsBean> list) {
        banner.setImages(list).setImageLoader(new ImageLoader() {
            @Override
            public void displayImage(Context context, Object path, ImageView imageView) {
                HongBean.GoodsInfoBean.GoodsImgsBean bean = (HongBean.GoodsInfoBean.GoodsImgsBean) path;
                Glide.with(context).load(bean.getGoods_img()).into(imageView);
            }
        }).start();
    }

    private void initHong(HongBean.GoodsInfoBean list) {
        goodslist.add(list);
        hongAdapter.notifyDataSetChanged();
    }

    private void initGood(String webData) {

//        String content = h5.replace("word", webData);
//        Log.i("TAG", content);
//        webView.loadDataWithBaseURL("about:blank", content, "text/html", "utf-8", null);

        listUrl = new ArrayList<>();

        String str = null;

        String[] image = webData.split("http");
        for (int i = 0; i < image.length; i++) {
            String[] url = image[i].split("jpg");
            if (url.length != 0) {
                for (int j = 0; j < url.length - 1; j++) {
                    str = "http" + url[0] + "jpg";
                    //集合里是否包含了元素
                    if (!listUrl.contains(str))
                        listUrl.add(str);
                }
            }
            String[] urls = image[i].split("png");
            if (urls.length != 0) {
                for (int j = 0; j < urls.length - 1; j++) {
                    str = "http" + urls[0] + "png";
                    if (!listUrl.contains(str))
                        listUrl.add(str);
                }
            }
        }

        //大图
        webView.setLayoutManager(new LinearLayoutManager(this));
        bigAdapter = new BigAdapter(listUrl, this);
        webView.setAdapter(bigAdapter);

        bigAdapter.setOnItemClickListener(new BigAdapter.OnItemClickListener() {
            @Override
            public void onClick(int pos) {
                Intent intent = new Intent(ShopActivity.this, BigActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("postion", pos);
                bundle.putStringArrayList("urls", listUrl);
                intent.putExtra("data", bundle);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}