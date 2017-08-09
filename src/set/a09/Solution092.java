package set.a09;

import common.ListNode;

public class Solution092 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode root = new ListNode(-1);
        root.next = head;
        
        ListNode end = null;
        ListNode pre = root;
        ListNode now = head;
        ListNode tail = null;
        
        for(int i = 1; i < m; i++){
        	pre = pre.next;
        	now = now.next;
        }
        
        end = pre;
        tail = now;
        
        pre = now;
        now = now.next;
        
        for(int i = m + 1; i <= n; i++){
        	ListNode tmp = now.next;
        	now.next = pre;
        	pre = now;
        	now = tmp;
        }
        
        end.next = pre;
        tail.next = now;
        
        return root.next;
    }
}
