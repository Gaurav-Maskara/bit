package com.practice.arrays;

import java.sql.Array;
import java.util.ArrayList;

public class RotateMatrix {

	public static void main(String[] args) {

		RotateMatrix rotateMatrix= new RotateMatrix();
		
		
		ArrayList<ArrayList<Integer>> rotatedmatrix = new ArrayList<ArrayList<Integer>>();
		
		
		
	}

	public void rotate(ArrayList<ArrayList<Integer>> a) {
		
		ArrayList<ArrayList<Integer>> rotatedmatrix = new ArrayList<ArrayList<Integer>>(a);
		int rows = a.size();
		int columns = a.get(0).size();
		
		for(int i = 0 ; i<rows; i++) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			for(int j = 0 ; j<columns; j++) {
				int index = a.size() - i - 1;
				rotatedmatrix.get(j).set(index, a.get(i).get(j));
			}
		}
		
		a = rotatedmatrix;
	}

}
