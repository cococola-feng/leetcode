package set.a09;

import common.TreeNode;

public class Solution098 {
	public boolean isValidBST(TreeNode root) {
        return checkBoarder(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
	
	private boolean checkBoarder(TreeNode node, int min, int max){
		if(node == null){
			return true;
		}

		if(node.val < min || node.val > max){
			return false;
		}

		if((node.val == Integer.MIN_VALUE && node.left != null) || (node.val == Integer.MAX_VALUE && node.right != null)){
			return false;
		}
		
		return checkBoarder(node.left, min, node.val - 1) && checkBoarder(node.right, node.val + 1, max);
	}
}
