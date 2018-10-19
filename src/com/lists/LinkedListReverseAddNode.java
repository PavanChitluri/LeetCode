package com.lists;

import java.util.Stack;

/**
 * 
 * @author Pavan_Chitluri
 *	Input:
  		First List: 5->6->3  // represents number 563
  		Second List: 8->4->2 //  represents number 842
	Output
  		Resultant list: 1->4->0->5  // represents number 1405
 *
 */


public class LinkedListReverseAddNode {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(5);
		l1.next = new ListNode(6);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(8);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(2);
		LinkedListReverseAddNode obj = new LinkedListReverseAddNode();
		ListNode sumList = obj.getSumListUsingStacks(l1, l2);
		while(sumList!=null) {
			System.out.print(sumList.val);
			sumList=sumList.next;
		}
		System.out.println();
		
		ListNode sumListUsingReverse = obj.getSumListUsingReverse(l1, l2);
		while(sumListUsingReverse!=null) {
			System.out.print(sumListUsingReverse.val);
			sumListUsingReverse=sumListUsingReverse.next;
		}
		System.out.println();
	}
	
	
	// by reversing lists 
	public ListNode getSumListUsingReverse( ListNode l1, ListNode l2) {
		
		ListNode reverseList1 = reverseList(l1);
		ListNode reverseList2 = reverseList(l2);
		
		LinkedListForwardAddNode obj = new LinkedListForwardAddNode();
		ListNode sumList = obj.getSumList(reverseList1, reverseList2);
		
		return reverseList(sumList);
	}
	
	
	
	private ListNode reverseList(ListNode l2) {
		ListNode head = null;
		while(l2!=null) {
			ListNode node = new ListNode(l2.val);
			node.next = head;
			head = node;
			l2 =l2.next;
		}
		return head;
	}


	// using stacks 
	public ListNode getSumListUsingStacks(ListNode l1, ListNode l2) {
		
		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();
		// add every element to stack for each list
		while(l1!=null){
			s1.add(l1.val);
			l1=l1.next;
		}
		
		while(l2!=null){
			s2.add(l2.val);
			l2=l2.next;
		}
		
		ListNode head = null;
		int carry =0;
		while( !s1.isEmpty() || !s2.isEmpty() || carry!=0) {
			int sum = carry + (s1.isEmpty() ? 0 : s1.pop()) + (s2.isEmpty() ? 0 : s2.pop()) ;
			ListNode node = new ListNode(sum%10);
			carry = sum/10;
			if(head==null) {
				head = node;
			} else {
				node.next=head;
				head=node;
			}
		}
		return head;
	}
	
}
