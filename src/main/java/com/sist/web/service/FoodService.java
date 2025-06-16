package com.sist.web.service;

import java.util.List;
import java.util.Map;

import com.sist.web.vo.FoodVO;

public interface FoodService {
	List<FoodVO> foodListData(Map<String, Object> map);
	int foodTotalPage();
}
