package com.jy.login.ui.fragment;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.jy.login.R;
import com.jy.login.base.BaseFragment;
import com.jy.login.interfaces.login.ILogin;
import com.jy.login.model.bean.LoginBean;
import com.jy.login.model.bean.MeBean;
import com.jy.login.persenter.LoginPersenter;
import com.jy.login.ui.activity.AddressActivity;
import com.jy.login.ui.activity.CarActivity;
import com.jy.login.ui.activity.MedingdanActivity;
import com.jy.login.ui.activity.ShezhiActivity;
import com.jy.login.ui.activity.VipActivity;
import com.jy.login.ui.activity.YijianActivity;
import com.jy.login.utils.SpUtils;

import butterknife.BindView;
import butterknife.OnClick;

import static android.app.Activity.RESULT_OK;

public class MeFragment extends BaseFragment<LoginPersenter> implements ILogin.View {

    @BindView(R.id.img)
    ImageView img;
    @BindView(R.id.img1)
    ImageView img1;
    @BindView(R.id.img2)
    ImageView img2;
    @BindView(R.id.tv_vip)
    TextView tvVip;
    @BindView(R.id.tv_address)
    TextView tvAddress;
    @BindView(R.id.tv_yijian)
    TextView tvYijian;
    @BindView(R.id.tv_gouwuche)
    TextView tvGouwuche;
    @BindView(R.id.tv_username)
    TextView tvUsername;
    @BindView(R.id.vip)
    TextView vip;
    @BindView(R.id.tv_jifen)
    TextView tvJifen;
    @BindView(R.id.xiaoxi)
    TextView xiaoxi;
    @BindView(R.id.tv_fukuan)
    TextView tvFukuan;
    @BindView(R.id.tv_shouhuo)
    TextView tvShouhuo;
    @BindView(R.id.tv_pingjia)
    TextView tvPingjia;
    @BindView(R.id.iv_fukuan)
    ImageView ivFukuan;
    @BindView(R.id.iv_shouhuo)
    ImageView ivShouhuo;
    @BindView(R.id.iv_pingjia)
    ImageView ivPingjia;
    @BindView(R.id.iv_tuikuan)
    ImageView ivTuikuan;

    @Override
    public int getLatout() {
        return R.layout.fragment_me;
    }

    @Override
    public void initView() {
        tvAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), AddressActivity.class));
            }
        });
    }

    @Override
    public LoginPersenter createPresenter() {
        return new LoginPersenter(this);
    }

    @Override
    public void initData() {
        presenter.getme(SpUtils.getInstance().getString("Token"));
    }

    @OnClick({R.id.img1, R.id.img, R.id.tv_vip, R.id.tv_yijian, R.id.tv_gouwuche, R.id.iv_fukuan, R.id.iv_shouhuo, R.id.iv_pingjia, R.id.iv_tuikuan})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img1:
                Intent intent1 = new Intent(getActivity(), ShezhiActivity.class);
                startActivity(intent1);
                break;
            case R.id.img:
                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("image/*");
                startActivityForResult(intent, 1);
                break;
            case R.id.tv_vip:
                Intent intent2 = new Intent(getActivity(), VipActivity.class);
                startActivity(intent2);
                break;
            case R.id.tv_yijian:
                Intent intent3 = new Intent(getActivity(), YijianActivity.class);
                startActivity(intent3);
                break;
            case R.id.tv_gouwuche:
                Intent intent4 = new Intent(getActivity(), CarActivity.class);
                startActivity(intent4);
                break;
            case R.id.iv_fukuan:
                startActivity(new Intent(getActivity(), MedingdanActivity.class));
                break;
            case R.id.iv_shouhuo:
                startActivity(new Intent(getActivity(), MedingdanActivity.class));
                break;
            case R.id.iv_pingjia:
                startActivity(new Intent(getActivity(), MedingdanActivity.class));
                break;
            case R.id.iv_tuikuan:
                startActivity(new Intent(getActivity(), MedingdanActivity.class));
                break;
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Uri data1 = data.getData();

            img.setImageURI(data1);
        }
    }

    @Override
    public void getlogin(LoginBean loginBean) {

    }

    @Override
    public void getme(MeBean meBean) {
        Glide.with(getActivity())
                .load(meBean.getInfo().getHeader_img())
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(100)))
                .into(img);
        tvUsername.setText(meBean.getInfo().getUsername());
        vip.setText(meBean.getInfo().getRank_name());
        tvJifen.setText(meBean.getInfo().getUsepoints());
        tvFukuan.setText(meBean.getData().getNo_pay());
        tvShouhuo.setText(meBean.getData().getYes_ship());
        tvPingjia.setText(meBean.getData().getNo_comment());
        int no_Pay = Integer.parseInt(meBean.getData().getNo_pay());
        int no_Comment = Integer.parseInt(meBean.getData().getNo_comment());
        int yes_ship = Integer.parseInt(meBean.getData().getYes_ship());
        if (no_Pay > 0) {
            tvFukuan.setVisibility(View.VISIBLE);
        }
        if (no_Comment > 0) {
            tvPingjia.setVisibility(View.VISIBLE);
        }
        if (yes_ship > 0) {
            tvShouhuo.setVisibility(View.VISIBLE);
        }
    }
}