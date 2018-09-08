package com.lists;

public class SortList {
	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(4);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(1);
		l1.next.next.next = new ListNode(3);
		
		SortList obj = new SortList();
		obj.sortList(l1);
		
	}
	
	public ListNode sortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode start = head;
		ListNode prev = null;

		while (start.next != null) {
			if (start.next.val < start.val) {
				prev = start;
				start = start.next;
				prev.next = start.next;
				start.next = prev;
				start = head;
			} else {
				start = start.next;
			}

		}
		return head;
	}
}
