package com.sist.web.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sist.web.dao.FoodMapper;
import com.sist.web.vo.FoodVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FoodServiceImpl implements FoodService{
	private final FoodMapper fMapper;
	
	@Override
	public List<FoodVO> foodListData(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int foodTotalPage() {
		// TODO Auto-generated method stub
		return 0;
	}
}
