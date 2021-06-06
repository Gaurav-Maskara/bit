package com.practice.linked.list;

public class RemoveNthNodefromListEnd {

	public static void main(String[] args) {

		RemoveNthNodefromListEnd main = new RemoveNthNodefromListEnd();

		ListNode A = new ListNode(1);
//		main.insertNode(220, A);
//		main.insertNode(378, A);
//		main.insertNode(944, A);
//		main.insertNode(245, A);
//
	    main.removeNthFromEnd(A, 1);
		main.printLinkedList(A);

	}

	
	public ListNode removeNthFromEnd(ListNode A, int B) {
		if((A == null)) {
			return A;
		}
		
		int noOfElements = 0;
		ListNode temp = A;
		while(temp != null) {
			noOfElements++;
			temp = temp.next;
		}
		
		int indexOfElementToRemove = noOfElements-B+1;
		if(indexOfElementToRemove < 0) {
			indexOfElementToRemove = 1;
		}
		
		
		temp = A;
		ListNode previous = A;
		int counter  = 1;
		while(counter < indexOfElementToRemove) {
			counter++;
			previous = temp;
			temp = temp.next;
		}

		if((indexOfElementToRemove == 1) && (noOfElements == 1)) {
			return null;
		}else if((noOfElements == 1)) {
			ListNode next = A.next;
			A = next;
			A.next = next.next;
			return A;
		}else {
			previous.next = temp.next;
		}

		return A;
	}

//	public ListNode removeNthFromEnd(ListNode A, int B) {
//		int count = 0;
//		ListNode slow = A;
//		ListNode fast = A;
//		while (count++ <= B && fast != null) {
//			fast = fast.next;
//		}
//		if (count < B)
//			return A.next;
//		if (fast == null)
//			return slow.next;
//		while (fast != null) {
//			fast = fast.next;
//			slow = slow.next;
//		}
//		slow.next = slow.next.next;
//		return A;
//	}
	
	
	
	
	
	

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
