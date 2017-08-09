package set.a10;

import common.TreeNode;

public class Solution106 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
        return recursiveBuild(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }
	
	private TreeNode recursiveBuild(int[] inorder, int inI, int inJ, int[] postorder, int postI, int postJ){
		if(inI > inJ || postI > postJ){
			return null;
		}
		
		int inM = inJ;
		while(inM >= inI && inorder[inM] != postorder[postJ]) inM--;
		
		TreeNode root = new TreeNode(postorder[postJ]);
		root.left = recursiveBuild(inorder, inI, inM - 1, postorder, postI, postI + inM - 1 - inI);
		root.right = recursiveBuild(inorder, inM + 1, inJ, postorder, postI + inM -inI, postJ - 1);
		
		return root;
	}
}
