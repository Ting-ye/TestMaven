package com.alibaba.bean;

import java.util.Date;

public class Orders {
    private Integer orderid;

    private Integer userid;

    private Float totalprice;

    private Date orderdata;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Float totalprice) {
        this.totalprice = totalprice;
    }

    public Date getOrderdata() {
        return orderdata;
    }

    public void setOrderdata(Date orderdata) {
        this.orderdata = orderdata;
    }
}