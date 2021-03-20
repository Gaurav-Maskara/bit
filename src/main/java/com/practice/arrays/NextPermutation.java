package com.practice.arrays;

import java.util.ArrayList;

public class NextPermutation {

	public static void main(String[] args) {

		NextPermutation nextPermutation = new NextPermutation();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(6);
		arrList.add(2);
		arrList.add(1);
		arrList.add(5);
		arrList.add(4);
		arrList.add(3);
		arrList.add(0);
		
//		arrList.add(5);
//		arrList.add(4);
//		arrList.add(3);
//		arrList.add(2);
//		arrList.add(1);
		
		
		System.out.println(nextPermutation.nextPermutation(arrList));
		
		
	}

	public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
		int postionAfterWhich = NextPermutation.findPositionAfterWhichItStrictlyDecreases(A);
		
		int nextBiggestValuePosition = 0;
		
		for(int i = postionAfterWhich; i<A.size(); i++) {
			if(A.get(i)>A.get(postionAfterWhich)) {
				nextBiggestValuePosition = i;
			}
		}
		
		int temp = A.get(postionAfterWhich);
		A.set(postionAfterWhich, A.get(nextBiggestValuePosition));
		A.set(nextBiggestValuePosition, A.get(temp));
		
		int postionAfterWhichTemp =postionAfterWhich;
		int last=A.size()-1;
		for(int i = postionAfterWhich+1; i<A.size()/2; i++) {
			int temp2 = A.get(i);
			A.set(i, A.get(last));
			A.set(last, temp2);
			last --;
		}
		return A;
	}
	
	
	public static int findPositionAfterWhichItStrictlyDecreases(ArrayList<Integer> arrList) {
		int strictlyAfter = 0;
		int slowPointer = 0;
		int fastPointer = 0;
		
		for(int i = 0; i<arrList.size()-1; i++) {
			slowPointer = i;
			fastPointer = i+1;
			if(arrList.get(slowPointer)-arrList.get(fastPointer)>0) {
				continue;
			}else {
				strictlyAfter = slowPointer;
			}
		}
		return strictlyAfter;
	}
	
	
	
	
	
	
}
