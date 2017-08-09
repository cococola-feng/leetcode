package set.a14;

import common.ListNode;

public class Solution143 {
	public void reorderList(ListNode head) {
		boolean odd = true;
		ListNode pre = null;
		while(head != null){
			if(odd){
				odd = false;
				pre = head;
				head = head.next;
			}else{
				ListNode last = head;
				ListNode preLast = pre;
				while(last.next != null){
					preLast = last;
					last = last.next;
				}
				if(last != head){
					preLast.next = null;
					pre.next = last;
					last.next = head;
					odd = true;
					pre = last;
				}else{
					break;
				}
			}
			
		}
    }
}
