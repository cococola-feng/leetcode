package set.a08;

import common.ListNode;

public class Solution086 {
	public ListNode partition(ListNode head, int x) {
        ListNode root = new ListNode(-1);
        root.next = head;
        
        ListNode leftPre = root;
        ListNode rightPre = root;
        
        while(leftPre.next != null){
        	if(leftPre.next.val >= x){
        		rightPre = leftPre.next;
        		while(rightPre.next != null){
        			if(rightPre.next.val < x){
        				ListNode moveNode = rightPre.next;
        				rightPre.next = moveNode.next;
        				moveNode.next = leftPre.next;
        				leftPre.next = moveNode;
        				break;
        			}else{
        				rightPre = rightPre.next;
        			}
        		}
        		if(rightPre.next == null){
        			break;
        		}
        	}else{
        		leftPre = leftPre.next;
        	}
        }
        
        return root.next;
    }	
}
