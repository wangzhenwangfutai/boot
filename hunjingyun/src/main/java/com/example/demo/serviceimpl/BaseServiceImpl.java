package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.BaseDao;
import com.example.demo.service.IBaseService;

/**
 * @Author:wangzhen
 * @Date: 2018/8/21 22:06
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    private BaseDao<T> baseDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return baseDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(T record) {
        return baseDao.insertSelective(record);
    }

    @Override
    public T selectByPrimaryKey(Integer id) {
        return baseDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T record) {
        return baseDao.updateByPrimaryKeySelective(record);
    }
}
