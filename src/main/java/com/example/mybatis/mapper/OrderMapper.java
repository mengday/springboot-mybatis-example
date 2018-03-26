package com.example.mybatis.mapper;

import com.example.mybatis.entity.Order;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by mengday.zhang on 2018/3/25.
 */
public interface OrderMapper {
    List<Order> getOrders();

    Page<Order> getOrdersByPage();
}
