package set.a11;

import common.TreeNode;

public class Solution111 {
	public int minDepth(TreeNode root) {
		if(root == null){
			return 0;
		}
		
		int l = minDepth(root.left);
		int r = minDepth(root.right);
		
		if(l == 0){
			return r + 1;
		}else if(r == 0){
			return l + 1;
		}else{
			return Math.min(l, r) + 1;
		}
    }
}
