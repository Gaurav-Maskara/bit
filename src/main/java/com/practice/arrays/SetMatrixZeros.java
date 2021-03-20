package com.practice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class SetMatrixZeros {

	public static void main(String[] args) {

		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		Collections.fill(a, new ArrayList<Integer>());
		
		
		ArrayList<Integer> rows = new ArrayList<Integer>();
		rows.add(0);
		rows.add(0);
		
		
		ArrayList<Integer> rows2 = new ArrayList<Integer>();
		rows2.add(1);
		rows2.add(1);
		
		
		a.add(rows);
		a.add(rows2);
		
		
		System.out.println(a);
		
		
		SetMatrixZeros setMatrixZeros = new SetMatrixZeros();
		setMatrixZeros.setZeroes(a);
		
		
		
		
	}

	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
		
		int rows = a.size();
		int columns = a.get(0).size();
		
		HashMap<Integer, RowColumns> markedZeros = new HashMap<Integer, RowColumns>();
		int noOfZeros = 0;
		for(int i = 0 ; i<rows; i++) {
			for(int j = 0; j<columns; j++) {
				if(a.get(i).get(j)==0) {
					markedZeros.put(++noOfZeros, new RowColumns(i, j));
				}
			}
		}
		
		Set<Integer> keys= markedZeros.keySet();
		
		for(Integer i: markedZeros.keySet()) {
			int tempRows = markedZeros.get(i).getRow();
			int tempColumn = markedZeros.get(i).getColumn();
			
			for(int j = tempRows; j<=tempRows; j++ ) {
				for(int k = 0; k<columns; k++) {
					a.get(j).set(k, 0);
				}
			}
			
			for(int j = 0; j< rows; j++ ) {
				for(int k = tempColumn; k<=tempColumn; k++) {
					a.get(j).set(k, 0);
				}
			}
		}
	}

}


class RowColumns {
	private int row;
	private int column;

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public RowColumns(int row, int column) {
		super();
		this.row = row;
		this.column = column;
	}

}


