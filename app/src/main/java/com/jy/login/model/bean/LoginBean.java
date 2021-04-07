package com.jy.login.model.bean;

public class LoginBean {

    /**
     * status : 1
     * msg : 请求成功！
     * data : {"invite_key":"OTI3","key":"gKkRSvsSgPVDQcqsTZnaYmlzbcyqketWubXGh4unCvE=","member_info":{"id":"927","username":"甄志辉","store_id":"0","sex":"0","birthday":"0000-00-00","shop_id":"0","money":"49897028.50","frozen_money":"0.00","comm_money":"0.00","fuwu_money":"0.00","tuiguang_money":"0.00","qita_money":"0.00","first_money":"0.00","reg_time":"1589867773","last_login":"1617763446","rank_id":"1","rank_type":"0","end_time":"0","points":"98576.00","recharge_points":"0.00","usepoints":"9632","parent_id":"0","parent_id_sync":"0","real_name":"猪心和","is_tmp":"0","nickname":"甄志辉","qq":"","work_tel":"","mobile":"15855558888","status":"1","wxid":"","source":"0","wxsmall_openid":"o3rH25QTvf9fLnmQ5R4Cc54jc_qg","wxsmall_session_key":"EaJue9KB5lwpJXrcmAYGcQ==","wx_unionid":"","header_img":"https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKQBotbJDGmnicSUSBX3kHRAkgUUuCbrILH3XiaKxtbzcSsUdNJ1xD3wZxicqvZx7vGmRjbBKrgP6r5Q/132","real_img":"","card_zimg":"","card_fimg":"","updatetime":"1617203683","card_sn":"","user_shop":"0","card_time":"0","constellation":null,"idcard":"420325198406290123","code":null,"card_id":null,"card_status":null,"province":"0","city_id":"0","district":"0","guide":"0","is_user":"1","is_hm":"0","is_shop":"1","sign_time":"0","sign_day_num":"0","is_follow":"0","is_real":"0","is_sign":"0","publish_wait":"2","wdzpicurl":"","reason":"","unfollow_time":"0","follow_time":"0","bindtime":"0","littleshop_id":"0","tuanzhang_id":"21"}}
     */

    private int status;
    private String msg;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * invite_key : OTI3
         * key : gKkRSvsSgPVDQcqsTZnaYmlzbcyqketWubXGh4unCvE=
         * member_info : {"id":"927","username":"甄志辉","store_id":"0","sex":"0","birthday":"0000-00-00","shop_id":"0","money":"49897028.50","frozen_money":"0.00","comm_money":"0.00","fuwu_money":"0.00","tuiguang_money":"0.00","qita_money":"0.00","first_money":"0.00","reg_time":"1589867773","last_login":"1617763446","rank_id":"1","rank_type":"0","end_time":"0","points":"98576.00","recharge_points":"0.00","usepoints":"9632","parent_id":"0","parent_id_sync":"0","real_name":"猪心和","is_tmp":"0","nickname":"甄志辉","qq":"","work_tel":"","mobile":"15855558888","status":"1","wxid":"","source":"0","wxsmall_openid":"o3rH25QTvf9fLnmQ5R4Cc54jc_qg","wxsmall_session_key":"EaJue9KB5lwpJXrcmAYGcQ==","wx_unionid":"","header_img":"https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKQBotbJDGmnicSUSBX3kHRAkgUUuCbrILH3XiaKxtbzcSsUdNJ1xD3wZxicqvZx7vGmRjbBKrgP6r5Q/132","real_img":"","card_zimg":"","card_fimg":"","updatetime":"1617203683","card_sn":"","user_shop":"0","card_time":"0","constellation":null,"idcard":"420325198406290123","code":null,"card_id":null,"card_status":null,"province":"0","city_id":"0","district":"0","guide":"0","is_user":"1","is_hm":"0","is_shop":"1","sign_time":"0","sign_day_num":"0","is_follow":"0","is_real":"0","is_sign":"0","publish_wait":"2","wdzpicurl":"","reason":"","unfollow_time":"0","follow_time":"0","bindtime":"0","littleshop_id":"0","tuanzhang_id":"21"}
         */

        private String invite_key;
        private String key;
        private MemberInfoBean member_info;

        public String getInvite_key() {
            return invite_key;
        }

        public void setInvite_key(String invite_key) {
            this.invite_key = invite_key;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public MemberInfoBean getMember_info() {
            return member_info;
        }

        public void setMember_info(MemberInfoBean member_info) {
            this.member_info = member_info;
        }

        public static class MemberInfoBean {
            /**
             * id : 927
             * username : 甄志辉
             * store_id : 0
             * sex : 0
             * birthday : 0000-00-00
             * shop_id : 0
             * money : 49897028.50
             * frozen_money : 0.00
             * comm_money : 0.00
             * fuwu_money : 0.00
             * tuiguang_money : 0.00
             * qita_money : 0.00
             * first_money : 0.00
             * reg_time : 1589867773
             * last_login : 1617763446
             * rank_id : 1
             * rank_type : 0
             * end_time : 0
             * points : 98576.00
             * recharge_points : 0.00
             * usepoints : 9632
             * parent_id : 0
             * parent_id_sync : 0
             * real_name : 猪心和
             * is_tmp : 0
             * nickname : 甄志辉
             * qq :
             * work_tel :
             * mobile : 15855558888
             * status : 1
             * wxid :
             * source : 0
             * wxsmall_openid : o3rH25QTvf9fLnmQ5R4Cc54jc_qg
             * wxsmall_session_key : EaJue9KB5lwpJXrcmAYGcQ==
             * wx_unionid :
             * header_img : https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKQBotbJDGmnicSUSBX3kHRAkgUUuCbrILH3XiaKxtbzcSsUdNJ1xD3wZxicqvZx7vGmRjbBKrgP6r5Q/132
             * real_img :
             * card_zimg :
             * card_fimg :
             * updatetime : 1617203683
             * card_sn :
             * user_shop : 0
             * card_time : 0
             * constellation : null
             * idcard : 420325198406290123
             * code : null
             * card_id : null
             * card_status : null
             * province : 0
             * city_id : 0
             * district : 0
             * guide : 0
             * is_user : 1
             * is_hm : 0
             * is_shop : 1
             * sign_time : 0
             * sign_day_num : 0
             * is_follow : 0
             * is_real : 0
             * is_sign : 0
             * publish_wait : 2
             * wdzpicurl :
             * reason :
             * unfollow_time : 0
             * follow_time : 0
             * bindtime : 0
             * littleshop_id : 0
             * tuanzhang_id : 21
             */

            private String id;
            private String username;
            private String store_id;
            private String sex;
            private String birthday;
            private String shop_id;
            private String money;
            private String frozen_money;
            private String comm_money;
            private String fuwu_money;
            private String tuiguang_money;
            private String qita_money;
            private String first_money;
            private String reg_time;
            private String last_login;
            private String rank_id;
            private String rank_type;
            private String end_time;
            private String points;
            private String recharge_points;
            private String usepoints;
            private String parent_id;
            private String parent_id_sync;
            private String real_name;
            private String is_tmp;
            private String nickname;
            private String qq;
            private String work_tel;
            private String mobile;
            private String status;
            private String wxid;
            private String source;
            private String wxsmall_openid;
            private String wxsmall_session_key;
            private String wx_unionid;
            private String header_img;
            private String real_img;
            private String card_zimg;
            private String card_fimg;
            private String updatetime;
            private String card_sn;
            private String user_shop;
            private String card_time;
            private Object constellation;
            private String idcard;
            private Object code;
            private Object card_id;
            private Object card_status;
            private String province;
            private String city_id;
            private String district;
            private String guide;
            private String is_user;
            private String is_hm;
            private String is_shop;
            private String sign_time;
            private String sign_day_num;
            private String is_follow;
            private String is_real;
            private String is_sign;
            private String publish_wait;
            private String wdzpicurl;
            private String reason;
            private String unfollow_time;
            private String follow_time;
            private String bindtime;
            private String littleshop_id;
            private String tuanzhang_id;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getStore_id() {
                return store_id;
            }

            public void setStore_id(String store_id) {
                this.store_id = store_id;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }

            public String getBirthday() {
                return birthday;
            }

            public void setBirthday(String birthday) {
                this.birthday = birthday;
            }

            public String getShop_id() {
                return shop_id;
            }

            public void setShop_id(String shop_id) {
                this.shop_id = shop_id;
            }

            public String getMoney() {
                return money;
            }

            public void setMoney(String money) {
                this.money = money;
            }

            public String getFrozen_money() {
                return frozen_money;
            }

            public void setFrozen_money(String frozen_money) {
                this.frozen_money = frozen_money;
            }

            public String getComm_money() {
                return comm_money;
            }

            public void setComm_money(String comm_money) {
                this.comm_money = comm_money;
            }

            public String getFuwu_money() {
                return fuwu_money;
            }

            public void setFuwu_money(String fuwu_money) {
                this.fuwu_money = fuwu_money;
            }

            public String getTuiguang_money() {
                return tuiguang_money;
            }

            public void setTuiguang_money(String tuiguang_money) {
                this.tuiguang_money = tuiguang_money;
            }

            public String getQita_money() {
                return qita_money;
            }

            public void setQita_money(String qita_money) {
                this.qita_money = qita_money;
            }

            public String getFirst_money() {
                return first_money;
            }

            public void setFirst_money(String first_money) {
                this.first_money = first_money;
            }

            public String getReg_time() {
                return reg_time;
            }

            public void setReg_time(String reg_time) {
                this.reg_time = reg_time;
            }

            public String getLast_login() {
                return last_login;
            }

            public void setLast_login(String last_login) {
                this.last_login = last_login;
            }

            public String getRank_id() {
                return rank_id;
            }

            public void setRank_id(String rank_id) {
                this.rank_id = rank_id;
            }

            public String getRank_type() {
                return rank_type;
            }

            public void setRank_type(String rank_type) {
                this.rank_type = rank_type;
            }

            public String getEnd_time() {
                return end_time;
            }

            public void setEnd_time(String end_time) {
                this.end_time = end_time;
            }

            public String getPoints() {
                return points;
            }

            public void setPoints(String points) {
                this.points = points;
            }

            public String getRecharge_points() {
                return recharge_points;
            }

            public void setRecharge_points(String recharge_points) {
                this.recharge_points = recharge_points;
            }

            public String getUsepoints() {
                return usepoints;
            }

            public void setUsepoints(String usepoints) {
                this.usepoints = usepoints;
            }

            public String getParent_id() {
                return parent_id;
            }

            public void setParent_id(String parent_id) {
                this.parent_id = parent_id;
            }

            public String getParent_id_sync() {
                return parent_id_sync;
            }

            public void setParent_id_sync(String parent_id_sync) {
                this.parent_id_sync = parent_id_sync;
            }

            public String getReal_name() {
                return real_name;
            }

            public void setReal_name(String real_name) {
                this.real_name = real_name;
            }

            public String getIs_tmp() {
                return is_tmp;
            }

            public void setIs_tmp(String is_tmp) {
                this.is_tmp = is_tmp;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getQq() {
                return qq;
            }

            public void setQq(String qq) {
                this.qq = qq;
            }

            public String getWork_tel() {
                return work_tel;
            }

            public void setWork_tel(String work_tel) {
                this.work_tel = work_tel;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getWxid() {
                return wxid;
            }

            public void setWxid(String wxid) {
                this.wxid = wxid;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getWxsmall_openid() {
                return wxsmall_openid;
            }

            public void setWxsmall_openid(String wxsmall_openid) {
                this.wxsmall_openid = wxsmall_openid;
            }

            public String getWxsmall_session_key() {
                return wxsmall_session_key;
            }

            public void setWxsmall_session_key(String wxsmall_session_key) {
                this.wxsmall_session_key = wxsmall_session_key;
            }

            public String getWx_unionid() {
                return wx_unionid;
            }

            public void setWx_unionid(String wx_unionid) {
                this.wx_unionid = wx_unionid;
            }

            public String getHeader_img() {
                return header_img;
            }

            public void setHeader_img(String header_img) {
                this.header_img = header_img;
            }

            public String getReal_img() {
                return real_img;
            }

            public void setReal_img(String real_img) {
                this.real_img = real_img;
            }

            public String getCard_zimg() {
                return card_zimg;
            }

            public void setCard_zimg(String card_zimg) {
                this.card_zimg = card_zimg;
            }

            public String getCard_fimg() {
                return card_fimg;
            }

            public void setCard_fimg(String card_fimg) {
                this.card_fimg = card_fimg;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getCard_sn() {
                return card_sn;
            }

            public void setCard_sn(String card_sn) {
                this.card_sn = card_sn;
            }

            public String getUser_shop() {
                return user_shop;
            }

            public void setUser_shop(String user_shop) {
                this.user_shop = user_shop;
            }

            public String getCard_time() {
                return card_time;
            }

            public void setCard_time(String card_time) {
                this.card_time = card_time;
            }

            public Object getConstellation() {
                return constellation;
            }

            public void setConstellation(Object constellation) {
                this.constellation = constellation;
            }

            public String getIdcard() {
                return idcard;
            }

            public void setIdcard(String idcard) {
                this.idcard = idcard;
            }

            public Object getCode() {
                return code;
            }

            public void setCode(Object code) {
                this.code = code;
            }

            public Object getCard_id() {
                return card_id;
            }

            public void setCard_id(Object card_id) {
                this.card_id = card_id;
            }

            public Object getCard_status() {
                return card_status;
            }

            public void setCard_status(Object card_status) {
                this.card_status = card_status;
            }

            public String getProvince() {
                return province;
            }

            public void setProvince(String province) {
                this.province = province;
            }

            public String getCity_id() {
                return city_id;
            }

            public void setCity_id(String city_id) {
                this.city_id = city_id;
            }

            public String getDistrict() {
                return district;
            }

            public void setDistrict(String district) {
                this.district = district;
            }

            public String getGuide() {
                return guide;
            }

            public void setGuide(String guide) {
                this.guide = guide;
            }

            public String getIs_user() {
                return is_user;
            }

            public void setIs_user(String is_user) {
                this.is_user = is_user;
            }

            public String getIs_hm() {
                return is_hm;
            }

            public void setIs_hm(String is_hm) {
                this.is_hm = is_hm;
            }

            public String getIs_shop() {
                return is_shop;
            }

            public void setIs_shop(String is_shop) {
                this.is_shop = is_shop;
            }

            public String getSign_time() {
                return sign_time;
            }

            public void setSign_time(String sign_time) {
                this.sign_time = sign_time;
            }

            public String getSign_day_num() {
                return sign_day_num;
            }

            public void setSign_day_num(String sign_day_num) {
                this.sign_day_num = sign_day_num;
            }

            public String getIs_follow() {
                return is_follow;
            }

            public void setIs_follow(String is_follow) {
                this.is_follow = is_follow;
            }

            public String getIs_real() {
                return is_real;
            }

            public void setIs_real(String is_real) {
                this.is_real = is_real;
            }

            public String getIs_sign() {
                return is_sign;
            }

            public void setIs_sign(String is_sign) {
                this.is_sign = is_sign;
            }

            public String getPublish_wait() {
                return publish_wait;
            }

            public void setPublish_wait(String publish_wait) {
                this.publish_wait = publish_wait;
            }

            public String getWdzpicurl() {
                return wdzpicurl;
            }

            public void setWdzpicurl(String wdzpicurl) {
                this.wdzpicurl = wdzpicurl;
            }

            public String getReason() {
                return reason;
            }

            public void setReason(String reason) {
                this.reason = reason;
            }

            public String getUnfollow_time() {
                return unfollow_time;
            }

            public void setUnfollow_time(String unfollow_time) {
                this.unfollow_time = unfollow_time;
            }

            public String getFollow_time() {
                return follow_time;
            }

            public void setFollow_time(String follow_time) {
                this.follow_time = follow_time;
            }

            public String getBindtime() {
                return bindtime;
            }

            public void setBindtime(String bindtime) {
                this.bindtime = bindtime;
            }

            public String getLittleshop_id() {
                return littleshop_id;
            }

            public void setLittleshop_id(String littleshop_id) {
                this.littleshop_id = littleshop_id;
            }

            public String getTuanzhang_id() {
                return tuanzhang_id;
            }

            public void setTuanzhang_id(String tuanzhang_id) {
                this.tuanzhang_id = tuanzhang_id;
            }
        }
    }
}
