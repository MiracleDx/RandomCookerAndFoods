package com.food.cooker.entity;

import lombok.Data;

@Data
public class Food {

	private String foodId;
	
	private String foodName;
	
	private Food(String foodId, String foodName) {
		this.foodId = foodId;
		this.foodName = foodName;
	}
	
	public static class FoodBuilder {
		
		private String foodId;
		
		private String foodName;
		
		public FoodBuilder setFoodId(String foodId) {
			this.foodId = foodId;
			return this;
		}
		
		public FoodBuilder setFoodName(String foodName) {
			this.foodName =  foodName;
			return this;
		}
		
		public Food builder() {
			return new Food(foodId, foodName);
		}
	}
}
