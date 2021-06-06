package com.practice.greedy.algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class HighestProduct {

	public static void main(String[] args) {

		HighestProduct main = new HighestProduct();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));
		System.out.println(main.maxp3(list));
		
		
	}

	public int maxp3(ArrayList<Integer> A) {
		
		if((A == null) || (A.size() < 3)) {
			return 0;
		}
		
		Collections.sort(A, Collections.reverseOrder());
		
		int product = A.get(0)*A.get(1)*A.get(2);
		return product;
	}
	
	
	

}
