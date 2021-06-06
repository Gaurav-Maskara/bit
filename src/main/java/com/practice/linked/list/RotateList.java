package com.practice.linked.list;

public class RotateList {

	public static void main(String[] args) {

	}

	public ListNode rotateRight(ListNode A, int B) {
		
		ListNode temp = A;
		int lengthOfList = 0;
		
		while(temp != null) {
			lengthOfList++;
			temp = temp.next;
		}
		
		if(B > lengthOfList) {
			B = B%lengthOfList;
		}
		
		temp = A;
		int rotatationRequired = lengthOfList-B+1;
		int count = 0;
		ListNode l ;
		
		
		
		
		
		
		
		
	}

}
