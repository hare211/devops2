package com.sist.web.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sist.web.vo.FoodVO;

@Mapper
public interface FoodMapper {
	List<FoodVO> foodListData(Map<String, Object> map);
	int foodTotalPage();
}
