package set.a08;

import common.ListNode;

public class Solution082 {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return head;
		}
		
        ListNode root = new ListNode(-1);
        root.next = head;
        
        ListNode pre = root;
        ListNode now = head;
        
        boolean dup = false;
        int dupVal = -1;
        
        while(now != null){
        	if(now.next != null && now.val == now.next.val){
        		dup = true;
        		dupVal = now.val;
        		pre.next = now.next;
        		now = now.next;
        	}else{
        		if(dup && dupVal == now.val){
        			pre.next = now.next;
            		now = now.next;
        		}else{
	        		pre = pre.next;
	        		now = now.next;
        		}
        		dup = false;
        	}
        }
        return root.next;
    }
}
