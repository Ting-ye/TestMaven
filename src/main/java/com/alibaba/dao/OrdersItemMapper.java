package com.alibaba.dao;

import com.alibaba.bean.OrdersItem;

public interface OrdersItemMapper {
    int deleteByPrimaryKey(Integer idordersitem);

    int insert(OrdersItem record);

    int insertSelective(OrdersItem record);

    OrdersItem selectByPrimaryKey(Integer idordersitem);

    int updateByPrimaryKeySelective(OrdersItem record);

    int updateByPrimaryKey(OrdersItem record);
}