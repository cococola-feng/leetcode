package set.a10;

import common.TreeNode;

public class Solution108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		return recursiveBuild(nums, 0, nums.length - 1);
	}
	
	private TreeNode recursiveBuild(int[] nums, int start, int end){
		if(start > end){
			return null;
		}else if(start == end){
			return new TreeNode(nums[start]);
		}else{
			int mid = (start + end)/2;
			TreeNode root = new TreeNode(nums[mid]);
			root.left = recursiveBuild(nums, start, mid - 1);
			root.right = recursiveBuild(nums, mid + 1, end);
			return  root;
		}
	}
	
	/*public TreeNode sortedArrayToBST(int[] nums) {
		if(nums == null || nums.length == 0){
			return null;
		}
		
		TreeNode root = new TreeNode(nums[0]);
		for(int i = 1; i < nums.length; i++){
			insert(root, nums[i]);
		}
		
		return  root;
    }
	
	private void insert(TreeNode root, int val) {
		if(val < root.val){
			if(root.left != null){
				insert(root.left, val);
			}else{
				root.left = new TreeNode(val);
			}
		}else{
			if(root.right != null) {
				insert(root.right, val);
			}else{
				root.right = new TreeNode(val);
			}
		}
	}*/
}
