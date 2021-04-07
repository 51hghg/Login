package com.jy.login.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jy.login.R;
import com.jy.login.base.BaseActivity;
import com.jy.login.base.BaseAdapter;
import com.jy.login.interfaces.address.IAddress;
import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.ViewPagerBean;
import com.jy.login.persenter.AddressPersenter;
import com.jy.login.ui.adapter.AddressAdapter;
import com.jy.login.utils.SpUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AddressActivity extends BaseActivity<AddressPersenter> implements IAddress.View {

    @BindView(R.id.recycler_address)
    RecyclerView recyclerAddress;
    @BindView(R.id.fan)
    ImageView fan;
    private ArrayList<AddressBean.DataBean> addresslist;
    private AddressAdapter addressAdapter;
    //是否使用特殊的标题栏背景颜色，android5.0以上可以设置状态栏背景色，如果不使用则使用透明色值
    protected boolean useThemestatusBarColor = false;
    //是否使用状态栏文字和图标为暗色，如果状态栏采用了白色系，则需要使状态栏和图标为暗色，android6.0以上可以设置
    protected boolean useStatusBarColor = true;
    private Intent intent;
    private Intent intent1;

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
        intent = new Intent();
        intent1 = new Intent();
        setStatusBar();
        return R.layout.activity_address;
    }

    @Override
    protected void initView() {
        addresslist = new ArrayList<>();

        recyclerAddress.setLayoutManager(new LinearLayoutManager(this));
        addressAdapter = new AddressAdapter(addresslist, this);
        recyclerAddress.setAdapter(addressAdapter);
        recyclerAddress.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));


        addressAdapter.setiListClick(new BaseAdapter.IListClick() {
            @Override
            public void itemClick(int pos) {

                intent1.putExtra("address", addresslist.get(pos).getRegion());
                setResult(200, intent1);
                finish();
            }
        });

        fan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    @Override
    protected AddressPersenter createPersenter() {
        return new AddressPersenter(this);
    }

    @Override
    protected void initData() {
        presenter.getaddress(SpUtils.getInstance().getString("Token"));
    }

    @Override
    public void getaddress(AddressBean addressBean) {
        initAddress(addressBean.getData());
    }

    @Override
    public void getviewpager(ViewPagerBean viewPagerBean) {

    }

    private void initAddress(List<AddressBean.DataBean> list) {
        addresslist.addAll(list);
        addressAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}