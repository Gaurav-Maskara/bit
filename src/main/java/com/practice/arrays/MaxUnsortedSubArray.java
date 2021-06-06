package com.practice.arrays;

import java.util.ArrayList;

public class MaxUnsortedSubArray {

	public static void main(String[] args) {

		int[] array = {1,1};
		MaxUnsortedSubArray maxUnsortedSubArray = new MaxUnsortedSubArray();
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i<array.length; i++) {
			al.add(array[i]);
		}
		
		System.out.println(maxUnsortedSubArray.subUnsort(al));
	}

	
	
	public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
		
		ArrayList<Integer> listToReturn = new ArrayList<>();
		
		if((A.size()==0) ||(A.size() == 1) ) {
			listToReturn.add(-1);
			return listToReturn;
		}
		int firstPointer = 0;
		int secondPointer = 0;
		boolean isSorted = true;
		
		for(int i = 1; i<A.size(); i++) {
			secondPointer = i;
			if(A.get(firstPointer) <= A.get(secondPointer)) {
				firstPointer = i;
			}else {
				isSorted = false;
				secondPointer = i;
				break;
			}
		}
		
		if(isSorted) {
			listToReturn.add(-1);
			return listToReturn;
		}
		
		listToReturn.add(firstPointer);
		listToReturn.add(secondPointer);
		return listToReturn;
	}

}
