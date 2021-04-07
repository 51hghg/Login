package com.jy.login;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.jy.login.ui.fragment.GoFragment;
import com.jy.login.ui.fragment.LiveFragment;
import com.jy.login.ui.fragment.MeFragment;
import com.jy.login.ui.fragment.ShopFragment;
import com.jy.login.ui.fragment.VideoFragment;
import com.jy.login.utils.SpUtils;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewpager;
    private TabLayout mTablayout;
    //是否使用特殊的标题栏背景颜色，android5.0以上可以设置状态栏背景色，如果不使用则使用透明色值
    protected boolean useThemestatusBarColor = false;
    //是否使用状态栏文字和图标为暗色，如果状态栏采用了白色系，则需要使状态栏和图标为暗色，android6.0以上可以设置
    protected boolean useStatusBarColor = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setStatusBar();

        initView();
    }

    private void initView() {
        // 初始化控件对象
//        Button mBtMainLogout = findViewById(R.id.bt_main_logout);
        // 绑定点击监听器
//        mBtMainLogout.setOnClickListener(this);

//        if(SpUtils.getInstance()!=null&&SpUtils.getInstance().getString("Token")==null){
//            startActivity(new Intent(this,loginActivity.class));
//        }
        String fan = getIntent().getStringExtra("fan");

        mViewpager = (ViewPager) findViewById(R.id.viewpager);
        mTablayout = (TabLayout) findViewById(R.id.tablayout);

        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new ShopFragment());
        fragments.add(new GoFragment());
        fragments.add(new LiveFragment());
        fragments.add(new MeFragment());

        mViewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
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

        mTablayout.setupWithViewPager(mViewpager);

        mTablayout.setTabTextColors(Color.parseColor("#000000"),Color.parseColor("#FFEB3B"));

        mTablayout.getTabAt(0).setText("首页").setIcon(R.drawable.selecter);
        mTablayout.getTabAt(1).setText("同城配送").setIcon(R.drawable.selecter1);
        mTablayout.getTabAt(2).setText("教你做").setIcon(R.drawable.selecter2);
        mTablayout.getTabAt(3).setText("我的").setIcon(R.drawable.selecter3);
        if(fan!=null&&fan.equals("10")){
            mTablayout.getTabAt(0).isSelected();
        }
//        mViewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                if(position==1||position==2){
//                    setPop();
//                }
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });
    }
    public void setPop(){
        View root = LayoutInflater.from(this).inflate(R.layout.item_pop, null);
        final PopupWindow popupWindow = new PopupWindow(root, 600, 300);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        Button btn_ok = root.findViewById(R.id.btn_ok);
        Button btn_no = root.findViewById(R.id.btn_no);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        btn_no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });

        // 产生背景变暗效果
        WindowManager.LayoutParams lp = getWindow()
                .getAttributes();
        lp.alpha = 0.4f;
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        getWindow().setAttributes(lp);
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

        popupWindow.showAtLocation(mViewpager, Gravity.CENTER, 0, 0);
    }

//    public void onClick(View view) {
//        if (view.getId() == R.id.bt_main_logout) {
//            Intent intent = new Intent(this,loginActivity.class);
//            startActivity(intent);
//            finish();
//        }
//    }

    //声明一个long类型变量：用于存放上一点击“返回键”的时刻
    private long mExitTime;
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        //判断用户是否点击了“返回键”
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            //与上次点击返回键时刻作差
            if ((System.currentTimeMillis() - mExitTime) > 2000) {
                //大于2000ms则认为是误操作，使用Toast进行提示
                Toast.makeText(this, "再按一次退出程序", Toast.LENGTH_SHORT).show();
                //并记录下本次点击“返回键”的时刻，以便下次进行判断
                mExitTime = System.currentTimeMillis();
            } else {
                //小于2000ms则认为是用户确实希望退出程序-调用System.exit()方法进行退出
                System.exit(0);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
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


}