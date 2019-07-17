package com.firstattempt.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbasicsApplication {

	//three things which are really important to specify the following
	//what are beans?
	//where to search for beans?
	
	 
	public static void main(String[] args) {
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		
		
		
		//System.out.println(result);
		
		ApplicationContext applicationContext = 
				SpringApplication.run(SpringbasicsApplication.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		//System.out.println(binarySearch);
		int result = binarySearch.binarySearch(new int [] {1,2,3}, 3);
		
		System.out.println(result);
	}

}
