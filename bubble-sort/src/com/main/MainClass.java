package com.main;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		BubbleSort bubbleSort = new BubbleSort();
		int[] createdArray = bubbleSort.getRandomArray(10);
		int[] sortedArray = bubbleSort.bubbleSort(createdArray);
		System.out.println(Arrays.toString(sortedArray));
	}
}
