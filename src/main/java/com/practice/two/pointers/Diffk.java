package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class Diffk {

	public static void main(String[] args) {

		Diffk diffk= new Diffk();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4));
		
		System.out.println(diffk.diffPossible(list, 0));
		
	}

	public int diffPossible(ArrayList<Integer> A, int B) {
		int i = 0;
		int j = 1;
		
		while(i < j) {
			int value1 = A.get(i);
			int value2 = A.get(j);
			
			if(Math.abs(value1-value2) == B) {
				return 1;
			}else if(Math.abs(value1-value2) > B) {
				j--;
			}else {
				i++;
			}
			
		}
		return 0;
	}

}
