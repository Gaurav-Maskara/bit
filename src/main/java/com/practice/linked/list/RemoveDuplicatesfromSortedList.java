package com.practice.linked.list;

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {

		RemoveDuplicatesfromSortedList main = new RemoveDuplicatesfromSortedList();
		
		ListNode A = new ListNode(1);
		main.insertNode(1, A);
		main.insertNode(1, A);
		main.insertNode(1, A);
		main.insertNode(1, A);
		main.insertNode(1, A);
		main.insertNode(1, A);
		
		
		main.insertNode(2, A);
		main.insertNode(2, A);
		main.insertNode(2, A);
		main.insertNode(2, A);
		main.insertNode(2, A);
		main.insertNode(2, A);
		
		
		main.insertNode(3, A);
		main.insertNode(3, A);
		main.insertNode(3, A);
		main.insertNode(3, A);
		main.insertNode(3, A);
		main.insertNode(3, A);
		
		
		
		main.insertNode(4, A);
		main.insertNode(4, A);
		main.insertNode(4, A);
		main.insertNode(4, A);
		main.insertNode(4, A);
		main.insertNode(4, A);
		
		
		main.insertNode(5, A);
		main.insertNode(5, A);
		main.insertNode(5, A);
		main.insertNode(5, A);
		main.insertNode(5, A);
		main.insertNode(5, A);
		
		
		main.insertNode(6, A);
		main.insertNode(6, A);
		main.insertNode(6, A);
		main.insertNode(6, A);
		main.insertNode(6, A);
		main.insertNode(6, A);
		
		
		
		main.printLinkedList(A);
		main.deleteDuplicates(A);
		main.printLinkedList(A);
		
		
	}

	
	
	
	public ListNode deleteDuplicates(ListNode A) {
		
		if((A == null) || (A.next == null)) {
			return A;
		}
		
		ListNode pointer1 = A;
		ListNode pointer2 = A.next;
		int noOfDuplicates = 0;
		
		while(pointer2 != null) {
			if(pointer1.val == pointer2.val) {
				noOfDuplicates++;
				pointer2 = pointer2.next;
			}else if(noOfDuplicates == 0) {
				pointer1 = pointer2;
				pointer2 = pointer2.next;
			}else {
				pointer1.next = pointer2;
				pointer1 = pointer2;
				pointer2 = pointer2.next;
				noOfDuplicates = 0;
			}
		}
		
		if(noOfDuplicates != 0) {
			pointer1.next = null;
			//pointer1 = pointer2;
			//pointer2 = pointer2.next;
		}
		
		return A;
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
			System.out.print(pointer.val +" ------ ");
			pointer = pointer.next;
		}
		System.out.println();
	}

}
