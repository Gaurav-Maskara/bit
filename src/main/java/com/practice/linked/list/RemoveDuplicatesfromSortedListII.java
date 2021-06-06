package com.practice.linked.list;

public class RemoveDuplicatesfromSortedListII {

	public static void main(String[] args) {

		RemoveDuplicatesfromSortedListII main = new RemoveDuplicatesfromSortedListII();
		
		ListNode head = new ListNode(1);
		main.insertNode(2, head);
		main.insertNode(3, head);
		main.insertNode(3, head);
		main.insertNode(4, head);
		main.insertNode(4, head);
		main.insertNode(5, head);
		
		
		
//		ListNode head = new ListNode(1);
//		main.insertNode(1, head);
//		main.insertNode(1, head);
//		main.insertNode(2, head);
//		main.insertNode(3, head);
		
		main.printLinkedList(head);
		main.deleteDuplicates(head);
		main.printLinkedList(head);
	}

	
	public ListNode deleteDuplicates(ListNode A) {
		ListNode first = A;
		ListNode second = A;
		ListNode third = A.next;
		
		int noOfDuplicates = 1;
		
		while(second.next != null) {
			if(second.val == third.val) {
				noOfDuplicates++;
				third = third.next;
			}else if(noOfDuplicates == 1) {
				first = second;
				second = third;
				third = third.next;
			}else {
				//remove duplicates
				int counter = 0;
				first.next = third;
			    first = third;
			    second = third;
			    third = third.next;
			}
		}
		return A;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void insertNode(int value, ListNode head) {
		ListNode nodeToInsert = new ListNode(value);
		ListNode pointer = head;
		
		while(pointer.next != null) {
			pointer = pointer.next;
		}
		pointer.next = nodeToInsert;
	}
	
	public void printLinkedList(ListNode parent) {
		ListNode pointer = parent;
		while(pointer != null) {
			System.out.print(pointer.val +"------");
			pointer = pointer.next;
		}
		System.out.println();
		
	}

}













	 class ListNode {
		public int val;
		public ListNode next;
	
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
