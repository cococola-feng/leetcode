package set.a0;

import common.ListNode;

public class Solution002 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode rel = new ListNode(-1);
        ListNode pre = rel;
        
        while(l1 != null || l2 != null || carry > 0){
        	if(l1 != null){
        		if(l2 == null){
        			sum = l1.val + carry;
        			l1 = l1.next;
        		}else{
        			sum = l1.val + l2.val + carry;
        			l1 = l1.next;
        			l2 = l2.next;
        		}
        	}else{
        		if(l2 == null){
        			sum = carry;
        		}else{
        			sum = l2.val + carry;
        			l2 = l2.next;
        		}
        	}
        	
        	carry = sum / 10;
        	sum = sum % 10;
        	
        	ListNode node = new ListNode(sum);
        	pre.next = node;
        	pre = node;
        }
        
        return rel.next;
    }
}
