package com.lists;

/**
 * @author Pavan_Chitluri 
 * Given a linked list, determine if it has a cycle in it.
 * Follow up: Can you solve it without using extra space?
 */

public class LinkedListCycle {

	public static void main(String[] args) {

	}

	public boolean hasCycle(ListNode head) {
		if (head == null)
			return false;
		ListNode temp1 = head;
		ListNode temp2 = head;
		while (temp2.next != null && temp2.next.next != null) {
			temp1 = temp1.next;
			temp2 = temp2.next.next;
			if (temp1 == temp2)
				return true;
		}
		return false;
	}

	public boolean hasCycle2(ListNode head) {
		if (head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

}
