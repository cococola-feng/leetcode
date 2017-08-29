package set.a23;

import common.ListNode;

public class Solution237 {
	public void deleteNode(ListNode node) {
		if(node.next != null){
			node.val = node.next.val;
		}
		if(node.next.next != null){
			deleteNode(node.next);
		}else{
			node.next = null;
		}
    }
}
