package com.jy.login.api;

import com.jy.login.model.bean.AddressBean;
import com.jy.login.model.bean.BannerBean;
import com.jy.login.model.bean.GoodBean;
import com.jy.login.model.bean.GoodsBean;
import com.jy.login.model.bean.HongBean;
import com.jy.login.model.bean.ShopBean;
import com.jy.login.model.bean.TabBean;
import com.jy.login.model.bean.TabDetailBean;

import io.reactivex.Flowable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ShopApi {
    //    String BASE_URL = "https://cdplay.cn/";
//
//    @GET("api/index")
//    Flowable<ShopBean> getshop();
    String BASE_URL = "https://103.yangrong2.top/";

    @GET("index.php/Wxsmall/?c=Index&a=get_vindex&de_wx_id=98&YRshopid=1&YRtemp=1&action_type=is_app")
    Flowable<BannerBean> getbanner();

    //模板接口
    @GET("index.php/Wxsmall/?c=Index&a=get_vindex&pagefrom=10&page=1&de_wx_id=0&stepnowtime=0&YRshopid=1&YRtemp=1&action_type=is_app")
    Flowable<GoodsBean> getgoods();

    @GET("index.php/Wxsmall/?c=Index&a=get_category&action_type=is_app")
    Flowable<TabBean> gettab();

    //详情页
    @GET("uapp.php?request=Takeout-cont_detial")
    Flowable<ShopBean> getshop(@Query("id") String id);

    //详情页
    @GET("uapp.php?request=Takeout-cont")
    Flowable<HongBean> gethong(@Query("id") String id);

    //标题详情8个按钮
    @GET("index.php/Wxsmall/?c=Index&a=get_vindex")
    Flowable<TabDetailBean> getTabDetail(@Query("de_wx_id") String id);

    //商品列表
    @GET("index.php/Wxsmall/?c=Takeout&a=index&action_type=is_app&keyword=&page=1&YRtoken=Hp7NlB0KcotLllvsS7Ahj7OvU18YJ1oQyz6jteknfu4=&YRshopid=1&YRtemp=1&pagesize=10")
    Flowable<GoodBean> getgood();

    //地址详情
    @GET("uapp.php?request=Member-address_list&YRtoken=Hp7NlB0KcotLllvsS7Ahj7OvU18YJ1oQyz6jteknfu4=")
    Flowable<AddressBean>  getaddress();
}
