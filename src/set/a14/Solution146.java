package set.a14;

import common.ListNode;

public class Solution146 {
	public ListNode insertionSortList(ListNode head) {
		if(head == null){
			return head;
		}
		
		//return res.next at last
		ListNode res = new ListNode(Integer.MIN_VALUE);
		
		ListNode pre = res;
		ListNode node = head;
		
		while(node != null){
			//write down the next node to visit
			ListNode next = node.next;
			
			while(pre.next != null && node.val > pre.next.val){
				pre = pre.next;
			}
			node.next = pre.next;
			pre.next = node;
			pre = res;
			node = next;
			
			node = next;
		}
		return res.next;
    }
}
