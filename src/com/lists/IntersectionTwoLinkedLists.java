package com.lists;
import java.util.HashSet;
import java.util.Set;

public class IntersectionTwoLinkedLists {
	public static void main(String[] args) {

	}

	
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;
		Set<ListNode> set = new HashSet<>();
		while (headA != null) {
			set.add(headA);
			headA = headA.next;
		}

		if (set.isEmpty()) {
			return null;
		}
		while (headB != null) {
			if (set.add(headB)) {
				headB = headB.next;
			} else {
				return headB;
			}
		}
		return null;

	}
	
	
	public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		ListNode a = headA;
		ListNode b = headB;

		while (a != b) {
			a = a == null ? headB : a.next;
			b = b == null ? headA : b.next;
		}

		return a;
	}
}
