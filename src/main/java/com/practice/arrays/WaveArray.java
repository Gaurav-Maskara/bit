package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {

	public static void main(String[] args) {

		
		
	}

	public ArrayList<Integer> wave(ArrayList<Integer> A) {
		Collections.sort(A);
		int endpoint = A.size()%2 == 0 ? A.size():A.size()-1;
		
		for(int i = 0; i<endpoint; i=i+2) {
			int element1 = A.get(i);
			int element2 = A.get(i+1);
			A.set(i, element2);
			A.set(i+1, element1);
		}
		return A;
	}

}
