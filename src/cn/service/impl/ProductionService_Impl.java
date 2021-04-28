package cn.service.impl;

import java.util.List;

import cn.dao.ProductionDao;
import cn.pojo.EasybuyProduct;
import cn.service.ProductionService;
import cn.utils.MyBatisUtil;
import cn.utils.Pager;

public class ProductionService_Impl implements ProductionService{
private ProductionDao pd = MyBatisUtil.createSqlSession().getMapper(ProductionDao.class);
	@Override
	public List<EasybuyProduct> findEasybuyProductAll(Pager pager) {
		// TODO Auto-generated method stub
		return pd.findEasybuyProductAll(pager);
	}

	@Override
	public int findTotalCount() {
		// TODO Auto-generated method stub
		return pd.findTotalCount();
	}

}
