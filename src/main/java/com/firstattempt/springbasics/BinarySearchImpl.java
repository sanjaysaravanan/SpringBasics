package com.firstattempt.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public int binarySearch(int [] nums, int numToSearchFor) {
		//implementing the sorting algo
		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = bubbleSortAlgorithm.sort(nums);
		
		//bubble sort algo
		//quicksort algo
		
		System.out.println(sortAlgorithm);
		return 3;
	}
	//sorting array
	//search the array
	//return the result
	
	
}
