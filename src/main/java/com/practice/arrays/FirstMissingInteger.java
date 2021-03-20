package com.practice.arrays;

import java.util.ArrayList;

public class FirstMissingInteger {

	public static void main(String[] args) {

		
	}

	
	public int firstMissingPositive(ArrayList<Integer> A) {
		
		int n = A.size();
		
		
		for(int i = 1; i<=n ; i++) {
			if(1<=A.get(i) && A.get(i)<=n) {
				A.set(i, i);
			}
		}
		
		
		
		
		
    }
}
