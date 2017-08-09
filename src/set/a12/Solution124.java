package set.a12;

import common.TreeNode;

public class Solution124 {
	private int max;
	public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        
        countNode(root);
        
        return max;
    }
	
	private int countNode(TreeNode node){
		if(node == null) return 0;
		
		int left = Math.max(0, countNode(node.left));
		int right = Math.max(0, countNode(node.right));
		
		max = Math.max(max, left + right + node.val);
		
		return Math.max(left, right) + node.val;
	}
}
