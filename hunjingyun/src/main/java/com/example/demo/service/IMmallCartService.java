package com.example.demo.service;

import com.example.demo.entity.MmallCart;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

/**
 * @author  wangzhen
 */
public interface IMmallCartService extends IBaseService<MmallCart> {
	MmallCart getCart();
	PageInfo<MmallCart> getAllCart(Integer pageNo,Integer pageSize);
	Page<MmallCart> getMmallPage(Integer pageNo,Integer pageSize);
	int add(MmallCart mmallCart)throws Exception;

}
