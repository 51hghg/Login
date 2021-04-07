package com.jy.login.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.jy.login.MainActivity;
import com.jy.login.R;
import com.jy.login.ui.adapter.MyPagerAdapter;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ViewpagerActivity extends AppCompatActivity {

    @BindView(R.id.viewpager)
    ViewPager viewpager;
    int[] arr = {R.mipmap.viewpage1, R.mipmap.viewpage2, R.mipmap.viewpage3};
    //是否使用特殊的标题栏背景颜色，android5.0以上可以设置状态栏背景色，如果不使用则使用透明色值
    protected boolean useThemestatusBarColor = false;
    //是否使用状态栏文字和图标为暗色，如果状态栏采用了白色系，则需要使状态栏和图标为暗色，android6.0以上可以设置
    protected boolean useStatusBarColor = true;
    @BindView(R.id.btn_start)
    Button btnStart;
    @BindView(R.id.dot_layout)
    LinearLayout dotLayout;
    @BindView(R.id.rl)
    RelativeLayout rl;
    private MyPagerAdapter myPagerAdapter;
    private ImageView red_Iv;
    private ArrayList<View> list;
    private int left;
    boolean isFirstIn = false;
    private Intent intent;
    private SharedPreferences.Editor edit;

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final SharedPreferences sharedPreferences = getSharedPreferences("is_first_in_data", Context.MODE_PRIVATE);
        edit = sharedPreferences.edit();
        isFirstIn = sharedPreferences.getBoolean("isFirstIn", true);
        new Handler().post(new Runnable() {
            @Override
            public void run() {
                if (isFirstIn) {
                    //之前错误没有这两句，没有设置Boolean类型，并提交
                    edit.putBoolean("isFirstIn", false);
                    edit.commit();
                } else {
                    intent = new Intent(ViewpagerActivity.this, TimeActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
        setContentView(R.layout.activity_viewpager);
        ButterKnife.bind(this);
        setStatusBar();
        list=new ArrayList<>();
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewpagerActivity.this, TimeActivity.class));
                finish();
            }
        });
        final View inflate1 = LayoutInflater.from(this).inflate(R.layout.item1, null);
        final View inflate2 = LayoutInflater.from(this).inflate(R.layout.item2, null);
        final View inflate3 = LayoutInflater.from(this).inflate(R.layout.item3, null);
        final ImageView viewById1 = inflate1.findViewById(R.id.img_a);
        final ImageView viewById2 = inflate2.findViewById(R.id.img_b);
        final ImageView viewById3 = inflate3.findViewById(R.id.img_c);
        Glide.with(this).load(R.mipmap.s1).into(viewById1);
        Glide.with(this).load(R.mipmap.s2).into(viewById2);
        Glide.with(this).load(R.mipmap.viewpage3).into(viewById3);
        list.add(inflate1);
        list.add(inflate2);
        list.add(inflate3);

        myPagerAdapter = new MyPagerAdapter(this, list);
        this.viewpager.setAdapter(myPagerAdapter);
        this.viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {
                if (i == 2) {
                    btnStart.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });


        //                加入滑动小圆点
        for (int i = 0; i < 3; i++) {
            ImageView gray_Iv = new ImageView(this);
            gray_Iv.setImageResource(R.drawable.splace_red_circle);
            //使用LayoutParams改变控件的位置
            LinearLayout.LayoutParams layoutParams =
                    new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,
                            LinearLayout.LayoutParams.WRAP_CONTENT);
            if (i > 0) {
                layoutParams.leftMargin = 50;
            }
            gray_Iv.setLayoutParams(layoutParams);
            dotLayout.addView(gray_Iv);
        }


        red_Iv = new ImageView(this);
        red_Iv.setImageResource(R.drawable.splace_yellow_circle);
        rl.addView(red_Iv);
//                示图树
        red_Iv.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                left = dotLayout.getChildAt(1).getLeft() - dotLayout.getChildAt(0).getLeft();
                red_Iv.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });

        viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            //滑动的时候
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                //滑动的百分比  positionOffset
                RelativeLayout.LayoutParams layoutParams =
                        (RelativeLayout.LayoutParams) red_Iv.getLayoutParams();
                layoutParams.leftMargin = (int) (left * positionOffset + position * left);
                red_Iv.setLayoutParams(layoutParams);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    public void one(){

    }
}