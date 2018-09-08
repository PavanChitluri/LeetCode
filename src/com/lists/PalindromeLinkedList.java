package com.lists;

public class PalindromeLinkedList {
	public static void main(String[] args) {
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(2);
		l2.next.next = new ListNode(1);
		l2.next.next.next = new ListNode(2);
	}

	public boolean isPalindrome(ListNode head) {

		ListNode fast = head;
		ListNode curr = head;
		ListNode prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		if (fast != null) {
			curr = curr.next;
		}

		while (prev != null && curr != null) {
			if (prev.val != curr.val) {
				return false;
			} else {
				curr = curr.next;
				prev = prev.next;
			}
		}
		return true;
	}

}
