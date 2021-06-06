package com.practice.stacks.queues;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindowMaximum {

	public static void main(String[] args) {

		
	}

	public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
		int length = A.size();
		int max = A.get(0);
		
		ArrayList<Integer> listToReturn = new ArrayList<>();
		int lengthToIterate = B>length ? length:B;
		
		for(int i = 0 ; i < lengthToIterate; i++) {
			max = Math.max(max, A.get(i));
		}
		
		if(B >= length) {
			listToReturn.add(max);
			return listToReturn;
		}
		
		
		for(int i = B; i < (length-B+1); i++) {
			max = Math.max(A.get(i), max);
			listToReturn	
		}
		
		
		
		
	}

}
