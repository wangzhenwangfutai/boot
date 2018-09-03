package com.example.demo.service;

/**
 * @Author:wangzhen
 * @Date: 2018/8/21 22:04
 */
public interface IBaseService<T> {
    int deleteByPrimaryKey(Integer id);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);
}
