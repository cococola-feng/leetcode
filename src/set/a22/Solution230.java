package set.a22;

import java.util.List;

import common.TreeNode;

public class Solution230 {
	public int kthSmallest(TreeNode root, int k) {
		TreeNode node = new TreeNode(-1);
		midTraverse(root, k, node);
		return node.val;
    }
	
	private int midTraverse(TreeNode root, int k, TreeNode node){
		if(root == null || k <= 0){
			return k;
		}
		
		k = midTraverse(root.left, k, node);
		
		if(k == 1){
			node.val = root.val;
		}
		
		k--;
		
		if(k > 0){
			k = midTraverse(root.right, k, node);
		}
		
		return k;
	}
}
