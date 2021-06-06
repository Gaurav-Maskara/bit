package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;


public class ContainerWithMostWater {

	public static void main(String[] args) {
		
		ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 4, 3));
		
		System.out.println(containerWithMostWater.maxArea(list));
	}

	
	public int maxAreaBruteForce(ArrayList<Integer> A) {
		int maxArea = 0;
		
		for(int i = 0 ; i < A.size()-1; i++) {
			for(int j = i+1; j < A.size(); j++) {
				int length = Math.abs(j-i);
				int breadth = Math.min(A.get(i), A.get(j));
				int area = length*breadth;
				maxArea = Math.max(area, maxArea);
			}
		}
		
		return maxArea;
	}

	
	public int maxArea(ArrayList<Integer> A) {
		int startPointer = 0;
		int endPointer = A.size()-1;
		
		int maxArea = 0;
		
		while(startPointer < endPointer) {
			int length = Math.abs(endPointer-startPointer);
			int breadth = Math.min(A.get(startPointer), A.get(endPointer));
			int area = length*breadth;
			
			maxArea = Math.max(maxArea, area);
			
			if(A.get(startPointer) < A.get(endPointer)) {
				startPointer++;
			}else {
				endPointer--;
			}
		}
		
		return maxArea;
	}
	
	
	
	
}
