package com.example.mybatis;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by mengday.zhang on 2018/3/25.
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>{

}
