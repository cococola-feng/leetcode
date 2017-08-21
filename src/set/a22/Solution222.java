package set.a22;

import common.TreeNode;

public class Solution222 {
	public int countNodes(TreeNode root) {
        if(root == null) return 0;
        
        int depth = getDepth(root);
        
        if(depth == 1) return 1;
        
        int left = (int)Math.pow(2, depth - 1);
        int right = (int)(Math.pow(2, depth) - 1);
        
        if(getNode(root, right) != null) return right;
        
        while(left < right){
        	int mid = (left + right) / 2;
        	TreeNode midNode = getNode(root, mid);
        	if(midNode != null){
        		left = mid + 1;
        	}else{
        		right = mid;
        	}
        }
        
        return left - 1;
    }
	
	private int getDepth (TreeNode root){
		int count = 0;
		while(root != null){
			count++;
			root = root.left;
		}
		return count; 
	}
	
	private TreeNode getNode(TreeNode root, int number) {
		String array = Integer.toBinaryString(number);
		int index = 0;
		while(array.charAt(index) == '0') index++;
		
		while(++index < array.length()){
			if(array.charAt(index) == '0'){
				root = root.left;
			}else{
				root = root.right;
			}
		}
		
		return root;
	}
}
