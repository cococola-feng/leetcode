package set.a09;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution094 {
	List<Integer> list = null;
	public List<Integer> inorderTraversal(TreeNode root) {
		list = new ArrayList<Integer>();
        
		traverse(root);
		
		return list;
    }
	
	private void traverse(TreeNode node) {
		if(node == null){
			return;
		}
		
		traverse(node.left);
		list.add(node.val);
		traverse(node.right);
	}
}
