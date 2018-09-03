package com.example.mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.example.mybatis.entity.Order;
import com.example.mybatis.entity.User;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.service.OrderService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mengday.zhang on 2018/3/25.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String getOrders(){
        List<Order> orders = orderService.getOrders();
        return JSON.toJSONString(orders);
    }

    /**
     * http://localhost:8080/orders/page?pageNo=2&pageSize=2
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping(value = "/page", produces = "application/json;charset=UTF-8")
    public String getOrdersByPage(Integer pageNo, Integer pageSize){
        Page<Order> orders = orderService.getOrdersByPage(pageNo, pageSize);
        PageInfo<Order> pageInfo = new PageInfo<>(orders);
        return JSON.toJSONString(pageInfo);
    }

//    @GetMapping("/users")
//    public String getUsers(){
//        List<User> users = userMapper.selectAll();
//        return JSON.toJSONString(users);
//    }
}
