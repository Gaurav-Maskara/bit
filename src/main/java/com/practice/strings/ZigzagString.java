package com.practice.strings;

import java.util.ArrayList;
import java.util.HashMap;

public class ZigzagString {

	public static void main(String[] args) {

		
		ZigzagString zigzagString = new ZigzagString();
		System.err.println(zigzagString.convert("kHAlbLzY8Dr4zR0eeLwvoRFg9r23Y3hEujEqdio0ctLh4jZ1izwLh70R7SAkFsXlZ8UlghCL95yezo5hBxQJ1Td6qFb3jpFrMj8pdvP6M6k7IaXkq21XhpmGNwl7tBe86eZasMW2BGhnqF6gPb1YjCTexgCurS", 1));
		
		
	}

	public String convert(String A, int B) {
		
		
		if((B == 1)) {
			return A;
		}
		
		HashMap<Integer, ArrayList<Character>> hashMap = new HashMap<>();
		StringBuilder zigZagString = new StringBuilder();
		
		for(int i = 1; i <= B; i++) {
			hashMap.put(i, new ArrayList<>());
		}
		
		int counter = 1;
		
		char[] charArrray = A.toCharArray();
		int[] directionArray = new int[2*(B-1)];
		int directionArrayCounter = 0;
		
		
		for(int i = 1; i <= (directionArray.length/2); i++) {
			directionArray[directionArrayCounter] = 1;
			directionArrayCounter++;
		}
		
		for(int i = 1; i <= (directionArray.length/2); i++) {
			directionArray[directionArrayCounter] = -1;
			directionArrayCounter++;
		}
		
		
		
		directionArrayCounter = 0;
		counter = 1;
		
		for(int i = 0; i<A.length(); i++) {
			
			ArrayList<Character> arr = hashMap.get(counter);
			arr.add(charArrray[i]);
			hashMap.put(counter, arr);
			
			counter = counter + directionArray[directionArrayCounter];
			directionArrayCounter++;
			
			if(directionArrayCounter > directionArray.length-1) {
				directionArrayCounter = 0;
			}
			
		}
		
		
		
		int wordCounter = 0;
		counter = 1;
		
		while(wordCounter < A.length()) {
			ArrayList<Character> arr = hashMap.get(counter);
			for(Character c : arr) {
				zigZagString.append(c);
				wordCounter++;
			}
			
			if(counter == B) {
				counter = 1;
			}else {
				counter++;
			}
		}
		
		return zigZagString.toString();
	}
	
	
	
	
	
	
	
	
	

}
