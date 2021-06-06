package com.practice.hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Sum2 {

	public static void main(String[] args) {

		Sum2 main = new Sum2();
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
		System.out.println(main.twoSum(arrayList, 9));
		
		
	
		
	}

	public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i = 0 ; i<A.size(); i++) {
			hm.put((B-A.get(i)), i);
		}
		
		
		
		
		ArrayList<Integer> listToReturn = new ArrayList<>();
		
		for(int i = 0; i<A.size(); i++) {
			if((hm.get(B-A.get(i)) != null) && (!(hm.get(B-A.get(i)) == i))) {
				listToReturn.add(i);
				listToReturn.add(hm.get(B-A.get(i)));
				return listToReturn;
			}
		}
		
		return listToReturn;
	}
}
