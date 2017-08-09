package set.a14;

import common.ListNode;

public class Solution148 {
	public ListNode sortList(ListNode head) {
		if(head == null || head.next == null){
			return head;
		}
		
        ListNode mid = null;
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
        	mid = slow;
        	slow = slow.next;
        	fast = fast.next.next;
        }
        
        mid.next = null;
        
        ListNode head1 = sortList(head);
        ListNode head2 = sortList(slow);
        
        return merge(head1, head2);
    }
	
	public ListNode merge(ListNode l1, ListNode l2){
		ListNode res = new ListNode(-1);
		ListNode pointer = res;
		
		while(l1 != null && l2 != null){
			if(l1.val < l2.val){
				pointer.next = l1;
				pointer = l1;
				l1 = l1.next;
			}else{
				pointer.next = l2;
				pointer = l2;
				l2 = l2.next;
			}
		}
		
		if(l1 != null){
			pointer.next = l1;
		}
		
		if(l2 != null){
			pointer.next = l2;
		}
		
		return res.next;
	}
}
