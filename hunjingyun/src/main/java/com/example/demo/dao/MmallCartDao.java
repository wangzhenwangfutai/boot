package com.example.demo.dao;


import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.MmallCart;
import com.github.pagehelper.Page;

@Component
public interface MmallCartDao extends BaseDao<MmallCart> {
    //使用分页方式一
    List<MmallCart> getAllMmallCart();

    //方式二
    Page<MmallCart> getPageCart();

}