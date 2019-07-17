package com.firstattempt.springbasics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int [] numbers) {
		//say logic of quick sort is implemented here
		return numbers;//example for spring not the exact logic
	}
}
