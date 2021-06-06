package com.practice.strings;

import java.util.ArrayList;
import java.util.HashSet;

public class PrettyJson {

	public static void main(String[] args) {

		PrettyJson prettyJson = new PrettyJson();
		ArrayList<String> prettyArrayList = prettyJson.prettyJSON("[\"foo\", {\"bar\":[\"baz\",null,1.0,2]}]");
		
		prettyArrayList.stream().forEach(s -> System.out.println(s));
		
		
		
	}

	
	public ArrayList<String> prettyJSON(String A) {

		String totalIndentation = "";
		int noOfIndentation = 0;

		String newLine = "\n";

		int length = A.length();
		int counter = 0;

		ArrayList<String> listToReturn = new ArrayList<>();

		HashSet<Character> brackets = new HashSet<>();
		brackets.add('(');
		brackets.add('{');
		brackets.add('[');

		brackets.add(')');
		brackets.add('}');
		brackets.add(']');

		while (counter < A.length()) {
			char c = A.charAt(counter);
			String temp = "";

			if ((c == '{') || (c == '(') || (c == '[')) {
				// temp = Character.toString(c);
				//listToReturn.add(Character.toString(c));
				listToReturn.add(getIndentationString(noOfIndentation, Character.toString(c)));
				noOfIndentation++;
			} else if ((c == '}') || (c == ')') || (c == ']')) {
				// temp = Character.toString(c);
				//listToReturn.add(Character.toString(c));
				noOfIndentation--;
				listToReturn.add(getIndentationString(noOfIndentation, Character.toString(c)));
			} else if ((c == ',')) {
				listToReturn.add(Character.toString(c));
			} else {
				totalIndentation = "";
				temp = "";
				for (int i = 1; i <= noOfIndentation; i++) {
					totalIndentation = totalIndentation + "\t";
				}
                  temp = temp+totalIndentation;
				while ((A.charAt(counter) != ',') && (!brackets.contains(A.charAt(counter)))) {
                    temp = temp+Character.toString(A.charAt(counter));
                    counter++;
				}
				if((A.charAt(counter) == ',') && (!brackets.contains(A.charAt(counter)))) {
					temp = temp+Character.toString(A.charAt(counter));
					//counter++;
					listToReturn.add(temp);
					//listToReturn.add(Character.toString(A.charAt(counter)));
				}else if(brackets.contains(A.charAt(counter))) {
					listToReturn.add(temp);
					continue;
				}
//				else {
//					listToReturn.add(temp);
//				}
			}
			
			counter++;
		}
		return listToReturn;
	}
	
	
	
	public String getIndentationString(int noOfIndentation, String value) {
		
		String totalIndentation = "";
		String temp = "";
		for (int i = 1; i <= noOfIndentation; i++) {
			totalIndentation = totalIndentation + "\t";
		}
		
		temp = temp+totalIndentation+value;
		return temp;
		
	}
	
	
	

}
