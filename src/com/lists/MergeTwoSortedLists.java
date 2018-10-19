package com.lists;

/**
 * Merge two sorted linked lists and return it as a new list. 
 * The new list should be made by splicing together the nodes of the first two lists.
	Example:
	Input: 1->2->4, 1->3->4
	Output: 1->1->2->3->4->4
 */
import java.util.HashMap;
import java.util.Map;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);

		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		l2.next.next = new ListNode(5);
		l2.next.next = new ListNode(6);

		MergeTwoSortedLists obj = new MergeTwoSortedLists();
		obj.mergeTwoLists(l1, l2);

		Map map = new HashMap<>();
	}

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		}

		ListNode temp = new ListNode(-1);
		ListNode start = temp;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				start.next = l1;
				l1 = l1.next;
			} else {
				start.next = l2;
				l2 = l2.next;
			}
			start = start.next;
		}

		if (l1 == null) {
			start.next = l2;
		} else {
			start.next = l1;
		}

		return temp.next;
	}

	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {

		if (l1 == null && l2 == null) {
			return null;
		}

		if (l1 == null) {
			return l2;
		}

		if (l2 == null) {
			return l1;
		}

		while (l2 != null) {
			int value = l2.val;
			l1 = insert(l1, value);
			l2 = l2.next;
		}

		return l1;
	}

	public ListNode insert(ListNode l1, int value) {
		ListNode temp = l1;
		ListNode prev = null;
		ListNode newNode = new ListNode(value);
		if (value <= l1.val) {
			newNode.next = l1;
			l1 = newNode;
			return l1;
		}
		while (temp != null) {
			if (value <= temp.val) {
				newNode.next = prev.next;
				prev.next = newNode;
				break;
			}
			prev = temp;
			temp = temp.next;
			if (temp == null) {
				prev.next = newNode;
			}

		}
		return l1;
	}

}
