package com.example.mybatis.service;

import com.example.mybatis.entity.Order;
import com.github.pagehelper.Page;

import java.util.List;

/**
 * Created by mengday.zhang on 2018/3/25.
 */
public interface OrderService {

    List<Order> getOrders();

    Page<Order> getOrdersByPage(Integer pageNo, Integer pageSize);
}
