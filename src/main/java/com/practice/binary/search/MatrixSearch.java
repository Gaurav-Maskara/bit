package com.practice.binary.search;

import java.util.ArrayList;

public class MatrixSearch {

	public static void main(String[] args) {

		MatrixSearch matrixSearch = new MatrixSearch();
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(1);
		
		System.out.println(matrixSearch.doBinarySearch(arrayList, 1));
		
		
	}

	public int searchMatrix(ArrayList<ArrayList<Integer>> A, int B) {
		
		int rows = A.size();
		int columns = A.get(0).size();
		
		for(int i = 0 ; i<rows; i++) {
			ArrayList<Integer> currentRow = new ArrayList<>();
			currentRow = A.get(i);
			boolean isElementThere = doBinarySearch(currentRow, B);
			
			if(isElementThere) {
				return 1;
			}
		}
		return 0;
	}
	
	
	public boolean doBinarySearch(ArrayList<Integer> arrayList, int b) {
		
		int low = 0;
		int high = arrayList.size()-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arrayList.get(mid) == b) {
				return true;
			}else if(arrayList.get(mid) > b) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		
		return false;
	}
	
	
	
	
}
