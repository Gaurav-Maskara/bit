package com.practice.arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class Source {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		partitionNegativeAndPositive(n, arr);
	}

	static boolean checkOppositeSigns(int value1, int value2) {
		return ((value1 ^ value2) < 0);
	}

	// Method to partition negative and positive numbers without comparing with 0
	static void partitionNegativeAndPositive(int n, int arr[]) {
		// Write your code here

		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();

		first.add(arr[0]);
		
		for (int i = 1; i < arr.length; i++) {
			if (checkOppositeSigns(first.get(0), arr[i]))
	            second.add(arr[i]);
	        else
	        	first.add(arr[i]);
		}
		
	    if(first.size() == 0) {
	    	for(int i = 0 ; i < second.size(); i++) {
	    		System.out.print(second.get(i) + " ");
	    	}
	    	System.out.println();
	    	if(second.get(0) >= 0) {
	    		System.out.print("Array doesn't have negative numbers");
	    	}else {
	    		System.out.print("Array doesn't have positive numbers");
	    	}
	    }else if(second.size() == 0) {
	    	for(int i = 0 ; i < first.size(); i++) {
	    		System.out.print(first.get(i) + " ");
	    	}
	    	System.out.println();
	    	if(first.get(0) >= 0) {
	    		System.out.print("Array doesn't have negative numbers");
	    	}else {
	    		System.out.print("Array doesn't have positive numbers");
	    	}
	    }else {
	    	if(checkOppositeSigns(first.get(0), arr[0])) {
	    		for(int i = 0; i < second.size(); i++) {
	    			System.out.print(second.get(i) + " ");
	    		}
	    		System.out.println();
	    		for(int i = 0; i < first.size(); i++) {
	    			System.out.print(first.get(i) + " ");
	    		}
	    	}else {
	    		for(int i = 0; i < first.size(); i++) {
	    			System.out.print(first.get(i) + " ");
	    		}
	    		System.out.println();
	    		for(int i = 0; i < second.size(); i++) {
	    			System.out.print(second.get(i) + " ");
	    		}
	    	}
	    }
		
	}
}