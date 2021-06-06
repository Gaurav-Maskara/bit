package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;

import lombok.val;

public class SortbyColor {

	public static void main(String[] args) {

		SortbyColor sortbyColor = new SortbyColor();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0, 1, 2, 0, 1, 2));
		
		sortbyColor.sortColors(list);
		
	}

	public void sortColors(ArrayList<Integer> a) {
		
		ArrayList<Integer> list0 = new ArrayList<>();
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		int i = 0;
		int length = a.size();
		
		while(i < a.size()) {
			int value = a.get(i);
			switch(value) {
			   case 0:
			   list0.add(value);
			   break;
			   
			   case 1:
			   list1.add(value);
			   break;
				   
			   case 2:
			   list2.add(value);
			   break;
			}
			i++;
		}
		i = 0;
		a.clear();
		while(i < list0.size()) {
			a.add(list0.get(i));
			i++;
		}
		
		i = 0;
		while(i < list1.size()) {
			a.add(list1.get(i));
			i++;
		}
		
		i = 0;
		while(i < list2.size()) {
			a.add(list2.get(i));
			i++;
		}
		
		
		//System.out.println(a);
	}

}
