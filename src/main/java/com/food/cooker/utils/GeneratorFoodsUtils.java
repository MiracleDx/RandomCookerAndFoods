package com.food.cooker.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.food.cooker.entity.Food;

@Component
public class GeneratorFoodsUtils {

	public List<Food> generatorFoodsList() {
		Food a = new Food.FoodBuilder().setFoodId(this.generatorUUID()).setFoodName("几蛋").builder();
		Food b = new Food.FoodBuilder().setFoodId(this.generatorUUID()).setFoodName("桑忙季").builder();
		Food c = new Food.FoodBuilder().setFoodId(this.generatorUUID()).setFoodName("盐存").builder();
		Food d = new Food.FoodBuilder().setFoodId(this.generatorUUID()).setFoodName("肉肉").builder();
		
		List<Food> foods = new ArrayList<>(); 
		foods.add(a);
		foods.add(b);
		foods.add(c);
		foods.add(d);
		
		//foods.forEach(System.out::println);
		return foods;
	}
	
	public String generatorUUID() {
		return UUID.randomUUID().toString().replace("-", "");
	}
}
