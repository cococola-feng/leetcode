package set.a23;

import common.ListNode;

public class Solution234 {
	public boolean isPalindrome(ListNode head) {
        int length = getLength(head);
        if(length == 0) return false;
        if(length == 1) return true;
        
        int midLength = length / 2;
        ListNode midNode = getKth(head, midLength);
        
        ListNode tail = reverse(midNode.next, null);
        midNode.next = null;
        
        boolean rel = true;
        while(head!= null && tail != null){
        	if(head.val != tail.val){
        		rel = false;
        		break;
        	}
        	head = head.next;
        	tail = tail.next;
        }
        return rel;
    }
	
	private ListNode reverse(ListNode node, ListNode pre){
		if(node == null) return null;
		
		if(node.next != null){
			ListNode rel = reverse(node.next, node);
			node.next.next = node;
			return rel;
		}else{
			return node;
		}
		
		
	}
	
	private int getLength(ListNode head){
		if(head == null) return 0;
		
		int rel = 0;
		while(head != null){
			rel++;
			head = head.next;
		}
		
		return rel;
	}
	
	private ListNode getKth(ListNode head, int k){
		while(k > 1){
			head = head.next;
			k--;
		}
		
		return head;
	}
}
