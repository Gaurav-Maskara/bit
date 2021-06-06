package com.practice.stacks.queues;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingcharacterinastreamofcharacters {

	public static void main(String[] args) {
		
		
		FirstNonRepeatingcharacterinastreamofcharacters main = new FirstNonRepeatingcharacterinastreamofcharacters();
		System.out.println(main.solve("abadbc"));

	}

	public String solve(String A) {
		
		if((A == null) || (A.length() <=1 )) {
			return A;
		}
		
		HashMap<Character, Integer> alphabets = new HashMap<>();
		
		for(char i = 'a'; i <= 'z'; i++) {
			alphabets.put(i, 0);
		}
		
		StringBuilder stringToReturn = new StringBuilder();
		Queue<Character> charQueue = new LinkedList<>();
		
		for(int i = 0 ; i < A.length(); i++) {
			Character c = A.charAt(i);
			
			charQueue.add(c);
			alphabets.put(c, (alphabets.get(c)+1));
			
			boolean isInserted = false;
			
			while(!isInserted) {
				if(!charQueue.isEmpty()) {
					if(alphabets.get(charQueue.peek()) == 1) {
						stringToReturn.append(charQueue.peek());
						isInserted = true;
					}else if(alphabets.get(charQueue.peek()) > 1) {
						charQueue.poll();
					}
				}else {
					stringToReturn.append("#");
					isInserted = true;
				}	
			}
		}
		
		return stringToReturn.toString();
		
	}

}
