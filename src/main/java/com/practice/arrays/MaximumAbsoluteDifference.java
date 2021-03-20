package com.practice.arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

	public static void main(String[] args) {

		MaximumAbsoluteDifference maximumAbsoluteDifference = new MaximumAbsoluteDifference();
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(3);
		A.add(-1);
		
		System.out.println(maximumAbsoluteDifference.maxArr(A));
		
		
		
	}

	public int maxArr(ArrayList<Integer> A) {
		
		int maxValue = Integer.MIN_VALUE;
		int currentValue = 0;
		
		for(int i = 0 ; i<A.size(); i++) {
			
			for(int j = 0; j<A.size(); j++) {
				int positionI = i+1;
				int positionJ = j+1;
				currentValue = Math.abs(A.get(i)-A.get(j))+Math.abs(positionI-positionJ);
				
				if(maxValue <currentValue) {
					maxValue = currentValue;
				}
			}
		}
		
		return maxValue;
	}

}
