package com.practice.heaps.and.maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;


public class Nmaxpaircombinations {

	public static void main(String[] args) {

		Nmaxpaircombinations main = new Nmaxpaircombinations();
		
		ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1,4,2,3));
		ArrayList<Integer> B = new ArrayList<>(Arrays.asList(2,5,1,6));
		
		System.out.println(main.solve(A, B));

	}
	

	public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
		ArrayList<Integer> listToReturn = new ArrayList<>();
		Collections.sort(A, Collections.reverseOrder());
		Collections.sort(B, Collections.reverseOrder());
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		for(int a:A) {
			for(int b:B) {
				if(pq.size()<A.size()) pq.add(a+b);
                else if(a+b>pq.peek()) pq.add(a+b);
                else break;
                if(pq.size()>A.size()) pq.remove();
			}
		}
		while(pq.size()>0) listToReturn.add(0,pq.poll());
		return listToReturn;
	}
	
	
	

}
