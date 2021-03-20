package com.practice.arrays;

import java.util.ArrayList;

public class MaxNonNegativeSubArray {

	public static void main(String[] args) {

		MaxNonNegativeSubArray maxNonNegativeSubArray= new MaxNonNegativeSubArray();
		int[] arr1 = {0, 0, -1, 0};
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		for(int i = 0 ; i<arr1.length; i++) {
			arrayList.add(arr1[i]);
		}
		
		System.out.println(maxNonNegativeSubArray.maxset(arrayList));
	}
	
	
	
	public ArrayList<Integer> maxset(ArrayList<Integer> A) {
		
		ArrayList<Integer> listToReturn = new ArrayList<Integer>();
		ArrayList<Integer> counterList = new ArrayList<Integer>();
		long maxSum = 0;
		long counterSum = 0;
		
		
		int i =0;
		
		while(i < A.size()) {
			if(A.get(i)>=0) {
				break;
			}
			i++;
		}
		
		
		for(; i<A.size(); i++) {
			if(A.get(i)>=0) {
				counterSum+=A.get(i);
				counterList.add(A.get(i));
			}else if(A.get(i)<0) {
				if(maxSum<counterSum || (maxSum == counterSum && listToReturn.size()<counterList.size())) {
					maxSum = counterSum;
					listToReturn.clear();
					listToReturn.addAll(counterList);
					counterList.clear();
					counterSum = 0;
				}
				else {
					counterList.clear();
					counterSum = 0;
				}
			}
		}
		
		if(maxSum<counterSum || (maxSum == counterSum && listToReturn.size()<counterList.size())) {
			maxSum = counterSum;
			listToReturn.clear();
			listToReturn.addAll(counterList);
		}
		return listToReturn;
    }

}
