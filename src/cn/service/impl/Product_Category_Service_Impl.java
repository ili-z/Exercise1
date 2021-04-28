package cn.service.impl;

import java.util.List;

import cn.dao.Product_Category_Dao;
import cn.pojo.EasybuyProductCategory;
import cn.service.Product_Category_Service;
import cn.utils.MyBatisUtil;
import cn.utils.ReturnResult;

public class Product_Category_Service_Impl implements Product_Category_Service{
	private Product_Category_Dao pcd = MyBatisUtil.createSqlSession().getMapper(Product_Category_Dao.class);

	@Override
	public List<EasybuyProductCategory> getProductCategoryList(int typeId) {
		// TODO Auto-generated method stub
		return pcd.getProductCategoryList(typeId);
	}

	@Override
	public List<EasybuyProductCategory> getProductCategoryListOne() {
		// TODO Auto-generated method stub
		return pcd.getProductCategoryListOne();
	}

	@Override
	public ReturnResult Login(String name, String pwd) {
		// TODO Auto-generated method stub
		return pcd.Login(name, pwd);
	}


}
