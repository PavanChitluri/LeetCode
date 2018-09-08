package com.lists;

public class LinkedListAddNode {
	
	public static void main(String[] args) {
		int x=21;
		System.out.println(x%10);
		System.out.println(x/10);
	}
	
	public ListNode getSumList(ListNode l1, ListNode l2) {
		ListNode newList = new ListNode(0);
		ListNode temp = newList;

		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {
			ListNode newNode = new ListNode(0);
			int sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val) + carry;
			carry = sum / 10;
			newNode.val = sum % 10;
			newList.next = newNode;
			newList = newNode;
			l1 = (l1 == null) ? l1 : l1.next;
			l2 = (l2 == null) ? l2 : l2.next;

		}

		return temp.next;

	}
	
	

}
