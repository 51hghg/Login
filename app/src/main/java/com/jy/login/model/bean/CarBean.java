package com.jy.login.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CarBean {

    /**
     * list : {"1":{"shop_info":{"id":"1","name":"烘焙优选自营","thumb":"/uploads/image/20210308/6045cfa3bfb3e.jpg","thumb_img":"http://mendian.oss-cn-qingdao.aliyuncs.com/uploads/image/20181113/5bea663d6a653.png","address":"库尔勒市梨乡路豪景大厦","status":"1","shipping_info":[{"id":"82","name":"","shop_id":"1","configure":"a:6:{s:4:\"type\";s:1:\"1\";s:5:\"money\";s:3:\"100\";s:12:\"first_weight\";s:1:\"1\";s:18:\"first_weight_money\";s:1:\"5\";s:8:\"x_weight\";s:1:\"1\";s:14:\"x_weight_money\";s:1:\"8\";}","area_region":"6,2,3360,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,28,29,30,31,32"}],"allgoods_weight":1,"allgoods_price":"12.50","org_allprice":0,"giftprice":"0.00","shop_total_price":"12.50"},"promot_list":[{"promot_info":{"goods_count":1,"orig_prices":"12.50","current_prices":"12.50","is_showpro":0,"save_prices":"0.00","new_save_price":"0.00"},"gift_list":false,"goods_list":[{"id":"11","cat_id":"2","shop_cat_id":"0","goods_sn":"6991398110591","goods_code":"YR0000001","goods_plu":"0","goods_name":"蛋糕烘培抹茶粉材料100g","goods_video":"","brand_id":"0","shop_id":"1","suppliers_id":"0","goods_number":1000002,"goods_weight":"1.000","market_price":"15.00","shop_price":"12.50","supply_price":"0.82","purchase_price":"0.90","user_min_bought":"0","user_max_bought":"0","img":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png","is_shipping":"0","is_prop":"0","is_integral":"1","is_best":"0","is_new":"0","is_hot":"0","is_index":"0","is_promote":"0","staff_comm":"1","money":"0.00","promote_id":"0","promote_start_time":"0","promote_end_time":"0","promote_price":"0.00","is_referral":"1","commission":"0.00","is_delete":"0","count":"0","avg_point":"0.0000","sell_count":"1150","qh_count":"0","limit_count":"2000.000","lower_count":"1.000","is_internet":"1","is_offline":"0","is_dinghuo":"1","production_date":"0","is_type":"1","addtime":"1531961908","updatetime":"1617267812","sort":"10","status":"1","publish_wait":"1","dp_count":"8","avg_score":"0","dp_count_1":"0","dp_count_2":"0","dp_count_3":"0","dp_count_4":"0","dp_count_5":"8","pt_id":"0","goods_type":"5","service_tostore":"1","service_tohome":"0","sale_type":"0","unit_name":"块","unit_id":"11","moq":"1","contain_service":null,"continued":null,"shop_ids":"0","service_spec":"","simple_description":null,"goods_zhuji":"DBC","service_ids":"","adv_words":"","activity_img":"","is_jijian":"0","goods_max_number":"0","goods_min_number":"0","presell_time":"0","custom_dtime":null,"act_sell_count":null,"label_ids":null,"ztd_comm":"0","ztd_money":"0.00","pay_type":"0","cart_type":"3","goods_id":"1","user_id":"927","cookie_id":"","goods_attr":"","goods_num":"1","cart_id":"0","price_type":"1","actgoodsid":"0","is_valid":"1","goods_shop_price":"12.50","live_anchor_id":"0","live_history_id":"0","goodsinfos":false,"goods_attr_format":false,"attr_price":"12.50","show_price":"12.50","org_allprice":"12.50","all_price":"12.50","all_weight":1,"is_limit_time":null,"promot_list":{"count":0},"collect_count":0,"imgF":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png"}]}],"send_desc":""}}
     * YRshop : {"bind_shop_id":"1","code":"bind_shop_success","send":2}
     * all_price : 12.50
     * all_save_price : 0.00
     * new_save_price : 0
     * promot_lists_json : null
     * shopgoods : {"1":{"goods_ids":["1"],"goods_total_price":12.5,"cart_type":["3"]}}
     * status : 1
     * init_list : []
     * all_cart_info : {"cart_num":0,"cart_total_price":"0.00"}
     * get_pay_rank : 0
     */

    private ListBean list;
    private YRshopBean YRshop;
    private String all_price;
    private String all_save_price;
    private int new_save_price;
    private String promot_lists_json;
    private ShopgoodsBean shopgoods;
    private int status;
    private AllCartInfoBean all_cart_info;
    private int get_pay_rank;
    private List<?> init_list;

    public ListBean getList() {
        return list;
    }

    public void setList(ListBean list) {
        this.list = list;
    }

    public YRshopBean getYRshop() {
        return YRshop;
    }

    public void setYRshop(YRshopBean YRshop) {
        this.YRshop = YRshop;
    }

    public String getAll_price() {
        return all_price;
    }

    public void setAll_price(String all_price) {
        this.all_price = all_price;
    }

    public String getAll_save_price() {
        return all_save_price;
    }

    public void setAll_save_price(String all_save_price) {
        this.all_save_price = all_save_price;
    }

    public int getNew_save_price() {
        return new_save_price;
    }

    public void setNew_save_price(int new_save_price) {
        this.new_save_price = new_save_price;
    }

    public String getPromot_lists_json() {
        return promot_lists_json;
    }

    public void setPromot_lists_json(String promot_lists_json) {
        this.promot_lists_json = promot_lists_json;
    }

    public ShopgoodsBean getShopgoods() {
        return shopgoods;
    }

    public void setShopgoods(ShopgoodsBean shopgoods) {
        this.shopgoods = shopgoods;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public AllCartInfoBean getAll_cart_info() {
        return all_cart_info;
    }

    public void setAll_cart_info(AllCartInfoBean all_cart_info) {
        this.all_cart_info = all_cart_info;
    }

    public int getGet_pay_rank() {
        return get_pay_rank;
    }

    public void setGet_pay_rank(int get_pay_rank) {
        this.get_pay_rank = get_pay_rank;
    }

    public List<?> getInit_list() {
        return init_list;
    }

    public void setInit_list(List<?> init_list) {
        this.init_list = init_list;
    }

    public static class ListBean {
        /**
         * 1 : {"shop_info":{"id":"1","name":"烘焙优选自营","thumb":"/uploads/image/20210308/6045cfa3bfb3e.jpg","thumb_img":"http://mendian.oss-cn-qingdao.aliyuncs.com/uploads/image/20181113/5bea663d6a653.png","address":"库尔勒市梨乡路豪景大厦","status":"1","shipping_info":[{"id":"82","name":"","shop_id":"1","configure":"a:6:{s:4:\"type\";s:1:\"1\";s:5:\"money\";s:3:\"100\";s:12:\"first_weight\";s:1:\"1\";s:18:\"first_weight_money\";s:1:\"5\";s:8:\"x_weight\";s:1:\"1\";s:14:\"x_weight_money\";s:1:\"8\";}","area_region":"6,2,3360,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,28,29,30,31,32"}],"allgoods_weight":1,"allgoods_price":"12.50","org_allprice":0,"giftprice":"0.00","shop_total_price":"12.50"},"promot_list":[{"promot_info":{"goods_count":1,"orig_prices":"12.50","current_prices":"12.50","is_showpro":0,"save_prices":"0.00","new_save_price":"0.00"},"gift_list":false,"goods_list":[{"id":"11","cat_id":"2","shop_cat_id":"0","goods_sn":"6991398110591","goods_code":"YR0000001","goods_plu":"0","goods_name":"蛋糕烘培抹茶粉材料100g","goods_video":"","brand_id":"0","shop_id":"1","suppliers_id":"0","goods_number":1000002,"goods_weight":"1.000","market_price":"15.00","shop_price":"12.50","supply_price":"0.82","purchase_price":"0.90","user_min_bought":"0","user_max_bought":"0","img":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png","is_shipping":"0","is_prop":"0","is_integral":"1","is_best":"0","is_new":"0","is_hot":"0","is_index":"0","is_promote":"0","staff_comm":"1","money":"0.00","promote_id":"0","promote_start_time":"0","promote_end_time":"0","promote_price":"0.00","is_referral":"1","commission":"0.00","is_delete":"0","count":"0","avg_point":"0.0000","sell_count":"1150","qh_count":"0","limit_count":"2000.000","lower_count":"1.000","is_internet":"1","is_offline":"0","is_dinghuo":"1","production_date":"0","is_type":"1","addtime":"1531961908","updatetime":"1617267812","sort":"10","status":"1","publish_wait":"1","dp_count":"8","avg_score":"0","dp_count_1":"0","dp_count_2":"0","dp_count_3":"0","dp_count_4":"0","dp_count_5":"8","pt_id":"0","goods_type":"5","service_tostore":"1","service_tohome":"0","sale_type":"0","unit_name":"块","unit_id":"11","moq":"1","contain_service":null,"continued":null,"shop_ids":"0","service_spec":"","simple_description":null,"goods_zhuji":"DBC","service_ids":"","adv_words":"","activity_img":"","is_jijian":"0","goods_max_number":"0","goods_min_number":"0","presell_time":"0","custom_dtime":null,"act_sell_count":null,"label_ids":null,"ztd_comm":"0","ztd_money":"0.00","pay_type":"0","cart_type":"3","goods_id":"1","user_id":"927","cookie_id":"","goods_attr":"","goods_num":"1","cart_id":"0","price_type":"1","actgoodsid":"0","is_valid":"1","goods_shop_price":"12.50","live_anchor_id":"0","live_history_id":"0","goodsinfos":false,"goods_attr_format":false,"attr_price":"12.50","show_price":"12.50","org_allprice":"12.50","all_price":"12.50","all_weight":1,"is_limit_time":null,"promot_list":{"count":0},"collect_count":0,"imgF":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png"}]}],"send_desc":""}
         */

        @SerializedName("1")
        private _$1Bean _$1;

        public _$1Bean get_$1() {
            return _$1;
        }

        public void set_$1(_$1Bean _$1) {
            this._$1 = _$1;
        }

        public static class _$1Bean {
            /**
             * shop_info : {"id":"1","name":"烘焙优选自营","thumb":"/uploads/image/20210308/6045cfa3bfb3e.jpg","thumb_img":"http://mendian.oss-cn-qingdao.aliyuncs.com/uploads/image/20181113/5bea663d6a653.png","address":"库尔勒市梨乡路豪景大厦","status":"1","shipping_info":[{"id":"82","name":"","shop_id":"1","configure":"a:6:{s:4:\"type\";s:1:\"1\";s:5:\"money\";s:3:\"100\";s:12:\"first_weight\";s:1:\"1\";s:18:\"first_weight_money\";s:1:\"5\";s:8:\"x_weight\";s:1:\"1\";s:14:\"x_weight_money\";s:1:\"8\";}","area_region":"6,2,3360,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,28,29,30,31,32"}],"allgoods_weight":1,"allgoods_price":"12.50","org_allprice":0,"giftprice":"0.00","shop_total_price":"12.50"}
             * promot_list : [{"promot_info":{"goods_count":1,"orig_prices":"12.50","current_prices":"12.50","is_showpro":0,"save_prices":"0.00","new_save_price":"0.00"},"gift_list":false,"goods_list":[{"id":"11","cat_id":"2","shop_cat_id":"0","goods_sn":"6991398110591","goods_code":"YR0000001","goods_plu":"0","goods_name":"蛋糕烘培抹茶粉材料100g","goods_video":"","brand_id":"0","shop_id":"1","suppliers_id":"0","goods_number":1000002,"goods_weight":"1.000","market_price":"15.00","shop_price":"12.50","supply_price":"0.82","purchase_price":"0.90","user_min_bought":"0","user_max_bought":"0","img":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png","is_shipping":"0","is_prop":"0","is_integral":"1","is_best":"0","is_new":"0","is_hot":"0","is_index":"0","is_promote":"0","staff_comm":"1","money":"0.00","promote_id":"0","promote_start_time":"0","promote_end_time":"0","promote_price":"0.00","is_referral":"1","commission":"0.00","is_delete":"0","count":"0","avg_point":"0.0000","sell_count":"1150","qh_count":"0","limit_count":"2000.000","lower_count":"1.000","is_internet":"1","is_offline":"0","is_dinghuo":"1","production_date":"0","is_type":"1","addtime":"1531961908","updatetime":"1617267812","sort":"10","status":"1","publish_wait":"1","dp_count":"8","avg_score":"0","dp_count_1":"0","dp_count_2":"0","dp_count_3":"0","dp_count_4":"0","dp_count_5":"8","pt_id":"0","goods_type":"5","service_tostore":"1","service_tohome":"0","sale_type":"0","unit_name":"块","unit_id":"11","moq":"1","contain_service":null,"continued":null,"shop_ids":"0","service_spec":"","simple_description":null,"goods_zhuji":"DBC","service_ids":"","adv_words":"","activity_img":"","is_jijian":"0","goods_max_number":"0","goods_min_number":"0","presell_time":"0","custom_dtime":null,"act_sell_count":null,"label_ids":null,"ztd_comm":"0","ztd_money":"0.00","pay_type":"0","cart_type":"3","goods_id":"1","user_id":"927","cookie_id":"","goods_attr":"","goods_num":"1","cart_id":"0","price_type":"1","actgoodsid":"0","is_valid":"1","goods_shop_price":"12.50","live_anchor_id":"0","live_history_id":"0","goodsinfos":false,"goods_attr_format":false,"attr_price":"12.50","show_price":"12.50","org_allprice":"12.50","all_price":"12.50","all_weight":1,"is_limit_time":null,"promot_list":{"count":0},"collect_count":0,"imgF":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png"}]}]
             * send_desc :
             */

            private ShopInfoBean shop_info;
            private String send_desc;
            private List<PromotListBeanX> promot_list;

            public ShopInfoBean getShop_info() {
                return shop_info;
            }

            public void setShop_info(ShopInfoBean shop_info) {
                this.shop_info = shop_info;
            }

            public String getSend_desc() {
                return send_desc;
            }

            public void setSend_desc(String send_desc) {
                this.send_desc = send_desc;
            }

            public List<PromotListBeanX> getPromot_list() {
                return promot_list;
            }

            public void setPromot_list(List<PromotListBeanX> promot_list) {
                this.promot_list = promot_list;
            }

            public static class ShopInfoBean {
                /**
                 * id : 1
                 * name : 烘焙优选自营
                 * thumb : /uploads/image/20210308/6045cfa3bfb3e.jpg
                 * thumb_img : http://mendian.oss-cn-qingdao.aliyuncs.com/uploads/image/20181113/5bea663d6a653.png
                 * address : 库尔勒市梨乡路豪景大厦
                 * status : 1
                 * shipping_info : [{"id":"82","name":"","shop_id":"1","configure":"a:6:{s:4:\"type\";s:1:\"1\";s:5:\"money\";s:3:\"100\";s:12:\"first_weight\";s:1:\"1\";s:18:\"first_weight_money\";s:1:\"5\";s:8:\"x_weight\";s:1:\"1\";s:14:\"x_weight_money\";s:1:\"8\";}","area_region":"6,2,3360,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,28,29,30,31,32"}]
                 * allgoods_weight : 1
                 * allgoods_price : 12.50
                 * org_allprice : 0
                 * giftprice : 0.00
                 * shop_total_price : 12.50
                 */

                private String id;
                private String name;
                private String thumb;
                private String thumb_img;
                private String address;
                private String status;
                private int allgoods_weight;
                private String allgoods_price;
                private int org_allprice;
                private String giftprice;
                private String shop_total_price;
                private List<ShippingInfoBean> shipping_info;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getThumb() {
                    return thumb;
                }

                public void setThumb(String thumb) {
                    this.thumb = thumb;
                }

                public String getThumb_img() {
                    return thumb_img;
                }

                public void setThumb_img(String thumb_img) {
                    this.thumb_img = thumb_img;
                }

                public String getAddress() {
                    return address;
                }

                public void setAddress(String address) {
                    this.address = address;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public int getAllgoods_weight() {
                    return allgoods_weight;
                }

                public void setAllgoods_weight(int allgoods_weight) {
                    this.allgoods_weight = allgoods_weight;
                }

                public String getAllgoods_price() {
                    return allgoods_price;
                }

                public void setAllgoods_price(String allgoods_price) {
                    this.allgoods_price = allgoods_price;
                }

                public int getOrg_allprice() {
                    return org_allprice;
                }

                public void setOrg_allprice(int org_allprice) {
                    this.org_allprice = org_allprice;
                }

                public String getGiftprice() {
                    return giftprice;
                }

                public void setGiftprice(String giftprice) {
                    this.giftprice = giftprice;
                }

                public String getShop_total_price() {
                    return shop_total_price;
                }

                public void setShop_total_price(String shop_total_price) {
                    this.shop_total_price = shop_total_price;
                }

                public List<ShippingInfoBean> getShipping_info() {
                    return shipping_info;
                }

                public void setShipping_info(List<ShippingInfoBean> shipping_info) {
                    this.shipping_info = shipping_info;
                }

                public static class ShippingInfoBean {
                    /**
                     * id : 82
                     * name :
                     * shop_id : 1
                     * configure : a:6:{s:4:"type";s:1:"1";s:5:"money";s:3:"100";s:12:"first_weight";s:1:"1";s:18:"first_weight_money";s:1:"5";s:8:"x_weight";s:1:"1";s:14:"x_weight_money";s:1:"8";}
                     * area_region : 6,2,3360,3,4,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,28,29,30,31,32
                     */

                    private String id;
                    private String name;
                    private String shop_id;
                    private String configure;
                    private String area_region;

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getShop_id() {
                        return shop_id;
                    }

                    public void setShop_id(String shop_id) {
                        this.shop_id = shop_id;
                    }

                    public String getConfigure() {
                        return configure;
                    }

                    public void setConfigure(String configure) {
                        this.configure = configure;
                    }

                    public String getArea_region() {
                        return area_region;
                    }

                    public void setArea_region(String area_region) {
                        this.area_region = area_region;
                    }
                }
            }

            public static class PromotListBeanX {
                /**
                 * promot_info : {"goods_count":1,"orig_prices":"12.50","current_prices":"12.50","is_showpro":0,"save_prices":"0.00","new_save_price":"0.00"}
                 * gift_list : false
                 * goods_list : [{"id":"11","cat_id":"2","shop_cat_id":"0","goods_sn":"6991398110591","goods_code":"YR0000001","goods_plu":"0","goods_name":"蛋糕烘培抹茶粉材料100g","goods_video":"","brand_id":"0","shop_id":"1","suppliers_id":"0","goods_number":1000002,"goods_weight":"1.000","market_price":"15.00","shop_price":"12.50","supply_price":"0.82","purchase_price":"0.90","user_min_bought":"0","user_max_bought":"0","img":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png","is_shipping":"0","is_prop":"0","is_integral":"1","is_best":"0","is_new":"0","is_hot":"0","is_index":"0","is_promote":"0","staff_comm":"1","money":"0.00","promote_id":"0","promote_start_time":"0","promote_end_time":"0","promote_price":"0.00","is_referral":"1","commission":"0.00","is_delete":"0","count":"0","avg_point":"0.0000","sell_count":"1150","qh_count":"0","limit_count":"2000.000","lower_count":"1.000","is_internet":"1","is_offline":"0","is_dinghuo":"1","production_date":"0","is_type":"1","addtime":"1531961908","updatetime":"1617267812","sort":"10","status":"1","publish_wait":"1","dp_count":"8","avg_score":"0","dp_count_1":"0","dp_count_2":"0","dp_count_3":"0","dp_count_4":"0","dp_count_5":"8","pt_id":"0","goods_type":"5","service_tostore":"1","service_tohome":"0","sale_type":"0","unit_name":"块","unit_id":"11","moq":"1","contain_service":null,"continued":null,"shop_ids":"0","service_spec":"","simple_description":null,"goods_zhuji":"DBC","service_ids":"","adv_words":"","activity_img":"","is_jijian":"0","goods_max_number":"0","goods_min_number":"0","presell_time":"0","custom_dtime":null,"act_sell_count":null,"label_ids":null,"ztd_comm":"0","ztd_money":"0.00","pay_type":"0","cart_type":"3","goods_id":"1","user_id":"927","cookie_id":"","goods_attr":"","goods_num":"1","cart_id":"0","price_type":"1","actgoodsid":"0","is_valid":"1","goods_shop_price":"12.50","live_anchor_id":"0","live_history_id":"0","goodsinfos":false,"goods_attr_format":false,"attr_price":"12.50","show_price":"12.50","org_allprice":"12.50","all_price":"12.50","all_weight":1,"is_limit_time":null,"promot_list":{"count":0},"collect_count":0,"imgF":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png"}]
                 */

                private PromotInfoBean promot_info;
                private boolean gift_list;
                private List<GoodsListBean> goods_list;

                public PromotInfoBean getPromot_info() {
                    return promot_info;
                }

                public void setPromot_info(PromotInfoBean promot_info) {
                    this.promot_info = promot_info;
                }

                public boolean isGift_list() {
                    return gift_list;
                }

                public void setGift_list(boolean gift_list) {
                    this.gift_list = gift_list;
                }

                public List<GoodsListBean> getGoods_list() {
                    return goods_list;
                }

                public void setGoods_list(List<GoodsListBean> goods_list) {
                    this.goods_list = goods_list;
                }

                public static class PromotInfoBean {
                    /**
                     * goods_count : 1
                     * orig_prices : 12.50
                     * current_prices : 12.50
                     * is_showpro : 0
                     * save_prices : 0.00
                     * new_save_price : 0.00
                     */

                    private int goods_count;
                    private String orig_prices;
                    private String current_prices;
                    private int is_showpro;
                    private String save_prices;
                    private String new_save_price;

                    public int getGoods_count() {
                        return goods_count;
                    }

                    public void setGoods_count(int goods_count) {
                        this.goods_count = goods_count;
                    }

                    public String getOrig_prices() {
                        return orig_prices;
                    }

                    public void setOrig_prices(String orig_prices) {
                        this.orig_prices = orig_prices;
                    }

                    public String getCurrent_prices() {
                        return current_prices;
                    }

                    public void setCurrent_prices(String current_prices) {
                        this.current_prices = current_prices;
                    }

                    public int getIs_showpro() {
                        return is_showpro;
                    }

                    public void setIs_showpro(int is_showpro) {
                        this.is_showpro = is_showpro;
                    }

                    public String getSave_prices() {
                        return save_prices;
                    }

                    public void setSave_prices(String save_prices) {
                        this.save_prices = save_prices;
                    }

                    public String getNew_save_price() {
                        return new_save_price;
                    }

                    public void setNew_save_price(String new_save_price) {
                        this.new_save_price = new_save_price;
                    }
                }

                public static class GoodsListBean {
                    /**
                     * id : 11
                     * cat_id : 2
                     * shop_cat_id : 0
                     * goods_sn : 6991398110591
                     * goods_code : YR0000001
                     * goods_plu : 0
                     * goods_name : 蛋糕烘培抹茶粉材料100g
                     * goods_video :
                     * brand_id : 0
                     * shop_id : 1
                     * suppliers_id : 0
                     * goods_number : 1000002
                     * goods_weight : 1.000
                     * market_price : 15.00
                     * shop_price : 12.50
                     * supply_price : 0.82
                     * purchase_price : 0.90
                     * user_min_bought : 0
                     * user_max_bought : 0
                     * img : https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png
                     * is_shipping : 0
                     * is_prop : 0
                     * is_integral : 1
                     * is_best : 0
                     * is_new : 0
                     * is_hot : 0
                     * is_index : 0
                     * is_promote : 0
                     * staff_comm : 1
                     * money : 0.00
                     * promote_id : 0
                     * promote_start_time : 0
                     * promote_end_time : 0
                     * promote_price : 0.00
                     * is_referral : 1
                     * commission : 0.00
                     * is_delete : 0
                     * count : 0
                     * avg_point : 0.0000
                     * sell_count : 1150
                     * qh_count : 0
                     * limit_count : 2000.000
                     * lower_count : 1.000
                     * is_internet : 1
                     * is_offline : 0
                     * is_dinghuo : 1
                     * production_date : 0
                     * is_type : 1
                     * addtime : 1531961908
                     * updatetime : 1617267812
                     * sort : 10
                     * status : 1
                     * publish_wait : 1
                     * dp_count : 8
                     * avg_score : 0
                     * dp_count_1 : 0
                     * dp_count_2 : 0
                     * dp_count_3 : 0
                     * dp_count_4 : 0
                     * dp_count_5 : 8
                     * pt_id : 0
                     * goods_type : 5
                     * service_tostore : 1
                     * service_tohome : 0
                     * sale_type : 0
                     * unit_name : 块
                     * unit_id : 11
                     * moq : 1
                     * contain_service : null
                     * continued : null
                     * shop_ids : 0
                     * service_spec :
                     * simple_description : null
                     * goods_zhuji : DBC
                     * service_ids :
                     * adv_words :
                     * activity_img :
                     * is_jijian : 0
                     * goods_max_number : 0
                     * goods_min_number : 0
                     * presell_time : 0
                     * custom_dtime : null
                     * act_sell_count : null
                     * label_ids : null
                     * ztd_comm : 0
                     * ztd_money : 0.00
                     * pay_type : 0
                     * cart_type : 3
                     * goods_id : 1
                     * user_id : 927
                     * cookie_id :
                     * goods_attr :
                     * goods_num : 1
                     * cart_id : 0
                     * price_type : 1
                     * actgoodsid : 0
                     * is_valid : 1
                     * goods_shop_price : 12.50
                     * live_anchor_id : 0
                     * live_history_id : 0
                     * goodsinfos : false
                     * goods_attr_format : false
                     * attr_price : 12.50
                     * show_price : 12.50
                     * org_allprice : 12.50
                     * all_price : 12.50
                     * all_weight : 1
                     * is_limit_time : null
                     * promot_list : {"count":0}
                     * collect_count : 0
                     * imgF : https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png
                     */

                    private String id;
                    private String cat_id;
                    private String shop_cat_id;
                    private String goods_sn;
                    private String goods_code;
                    private String goods_plu;
                    private String goods_name;
                    private String goods_video;
                    private String brand_id;
                    private String shop_id;
                    private String suppliers_id;
                    private int goods_number;
                    private String goods_weight;
                    private String market_price;
                    private String shop_price;
                    private String supply_price;
                    private String purchase_price;
                    private String user_min_bought;
                    private String user_max_bought;
                    private String img;
                    private String is_shipping;
                    private String is_prop;
                    private String is_integral;
                    private String is_best;
                    private String is_new;
                    private String is_hot;
                    private String is_index;
                    private String is_promote;
                    private String staff_comm;
                    private String money;
                    private String promote_id;
                    private String promote_start_time;
                    private String promote_end_time;
                    private String promote_price;
                    private String is_referral;
                    private String commission;
                    private String is_delete;
                    private String count;
                    private String avg_point;
                    private String sell_count;
                    private String qh_count;
                    private String limit_count;
                    private String lower_count;
                    private String is_internet;
                    private String is_offline;
                    private String is_dinghuo;
                    private String production_date;
                    private String is_type;
                    private String addtime;
                    private String updatetime;
                    private String sort;
                    private String status;
                    private String publish_wait;
                    private String dp_count;
                    private String avg_score;
                    private String dp_count_1;
                    private String dp_count_2;
                    private String dp_count_3;
                    private String dp_count_4;
                    private String dp_count_5;
                    private String pt_id;
                    private String goods_type;
                    private String service_tostore;
                    private String service_tohome;
                    private String sale_type;
                    private String unit_name;
                    private String unit_id;
                    private String moq;
                    private Object contain_service;
                    private Object continued;
                    private String shop_ids;
                    private String service_spec;
                    private Object simple_description;
                    private String goods_zhuji;
                    private String service_ids;
                    private String adv_words;
                    private String activity_img;
                    private String is_jijian;
                    private String goods_max_number;
                    private String goods_min_number;
                    private String presell_time;
                    private Object custom_dtime;
                    private Object act_sell_count;
                    private Object label_ids;
                    private String ztd_comm;
                    private String ztd_money;
                    private String pay_type;
                    private String cart_type;
                    private String goods_id;
                    private String user_id;
                    private String cookie_id;
                    private String goods_attr;
                    private String goods_num;
                    private String cart_id;
                    private String price_type;
                    private String actgoodsid;
                    private String is_valid;
                    private String goods_shop_price;
                    private String live_anchor_id;
                    private String live_history_id;
                    private boolean goodsinfos;
                    private boolean goods_attr_format;
                    private String attr_price;
                    private String show_price;
                    private String org_allprice;
                    private String all_price;
                    private int all_weight;
                    private Object is_limit_time;
                    private PromotListBean promot_list;
                    private int collect_count;
                    private String imgF;
                    public boolean selectOrder;  //下单状态
                    public boolean selectEdit;  //编辑状态

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getCat_id() {
                        return cat_id;
                    }

                    public void setCat_id(String cat_id) {
                        this.cat_id = cat_id;
                    }

                    public String getShop_cat_id() {
                        return shop_cat_id;
                    }

                    public void setShop_cat_id(String shop_cat_id) {
                        this.shop_cat_id = shop_cat_id;
                    }

                    public String getGoods_sn() {
                        return goods_sn;
                    }

                    public void setGoods_sn(String goods_sn) {
                        this.goods_sn = goods_sn;
                    }

                    public String getGoods_code() {
                        return goods_code;
                    }

                    public void setGoods_code(String goods_code) {
                        this.goods_code = goods_code;
                    }

                    public String getGoods_plu() {
                        return goods_plu;
                    }

                    public void setGoods_plu(String goods_plu) {
                        this.goods_plu = goods_plu;
                    }

                    public String getGoods_name() {
                        return goods_name;
                    }

                    public void setGoods_name(String goods_name) {
                        this.goods_name = goods_name;
                    }

                    public String getGoods_video() {
                        return goods_video;
                    }

                    public void setGoods_video(String goods_video) {
                        this.goods_video = goods_video;
                    }

                    public String getBrand_id() {
                        return brand_id;
                    }

                    public void setBrand_id(String brand_id) {
                        this.brand_id = brand_id;
                    }

                    public String getShop_id() {
                        return shop_id;
                    }

                    public void setShop_id(String shop_id) {
                        this.shop_id = shop_id;
                    }

                    public String getSuppliers_id() {
                        return suppliers_id;
                    }

                    public void setSuppliers_id(String suppliers_id) {
                        this.suppliers_id = suppliers_id;
                    }

                    public int getGoods_number() {
                        return goods_number;
                    }

                    public void setGoods_number(int goods_number) {
                        this.goods_number = goods_number;
                    }

                    public String getGoods_weight() {
                        return goods_weight;
                    }

                    public void setGoods_weight(String goods_weight) {
                        this.goods_weight = goods_weight;
                    }

                    public String getMarket_price() {
                        return market_price;
                    }

                    public void setMarket_price(String market_price) {
                        this.market_price = market_price;
                    }

                    public String getShop_price() {
                        return shop_price;
                    }

                    public void setShop_price(String shop_price) {
                        this.shop_price = shop_price;
                    }

                    public String getSupply_price() {
                        return supply_price;
                    }

                    public void setSupply_price(String supply_price) {
                        this.supply_price = supply_price;
                    }

                    public String getPurchase_price() {
                        return purchase_price;
                    }

                    public void setPurchase_price(String purchase_price) {
                        this.purchase_price = purchase_price;
                    }

                    public String getUser_min_bought() {
                        return user_min_bought;
                    }

                    public void setUser_min_bought(String user_min_bought) {
                        this.user_min_bought = user_min_bought;
                    }

                    public String getUser_max_bought() {
                        return user_max_bought;
                    }

                    public void setUser_max_bought(String user_max_bought) {
                        this.user_max_bought = user_max_bought;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }

                    public String getIs_shipping() {
                        return is_shipping;
                    }

                    public void setIs_shipping(String is_shipping) {
                        this.is_shipping = is_shipping;
                    }

                    public String getIs_prop() {
                        return is_prop;
                    }

                    public void setIs_prop(String is_prop) {
                        this.is_prop = is_prop;
                    }

                    public String getIs_integral() {
                        return is_integral;
                    }

                    public void setIs_integral(String is_integral) {
                        this.is_integral = is_integral;
                    }

                    public String getIs_best() {
                        return is_best;
                    }

                    public void setIs_best(String is_best) {
                        this.is_best = is_best;
                    }

                    public String getIs_new() {
                        return is_new;
                    }

                    public void setIs_new(String is_new) {
                        this.is_new = is_new;
                    }

                    public String getIs_hot() {
                        return is_hot;
                    }

                    public void setIs_hot(String is_hot) {
                        this.is_hot = is_hot;
                    }

                    public String getIs_index() {
                        return is_index;
                    }

                    public void setIs_index(String is_index) {
                        this.is_index = is_index;
                    }

                    public String getIs_promote() {
                        return is_promote;
                    }

                    public void setIs_promote(String is_promote) {
                        this.is_promote = is_promote;
                    }

                    public String getStaff_comm() {
                        return staff_comm;
                    }

                    public void setStaff_comm(String staff_comm) {
                        this.staff_comm = staff_comm;
                    }

                    public String getMoney() {
                        return money;
                    }

                    public void setMoney(String money) {
                        this.money = money;
                    }

                    public String getPromote_id() {
                        return promote_id;
                    }

                    public void setPromote_id(String promote_id) {
                        this.promote_id = promote_id;
                    }

                    public String getPromote_start_time() {
                        return promote_start_time;
                    }

                    public void setPromote_start_time(String promote_start_time) {
                        this.promote_start_time = promote_start_time;
                    }

                    public String getPromote_end_time() {
                        return promote_end_time;
                    }

                    public void setPromote_end_time(String promote_end_time) {
                        this.promote_end_time = promote_end_time;
                    }

                    public String getPromote_price() {
                        return promote_price;
                    }

                    public void setPromote_price(String promote_price) {
                        this.promote_price = promote_price;
                    }

                    public String getIs_referral() {
                        return is_referral;
                    }

                    public void setIs_referral(String is_referral) {
                        this.is_referral = is_referral;
                    }

                    public String getCommission() {
                        return commission;
                    }

                    public void setCommission(String commission) {
                        this.commission = commission;
                    }

                    public String getIs_delete() {
                        return is_delete;
                    }

                    public void setIs_delete(String is_delete) {
                        this.is_delete = is_delete;
                    }

                    public String getCount() {
                        return count;
                    }

                    public void setCount(String count) {
                        this.count = count;
                    }

                    public String getAvg_point() {
                        return avg_point;
                    }

                    public void setAvg_point(String avg_point) {
                        this.avg_point = avg_point;
                    }

                    public String getSell_count() {
                        return sell_count;
                    }

                    public void setSell_count(String sell_count) {
                        this.sell_count = sell_count;
                    }

                    public String getQh_count() {
                        return qh_count;
                    }

                    public void setQh_count(String qh_count) {
                        this.qh_count = qh_count;
                    }

                    public String getLimit_count() {
                        return limit_count;
                    }

                    public void setLimit_count(String limit_count) {
                        this.limit_count = limit_count;
                    }

                    public String getLower_count() {
                        return lower_count;
                    }

                    public void setLower_count(String lower_count) {
                        this.lower_count = lower_count;
                    }

                    public String getIs_internet() {
                        return is_internet;
                    }

                    public void setIs_internet(String is_internet) {
                        this.is_internet = is_internet;
                    }

                    public String getIs_offline() {
                        return is_offline;
                    }

                    public void setIs_offline(String is_offline) {
                        this.is_offline = is_offline;
                    }

                    public String getIs_dinghuo() {
                        return is_dinghuo;
                    }

                    public void setIs_dinghuo(String is_dinghuo) {
                        this.is_dinghuo = is_dinghuo;
                    }

                    public String getProduction_date() {
                        return production_date;
                    }

                    public void setProduction_date(String production_date) {
                        this.production_date = production_date;
                    }

                    public String getIs_type() {
                        return is_type;
                    }

                    public void setIs_type(String is_type) {
                        this.is_type = is_type;
                    }

                    public String getAddtime() {
                        return addtime;
                    }

                    public void setAddtime(String addtime) {
                        this.addtime = addtime;
                    }

                    public String getUpdatetime() {
                        return updatetime;
                    }

                    public void setUpdatetime(String updatetime) {
                        this.updatetime = updatetime;
                    }

                    public String getSort() {
                        return sort;
                    }

                    public void setSort(String sort) {
                        this.sort = sort;
                    }

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getPublish_wait() {
                        return publish_wait;
                    }

                    public void setPublish_wait(String publish_wait) {
                        this.publish_wait = publish_wait;
                    }

                    public String getDp_count() {
                        return dp_count;
                    }

                    public void setDp_count(String dp_count) {
                        this.dp_count = dp_count;
                    }

                    public String getAvg_score() {
                        return avg_score;
                    }

                    public void setAvg_score(String avg_score) {
                        this.avg_score = avg_score;
                    }

                    public String getDp_count_1() {
                        return dp_count_1;
                    }

                    public void setDp_count_1(String dp_count_1) {
                        this.dp_count_1 = dp_count_1;
                    }

                    public String getDp_count_2() {
                        return dp_count_2;
                    }

                    public void setDp_count_2(String dp_count_2) {
                        this.dp_count_2 = dp_count_2;
                    }

                    public String getDp_count_3() {
                        return dp_count_3;
                    }

                    public void setDp_count_3(String dp_count_3) {
                        this.dp_count_3 = dp_count_3;
                    }

                    public String getDp_count_4() {
                        return dp_count_4;
                    }

                    public void setDp_count_4(String dp_count_4) {
                        this.dp_count_4 = dp_count_4;
                    }

                    public String getDp_count_5() {
                        return dp_count_5;
                    }

                    public void setDp_count_5(String dp_count_5) {
                        this.dp_count_5 = dp_count_5;
                    }

                    public String getPt_id() {
                        return pt_id;
                    }

                    public void setPt_id(String pt_id) {
                        this.pt_id = pt_id;
                    }

                    public String getGoods_type() {
                        return goods_type;
                    }

                    public void setGoods_type(String goods_type) {
                        this.goods_type = goods_type;
                    }

                    public String getService_tostore() {
                        return service_tostore;
                    }

                    public void setService_tostore(String service_tostore) {
                        this.service_tostore = service_tostore;
                    }

                    public String getService_tohome() {
                        return service_tohome;
                    }

                    public void setService_tohome(String service_tohome) {
                        this.service_tohome = service_tohome;
                    }

                    public String getSale_type() {
                        return sale_type;
                    }

                    public void setSale_type(String sale_type) {
                        this.sale_type = sale_type;
                    }

                    public String getUnit_name() {
                        return unit_name;
                    }

                    public void setUnit_name(String unit_name) {
                        this.unit_name = unit_name;
                    }

                    public String getUnit_id() {
                        return unit_id;
                    }

                    public void setUnit_id(String unit_id) {
                        this.unit_id = unit_id;
                    }

                    public String getMoq() {
                        return moq;
                    }

                    public void setMoq(String moq) {
                        this.moq = moq;
                    }

                    public Object getContain_service() {
                        return contain_service;
                    }

                    public void setContain_service(Object contain_service) {
                        this.contain_service = contain_service;
                    }

                    public Object getContinued() {
                        return continued;
                    }

                    public void setContinued(Object continued) {
                        this.continued = continued;
                    }

                    public String getShop_ids() {
                        return shop_ids;
                    }

                    public void setShop_ids(String shop_ids) {
                        this.shop_ids = shop_ids;
                    }

                    public String getService_spec() {
                        return service_spec;
                    }

                    public void setService_spec(String service_spec) {
                        this.service_spec = service_spec;
                    }

                    public Object getSimple_description() {
                        return simple_description;
                    }

                    public void setSimple_description(Object simple_description) {
                        this.simple_description = simple_description;
                    }

                    public String getGoods_zhuji() {
                        return goods_zhuji;
                    }

                    public void setGoods_zhuji(String goods_zhuji) {
                        this.goods_zhuji = goods_zhuji;
                    }

                    public String getService_ids() {
                        return service_ids;
                    }

                    public void setService_ids(String service_ids) {
                        this.service_ids = service_ids;
                    }

                    public String getAdv_words() {
                        return adv_words;
                    }

                    public void setAdv_words(String adv_words) {
                        this.adv_words = adv_words;
                    }

                    public String getActivity_img() {
                        return activity_img;
                    }

                    public void setActivity_img(String activity_img) {
                        this.activity_img = activity_img;
                    }

                    public String getIs_jijian() {
                        return is_jijian;
                    }

                    public void setIs_jijian(String is_jijian) {
                        this.is_jijian = is_jijian;
                    }

                    public String getGoods_max_number() {
                        return goods_max_number;
                    }

                    public void setGoods_max_number(String goods_max_number) {
                        this.goods_max_number = goods_max_number;
                    }

                    public String getGoods_min_number() {
                        return goods_min_number;
                    }

                    public void setGoods_min_number(String goods_min_number) {
                        this.goods_min_number = goods_min_number;
                    }

                    public String getPresell_time() {
                        return presell_time;
                    }

                    public void setPresell_time(String presell_time) {
                        this.presell_time = presell_time;
                    }

                    public Object getCustom_dtime() {
                        return custom_dtime;
                    }

                    public void setCustom_dtime(Object custom_dtime) {
                        this.custom_dtime = custom_dtime;
                    }

                    public Object getAct_sell_count() {
                        return act_sell_count;
                    }

                    public void setAct_sell_count(Object act_sell_count) {
                        this.act_sell_count = act_sell_count;
                    }

                    public Object getLabel_ids() {
                        return label_ids;
                    }

                    public void setLabel_ids(Object label_ids) {
                        this.label_ids = label_ids;
                    }

                    public String getZtd_comm() {
                        return ztd_comm;
                    }

                    public void setZtd_comm(String ztd_comm) {
                        this.ztd_comm = ztd_comm;
                    }

                    public String getZtd_money() {
                        return ztd_money;
                    }

                    public void setZtd_money(String ztd_money) {
                        this.ztd_money = ztd_money;
                    }

                    public String getPay_type() {
                        return pay_type;
                    }

                    public void setPay_type(String pay_type) {
                        this.pay_type = pay_type;
                    }

                    public String getCart_type() {
                        return cart_type;
                    }

                    public void setCart_type(String cart_type) {
                        this.cart_type = cart_type;
                    }

                    public String getGoods_id() {
                        return goods_id;
                    }

                    public void setGoods_id(String goods_id) {
                        this.goods_id = goods_id;
                    }

                    public String getUser_id() {
                        return user_id;
                    }

                    public void setUser_id(String user_id) {
                        this.user_id = user_id;
                    }

                    public String getCookie_id() {
                        return cookie_id;
                    }

                    public void setCookie_id(String cookie_id) {
                        this.cookie_id = cookie_id;
                    }

                    public String getGoods_attr() {
                        return goods_attr;
                    }

                    public void setGoods_attr(String goods_attr) {
                        this.goods_attr = goods_attr;
                    }

                    public String getGoods_num() {
                        return goods_num;
                    }

                    public void setGoods_num(String goods_num) {
                        this.goods_num = goods_num;
                    }

                    public String getCart_id() {
                        return cart_id;
                    }

                    public void setCart_id(String cart_id) {
                        this.cart_id = cart_id;
                    }

                    public String getPrice_type() {
                        return price_type;
                    }

                    public void setPrice_type(String price_type) {
                        this.price_type = price_type;
                    }

                    public String getActgoodsid() {
                        return actgoodsid;
                    }

                    public void setActgoodsid(String actgoodsid) {
                        this.actgoodsid = actgoodsid;
                    }

                    public String getIs_valid() {
                        return is_valid;
                    }

                    public void setIs_valid(String is_valid) {
                        this.is_valid = is_valid;
                    }

                    public String getGoods_shop_price() {
                        return goods_shop_price;
                    }

                    public void setGoods_shop_price(String goods_shop_price) {
                        this.goods_shop_price = goods_shop_price;
                    }

                    public String getLive_anchor_id() {
                        return live_anchor_id;
                    }

                    public void setLive_anchor_id(String live_anchor_id) {
                        this.live_anchor_id = live_anchor_id;
                    }

                    public String getLive_history_id() {
                        return live_history_id;
                    }

                    public void setLive_history_id(String live_history_id) {
                        this.live_history_id = live_history_id;
                    }

                    public boolean isGoodsinfos() {
                        return goodsinfos;
                    }

                    public void setGoodsinfos(boolean goodsinfos) {
                        this.goodsinfos = goodsinfos;
                    }

                    public boolean isGoods_attr_format() {
                        return goods_attr_format;
                    }

                    public void setGoods_attr_format(boolean goods_attr_format) {
                        this.goods_attr_format = goods_attr_format;
                    }

                    public String getAttr_price() {
                        return attr_price;
                    }

                    public void setAttr_price(String attr_price) {
                        this.attr_price = attr_price;
                    }

                    public String getShow_price() {
                        return show_price;
                    }

                    public void setShow_price(String show_price) {
                        this.show_price = show_price;
                    }

                    public String getOrg_allprice() {
                        return org_allprice;
                    }

                    public void setOrg_allprice(String org_allprice) {
                        this.org_allprice = org_allprice;
                    }

                    public String getAll_price() {
                        return all_price;
                    }

                    public void setAll_price(String all_price) {
                        this.all_price = all_price;
                    }

                    public int getAll_weight() {
                        return all_weight;
                    }

                    public void setAll_weight(int all_weight) {
                        this.all_weight = all_weight;
                    }

                    public Object getIs_limit_time() {
                        return is_limit_time;
                    }

                    public void setIs_limit_time(Object is_limit_time) {
                        this.is_limit_time = is_limit_time;
                    }

                    public PromotListBean getPromot_list() {
                        return promot_list;
                    }

                    public void setPromot_list(PromotListBean promot_list) {
                        this.promot_list = promot_list;
                    }

                    public int getCollect_count() {
                        return collect_count;
                    }

                    public void setCollect_count(int collect_count) {
                        this.collect_count = collect_count;
                    }

                    public String getImgF() {
                        return imgF;
                    }

                    public void setImgF(String imgF) {
                        this.imgF = imgF;
                    }

                    public static class PromotListBean {
                        /**
                         * count : 0
                         */

                        private int count;

                        public int getCount() {
                            return count;
                        }

                        public void setCount(int count) {
                            this.count = count;
                        }
                    }
                }
            }
        }
    }

    public static class YRshopBean {
        /**
         * bind_shop_id : 1
         * code : bind_shop_success
         * send : 2
         */

        private String bind_shop_id;
        private String code;
        private int send;

        public String getBind_shop_id() {
            return bind_shop_id;
        }

        public void setBind_shop_id(String bind_shop_id) {
            this.bind_shop_id = bind_shop_id;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getSend() {
            return send;
        }

        public void setSend(int send) {
            this.send = send;
        }
    }

    public static class ShopgoodsBean {
        /**
         * 1 : {"goods_ids":["1"],"goods_total_price":12.5,"cart_type":["3"]}
         */

        @SerializedName("1")
        private _$1BeanX _$1;

        public _$1BeanX get_$1() {
            return _$1;
        }

        public void set_$1(_$1BeanX _$1) {
            this._$1 = _$1;
        }

        public static class _$1BeanX {
            /**
             * goods_ids : ["1"]
             * goods_total_price : 12.5
             * cart_type : ["3"]
             */

            private double goods_total_price;
            private List<String> goods_ids;
            private List<String> cart_type;

            public double getGoods_total_price() {
                return goods_total_price;
            }

            public void setGoods_total_price(double goods_total_price) {
                this.goods_total_price = goods_total_price;
            }

            public List<String> getGoods_ids() {
                return goods_ids;
            }

            public void setGoods_ids(List<String> goods_ids) {
                this.goods_ids = goods_ids;
            }

            public List<String> getCart_type() {
                return cart_type;
            }

            public void setCart_type(List<String> cart_type) {
                this.cart_type = cart_type;
            }
        }
    }

    public static class AllCartInfoBean {
        /**
         * cart_num : 0
         * cart_total_price : 0.00
         */

        private int cart_num;
        private String cart_total_price;

        public int getCart_num() {
            return cart_num;
        }

        public void setCart_num(int cart_num) {
            this.cart_num = cart_num;
        }

        public String getCart_total_price() {
            return cart_total_price;
        }

        public void setCart_total_price(String cart_total_price) {
            this.cart_total_price = cart_total_price;
        }
    }
}
