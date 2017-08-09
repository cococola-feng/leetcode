package set.a02;

import common.ListNode;

public class Solution024 {
	public ListNode swapPairs(ListNode head) {
		if (head == null){
			return null;
		}
		
        ListNode p = head;
        ListNode q = p.next;
        ListNode s = new ListNode(0);
        s.next = p;
        ListNode t = s;
        
        while (q != null){
        	t.next = q;
        	p.next = q.next;
        	q.next = p;
        	
        	t = p;
        	p = p.next;
        	q = p != null ? p.next : null;
        }
        
        return s.next;
    }
}
