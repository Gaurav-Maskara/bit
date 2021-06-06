package com.practice.binary.search;

import java.util.List;

public class RotatedSortedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int search(final List<Integer> A, int B) {
		int low = 0;
		int high = A.size()-1;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(A.get(mid) == B) {
				return mid;
			}else if(A.get(mid) <= A.get(high)) {
				if((B > A.get(mid)) && (B <= A.get(high)) ) {
					low = mid+1;
				}else {
					high = mid-1;
				}
			}else if(A.get(low) <= A.get(mid)) {
			    if((B >= A.get(low)) && (B < A.get(mid))) {
			    	high = mid-1;
			    }else {
			    	low = mid+1;
			    }
			}
		}
		return -1;
	}
}
