package com.food.cooker.utils;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class GeneratorRandomUtils {

	public int[] generatorRandomArray(Integer length, Integer randomRound) {
		int[] array = new int[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		SecureRandom random = new SecureRandom();
		int[] randomArray = new int[randomRound];
		for (int i = 0; i < randomRound; i++) {
			int index = random.nextInt(length - i) + i;
			int temp = array[i];
			randomArray[i] = array[index];
			array[index] = temp;
			//System.out.println(randomArray[i]);
		}
		return randomArray;
	}
	
	public <T> List<T> generatorRandomList(List<T> list, Integer randomRound) {
		int[] randomArray = new GeneratorRandomUtils().generatorRandomArray(list.size(), randomRound);
		List<T> randomList = new ArrayList<>(randomRound);
		for (int i = 0; i < randomArray.length; i++) {
			randomList.add(list.get(randomArray[i]));
		}
		//randomList.forEach(System.out::println);
		return randomList;
	}
}
