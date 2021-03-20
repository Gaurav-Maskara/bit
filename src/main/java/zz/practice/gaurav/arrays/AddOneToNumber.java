package zz.practice.gaurav.arrays;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class AddOneToNumber {

	public static void main(String[] args) {

		AddOneToNumber addOneToNumber = new AddOneToNumber();
	
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(0);
		A.add(0);
		A.add(9);
		
		addOneToNumber.plusOne2(A);
	}

	public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
		
		ArrayList<Integer> answer = new ArrayList<Integer>();
		ArrayList<Integer> finalAnswer = new ArrayList<Integer>();
		boolean flag = true;

		int lastDigit = 0;
		int carry =0;	
			lastDigit = A.get(A.size()-1);
			lastDigit++;
		
			if(lastDigit<=9) {
				answer.add(lastDigit);
				for(int i = A.size()-2; i>=0; i--) {
					if(A.get(i) == 0 && i==0) {
						break;
					}
					answer.add(A.get(i));
				}
			}
			else {
				answer.add(0);
				carry=1;
				for(int i = A.size()-2; i>=0; i--) {
					flag = false;
					lastDigit = A.get(i)+carry;
					if(lastDigit == 0 && i==0) {
						break;
					}
					if(lastDigit<=9 ) {
						answer.add(lastDigit);
						carry =0;
					}
					else if(i ==0 ){
						answer.add(0);
						answer.add(1);
					}
					else {
						answer.add(0);
						carry = 1;
					}
				}
				
				if(flag) {
					answer.add(1);
				}
				
			}
			
			Collections.reverse(answer);
			int countZeros = 0;
			for(int i = 0 ; i<answer.size(); i++) {
				if(answer.get(i)==0) {
					countZeros++;
				}else if(answer.get(i)!=0) {
					break;
				}
			}
			
			for(int i = countZeros; i<answer.size(); i++) {
				finalAnswer.add(answer.get(i));
			}
			
			return finalAnswer;
		}
		
		
		
	public ArrayList<Integer> plusOne2(ArrayList<Integer> a) {
	    int i = 0;
        //remove zeroes at the front
        while (i < a.size() - 1 && a.get(i) == 0) {
            a.remove(i);
        }

        int carry = 1;
        int sum;
        for (i = a.size() - 1; i >= 0; i--) {
            sum = a.get(i) + carry;
            a.set(i, sum % 10);
            carry = sum / 10;
            // no need of further processing if carry is zero
            if (carry == 0) {
                break;
            }
        }
        // if carry is still left
        if (carry != 0) {
            a.add(0, carry);
        }
        return a; 
	}

}
