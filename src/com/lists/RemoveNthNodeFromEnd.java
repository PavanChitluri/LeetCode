package com.lists;

/**
 * @author Pavan_Chitluri
 * Given a linked list, remove the n-th node from the end of list and return its head.
	Example:
	Given linked list: 1->2->3->4->5, and n = 2.
	After removing the second node from the end, the linked list becomes 1->2->3->5.
 *
 */

public class RemoveNthNodeFromEnd {
	public static void main(String[] args) {
		ListNode list = new ListNode(1);
		list.next = new ListNode(2);
		list.next.next = new ListNode(3);
		list.next.next.next = new ListNode(4);
		list.next.next.next.next = new ListNode(5);
		RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();
		obj.removeNthFromEnd(list, 2);
	}

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n < 1) {
			return head;
		}
		int length = getLength(head);
		if (n == length) {
			head = head.next;
			return head;
		}

		ListNode curr = head;
		ListNode prev = null;
		for (int i = 0; i < length - n; i++) {
			prev = curr;
			curr = curr.next;
		}
		if (prev != null) {
			prev.next = curr.next;
		}

		return head;
	}

	public int getLength(ListNode head) {
		int length = 0;

		while (head != null) {
			length++;
			head = head.next;
		}

		return length;
	}

	/*
	 * public ListNode removeNthFromEnd(ListNode head, int n) { ListNode curr =
	 * head; ListNode prev = head;
	 * 
	 * for (int i = 0; i < n; i++) { curr= curr.next; }
	 * 
	 * while(curr.next!=null) { curr=curr.next; prev=prev.next; }
	 * System.out.println(prev); return prev; }
	 */
}
