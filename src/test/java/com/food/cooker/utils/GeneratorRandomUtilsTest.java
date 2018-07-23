package com.food.cooker.utils;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.food.cooker.entity.Food;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratorRandomUtilsTest {

	@Resource
	private GeneratorRandomUtils generatorRandomUtils;
	
	@Resource
	private GeneratorFoodsUtils GeneratorFoodsUtils;
	
	@Test
	public void generatorRandomArrayTest() {
		generatorRandomUtils.generatorRandomArray(10, 2);
	}
	
	@Test
	public void generatorRandomList() {
		Food a = new Food.FoodBuilder().setFoodId(GeneratorFoodsUtils.generatorUUID()).setFoodName("几蛋").builder();
		Food b = new Food.FoodBuilder().setFoodId(GeneratorFoodsUtils.generatorUUID()).setFoodName("桑忙季").builder();
		Food c = new Food.FoodBuilder().setFoodId(GeneratorFoodsUtils.generatorUUID()).setFoodName("盐存").builder();
		Food d = new Food.FoodBuilder().setFoodId(GeneratorFoodsUtils.generatorUUID()).setFoodName("肉肉").builder();
		
		List<Food> foods = new ArrayList<>(); 
		foods.add(a);
		foods.add(b);
		foods.add(c);
		foods.add(d);
		generatorRandomUtils.generatorRandomList(foods, 2);
	}
	
}
