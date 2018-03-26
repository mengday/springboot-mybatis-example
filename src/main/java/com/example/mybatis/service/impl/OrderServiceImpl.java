package com.example.mybatis.service.impl;

import com.example.mybatis.entity.Order;
import com.example.mybatis.mapper.OrderMapper;
import com.example.mybatis.service.OrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * Created by mengday.zhang on 2018/3/25.
 */
@Service
@Transactional(readOnly = true)
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> getOrders() {
        return orderMapper.getOrders();
    }

    @Override
    public Page<Order> getOrdersByPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo, pageSize);
        return orderMapper.getOrdersByPage();
    }
}
