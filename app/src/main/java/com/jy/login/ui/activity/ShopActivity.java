package com.jy.login.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jy.login.R;
import com.jy.login.base.BaseActivity;
import com.jy.login.interfaces.shop.IShop;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.TabDetailBean;
import com.jy.login.persenter.ShopPersenter;
import com.jy.login.ui.adapter.BigAdapter;
import com.jy.login.ui.adapter.HongAdapter;
import com.jy.login.widget.NumberSelect;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShopActivity extends BaseActivity<ShopPersenter> implements IShop.View {

    @BindView(R.id.webView)
    RecyclerView webView;
    @BindView(R.id.banner)
    Banner banner;
    @BindView(R.id.recy_hong)
    RecyclerView recyHong;
    //是否使用特殊的标题栏背景颜色，android5.0以上可以设置状态栏背景色，如果不使用则使用透明色值
    protected boolean useThemestatusBarColor = false;
    //是否使用状态栏文字和图标为暗色，如果状态栏采用了白色系，则需要使状态栏和图标为暗色，android6.0以上可以设置
    protected boolean useStatusBarColor = true;
    @BindView(R.id.btn_shop)
    Button btnShop;
    @BindView(R.id.con_main)
    ConstraintLayout conMain;
    int numberBuy = 0;
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
    private Button btn_shop;

    protected void setStatusBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {//5.0及以上
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            //根据上面设置是否对状态栏单独设置颜色
            if (useThemestatusBarColor) {
                getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));//设置状态栏背景色
            } else {
                getWindow().setStatusBarColor(Color.TRANSPARENT);//透明
            }
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {//4.4到5.0
            WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
            localLayoutParams.flags = (WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS | localLayoutParams.flags);
        } else {
            Toast.makeText(this, "低于4.4的android系统版本不存在沉浸式状态栏", Toast.LENGTH_SHORT).show();
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M && useStatusBarColor) {//android6.0以后可以对状态栏文字颜色和图标进行修改
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }

    @Override
    protected int getLayout() {
        setStatusBar();
        return R.layout.activity_shop;

    }

    @Override
    protected void initView() {
        goodslist = new ArrayList<>();

        recyHong.setLayoutManager(new LinearLayoutManager(this));
        hongAdapter = new HongAdapter(goodslist, this);
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
    public void getgood(GoodBean goodBean) {

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

    @Override
    public void getTabDetaile(TabDetailBean tabDetailBean) {

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

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false) {
//            @Override
//            public boolean canScrollVertically() {
//                return false;
//            }
//        };

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

    @OnClick(R.id.btn_shop)
    public void onViewClicked() {
        setPop();
    }

    public void setPop() {

        View root = LayoutInflater.from(this).inflate(R.layout.shop_pop, null);
        final PopupWindow popupWindow = new PopupWindow(root, LinearLayout.LayoutParams.MATCH_PARENT, 1500);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setOutsideTouchable(true);
        final ImageView image_Close = root.findViewById(R.id.img_close);
        final ImageView image_pop = root.findViewById(R.id.pop_header);
        NumberSelect numberSelect = root.findViewById(R.id.layout_change);
        btn_shop = root.findViewById(R.id.btn_true_shop);
        numberSelect.addPage(R.layout.layout_number_change);
        TextView text_Price = root.findViewById(R.id.text_price);
        if (goodslist.get(0).getImg() != null && goodslist.get(0).getShop_price() != null) {
            Glide.with(this).load(goodslist.get(0).getImg()).into(image_pop);
            text_Price.setText(goodslist.get(0).getShop_price());
        }
        numberSelect.addChangeNumber(new NumberSelect.ChangeNumber() {
            @Override
            public void change(int number) {
                numberBuy = number;
            }
        });
        btn_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numberBuy < 1) {
                    Toast.makeText(ShopActivity.this, "请选择商品数量", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(ShopActivity.this, DingActivity.class);
                    intent.putExtra("size", numberBuy);
                    intent.putExtra("name", goodslist.get(0).getGoods_name());
                    intent.putExtra("price", goodslist.get(0).getMarket_price_format());
                    intent.putExtra("old", goodslist.get(0).getMin_price_format());
                    intent.putExtra("img", goodslist.get(0).getImg());
                    startActivity(intent);
                    popupWindow.dismiss();
                }

            }
        });


        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                numberBuy = 0;
            }
        });
        popupWindow.showAtLocation(conMain, Gravity.BOTTOM, 0, 0);
        // 产生背景变暗效果
        WindowManager.LayoutParams lp = this.getWindow()
                .getAttributes();
        lp.alpha = 0.4f;
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        this.getWindow().setAttributes(lp);
        popupWindow.setTouchable(true);
        popupWindow.setFocusable(true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.update();
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {

            // 在dismiss中恢复透明度
            public void onDismiss() {
                WindowManager.LayoutParams lp = getWindow()
                        .getAttributes();
                lp.alpha = 1f;
                getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                getWindow().setAttributes(lp);
            }
        });

        image_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

    }
}