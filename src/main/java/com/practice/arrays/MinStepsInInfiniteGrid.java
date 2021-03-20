package com.practice.arrays;

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {

	public static void main(String[] args) {

		MinStepsInInfiniteGrid minStepsInInfiniteGrid = new MinStepsInInfiniteGrid();
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(-7);
		A.add(-13);
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(1);
		B.add(-5);
		
		System.out.println(minStepsInInfiniteGrid.coverPoints(A, B));
		minStepsInInfiniteGrid.coverPoints(A, B);
		
		
		
		
	}

	public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
		
		
		int initialX = A.get(0);
		int initialY = B.get(0);
		
		
		int noOfSteps = 0;
		
		
		for(int i = 1; i<=A.size()-1; i++) {
			int currentX = A.get(i);
			int currentY = B.get(i);
			int maxDistance = Math.max(Math.abs(currentX-initialX), Math.abs(currentY-initialY));
			noOfSteps+=maxDistance;
			initialX = currentX;
			initialY = currentY;
		}
		
		return noOfSteps;
		
	}

}
