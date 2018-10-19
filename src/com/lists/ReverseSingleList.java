package com.lists;

public class ReverseSingleList {
	public static void main(String[] args) {
		
	}
	
	public ListNode reverseList(ListNode head) {

		if (head == null) {
			return head;
		}

		ListNode p1 = head;
		ListNode p2 = p1.next;
		ListNode p3 = p2.next;
		p1.next = null;
		while (p3 != null) {
			p2.next = p1;
			p1 = p2;
			p2 = p3;
			p3 = p3.next;
		}
		return p3;
	}
}
