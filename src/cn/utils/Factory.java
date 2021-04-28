package cn.utils;

import cn.service.Product_Category_Service;
import cn.service.impl.Product_Category_Service_Impl;
import cn.service.impl.ProductionService_Impl;

public class Factory {
	public static Product_Category_Service getProduct_Category_Service_Impl(String name) {
		if("Product_Category_Service".equals(name)) {
			return new Product_Category_Service_Impl();
		}
		return null;
	}
	public static ProductionService_Impl getProductionService_Impl(String name) {
		if("ProductionService".equals(name)) {
			return new ProductionService_Impl();
		}
		return null;
	}
}
