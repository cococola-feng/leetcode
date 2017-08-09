package set.a11;

import common.TreeLinkNode;

public class Solution117 {
	public void connect(TreeLinkNode root) {
		TreeLinkNode level_first = root;
        while(level_first != null){
        	TreeLinkNode cur = level_first;
        	while(cur!=null){
        		if(cur.left != null){
        			if(cur.right != null){
        				cur.left.next = cur.right;
        			}else{
        				cur.left.next = firstChild(cur.next);
        			}
        		}
        		if(cur.right !=null){
        			cur.right.next = firstChild(cur.next);
        		}
        		cur = cur.next;
        	}
        	level_first = firstChild (level_first);
        }
    }
	private TreeLinkNode firstChild (TreeLinkNode node){
		while(node != null){
			if(node.left != null) return node.left;
			if(node.right != null) return node.right;
			node = node.next;
		}
		return null;
	}
}
