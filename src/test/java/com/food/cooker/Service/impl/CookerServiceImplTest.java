package com.food.cooker.Service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.food.cooker.service.CookerService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CookerServiceImplTest {

	@Resource
	private CookerService cookerService;
	
	@Test
	public void getRandomFoodTest() {
		cookerService.getRandomFood();
	}
	
}
