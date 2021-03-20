package com.practice.arrays;

import java.util.ArrayList;

public class TripletsWithSumBetweenGivenRange {

	public static void main(String[] args) {

		TripletsWithSumBetweenGivenRange tp = new TripletsWithSumBetweenGivenRange();
		
		ArrayList<String> A = new ArrayList<String>();
		A.add("2.673662");
		A.add("2.419159");
		A.add("0.573816");
		A.add("2.454376");
		A.add("0.403605");
		A.add("2.503658");
		A.add("0.806191");
		
		System.out.println(tp.solve(A));
		
	}
	
	
	
	public int solve(ArrayList<String> A) {
		if(A.size()<3) {
			return 0;
		}
		
		for(int i = 0; i<=A.size()-3; i++) {
			for(int j = i+1; j<=A.size()-2; j++) {
				for(int k = j+1; k<A.size(); k++) {
					double sum =Double.parseDouble(A.get(i))+Double.parseDouble(A.get(j))+Double.parseDouble(A.get(k));
					if(sum <2 && sum>1) {
						return 1;
					}
				}
			}
		}
		return 0;
    }
	
	
	

}
