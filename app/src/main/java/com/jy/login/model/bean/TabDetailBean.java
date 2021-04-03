package com.jy.login.model.bean;

import java.util.List;

public
class TabDetailBean {

    /**
     * status : 1
     * stepnowtime : null
     * data : {"YRinitlist":[{"content":{"nav_list":[{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"2","sonfindname":"母婴童装"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/2.html","is_param":true,"url_param":"","title":"母婴童鞋","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065728b2a171.png","app_mark":"GoodsCategory","str":["cate_id","2"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"9","sonfindname":"儿童玩具"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/9.html","is_param":true,"url_param":"","title":"儿童玩具","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065728e07c20.png","app_mark":"GoodsCategory","str":["cate_id","9"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"4","sonfindname":"鞋靴箱包"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/4.html","is_param":true,"url_param":"","title":"鞋靴箱包","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065729103f17.png","app_mark":"GoodsCategory","str":["cate_id","4"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"5","sonfindname":"礼品鲜花"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/5.html","is_param":true,"url_param":"","title":"礼品鲜花","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657293ca4eb.png","app_mark":"GoodsCategory","str":["cate_id","5"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"15","sonfindname":"数码家电"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/15.html","is_param":true,"url_param":"","title":"数码家电","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657583a51ce.png","app_mark":"GoodsCategory","str":["cate_id","15"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"24","sonfindname":"结婚摄影"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/24.html","is_param":true,"url_param":"","title":"结婚摄影","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657593367c9.png","app_mark":"GoodsCategory","str":["cate_id","24"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"36","sonfindname":"食品餐饮"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/36.html","is_param":true,"url_param":"","title":"食品餐饮","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065759ced979.png","app_mark":"GoodsCategory","str":["cate_id","36"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"60","sonfindname":"生鲜果蔬"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/60.html","is_param":true,"url_param":"","title":"生鲜果蔬","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/606575af6072c.png","app_mark":"GoodsCategory","str":["cate_id","60"]}]},"data_type":6,"id":"202010141926616","shop_id":1}],"de_wx_id":"23","temp_id":"shops_index_blue","temp_code":"","pagefrom":0,"time":"1617010755","title_name":"烘焙优选","is_show_sales":"0","get_pay_rank":0}
     */

    private int status;
    private Object stepnowtime;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Object getStepnowtime() {
        return stepnowtime;
    }

    public void setStepnowtime(Object stepnowtime) {
        this.stepnowtime = stepnowtime;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * YRinitlist : [{"content":{"nav_list":[{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"2","sonfindname":"母婴童装"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/2.html","is_param":true,"url_param":"","title":"母婴童鞋","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065728b2a171.png","app_mark":"GoodsCategory","str":["cate_id","2"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"9","sonfindname":"儿童玩具"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/9.html","is_param":true,"url_param":"","title":"儿童玩具","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065728e07c20.png","app_mark":"GoodsCategory","str":["cate_id","9"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"4","sonfindname":"鞋靴箱包"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/4.html","is_param":true,"url_param":"","title":"鞋靴箱包","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065729103f17.png","app_mark":"GoodsCategory","str":["cate_id","4"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"5","sonfindname":"礼品鲜花"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/5.html","is_param":true,"url_param":"","title":"礼品鲜花","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657293ca4eb.png","app_mark":"GoodsCategory","str":["cate_id","5"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"15","sonfindname":"数码家电"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/15.html","is_param":true,"url_param":"","title":"数码家电","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657583a51ce.png","app_mark":"GoodsCategory","str":["cate_id","15"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"24","sonfindname":"结婚摄影"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/24.html","is_param":true,"url_param":"","title":"结婚摄影","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657593367c9.png","app_mark":"GoodsCategory","str":["cate_id","24"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"36","sonfindname":"食品餐饮"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/36.html","is_param":true,"url_param":"","title":"食品餐饮","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065759ced979.png","app_mark":"GoodsCategory","str":["cate_id","36"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"60","sonfindname":"生鲜果蔬"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/60.html","is_param":true,"url_param":"","title":"生鲜果蔬","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/606575af6072c.png","app_mark":"GoodsCategory","str":["cate_id","60"]}]},"data_type":6,"id":"202010141926616","shop_id":1}]
         * de_wx_id : 23
         * temp_id : shops_index_blue
         * temp_code :
         * pagefrom : 0
         * time : 1617010755
         * title_name : 烘焙优选
         * is_show_sales : 0
         * get_pay_rank : 0
         */

        private String de_wx_id;
        private String temp_id;
        private String temp_code;
        private int pagefrom;
        private String time;
        private String title_name;
        private String is_show_sales;
        private int get_pay_rank;
        private List<YRinitlistBean> YRinitlist;

        public String getDe_wx_id() {
            return de_wx_id;
        }

        public void setDe_wx_id(String de_wx_id) {
            this.de_wx_id = de_wx_id;
        }

        public String getTemp_id() {
            return temp_id;
        }

        public void setTemp_id(String temp_id) {
            this.temp_id = temp_id;
        }

        public String getTemp_code() {
            return temp_code;
        }

        public void setTemp_code(String temp_code) {
            this.temp_code = temp_code;
        }

        public int getPagefrom() {
            return pagefrom;
        }

        public void setPagefrom(int pagefrom) {
            this.pagefrom = pagefrom;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getTitle_name() {
            return title_name;
        }

        public void setTitle_name(String title_name) {
            this.title_name = title_name;
        }

        public String getIs_show_sales() {
            return is_show_sales;
        }

        public void setIs_show_sales(String is_show_sales) {
            this.is_show_sales = is_show_sales;
        }

        public int getGet_pay_rank() {
            return get_pay_rank;
        }

        public void setGet_pay_rank(int get_pay_rank) {
            this.get_pay_rank = get_pay_rank;
        }

        public List<YRinitlistBean> getYRinitlist() {
            return YRinitlist;
        }

        public void setYRinitlist(List<YRinitlistBean> YRinitlist) {
            this.YRinitlist = YRinitlist;
        }

        public static class YRinitlistBean {
            /**
             * content : {"nav_list":[{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"2","sonfindname":"母婴童装"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/2.html","is_param":true,"url_param":"","title":"母婴童鞋","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065728b2a171.png","app_mark":"GoodsCategory","str":["cate_id","2"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"9","sonfindname":"儿童玩具"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/9.html","is_param":true,"url_param":"","title":"儿童玩具","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065728e07c20.png","app_mark":"GoodsCategory","str":["cate_id","9"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"4","sonfindname":"鞋靴箱包"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/4.html","is_param":true,"url_param":"","title":"鞋靴箱包","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065729103f17.png","app_mark":"GoodsCategory","str":["cate_id","4"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"5","sonfindname":"礼品鲜花"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/5.html","is_param":true,"url_param":"","title":"礼品鲜花","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657293ca4eb.png","app_mark":"GoodsCategory","str":["cate_id","5"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"15","sonfindname":"数码家电"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/15.html","is_param":true,"url_param":"","title":"数码家电","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657583a51ce.png","app_mark":"GoodsCategory","str":["cate_id","15"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"24","sonfindname":"结婚摄影"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/24.html","is_param":true,"url_param":"","title":"结婚摄影","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/60657593367c9.png","app_mark":"GoodsCategory","str":["cate_id","24"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"36","sonfindname":"食品餐饮"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/36.html","is_param":true,"url_param":"","title":"食品餐饮","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/6065759ced979.png","app_mark":"GoodsCategory","str":["cate_id","36"]},{"link":{"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"60","sonfindname":"生鲜果蔬"},"is_url":false,"url":"https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/60.html","is_param":true,"url_param":"","title":"生鲜果蔬","showtitle":"导航名称","img":"https://103.yangrong2.top/uploads/image/20210401/606575af6072c.png","app_mark":"GoodsCategory","str":["cate_id","60"]}]}
             * data_type : 6
             * id : 202010141926616
             * shop_id : 1
             */

            private ContentBean content;
            private int data_type;
            private String id;
            private int shop_id;

            public ContentBean getContent() {
                return content;
            }

            public void setContent(ContentBean content) {
                this.content = content;
            }

            public int getData_type() {
                return data_type;
            }

            public void setData_type(int data_type) {
                this.data_type = data_type;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getShop_id() {
                return shop_id;
            }

            public void setShop_id(int shop_id) {
                this.shop_id = shop_id;
            }

            public static class ContentBean {
                private List<NavListBean> nav_list;

                public List<NavListBean> getNav_list() {
                    return nav_list;
                }

                public void setNav_list(List<NavListBean> nav_list) {
                    this.nav_list = nav_list;
                }

                public static class NavListBean {
                    /**
                     * link : {"is_param":"1","findname":"商品列表","url_navtype":"12","url_modulename":"2","sonfindname":"母婴童装"}
                     * is_url : false
                     * url : https://103.yangrong2.top/index.php/mobile/takeout/shops_index/catid/2.html
                     * is_param : true
                     * url_param :
                     * title : 母婴童鞋
                     * showtitle : 导航名称
                     * img : https://103.yangrong2.top/uploads/image/20210401/6065728b2a171.png
                     * app_mark : GoodsCategory
                     * str : ["cate_id","2"]
                     */

                    private LinkBean link;
                    private boolean is_url;
                    private String url;
                    private boolean is_param;
                    private String url_param;
                    private String title;
                    private String showtitle;
                    private String img;
                    private String app_mark;
                    private List<String> str;

                    public LinkBean getLink() {
                        return link;
                    }

                    public void setLink(LinkBean link) {
                        this.link = link;
                    }

                    public boolean isIs_url() {
                        return is_url;
                    }

                    public void setIs_url(boolean is_url) {
                        this.is_url = is_url;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public boolean isIs_param() {
                        return is_param;
                    }

                    public void setIs_param(boolean is_param) {
                        this.is_param = is_param;
                    }

                    public String getUrl_param() {
                        return url_param;
                    }

                    public void setUrl_param(String url_param) {
                        this.url_param = url_param;
                    }

                    public String getTitle() {
                        return title;
                    }

                    public void setTitle(String title) {
                        this.title = title;
                    }

                    public String getShowtitle() {
                        return showtitle;
                    }

                    public void setShowtitle(String showtitle) {
                        this.showtitle = showtitle;
                    }

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }

                    public String getApp_mark() {
                        return app_mark;
                    }

                    public void setApp_mark(String app_mark) {
                        this.app_mark = app_mark;
                    }

                    public List<String> getStr() {
                        return str;
                    }

                    public void setStr(List<String> str) {
                        this.str = str;
                    }

                    public static class LinkBean {
                        /**
                         * is_param : 1
                         * findname : 商品列表
                         * url_navtype : 12
                         * url_modulename : 2
                         * sonfindname : 母婴童装
                         */

                        private String is_param;
                        private String findname;
                        private String url_navtype;
                        private String url_modulename;
                        private String sonfindname;

                        public String getIs_param() {
                            return is_param;
                        }

                        public void setIs_param(String is_param) {
                            this.is_param = is_param;
                        }

                        public String getFindname() {
                            return findname;
                        }

                        public void setFindname(String findname) {
                            this.findname = findname;
                        }

                        public String getUrl_navtype() {
                            return url_navtype;
                        }

                        public void setUrl_navtype(String url_navtype) {
                            this.url_navtype = url_navtype;
                        }

                        public String getUrl_modulename() {
                            return url_modulename;
                        }

                        public void setUrl_modulename(String url_modulename) {
                            this.url_modulename = url_modulename;
                        }

                        public String getSonfindname() {
                            return sonfindname;
                        }

                        public void setSonfindname(String sonfindname) {
                            this.sonfindname = sonfindname;
                        }
                    }
                }
            }
        }
    }
}
