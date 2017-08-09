package set.a14;

import java.util.HashSet;

import common.ListNode;

public class Solution142 {
	public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode res = null;
        while(head != null){
        	if(set.contains(head)){
        		res = head;
        		break;
        	}
        	set.add(head);
        	head = head.next;
        }
        return res;
    }
}
