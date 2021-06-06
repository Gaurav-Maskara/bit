package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ThreeSumZero {

	public static void main(String[] args) {

		ThreeSumZero threeSumZero = new ThreeSumZero();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(-1, 0, 1, 2, -1, -4));
		System.out.println(threeSumZero.threeSum(list));
		
	}

	public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {

		Collections.sort(A);
		ArrayList<ArrayList<Integer>> listToReturn = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < A.size()-2; i++) {
			int j = i+1;
			int k = A.size()-1;
			
			while(j < k) {
			   int sum = A.get(i)+A.get(j)+A.get(k);
			   
			   if(sum == 0) {
				   ArrayList<Integer> tempList = new ArrayList<>();
				   tempList.add(A.get(i));
				   tempList.add(A.get(j));
				   tempList.add(A.get(k));
				   
				   //System.out.println(tempList.toString());
				   
				   if(!listToReturn.contains(tempList)) {
					   listToReturn.add(tempList);
				   }
				 
				   //break;
				   j++;
				   k--;
				   
			   }else if(sum > 0) {
				   k--;
			   }else {
				   j++;
			   }
			}
		}
		
		return listToReturn;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
