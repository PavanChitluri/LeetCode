package com.lists;
import java.util.HashMap;
import java.util.Map;

public class CopyListRandomPointer {
	public static void main(String[] args) {
		
	}
	
	public RandomListNode copyRandomList(RandomListNode head) {
		if(head==null) {
			return null;
		}
		Map<RandomListNode, RandomListNode> map= new HashMap<>();
		RandomListNode newList =new RandomListNode(head.label);
		
		
		RandomListNode start = newList;
		newList.next=head.next;
		newList.random=head.random;
		head=head.next;
		while(head!=null) {
			newList = newList.next;
			newList.next=head.next;
			head=head.next;
		}
		
        return start;
    }
}
