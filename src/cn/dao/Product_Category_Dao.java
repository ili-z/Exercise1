package cn.dao;

import java.util.List;

import cn.pojo.EasybuyProductCategory;
import cn.utils.ReturnResult;


public interface Product_Category_Dao{
//	����
	public List<EasybuyProductCategory> getProductCategoryList(int typeId);
	public List<EasybuyProductCategory> getProductCategoryListOne();
	
//	��¼
	public ReturnResult Login(String name,String pwd); 
	
}
