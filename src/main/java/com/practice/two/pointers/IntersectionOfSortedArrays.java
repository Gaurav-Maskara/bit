package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfSortedArrays {

	public static void main(String[] args) {

		IntersectionOfSortedArrays intersectionOfSortedArrays = new IntersectionOfSortedArrays();
		
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(10000000));
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(10000000));
		
		
		System.out.println(intersectionOfSortedArrays.intersect(A, B));
		
	}

	public ArrayList<Integer> intersect(final List<Integer> A, final List<Integer> B) {
		
		int counterA = 0;
		int counterB = 0;
		
		ArrayList<Integer> listToReturn = new ArrayList<>();
		
		
		//System.out.println(10000000 == 10000000);
		
		while((counterA < A.size()) && (counterB < B.size())) {
			int value1 = A.get(counterA);
			int value2 = B.get(counterB);
			
			if(value1 == value2) {
				listToReturn.add(A.get(counterA));
				counterA++;
				counterB++;
			}else if(value1 < value2) {
				counterA++;
			}else {
				counterB++;
			}
		}
		
		
		return listToReturn;
	}
	
	
	
	

}
