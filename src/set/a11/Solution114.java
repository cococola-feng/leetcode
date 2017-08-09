package set.a11;

import common.TreeNode;

public class Solution114 {
	TreeNode preNode = null;
	public void flatten(TreeNode root) {
		if(root == null) return;
		
		if(preNode != null && root != preNode.right){
			preNode.right = root;
			preNode.left = null;
		}
		
		preNode = root;
		
		TreeNode left = root.left;
		TreeNode right = root.right;
		if(left != null) flatten(left);
		if(right != null) flatten(right);
    }
}
