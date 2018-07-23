package com.food.cooker.utils;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.food.cooker.utils.GeneratorFoodsUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneratorFoodsUtilsTest {

	@Resource
	private GeneratorFoodsUtils generatorFoodsUtils;
	
	@Test
	public void generatorFoodsListTest() {
		generatorFoodsUtils.generatorFoodsList();
	}
}
