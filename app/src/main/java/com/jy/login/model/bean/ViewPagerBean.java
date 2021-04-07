package com.jy.login.model.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ViewPagerBean {


    /**
     * status : 1
     * msg :
     * cate_count : 4
     * data : [{"id":"4","name":"全部","pid":"4","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"1","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210406/606bca5170dbe.JPG","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"1617676852","allparent":"4,0","allson":"5"},{"id":"6","name":"么么","pid":"4","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"2","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210406/606bca79117dd.JPG","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"1617676897","allparent":"4,0","allson":"6"},{"id":"7","name":"嘴唇","pid":"4","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"3","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210406/606bca9b9ad21.JPG","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"1617676934","allparent":"4,0","allson":"7"},{"id":"8","name":"吕高硕","pid":"4","type_id":"0","class":"","is_home":"0","is_online_buy":"1","sort":"4","status":"1","seotitle":"","seokeywords":"","seodescription":"","measure_unit":"","show_in_nav":"0","grade":"0","price":"0.00","icon":"","img":"https://103.yangrong2.top/uploads/image/20210406/606bcab8c0f7b.JPG","balance_rate":"1.00","type":"0","shop_id":"0","updatetime":"1617676967","allparent":"4,0","allson":"8"}]
     */

    private int status;
    private String msg;
    private int cate_count;
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

    public int getCate_count() {
        return cate_count;
    }

    public void setCate_count(int cate_count) {
        this.cate_count = cate_count;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 4
         * name : 全部
         * pid : 4
         * type_id : 0
         * class :
         * is_home : 0
         * is_online_buy : 1
         * sort : 1
         * status : 1
         * seotitle :
         * seokeywords :
         * seodescription :
         * measure_unit :
         * show_in_nav : 0
         * grade : 0
         * price : 0.00
         * icon :
         * img : https://103.yangrong2.top/uploads/image/20210406/606bca5170dbe.JPG
         * balance_rate : 1.00
         * type : 0
         * shop_id : 0
         * updatetime : 1617676852
         * allparent : 4,0
         * allson : 5
         */

        private String id;
        private String name;
        private String pid;
        private String type_id;
        @SerializedName("class")
        private String classX;
        private String is_home;
        private String is_online_buy;
        private String sort;
        private String status;
        private String seotitle;
        private String seokeywords;
        private String seodescription;
        private String measure_unit;
        private String show_in_nav;
        private String grade;
        private String price;
        private String icon;
        private String img;
        private String balance_rate;
        private String type;
        private String shop_id;
        private String updatetime;
        private String allparent;
        private String allson;

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

        public String getPid() {
            return pid;
        }

        public void setPid(String pid) {
            this.pid = pid;
        }

        public String getType_id() {
            return type_id;
        }

        public void setType_id(String type_id) {
            this.type_id = type_id;
        }

        public String getClassX() {
            return classX;
        }

        public void setClassX(String classX) {
            this.classX = classX;
        }

        public String getIs_home() {
            return is_home;
        }

        public void setIs_home(String is_home) {
            this.is_home = is_home;
        }

        public String getIs_online_buy() {
            return is_online_buy;
        }

        public void setIs_online_buy(String is_online_buy) {
            this.is_online_buy = is_online_buy;
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

        public String getSeotitle() {
            return seotitle;
        }

        public void setSeotitle(String seotitle) {
            this.seotitle = seotitle;
        }

        public String getSeokeywords() {
            return seokeywords;
        }

        public void setSeokeywords(String seokeywords) {
            this.seokeywords = seokeywords;
        }

        public String getSeodescription() {
            return seodescription;
        }

        public void setSeodescription(String seodescription) {
            this.seodescription = seodescription;
        }

        public String getMeasure_unit() {
            return measure_unit;
        }

        public void setMeasure_unit(String measure_unit) {
            this.measure_unit = measure_unit;
        }

        public String getShow_in_nav() {
            return show_in_nav;
        }

        public void setShow_in_nav(String show_in_nav) {
            this.show_in_nav = show_in_nav;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getIcon() {
            return icon;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public String getImg() {
            return img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getBalance_rate() {
            return balance_rate;
        }

        public void setBalance_rate(String balance_rate) {
            this.balance_rate = balance_rate;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getShop_id() {
            return shop_id;
        }

        public void setShop_id(String shop_id) {
            this.shop_id = shop_id;
        }

        public String getUpdatetime() {
            return updatetime;
        }

        public void setUpdatetime(String updatetime) {
            this.updatetime = updatetime;
        }

        public String getAllparent() {
            return allparent;
        }

        public void setAllparent(String allparent) {
            this.allparent = allparent;
        }

        public String getAllson() {
            return allson;
        }

        public void setAllson(String allson) {
            this.allson = allson;
        }
    }
}
