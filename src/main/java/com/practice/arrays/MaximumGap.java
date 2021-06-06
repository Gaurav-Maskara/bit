package com.practice.arrays;

import java.util.ArrayList;
import java.util.List;

public class MaximumGap {

	public static void main(String[] args) {
		
        MaximumGap maximumGap = new MaximumGap();
		int[] arr = {3,5,4,2};
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0 ; i<arr.length; i++) {
			al.add(arr[i]);
		}
		
		System.out.println(maximumGap.maximumGap(al));
		
		
	}

	public int maximumGap(final List<Integer> A) {
		int maxDistance = 0;
		for(int i = 0 ; i<A.size(); i++) {
			for(int j = i+1; j<A.size(); j++) {
				if(A.get(i)<=A.get(j)) {
					maxDistance = Math.max(maxDistance, (j-i));
				}
			}
		}
		return maxDistance;
	}

}
