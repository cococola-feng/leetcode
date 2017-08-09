package set.a15;

import common.ListNode;

public class Solution160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode copyA = headA, copyB = headB;
        
        while(headA != headB){
        	headA = headA == null ? copyB : headA.next;
        	headB = headB == null ? copyA : headB.next;
        }
        
        return headA;
    }
	
}
