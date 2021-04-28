package cn.service;

import java.util.List;

import cn.pojo.EasybuyProductCategory;
import cn.utils.ReturnResult;

public interface Product_Category_Service {
//	·ÖÀà
	public List<EasybuyProductCategory> getProductCategoryList(int typeId);
	public List<EasybuyProductCategory> getProductCategoryListOne();
	
//	µÇÂ¼
	public ReturnResult Login(String name,String pwd); 
}
