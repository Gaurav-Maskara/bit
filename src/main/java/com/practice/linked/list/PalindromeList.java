package com.practice.linked.list;

public class PalindromeList {
	
	

	public static void main(String[] args) {

		PalindromeList palindromeList = new PalindromeList();
		
		ListNode parent = new ListNode(1);
		palindromeList.insertNode(2, parent);
		palindromeList.insertNode(3, parent);
		palindromeList.insertNode(3, parent);
		palindromeList.insertNode(2, parent);
		palindromeList.insertNode(1, parent);
		
		palindromeList.printLinkedList(parent);
		
		
		System.out.println(palindromeList.lPalin(parent));
		
	}
	
	
	
	
	

	public int lPalin(ListNode A) {
		ListNode pointer = A;
		int noOfElements = 0;
		
		while(pointer != null) {
			noOfElements++;
			pointer = pointer.next;
		}
		
		pointer = A;
		int counter = 1;
		while(counter < (noOfElements/2)) {
			counter++;
			pointer = pointer.next;
		}
		
		
		while(pointer.next != null) {
		    ListNode temp = pointer.next;
		    pointer.next = 
		    
			
		}
		
		
		
		
		
		
		
		
		System.out.println("No of elements --> "+ noOfElements);
		System.out.println("Counter --> "+ counter);
		
		
		return 0;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void insertNode(int value, ListNode parent) {
		ListNode nodeToInsert = new ListNode(value);
		ListNode pointer = parent;
		
		while(pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.next = nodeToInsert;
	}
	
	public void printLinkedList(ListNode parent) {
		ListNode pointer = parent;
		while(pointer != null) {
			//System.out.print(pointer.val +"  ");
			pointer = pointer.next;
		}
		
	}

}


  class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; }
  }
  
  
  
  
 