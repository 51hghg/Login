package com.jy.login.model.bean;

import java.util.List;

public class MeBean {

    /**
     * status : 1
     * data : {"no_ship":"7","yes_ship":"6","no_comment":"0","service_order":"0","no_pay":"0","tui_kuan":"1","goods_count":0,"get_coupons":"0","count_tui":"2"}
     * info : {"id":"927","username":"甄志辉","password":"febd527eeb1717289b69593627ae00e6","paypassword":"febd527eeb1717289b69593627ae00e6","store_id":"0","salt":"a3cbk6","email":"","question":"0","answer":"","sex":"0","birthday":"0000-00-00","shop_id":"0","money":"49897028.50","frozen_money":"0.00","comm_money":"0.00","fuwu_money":"0.00","tuiguang_money":"0.00","qita_money":"0.00","first_money":"0.00","reg_time":"1589867773","last_login":"1617781462","login_count":"1082","last_ip":"2130706433","reg_ip":"3683615683","rank_id":"1","rank_type":"0","end_time":false,"points":"98576.00","recharge_points":"0.00","usepoints":"9632","parent_id":"0","parent_id_sync":"0","real_name":"猪心和","is_tmp":"0","nickname":"甄志辉","qq":"","msn":"","tel":"","work_tel":"","mobile":"15855558888","status":"1","wxid":"","source":"0","wxsmall_openid":"o3rH25QTvf9fLnmQ5R4Cc54jc_qg","wxsmall_session_key":"EaJue9KB5lwpJXrcmAYGcQ==","wx_unionid":"","push_android_registrationid":"","push_ios_registrationid":"","header_img":"https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKQBotbJDGmnicSUSBX3kHRAkgUUuCbrILH3XiaKxtbzcSsUdNJ1xD3wZxicqvZx7vGmRjbBKrgP6r5Q/132","real_img":"","card_zimg":"","card_fimg":"","updatetime":"1617203683","card_sn":"","user_shop":"0","card_paypass":"","card_time":"0","constellation":null,"idcard":"420325198406290123","education":null,"code":null,"card_id":null,"card_status":null,"province":"0","city_id":"0","district":"0","guide":"0","is_user":"1","is_hm":"0","is_shop":"1","try_login_count":"0","sign_time":"0","sign_day_num":"0","label_ids":"","is_follow":"0","is_real":"0","is_sign":"0","publish_wait":"2","wdzpicurl":"","reason":"","register_tencent":null,"unfollow_time":"0","follow_time":"0","bindtime":"0","littleshop_id":"0","tuanzhang_id":"21","rank_name":"普通会员","rank_img":"https://103.yangrong2.top/Public/images/v1.png","rank_sort":"1","card_fimg_format":"","card_zimg_format":"","real_img_format":"","six_array":["保密","男","女"],"constellationData":["白羊座","金牛座","双子座","巨蟹座","狮子座","处女座","天枰座","射手座","摩羯座","水瓶座","双鱼座","天蝎座"],"six_name":"保密","constellation_name":null}
     * card_color : Color060
     * card_code : []
     * card_status : 3
     * rank_remark : 优选好货低至7折，任你选
     * get_pay_rank : 0
     * is_ztd : 0
     * is_open_ztd : 1
     * ztd_review : null
     */

    private int status;
    private DataBean data;
    private InfoBean info;
    private String card_color;
    private int card_status;
    private String rank_remark;
    private int get_pay_rank;
    private int is_ztd;
    private String is_open_ztd;
    private Object ztd_review;
    private List<?> card_code;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public String getCard_color() {
        return card_color;
    }

    public void setCard_color(String card_color) {
        this.card_color = card_color;
    }

    public int getCard_status() {
        return card_status;
    }

    public void setCard_status(int card_status) {
        this.card_status = card_status;
    }

    public String getRank_remark() {
        return rank_remark;
    }

    public void setRank_remark(String rank_remark) {
        this.rank_remark = rank_remark;
    }

    public int getGet_pay_rank() {
        return get_pay_rank;
    }

    public void setGet_pay_rank(int get_pay_rank) {
        this.get_pay_rank = get_pay_rank;
    }

    public int getIs_ztd() {
        return is_ztd;
    }

    public void setIs_ztd(int is_ztd) {
        this.is_ztd = is_ztd;
    }

    public String getIs_open_ztd() {
        return is_open_ztd;
    }

    public void setIs_open_ztd(String is_open_ztd) {
        this.is_open_ztd = is_open_ztd;
    }

    public Object getZtd_review() {
        return ztd_review;
    }

    public void setZtd_review(Object ztd_review) {
        this.ztd_review = ztd_review;
    }

    public List<?> getCard_code() {
        return card_code;
    }

    public void setCard_code(List<?> card_code) {
        this.card_code = card_code;
    }

    public static class DataBean {
        /**
         * no_ship : 7
         * yes_ship : 6
         * no_comment : 0
         * service_order : 0
         * no_pay : 0
         * tui_kuan : 1
         * goods_count : 0
         * get_coupons : 0
         * count_tui : 2
         */

        private String no_ship;
        private String yes_ship;
        private String no_comment;
        private String service_order;
        private String no_pay;
        private String tui_kuan;
        private int goods_count;
        private String get_coupons;
        private String count_tui;

        public String getNo_ship() {
            return no_ship;
        }

        public void setNo_ship(String no_ship) {
            this.no_ship = no_ship;
        }

        public String getYes_ship() {
            return yes_ship;
        }

        public void setYes_ship(String yes_ship) {
            this.yes_ship = yes_ship;
        }

        public String getNo_comment() {
            return no_comment;
        }

        public void setNo_comment(String no_comment) {
            this.no_comment = no_comment;
        }

        public String getService_order() {
            return service_order;
        }

        public void setService_order(String service_order) {
            this.service_order = service_order;
        }

        public String getNo_pay() {
            return no_pay;
        }

        public void setNo_pay(String no_pay) {
            this.no_pay = no_pay;
        }

        public String getTui_kuan() {
            return tui_kuan;
        }

        public void setTui_kuan(String tui_kuan) {
            this.tui_kuan = tui_kuan;
        }

        public int getGoods_count() {
            return goods_count;
        }

        public void setGoods_count(int goods_count) {
            this.goods_count = goods_count;
        }

        public String getGet_coupons() {
            return get_coupons;
        }

        public void setGet_coupons(String get_coupons) {
            this.get_coupons = get_coupons;
        }

        public String getCount_tui() {
            return count_tui;
        }

        public void setCount_tui(String count_tui) {
            this.count_tui = count_tui;
        }
    }

    public static class InfoBean {
        /**
         * id : 927
         * username : 甄志辉
         * password : febd527eeb1717289b69593627ae00e6
         * paypassword : febd527eeb1717289b69593627ae00e6
         * store_id : 0
         * salt : a3cbk6
         * email :
         * question : 0
         * answer :
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
         * last_login : 1617781462
         * login_count : 1082
         * last_ip : 2130706433
         * reg_ip : 3683615683
         * rank_id : 1
         * rank_type : 0
         * end_time : false
         * points : 98576.00
         * recharge_points : 0.00
         * usepoints : 9632
         * parent_id : 0
         * parent_id_sync : 0
         * real_name : 猪心和
         * is_tmp : 0
         * nickname : 甄志辉
         * qq :
         * msn :
         * tel :
         * work_tel :
         * mobile : 15855558888
         * status : 1
         * wxid :
         * source : 0
         * wxsmall_openid : o3rH25QTvf9fLnmQ5R4Cc54jc_qg
         * wxsmall_session_key : EaJue9KB5lwpJXrcmAYGcQ==
         * wx_unionid :
         * push_android_registrationid :
         * push_ios_registrationid :
         * header_img : https://wx.qlogo.cn/mmopen/vi_32/Q0j4TwGTfTKQBotbJDGmnicSUSBX3kHRAkgUUuCbrILH3XiaKxtbzcSsUdNJ1xD3wZxicqvZx7vGmRjbBKrgP6r5Q/132
         * real_img :
         * card_zimg :
         * card_fimg :
         * updatetime : 1617203683
         * card_sn :
         * user_shop : 0
         * card_paypass :
         * card_time : 0
         * constellation : null
         * idcard : 420325198406290123
         * education : null
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
         * try_login_count : 0
         * sign_time : 0
         * sign_day_num : 0
         * label_ids :
         * is_follow : 0
         * is_real : 0
         * is_sign : 0
         * publish_wait : 2
         * wdzpicurl :
         * reason :
         * register_tencent : null
         * unfollow_time : 0
         * follow_time : 0
         * bindtime : 0
         * littleshop_id : 0
         * tuanzhang_id : 21
         * rank_name : 普通会员
         * rank_img : https://103.yangrong2.top/Public/images/v1.png
         * rank_sort : 1
         * card_fimg_format :
         * card_zimg_format :
         * real_img_format :
         * six_array : ["保密","男","女"]
         * constellationData : ["白羊座","金牛座","双子座","巨蟹座","狮子座","处女座","天枰座","射手座","摩羯座","水瓶座","双鱼座","天蝎座"]
         * six_name : 保密
         * constellation_name : null
         */

        private String id;
        private String username;
        private String password;
        private String paypassword;
        private String store_id;
        private String salt;
        private String email;
        private String question;
        private String answer;
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
        private String login_count;
        private String last_ip;
        private String reg_ip;
        private String rank_id;
        private String rank_type;
        private boolean end_time;
        private String points;
        private String recharge_points;
        private String usepoints;
        private String parent_id;
        private String parent_id_sync;
        private String real_name;
        private String is_tmp;
        private String nickname;
        private String qq;
        private String msn;
        private String tel;
        private String work_tel;
        private String mobile;
        private String status;
        private String wxid;
        private String source;
        private String wxsmall_openid;
        private String wxsmall_session_key;
        private String wx_unionid;
        private String push_android_registrationid;
        private String push_ios_registrationid;
        private String header_img;
        private String real_img;
        private String card_zimg;
        private String card_fimg;
        private String updatetime;
        private String card_sn;
        private String user_shop;
        private String card_paypass;
        private String card_time;
        private Object constellation;
        private String idcard;
        private Object education;
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
        private String try_login_count;
        private String sign_time;
        private String sign_day_num;
        private String label_ids;
        private String is_follow;
        private String is_real;
        private String is_sign;
        private String publish_wait;
        private String wdzpicurl;
        private String reason;
        private Object register_tencent;
        private String unfollow_time;
        private String follow_time;
        private String bindtime;
        private String littleshop_id;
        private String tuanzhang_id;
        private String rank_name;
        private String rank_img;
        private String rank_sort;
        private String card_fimg_format;
        private String card_zimg_format;
        private String real_img_format;
        private String six_name;
        private Object constellation_name;
        private List<String> six_array;
        private List<String> constellationData;

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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPaypassword() {
            return paypassword;
        }

        public void setPaypassword(String paypassword) {
            this.paypassword = paypassword;
        }

        public String getStore_id() {
            return store_id;
        }

        public void setStore_id(String store_id) {
            this.store_id = store_id;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getQuestion() {
            return question;
        }

        public void setQuestion(String question) {
            this.question = question;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
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

        public String getLogin_count() {
            return login_count;
        }

        public void setLogin_count(String login_count) {
            this.login_count = login_count;
        }

        public String getLast_ip() {
            return last_ip;
        }

        public void setLast_ip(String last_ip) {
            this.last_ip = last_ip;
        }

        public String getReg_ip() {
            return reg_ip;
        }

        public void setReg_ip(String reg_ip) {
            this.reg_ip = reg_ip;
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

        public boolean isEnd_time() {
            return end_time;
        }

        public void setEnd_time(boolean end_time) {
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

        public String getMsn() {
            return msn;
        }

        public void setMsn(String msn) {
            this.msn = msn;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
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

        public String getPush_android_registrationid() {
            return push_android_registrationid;
        }

        public void setPush_android_registrationid(String push_android_registrationid) {
            this.push_android_registrationid = push_android_registrationid;
        }

        public String getPush_ios_registrationid() {
            return push_ios_registrationid;
        }

        public void setPush_ios_registrationid(String push_ios_registrationid) {
            this.push_ios_registrationid = push_ios_registrationid;
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

        public String getCard_paypass() {
            return card_paypass;
        }

        public void setCard_paypass(String card_paypass) {
            this.card_paypass = card_paypass;
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

        public Object getEducation() {
            return education;
        }

        public void setEducation(Object education) {
            this.education = education;
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

        public String getTry_login_count() {
            return try_login_count;
        }

        public void setTry_login_count(String try_login_count) {
            this.try_login_count = try_login_count;
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

        public String getLabel_ids() {
            return label_ids;
        }

        public void setLabel_ids(String label_ids) {
            this.label_ids = label_ids;
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

        public Object getRegister_tencent() {
            return register_tencent;
        }

        public void setRegister_tencent(Object register_tencent) {
            this.register_tencent = register_tencent;
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

        public String getRank_name() {
            return rank_name;
        }

        public void setRank_name(String rank_name) {
            this.rank_name = rank_name;
        }

        public String getRank_img() {
            return rank_img;
        }

        public void setRank_img(String rank_img) {
            this.rank_img = rank_img;
        }

        public String getRank_sort() {
            return rank_sort;
        }

        public void setRank_sort(String rank_sort) {
            this.rank_sort = rank_sort;
        }

        public String getCard_fimg_format() {
            return card_fimg_format;
        }

        public void setCard_fimg_format(String card_fimg_format) {
            this.card_fimg_format = card_fimg_format;
        }

        public String getCard_zimg_format() {
            return card_zimg_format;
        }

        public void setCard_zimg_format(String card_zimg_format) {
            this.card_zimg_format = card_zimg_format;
        }

        public String getReal_img_format() {
            return real_img_format;
        }

        public void setReal_img_format(String real_img_format) {
            this.real_img_format = real_img_format;
        }

        public String getSix_name() {
            return six_name;
        }

        public void setSix_name(String six_name) {
            this.six_name = six_name;
        }

        public Object getConstellation_name() {
            return constellation_name;
        }

        public void setConstellation_name(Object constellation_name) {
            this.constellation_name = constellation_name;
        }

        public List<String> getSix_array() {
            return six_array;
        }

        public void setSix_array(List<String> six_array) {
            this.six_array = six_array;
        }

        public List<String> getConstellationData() {
            return constellationData;
        }

        public void setConstellationData(List<String> constellationData) {
            this.constellationData = constellationData;
        }
    }
}
