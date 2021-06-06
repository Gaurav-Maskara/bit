package com.practice.linked.list;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		
		
		MergeTwoSortedLists main = new MergeTwoSortedLists();
		
		ListNode A = new ListNode(5);
		main.insertNode(8, A);
		main.insertNode(20, A);
		main.printLinkedList(A);
		
		ListNode B = new ListNode(4);
		main.insertNode(11, B);
		main.insertNode(15, B);
		main.printLinkedList(B);
		
		
		ListNode newHead = main.mergeTwoLists(A, B);
		main.printLinkedList(newHead);
		
		
		

	}
	
	
	
	public ListNode mergeTwoLists(ListNode A, ListNode B) {
		
		ListNode newHead;
		ListNode pointerA;
		ListNode pointerB;
		
		if(A.val <= B.val) {
			newHead = new ListNode(A.val);
			pointerA = A.next;
			pointerB = B;
		}else {
			newHead = new ListNode(B.val);
			pointerA = A;
			pointerB = B.next;
		}
		
		ListNode temp = newHead;
		
		while((pointerA != null) || (pointerB != null)) {
			
			if(((pointerA != null && pointerB != null) && (pointerA.val <= pointerB.val)) || (pointerA != null && pointerB == null)) {
				ListNode nodeToInsert = new ListNode(pointerA.val);
				temp.next = nodeToInsert;
				temp = nodeToInsert;
				pointerA = pointerA.next;
				
			}else {
				ListNode nodeToInsert = new ListNode(pointerB.val);
				temp.next = nodeToInsert;
				temp = nodeToInsert;
				pointerB = pointerB.next;
			}
		}
		return newHead;
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
