package com.oukele.dao;

import com.oukele.model.Orders;
import java.util.List;

public interface OrdersMapper {
    int deleteByPrimaryKey(String ordersId);

    int insert(Orders record);

    Orders selectByPrimaryKey(String ordersId);

    List<Orders> selectAll();

    int updateByPrimaryKey(Orders record);
}