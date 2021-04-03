package com.jy.login.model.bean;

import java.util.List;

public class AddressBean {

    /**
     * status : 1
     * msg : 未获取到数据
     * no_add : 0
     * data : [{"id":"262","uid":"927","store_id":"0","consignee":"猪心和","email":"","province":"2","city":"3360","district":"36","address":"淘汇新天停车场(出入口)","house_no":"1206","zipcode":"","mobile":"15855558888","sign_building":"","best_time":false,"updatetime":"2021-03-31","status":"0","sex":"1","xpoint":"116.410303","ypoint":"39.916296","tag":"3","username":"甄志辉","region":"北京市北京市东城区","sex_name":"女士","tag_name":"学校","province_name":"北京市","city_name":"北京市","district_name":"东城区"},{"id":"261","uid":"927","store_id":"0","consignee":"猪心和","email":"","province":"2","city":"3360","district":"36","address":"北京科卓检测技术有限公司","house_no":"1206","zipcode":"","mobile":"15855558888","sign_building":"","best_time":false,"updatetime":"2021-03-28","status":"0","sex":"0","xpoint":"116.556208","ypoint":"39.731944","tag":"2","username":"甄志辉","region":"北京市北京市东城区","sex_name":"男士","tag_name":"公司","province_name":"北京市","city_name":"北京市","district_name":"东城区"}]
     */

    private int status;
    private String msg;
    private int no_add;
    private List<DataBean> data;

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

    public int getNo_add() {
        return no_add;
    }

    public void setNo_add(int no_add) {
        this.no_add = no_add;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 262
         * uid : 927
         * store_id : 0
         * consignee : 猪心和
         * email :
         * province : 2
         * city : 3360
         * district : 36
         * address : 淘汇新天停车场(出入口)
         * house_no : 1206
         * zipcode :
         * mobile : 15855558888
         * sign_building :
         * best_time : false
         * updatetime : 2021-03-31
         * status : 0
         * sex : 1
         * xpoint : 116.410303
         * ypoint : 39.916296
         * tag : 3
         * username : 甄志辉
         * region : 北京市北京市东城区
         * sex_name : 女士
         * tag_name : 学校
         * province_name : 北京市
         * city_name : 北京市
         * district_name : 东城区
         */

        private String id;
        private String uid;
        private String store_id;
        private String consignee;
        private String email;
        private String province;
        private String city;
        private String district;
        private String address;
        private String house_no;
        private String zipcode;
        private String mobile;
        private String sign_building;
        private boolean best_time;
        private String updatetime;
        private String status;
        private String sex;
        private String xpoint;
        private String ypoint;
        private String tag;
        private String username;
        private String region;
        private String sex_name;
        private String tag_name;
        private String province_name;
        private String city_name;
        private String district_name;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getStore_id() {
            return store_id;
        }

        public void setStore_id(String store_id) {
            this.store_id = store_id;
        }

        public String getConsignee() {
            return consignee;
        }

        public void setConsignee(String consignee) {
            this.consignee = consignee;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getHouse_no() {
            return house_no;
        }

        public void setHouse_no(String house_no) {
            this.house_no = house_no;
        }

        public String getZipcode() {
            return zipcode;
        }

        public void setZipcode(String zipcode) {
            this.zipcode = zipcode;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getSign_building() {
            return sign_building;
        }

        public void setSign_building(String sign_building) {
            this.sign_building = sign_building;
        }

        public boolean isBest_time() {
            return best_time;
        }

        public void setBest_time(boolean best_time) {
            this.best_time = best_time;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getXpoint() {
            return xpoint;
        }

        public void setXpoint(String xpoint) {
            this.xpoint = xpoint;
        }

        public String getYpoint() {
            return ypoint;
        }

        public void setYpoint(String ypoint) {
            this.ypoint = ypoint;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getSex_name() {
            return sex_name;
        }

        public void setSex_name(String sex_name) {
            this.sex_name = sex_name;
        }

        public String getTag_name() {
            return tag_name;
        }

        public void setTag_name(String tag_name) {
            this.tag_name = tag_name;
        }

        public String getProvince_name() {
            return province_name;
        }

        public void setProvince_name(String province_name) {
            this.province_name = province_name;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getDistrict_name() {
            return district_name;
        }

        public void setDistrict_name(String district_name) {
            this.district_name = district_name;
        }
    }
}
