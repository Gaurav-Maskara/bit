package com.practice.hashing;

public class Fraction {

	public static void main(String[] args) {

		Fraction main = new Fraction();
		System.out.println(main.fractionToDecimal(-2147483648, -1));
		
	}
	
	
	
	public String fractionToDecimal(int A, int B) {
		double answer = (double)A/B;
		
		if(answer == 0) {
			return "0";
		}
		
		String stringValue = ""+answer;
		
		int i = stringValue.indexOf(".")+1;
		StringBuilder sb = new StringBuilder(stringValue.substring(0, i));
		
		char a = stringValue.charAt(i);
		boolean isRepeated = false;
		for(; i < stringValue.length()-1; i++) {
			char b = stringValue.charAt(i+1);
			if(a == b) {
				isRepeated = true;
			}else {
				if(isRepeated) {
					sb.append("("+a+")");
					a = stringValue.charAt(i+1);
				}else {
					sb.append(a);
					a = b;
				}
				isRepeated = false;
			}
		}
		
		if(isRepeated) {
			sb.append("("+a+")");
		}
		
		return sb.toString();
    }

}
