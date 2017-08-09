package set.a09;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution095 {
	public List<TreeNode> generateTrees(int n) {
		if(n == 0){
			return new ArrayList<TreeNode>();
		}
		
        return recursiveGenerate(1, n);
    }
	
	private List<TreeNode> recursiveGenerate(int start, int end) {
		List<TreeNode> rel = new ArrayList<TreeNode>();
		
		if(start > end) {
			rel.add(null);
			return rel;
		}
		
		if(start == end) {
			rel.add(new TreeNode(start));
			return rel;
		}
		
		for(int i = start; i <= end; i++){
			List<TreeNode> leftList = recursiveGenerate(start, i - 1);
			List<TreeNode> rightList = recursiveGenerate(i + 1, end);
			
			for(TreeNode left : leftList){
				for(TreeNode right : rightList){
					TreeNode root = new TreeNode(i);
					root.left = left;
					root.right = right;
					rel.add(root);
				}
			}
		}
		
		return rel;
	}
}
