package com.practice.linked.list;



public class AddTwoNumbersasLists {

	public static void main(String[] args) {
		
		AddTwoNumbersasLists main = new AddTwoNumbersasLists();

		ListNode A = new ListNode(9);
		main.insertNode(9, A);
		main.insertNode(1, A);
		
		
		ListNode B = new ListNode(1);
//		main.insertNode(6, B);
//		main.insertNode(4, B);
		
		main.printLinkedList(main.addTwoNumbers(A, B));
		 
		
	}

	public ListNode addTwoNumbers(ListNode A, ListNode B) {
		
		ListNode temp1 = A;
		ListNode temp2 = B;
		
		StringBuilder no1 = new StringBuilder();
		StringBuilder no2 = new StringBuilder();
		
		while(temp1 != null) {
			int val = temp1.val;
			no1.append(val);
			temp1 = temp1.next;
		}
		
		no1.reverse();
		
		while(temp2 != null) {
			int val = temp2.val;
			no2.append(val);
			temp2 = temp2.next;
		}
		
		no2.reverse();
		
		
		long addition = Long.parseLong(no1.toString())+Long.parseLong(no2.toString());
		StringBuilder finalAddition = new StringBuilder();
		finalAddition.append(addition);
		finalAddition.reverse();
		
		System.out.println(finalAddition);
		
		
		ListNode headToReturn = new ListNode(Character.getNumericValue(finalAddition.charAt(0)));
		temp1 = headToReturn;
		
		for(int i = 1 ; i<finalAddition.length(); i++) {
			char c = finalAddition.charAt(i);
			ListNode nodeToInsert = new ListNode(Character.getNumericValue(c));
			temp1.next = nodeToInsert;
			temp1 = nodeToInsert;
		}
		
		return headToReturn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void insertNode(int value, ListNode parent) {
		ListNode nodeToInsert = new ListNode(value);
		ListNode pointer = parent;

		while (pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.next = nodeToInsert;
	}

	public void printLinkedList(ListNode parent) {
		ListNode pointer = parent;
		while (pointer != null) {
			System.out.print(pointer.val + " ------ ");
			pointer = pointer.next;
		}
		System.out.println();
	}

}
