package set.a09;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution099 {
	/**
	 * When traversing a BST tree, each node that is left to node 
	 * A is print earlier than A and each node that is right to node 
	 * A is printed lately.
	 */
	
	/*TreeNode tobeSwap = null;
	TreeNode preNode = new TreeNode(Integer.MIN_VALUE);
	public void recoverTree(TreeNode root) {
		if(root == null){
			return;
		}
		
		recoverTree(root.left);
		
		if(preNode.val > root.val){
			if(tobeSwap == null){
				tobeSwap = root;
			}else{
				int tmp = tobeSwap.val;
				tobeSwap.val = root.val;
				root.val = tmp;
				return;
			}
		}
		preNode = root;
		
		recoverTree(root.right);
    }*/
	TreeNode firstElement = null;
    TreeNode secondElement = null;
    // The reason for this initialization is to avoid null pointer exception in the first comparison when prevElement has not been initialized
    TreeNode prevElement = new TreeNode(Integer.MIN_VALUE);
    
    public void recoverTree(TreeNode root) {
        
        // In order traversal to find the two elements
        traverse(root);
        
        // Swap the values of the two nodes
        int temp = firstElement.val;
        firstElement.val = secondElement.val;
        secondElement.val = temp;
    }
    
    private void traverse(TreeNode root) {
        
        if (root == null)
            return;
            
        traverse(root.left);
        
        // Start of "do some business", 
        // If first element has not been found, assign it to prevElement (refer to 6 in the example above)
        if (firstElement == null && prevElement.val >= root.val) {
            firstElement = prevElement;
        }
    
        // If first element is found, assign the second element to the root (refer to 2 in the example above)
        if (firstElement != null && prevElement.val >= root.val) {
            secondElement = root;
        }        
        prevElement = root;

        // End of "do some business"

        traverse(root.right);
}
	
}
