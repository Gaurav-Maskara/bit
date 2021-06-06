package com.practice.strings;

public class LengthofLastWord {

	public static void main(String[] args) {

		LengthofLastWord lengthofLastWord= new LengthofLastWord();
		System.out.println(lengthofLastWord.lengthOfLastWord("Hello World"));
		
		
	}

	public int lengthOfLastWord(final String A) {
		if((A ==  null) || (A.length() == 0) || (A.trim().length() == 0)) {
			return 0;
		}
		
		int length = 0;
		char lastChar = A.charAt(A.length()-1);
		String lastWord = "";
		
		for(int i = A.length()-1; i >= 0; i--) {
			if((A.charAt(i) == ' ') && (lastChar == ' ') && (lastWord.length() == 0)) {
				continue;
			}else if((A.charAt(i) == ' ')) {
				break;
			}else {
				lastWord = lastWord+A.charAt(i);
			}
		}
		return lastWord.length();
	}

}
