package com.example.demo.dao;

import org.springframework.stereotype.Component;

import com.example.demo.entity.MmallCart;

/**
 * @Author:wangzhen
 * @Date: 2018/8/21 22:02
 */
@Component
public interface BaseDao<T> {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);
}
