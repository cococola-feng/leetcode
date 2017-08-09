package set.a11;

import common.TreeLinkNode;

public class Solution116 {
	public void connect(TreeLinkNode root) {
        TreeLinkNode level_first = root;
        while(level_first != null){
        	TreeLinkNode cur = level_first;
        	while(cur!=null){
        		if(cur.left != null){
        			cur.left.next = cur.right;
        		}
        		if(cur.right !=null && cur.next != null){
        			cur.right.next = cur.next.left;
        		}
        		cur = cur.next;
        	}
        	level_first = level_first.left;
        }
    }
}
