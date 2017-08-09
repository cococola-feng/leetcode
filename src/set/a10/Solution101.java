package set.a10;

import common.TreeNode;

public class Solution101 {
	public boolean isSymmetric(TreeNode root) {
        if(root == null){
        	return true;
        }
        
        return recursiveSymmetric(root.left, root.right);
    }
	
	private boolean recursiveSymmetric(TreeNode left, TreeNode right){
		if(left == null || right == null){
			return left == right;
		}
		
		if(left.val != right.val){
			return false;
		}
		
		return recursiveSymmetric(left.left, right.right) && recursiveSymmetric(left.right, right.left);
	}
}
