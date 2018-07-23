package com.food.cooker.service;

import java.util.List;

import com.food.cooker.vo.FoodVo;

public interface CookerService {

	List<FoodVo> getRandomFood();
}