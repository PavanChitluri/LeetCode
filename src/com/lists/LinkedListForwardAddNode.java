package com.lists;


/**
 * 
 * Input: 
 * 		  First List: 5->6->3 // represents number 365 
 * 		  Second List: 8->4->2 // represents number 248 
 * 	Output 
 *       Resultant list: 3->1->6 // represents number 613
 *       
 *       
 * Example 2
 * 
 * 	Input: First List: 7->5->9->4->6 // represents number 64957 
 * 		   Second List: 8->4  // represents number 48 
 * 		   Output Resultant list: 5->0->0->5->6 // represents number 65005
 */

public class LinkedListForwardAddNode {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(7);
		l1.next = new ListNode(5);
		l1.next.next = new ListNode(9);
		l1.next.next.next = new ListNode(4);
		l1.next.next.next.next = new ListNode(6);

		ListNode l2 = new ListNode(8);
		l2.next = new ListNode(4);
		// l2.next.next = new ListNode(2);

		LinkedListForwardAddNode obj = new LinkedListForwardAddNode();
		ListNode sumList = obj.getSumList(l1, l2);
		while (sumList != null) {
			System.out.print(sumList.val);
			sumList = sumList.next;
		}

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
