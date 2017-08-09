package set.a06;

import common.ListNode;

public class Solution061 {
	public ListNode rotateRight(ListNode head, int k) {
        ListNode root = new ListNode(-1);
        root.next = head;
        ListNode split = head;
        ListNode tail = head;
        
        if(head == null || k==0){
        	return head;
        }
        
        int len = 0;
        while(tail != null){
        	len++;
        	tail = tail.next;
        }
        
        k = k % len;
        
        tail = head;
        while(--k >= 0){
        	tail = tail.next;
        }
        
        while(tail.next != null){
        	tail = tail.next;
        	split = split.next;
        }
        
        tail.next = root.next;
        root.next = split.next;
        split.next = null;
        
        return root.next;
    }
}
