package set.a14;

import common.ListNode;

public class Solution143_Fast {
	public void reorderList(ListNode head) {
		if(head == null){
			return;
		}
		
		ListNode p1 = head;
		ListNode p2 = head;
		
		while(p2.next != null && p2.next.next != null){
			p1 = p1.next;
			p2 = p2.next.next;
		}
		
		p2 = p1.next;
		p1.next = null;
		p1 = null;
		while(p2 != null){
			ListNode next = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = next;
			
		}
		
		boolean odd = true;
		p2 = head;
		ListNode pre = new ListNode(-1);
		while(p1 != null || p2 != null){
			if(odd){
				pre.next = p2;
				pre = p2;
				p2 = p2.next;
			}else{
				pre.next = p1;
				pre = p1;
				p1 = p1.next;
			}
			odd = !odd;
		}
	}
}
