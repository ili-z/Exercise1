package cn.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.EasybuyProduct;
import cn.utils.Pager;

public interface ProductionService {
	public List<EasybuyProduct> findEasybuyProductAll(@Param("pa")Pager pager);
	public int findTotalCount();//��ѯ�ܼ�¼��
}
