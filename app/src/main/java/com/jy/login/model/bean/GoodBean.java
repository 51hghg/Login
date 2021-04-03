package com.jy.login.model.bean;

import java.util.List;

public class GoodBean {

    /**
     * status : 1
     * data : {"goods_list":[{"id":"4","cat_id":"1","is_online_buy":1,"name":"600g半成品葡式蛋挞皮液","addname":"/images/nocheck_duig.png","sell_count":"136","market_price":"33.12","shop_price":"27.60","sprice":"￥27.60","sprice_new":"￥24.84","shop_price_old":"￥27.60","balance_price":"0.00","mprice":"￥33.12","img":"https://103.yangrong2.top/uploads/image/20210401/60658da597dde.png","format_spec":{"newarr":[],"spec":[],"combination":"[]","combinationnum":"0","combinationprice":"null","combinationpricenum":"0","new_attr":[]},"commnet_count":"2","good_score":"60","stock":{"goods_number":"288"},"avg_num":"33","is_promote":"0","pt_id":"0"},{"id":"3","cat_id":"2","is_online_buy":1,"name":"蛋糕烘培抹茶粉材料200g","addname":"/images/nocheck_duig.png","sell_count":"224","market_price":"30.00","shop_price":"24.00","sprice":"￥5.00","sprice_new":"￥22.50","shop_price_old":"￥25.00","balance_price":"0.00","mprice":"￥25.00","img":"https://103.yangrong2.top/uploads/image/20210401/60658d4789322.png","format_spec":{"newarr":[],"spec":[],"combination":"[]","combinationnum":"0","combinationprice":"null","combinationpricenum":"0","new_attr":[]},"commnet_count":"0","good_score":0,"stock":{"goods_number":"316"},"avg_num":"42","is_promote":"0","pt_id":"208","pt_price":"5.00","pin_mark":"2人团","is_ptdue":0},{"id":"2","cat_id":"2","is_online_buy":1,"name":"蛋糕烘培抹茶粉材料100g","addname":"/images/nocheck_duig.png","sell_count":"-409.158","market_price":"15.00","shop_price":"12.50","sprice":"￥12.50","sprice_new":"￥11.25","shop_price_old":"￥12.50","balance_price":"0.00","mprice":"￥15.00","img":"https://103.yangrong2.top/uploads/image/20210401/60658dffc8e4e.png","format_spec":{"newarr":[],"spec":[],"combination":"[]","combinationnum":"0","combinationprice":"null","combinationpricenum":"0","new_attr":[]},"commnet_count":"1","good_score":"100","stock":{"goods_number":"678.62"},"avg_num":"100","is_promote":"0","pt_id":"0"},{"id":"1","cat_id":"2","is_online_buy":1,"name":"蛋糕烘培抹茶粉材料100g","addname":"/images/nocheck_duig.png","sell_count":"1015.07","market_price":"15.00","shop_price":"12.50","sprice":"￥12.50","sprice_new":"￥11.25","shop_price_old":"￥12.50","balance_price":"0.00","mprice":"￥15.00","img":"https://103.yangrong2.top/uploads/image/20210401/60658c82d397c.png","format_spec":{"newarr":[],"spec":[],"combination":"[]","combinationnum":"0","combinationprice":"null","combinationpricenum":"0","new_attr":[]},"commnet_count":"8","good_score":"100","stock":{"goods_number":"1000002"},"avg_num":"1","is_promote":"0","pt_id":"0"}]}
     * msg : 已加载全部数据
     */

    private String status;
    private DataBean data;
    private String msg;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        private List<GoodsListBean> goods_list;

        public List<GoodsListBean> getGoods_list() {
            return goods_list;
        }

        public void setGoods_list(List<GoodsListBean> goods_list) {
            this.goods_list = goods_list;
        }

        public static class GoodsListBean {
            /**
             * id : 4
             * cat_id : 1
             * is_online_buy : 1
             * name : 600g半成品葡式蛋挞皮液
             * addname : /images/nocheck_duig.png
             * sell_count : 136
             * market_price : 33.12
             * shop_price : 27.60
             * sprice : ￥27.60
             * sprice_new : ￥24.84
             * shop_price_old : ￥27.60
             * balance_price : 0.00
             * mprice : ￥33.12
             * img : https://103.yangrong2.top/uploads/image/20210401/60658da597dde.png
             * format_spec : {"newarr":[],"spec":[],"combination":"[]","combinationnum":"0","combinationprice":"null","combinationpricenum":"0","new_attr":[]}
             * commnet_count : 2
             * good_score : 60
             * stock : {"goods_number":"288"}
             * avg_num : 33
             * is_promote : 0
             * pt_id : 0
             * pt_price : 5.00
             * pin_mark : 2人团
             * is_ptdue : 0
             */

            private String id;
            private String cat_id;
            private int is_online_buy;
            private String name;
            private String addname;
            private String sell_count;
            private String market_price;
            private String shop_price;
            private String sprice;
            private String sprice_new;
            private String shop_price_old;
            private String balance_price;
            private String mprice;
            private String img;
            private FormatSpecBean format_spec;
            private String commnet_count;
            private String good_score;
            private StockBean stock;
            private String avg_num;
            private String is_promote;
            private String pt_id;
            private String pt_price;
            private String pin_mark;
            private int is_ptdue;

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

            public int getIs_online_buy() {
                return is_online_buy;
            }

            public void setIs_online_buy(int is_online_buy) {
                this.is_online_buy = is_online_buy;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddname() {
                return addname;
            }

            public void setAddname(String addname) {
                this.addname = addname;
            }

            public String getSell_count() {
                return sell_count;
            }

            public void setSell_count(String sell_count) {
                this.sell_count = sell_count;
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

            public String getSprice() {
                return sprice;
            }

            public void setSprice(String sprice) {
                this.sprice = sprice;
            }

            public String getSprice_new() {
                return sprice_new;
            }

            public void setSprice_new(String sprice_new) {
                this.sprice_new = sprice_new;
            }

            public String getShop_price_old() {
                return shop_price_old;
            }

            public void setShop_price_old(String shop_price_old) {
                this.shop_price_old = shop_price_old;
            }

            public String getBalance_price() {
                return balance_price;
            }

            public void setBalance_price(String balance_price) {
                this.balance_price = balance_price;
            }

            public String getMprice() {
                return mprice;
            }

            public void setMprice(String mprice) {
                this.mprice = mprice;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public FormatSpecBean getFormat_spec() {
                return format_spec;
            }

            public void setFormat_spec(FormatSpecBean format_spec) {
                this.format_spec = format_spec;
            }

            public String getCommnet_count() {
                return commnet_count;
            }

            public void setCommnet_count(String commnet_count) {
                this.commnet_count = commnet_count;
            }

            public String getGood_score() {
                return good_score;
            }

            public void setGood_score(String good_score) {
                this.good_score = good_score;
            }

            public StockBean getStock() {
                return stock;
            }

            public void setStock(StockBean stock) {
                this.stock = stock;
            }

            public String getAvg_num() {
                return avg_num;
            }

            public void setAvg_num(String avg_num) {
                this.avg_num = avg_num;
            }

            public String getIs_promote() {
                return is_promote;
            }

            public void setIs_promote(String is_promote) {
                this.is_promote = is_promote;
            }

            public String getPt_id() {
                return pt_id;
            }

            public void setPt_id(String pt_id) {
                this.pt_id = pt_id;
            }

            public String getPt_price() {
                return pt_price;
            }

            public void setPt_price(String pt_price) {
                this.pt_price = pt_price;
            }

            public String getPin_mark() {
                return pin_mark;
            }

            public void setPin_mark(String pin_mark) {
                this.pin_mark = pin_mark;
            }

            public int getIs_ptdue() {
                return is_ptdue;
            }

            public void setIs_ptdue(int is_ptdue) {
                this.is_ptdue = is_ptdue;
            }

            public static class FormatSpecBean {
                /**
                 * newarr : []
                 * spec : []
                 * combination : []
                 * combinationnum : 0
                 * combinationprice : null
                 * combinationpricenum : 0
                 * new_attr : []
                 */

                private String combination;
                private String combinationnum;
                private String combinationprice;
                private String combinationpricenum;
                private List<?> newarr;
                private List<?> spec;
                private List<?> new_attr;

                public String getCombination() {
                    return combination;
                }

                public void setCombination(String combination) {
                    this.combination = combination;
                }

                public String getCombinationnum() {
                    return combinationnum;
                }

                public void setCombinationnum(String combinationnum) {
                    this.combinationnum = combinationnum;
                }

                public String getCombinationprice() {
                    return combinationprice;
                }

                public void setCombinationprice(String combinationprice) {
                    this.combinationprice = combinationprice;
                }

                public String getCombinationpricenum() {
                    return combinationpricenum;
                }

                public void setCombinationpricenum(String combinationpricenum) {
                    this.combinationpricenum = combinationpricenum;
                }

                public List<?> getNewarr() {
                    return newarr;
                }

                public void setNewarr(List<?> newarr) {
                    this.newarr = newarr;
                }

                public List<?> getSpec() {
                    return spec;
                }

                public void setSpec(List<?> spec) {
                    this.spec = spec;
                }

                public List<?> getNew_attr() {
                    return new_attr;
                }

                public void setNew_attr(List<?> new_attr) {
                    this.new_attr = new_attr;
                }
            }

            public static class StockBean {
                /**
                 * goods_number : 288
                 */

                private String goods_number;

                public String getGoods_number() {
                    return goods_number;
                }

                public void setGoods_number(String goods_number) {
                    this.goods_number = goods_number;
                }
            }
        }
    }
}
