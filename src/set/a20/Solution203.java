package set.a20;

import common.ListNode;

public class Solution203 {
	public ListNode removeElements(ListNode head, int val) {
        ListNode rel = new ListNode(-1);
        rel.next = head;
        
        ListNode node = head, pre = rel;
        
        while(node != null){
        	if(node.val == val){
        		pre.next = node.next;
        	}else{
        		pre = node;
        	}
        	node = node.next;
        }
        
        return rel.next;
    }
}
