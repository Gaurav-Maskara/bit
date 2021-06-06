package com.practice.linked.list;

public class Kreverselinkedlist {

	public static void main(String[] args) {

		Kreverselinkedlist main = new Kreverselinkedlist();
		
		ListNode A = new ListNode(1);
		main.insertNode(2, A);
		main.insertNode(3, A);
		main.insertNode(4, A);
		main.insertNode(5, A);
		main.insertNode(6, A);
		
		
		//main.reverseList(A, 2);
		main.reverse(A);
		
		
	}

	
	public ListNode reverseList(ListNode A, int B) {
		ListNode tail = A;
		ListNode first = A;
		ListNode second = A.next;
		
		while(second != null) {
			ListNode temp = second.next;
			
			
			for(int i = 1; i<=B; i++) {
				
			}
			
			
			
		}
		
		
		
		
	}
	
	
	
	

	
	public void reverse(ListNode head) {
		ListNode first = head;
		ListNode second = head.next;
		ListNode tail = head;
		
		while(second != null) {
			ListNode temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
		
		head = first;
		tail.next = null;
		this.printLinkedList(head);
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
