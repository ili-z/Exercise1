package cn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.pojo.EasybuyProduct;
import cn.utils.Pager;

public interface ProductionDao {
	public List<EasybuyProduct> findEasybuyProductAll(@Param("pa")Pager pager);
	public int findTotalCount();//查询总记录数
}
