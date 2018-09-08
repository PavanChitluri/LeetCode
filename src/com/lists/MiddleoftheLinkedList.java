package com.lists;

public class MiddleoftheLinkedList {
	public static void main(String[] args) {
		MiddleoftheLinkedList obj = new MiddleoftheLinkedList();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next = new ListNode(6);
		ListNode node = obj.middleNode(head);
		System.out.println(node.val);
	}

	public ListNode middleNode(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}

}
