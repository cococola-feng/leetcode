package set.a20;

import common.ListNode;

public class Solution206 {
	public ListNode reverseList(ListNode head) {
		return getHead(head);
    }
	
	private ListNode getHead(ListNode node){
		if(node == null) return null;
		
		ListNode next = node.next;
		ListNode rel = null;
		if(next != null){
			rel = getHead(next);
			next.next = node;
		}else{
			rel = node;
		}
		node.next = null;
		
		return rel;
	}
}
