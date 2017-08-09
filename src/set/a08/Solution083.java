package set.a08;

import common.ListNode;

public class Solution083 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return head;
		}
		
        ListNode root = new ListNode(-1);
        root.next = head;
        
        ListNode pre = root;
        ListNode now = head;
        
        while(now != null){
        	if(now.next != null && now.val == now.next.val){
        		pre.next = now.next;
        		now = now.next;
        	}else{
    			pre = now;
        		now = now.next;
        	}
        }
        return root.next;
    }
}
