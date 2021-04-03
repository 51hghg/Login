package com.jy.login.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
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

import com.bumptech.glide.Glide;
import com.jy.login.R;
import com.jy.login.base.BaseActivity;
import com.jy.login.base.BasePresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DingActivity extends BaseActivity {

    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.price)
    TextView price;
    @BindView(R.id.old_price)
    TextView oldPrice;
    @BindView(R.id.size_1)
    TextView size1;
    @BindView(R.id.size)
    TextView size;
    @BindView(R.id.price_ok)
    TextView priceOk;
    @BindView(R.id.size_2)
    TextView size2;
    @BindView(R.id.price_ook)
    TextView priceOok;
    //是否使用特殊的标题栏背景颜色，android5.0以上可以设置状态栏背景色，如果不使用则使用透明色值
    protected boolean useThemestatusBarColor = false;
    //是否使用状态栏文字和图标为暗色，如果状态栏采用了白色系，则需要使状态栏和图标为暗色，android6.0以上可以设置
    protected boolean useStatusBarColor = true;
    @BindView(R.id.btn_true)
    Button btnTrue;
    @BindView(R.id.con_Main)
    ConstraintLayout conMain;

    @Override
    protected int getLayout() {
        setStatusBar();
        return R.layout.activity_ding;
    }

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
    protected void initView() {
        Intent intent = getIntent();
        String imgbig = intent.getStringExtra("img");
        String namebig = intent.getStringExtra("name");
        String pricebig = intent.getStringExtra("price");
        String old = intent.getStringExtra("old");
        int sizebig = intent.getIntExtra("size", 0);

        Glide.with(this).load(imgbig).into(img);
        name.setText(namebig);
        price.setText(pricebig);
        priceOk.setText(pricebig);
        priceOok.setText(pricebig);
        oldPrice.setText(old);
        oldPrice.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);
//        size1.setText(sizebig);
//        size2.setText(sizebig);
//        size.setText(sizebig);


        btnTrue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setPop();
            }
        });
    }

    public void setPop() {
        View root = LayoutInflater.from(this).inflate(R.layout.ding_pop, null);
        final PopupWindow popupWindow = new PopupWindow(root, LinearLayout.LayoutParams.MATCH_PARENT, 900);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        final TextView text_Cancel = root.findViewById(R.id.text_cancel);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setOutsideTouchable(true);

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

        text_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

    }

    @Override
    protected BasePresenter createPersenter() {
        return null;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}