package zz.practice.gaurav.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class MaximumConsecutiveGap {

	public static void main(String[] args) {

//		int[] arr = {1, 10, 5};
//		MaximumConsecutiveGap mcg = new MaximumConsecutiveGap();
//		
//		List<Integer> list = new ArrayList<Integer>();
//		for(int i : arr) {
//			list.add(i);
//		}
//		
//		System.out.println(mcg.maximumGap(list));
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 10000000; i>=0; i--) {
			Random rd = new Random();
		    list.add(rd.nextInt());
			//list.add(i);
		}
		
		
		
		MaximumConsecutiveGap mcg = new MaximumConsecutiveGap();
		mcg.normalSortingTime(list);
		mcg.treeSetSortingTime(list);
	}

	
	
	
	
	public int maximumGap(final List<Integer> A) {
		
		
		Set<Integer> set = new TreeSet<>(A);
		int lengthOfArray = A.size();
		int gap = 0;
		
		if(lengthOfArray < 2) {
			return gap;
		}
		
		Collections.sort(A);
		int tempGap = 0;
		for(int i = 0 ; i<A.size()-1 ; i++) {
			tempGap = Math.abs(A.get(i)-A.get(i+1));
			if(gap<tempGap) {
				gap = tempGap;
			}
		}
		return gap;
	}
	
	
	public void normalSortingTime(List<Integer> list) {
		
		long startTime = System.currentTimeMillis();
		Collections.sort(list);
		long endTime = System.currentTimeMillis();
		
		
		long totalMilliTaken = endTime - startTime;
		System.out.println("Time taken in nromal sorting in seconds---->" + totalMilliTaken/1000);
		
		
	}
	
	public void treeSetSortingTime(List<Integer> list) {
		
		long startTime = System.currentTimeMillis();
		Set<Integer> set = new TreeSet<>(list);
		long endTime = System.currentTimeMillis();
		
		
		
		long totalMilliTaken = endTime - startTime;
		System.out.println("Time taken in Tree set sorting in seconds---->" + totalMilliTaken/1000);
		
		
	}
	
	

}
