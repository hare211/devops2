package com.sist.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sist.web.service.FoodService;
import com.sist.web.vo.FoodVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	private final FoodService fService;
	
	@GetMapping("/main")
	public String main_main(@RequestParam(name = "page", defaultValue = "1") String page, Model model) {
		
		int curPage = Integer.parseInt(page);
		int rowSize = 12;
		int start = (rowSize * curPage) - (rowSize - 1);
		int end = rowSize * curPage;
		
		Map<String, Object> map = new HashMap<>();
		map.put("start", start);
		map.put("end", end);
		
		List<FoodVO> list = new ArrayList<>();
		int totalPage = 0;
		try {
			list = fService.foodListData(map);
			totalPage = fService.foodTotalPage();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		final int BLOCK = 10;
		int startPage = ((curPage - 1) / BLOCK * BLOCK) + 1;
		int endPage = ((curPage - 1) / BLOCK * BLOCK) + BLOCK;
		
		if (endPage > totalPage) {
			endPage = totalPage;
		}
		
		model.addAttribute("list", list);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("startPage", startPage);
		model.addAttribute("endPage", endPage);
		model.addAttribute("main_html", "main/home");
		return "main";
	}
}
