package com.example.demo.serviceimpl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.MmallCartDao;
import com.example.demo.entity.MmallCart;
import com.example.demo.service.IMmallCartService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service("mmallCartService")
@Transactional(rollbackFor = Exception.class)
public class MmallCartServiceImpl extends BaseServiceImpl<MmallCart> implements IMmallCartService {

	@Autowired
	private MmallCartDao mmallCartDao;

	@Override
	public MmallCart getCart() {
		return mmallCartDao.selectByPrimaryKey(1);
	}

	@Override
	public PageInfo<MmallCart> getAllCart(Integer pageNo, Integer pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		List<MmallCart> cList = mmallCartDao.getAllMmallCart();
		PageInfo<MmallCart> pageInfo = new PageInfo<>(cList);
		return pageInfo;
	}

	@Override
	public Page<MmallCart> getMmallPage(Integer pageNo, Integer pageSize) {
		PageHelper.startPage(pageNo, pageSize);
		return mmallCartDao.getPageCart();
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public int add(MmallCart mmallCart) throws Exception {
			MmallCart mmallCartV0 = new MmallCart();
			mmallCartV0.setProductId(10);
			mmallCartV0.setUserId(112);
			mmallCartDao.insertSelective(mmallCartV0);
			MmallCart mmallCartV1 = new MmallCart();
			mmallCartV1.setProductId(10);
			mmallCartV1.setUserId(113);
			mmallCartDao.insertSelective(mmallCartV1);
		    throw new Exception("sad") ;
		//return 1;

	}

}
