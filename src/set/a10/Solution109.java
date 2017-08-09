package set.a10;

import common.ListNode;
import common.TreeNode;

public class Solution109 {
	public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
        	return null;
        }
        
        return recursiveBuild(head, null);
    }
	
	private TreeNode recursiveBuild(ListNode head, ListNode tail){
		ListNode mid = head;
		ListNode end = head;
		
		if(head == tail){
			return null;
		}
		
		while(end != tail && end.next != tail){
			mid = mid.next;
			end = end.next.next;
		}
		
		TreeNode root = new TreeNode(mid.val);
		root.left = recursiveBuild(head, mid);
		root.right = recursiveBuild(mid.next, tail);
		return root;
	}
}
