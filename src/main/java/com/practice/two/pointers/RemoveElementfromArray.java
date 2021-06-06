package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElementfromArray {

	public static void main(String[] args) {

		RemoveElementfromArray removeElementfromArray = new RemoveElementfromArray();
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, 1, 1, 2, 1, 3));
		
		System.out.println(removeElementfromArray.removeElement(list, 1));
		
	}

	public int removeElement(ArrayList<Integer> a, int b) {
		int i = 0;
		
		while(i < a.size()) {
			
			int value = a.get(i);
			if(value == b) {
				a.remove(i);
			}else {
				i++;
			}
		}
		System.out.println(a);
		return a.size();
	}

}
