package com.lists;

/**
 * @author Pavan_Chitluri 
 * 		  Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * 
 *         If there are two middle nodes, return the second middle node.
 * 
 *         Example 1:
 * 
 *         Input: [1,2,3,4,5] Output: Node 3 from this list (Serialization:
 *         [3,4,5]) The returned node has value 3. (The judge's serialization of
 *         this node is [3,4,5]). Note that we returned a ListNode object ans,
 *         such that: ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, and
 *         ans.next.next.next = NULL. Example 2:
 * 
 *         Input: [1,2,3,4,5,6] Output: Node 4 from this list (Serialization:
 *         [4,5,6]) Since the list has two middle nodes with values 3 and 4, we
 *         return the second one.
 * 
 * 
 *         Note:
 * 
 *         The number of nodes in the given list will be between 1 and 100.
 */

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
