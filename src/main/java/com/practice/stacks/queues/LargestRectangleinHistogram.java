package com.practice.stacks.queues;

import java.util.ArrayList;
import java.util.Arrays;


public class LargestRectangleinHistogram {

	public static void main(String[] args) {
		
		LargestRectangleinHistogram main = new LargestRectangleinHistogram();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2,1,5,6,2,3));
		
		System.out.println(main.largestRectangleArea(list));

	}

	public int largestRectangleArea(ArrayList<Integer> A) {
		
		if(A == null) {
			return 0;
		}
		
		if(A.size() == 1) {
			return A.get(0);
		}
		
		
		int pointer1 = 0;
		int pointer2 = A.size()-1;
		int height = Integer.MAX_VALUE;
		int area = Integer.MIN_VALUE;
		
		while(pointer1 < pointer2) {
			
			height = A.get(pointer1);
			for(int i = pointer1; i <= pointer2; i++) {
				height = Math.min(A.get(i), height);
			}
			int newArea = height * ((pointer2+1)-(pointer1+1)+1);
			area = Math.max(area, newArea);
			
			if(A.get(pointer1) <= A.get(pointer2)) {
				pointer1++;
			}else {
				pointer2--;
			}
		}
		return area;
	}

}
	