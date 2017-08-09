package set.a01;

import common.ListNode;

public class Solution019 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode detect = head;
		ListNode parent = new ListNode(-1);
		parent.next = head;
		ListNode node = head;
		
		ListNode rel = parent;
		
		while (n-- > 0 && detect != null){
			detect = detect.next;
		}
		
		if (n > 0){
			return null;
		}
		
		while (detect != null){
			detect = detect.next;
			node = node.next;
			parent = parent.next;
		}
		
		parent.next = node.next;
		
		return rel.next;
	}
}
