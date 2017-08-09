package set.a10;

import common.TreeNode;

public class Solution105 {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
        return recursiveBuild(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
    }
	
	private TreeNode recursiveBuild(int[] preorder, int preI, int preJ, int[] inorder, int inI, int inJ){
		if(preI > preJ){
			return null;
		}
		
		TreeNode root = new TreeNode(preorder[preI]);
		int inM = inI;
		while(inM<= inJ && inorder[inM] != preorder[preI]) inM++;
		
		root.left = recursiveBuild(preorder, preI + 1, preI + inM - inI, inorder, inI, inM - 1);
		root.right = recursiveBuild(preorder, preI + inM - inI + 1, preJ, inorder, inM + 1, inJ);
		return root;
	}
}
