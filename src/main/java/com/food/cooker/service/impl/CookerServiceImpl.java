package com.food.cooker.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.food.cooker.entity.Food;
import com.food.cooker.service.CookerService;
import com.food.cooker.utils.GeneratorFoodsUtils;
import com.food.cooker.utils.GeneratorRandomUtils;
import com.food.cooker.vo.FoodVo;

@Service
public class CookerServiceImpl implements CookerService {
	
	@Resource
	private GeneratorRandomUtils generatorRandomUtils;
	
	@Resource
	private GeneratorFoodsUtils generatorFoodsUtils;

	@Override
	public List<FoodVo> getRandomFood() {
		Integer foodNumbers = 2;
		// 所有食物列表
		List<Food> foodList = generatorFoodsUtils.generatorFoodsList();
		System.out.println("所有的食物->");
		foodList.forEach(System.out::println);
		System.out.println("");
		
		// 前一天食物列表
		List<Food> yesterdayList = generatorRandomUtils.generatorRandomList(foodList, foodNumbers);
		System.out.println("昨天吃的->");
		yesterdayList.forEach(System.out::println);
		System.out.println("");
		
		// 剩余可选食物
		List<Food> lastList = foodList.stream().filter(e -> !yesterdayList.contains(e)).collect(Collectors.toList());
		System.out.println("剩下可选的->");
		lastList.forEach(System.out::println);
		System.out.println("");
		
		// 今天食物列表
		List<Food> todayList = generatorRandomUtils.generatorRandomList(lastList, foodNumbers);
		System.out.println("今天吃的->");
		todayList.forEach(System.out::println);
		List<FoodVo> voList = todayList.stream().map(e -> convert(e)).collect(Collectors.toList());
		return voList;
	}
	
	private FoodVo convert(Food food) {
		FoodVo vo = new FoodVo();
		BeanUtils.copyProperties(food, vo);
		return vo;
	}
}
