package com.practice.arrays;

import java.util.List;

class BestTimeToBuyAndSellStock {
  
	public int maxProfit(List<Integer> A) {
		   if (A.size() == 0) {
	            return 0;
	        }

	        int sum = 0;
	        for (int i = 1; i < A.size(); i++) {
	            if (A.get(i) > A.get(i - 1)) {
	                sum += A.get(i) - A.get(i - 1);
	            }
	        }
	        return sum;
    }
}