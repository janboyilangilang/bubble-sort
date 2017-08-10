package com.main;

import java.util.Random;

public class BubbleSort {
	
	public int[] getRandomArray(int length) {
		int[] array = new int[length];
		Random random = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(length);
		}
		
		return array;
	}
	
	public int[] bubbleSort(int[] array) {
		boolean flag = true;
		int holdingVar;
		
		while(flag) {
			flag = false;
			for (int i = 0; i < array.length - 1; i++) {
				if(array[i] > array[i + 1]) {
					holdingVar = array[i];
					array[i] = array[i + 1];
					array[i + 1] = holdingVar;
					flag = true;
				}
			}
		}
		
		return array;
	}
}
