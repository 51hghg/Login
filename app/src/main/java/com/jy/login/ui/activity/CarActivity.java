package com.jy.login.ui.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jy.login.R;
import com.jy.login.base.BaseActivity;
import com.jy.login.interfaces.car.ICar;
import com.jy.login.model.bean.CarBean;
import com.jy.login.model.bean.DingdanBean;
import com.jy.login.persenter.CarPersenter;
import com.jy.login.ui.adapter.CarListAdapter;
import com.jy.login.utils.SpUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CarActivity extends BaseActivity<CarPersenter> implements ICar.View {


    @BindView(R.id.txt_edit)
    TextView txtEdit;
    @BindView(R.id.recy_good)
    RecyclerView recyGood;
    @BindView(R.id.btn_quguang)
    Button btnQuguang;
    @BindView(R.id.ll_null)
    LinearLayout llNull;
    @BindView(R.id.checkbox_all)
    CheckBox checkboxAll;
    @BindView(R.id.txt_totalPrice)
    TextView txtTotalPrice;
    @BindView(R.id.txt_submit)
    TextView txtSubmit;
    @BindView(R.id.layout_common)
    ConstraintLayout layoutCommon;
    @BindView(R.id.img_fan)
    ImageView imgFan;
    private boolean isEdit; //是否是编辑状态
    private List<CarBean.ListBean._$1Bean.PromotListBeanX.GoodsListBean> list;
    private CarListAdapter carListAdapter;
    //是否使用特殊的标题栏背景颜色，android5.0以上可以设置状态栏背景色，如果不使用则使用透明色值
    protected boolean useThemestatusBarColor = false;
    //是否使用状态栏文字和图标为暗色，如果状态栏采用了白色系，则需要使状态栏和图标为暗色，android6.0以上可以设置
    protected boolean useStatusBarColor = true;
    private int i = 3;

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
        return R.layout.activity_car;
    }

    @Override
    protected void initView() {
        imgFan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        checkboxAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TAG", "checkboxall:" + checkboxAll.isChecked());
                boolean bool = checkboxAll.isChecked();
                if (isEdit) {
//                    updateGoodSelectStateEdit(bool);
                } else {
//                    updateGoodSelectStateOrder(bool);
                }
            }
        });


    }
    /**
     * 编辑状态下的数据刷新
     * @param
     */
//    private void updateGoodSelectStateEdit(boolean bool){
//        for(CarBean.DataBean.CartListBean item:list){
//            item.selectEdit = bool;
//        }
//        totalSelectOrder();
//        carListAdapter.notifyDataSetChanged();
//    }



    @Override
    protected CarPersenter createPersenter() {
        return new CarPersenter(this);
    }

    @Override
    protected void initData() {
        setStatusBar();
        final HashMap<String , String > map = new HashMap<>();
        map.put("YRtoken","Hp7NlB0KcotLllvsS7Ahj7OvU18YJ1oQyz6jteknfu4=");


        list = new ArrayList<>();
        carListAdapter = new CarListAdapter( list,CarActivity.this);
        recyGood.setLayoutManager(new LinearLayoutManager(this));
        recyGood.setAdapter(carListAdapter);

        presenter.getCar(map);
    }

    @Override
    public void getCar(CarBean carBean) {
        if(carBean.getList().get_$1().getPromot_list().get(0).getGoods_list().isEmpty()){
            llNull.setVisibility(View.VISIBLE);
        }else{
            list.addAll(carBean.getList().get_$1().getPromot_list().get(0).getGoods_list());
            carListAdapter.notifyDataSetChanged();
        }
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