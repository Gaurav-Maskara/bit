package com.practice.stacks.queues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RainWaterTrapped {

	public static void main(String[] args) {

		RainWaterTrapped main = new RainWaterTrapped();
		ArrayList<Integer> array = new ArrayList<>(Arrays.asList(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1));
		System.err.println(main.trap(array));
		
		
	}

	public int trap(final List<Integer> A) {
	    int water = 0;
		for(int i = 0 ; i<A.size()-1;) {
			int val = A.get(i);
			
			if(val == 0) {
				i++;
			}
			
			int j;
			for(j = i+1; j <A.size(); j++) {
				if(A.get(j) != 0) {
					break;
				}
			}
			
			int height = Math.min(A.get(i), A.get(j));
			int width = (j -i -1);
			water = water + (height*width);
			i = j;
			
		}
		return water;
	}
	
	
	

}
