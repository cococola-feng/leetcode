package set.a10;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> rel = new ArrayList<List<Integer>>();
		
		if(root == null){
			return rel;
		}
		
		List<TreeNode> preLevel = new ArrayList<TreeNode>();
		preLevel.add(root);
		
		while(preLevel.size() > 0){
			List<Integer> list = new ArrayList<Integer>();
			for(TreeNode node : preLevel){
				list.add(node.val);
			}
			rel.add(list);
			
			List<TreeNode> thisLevel = new ArrayList<TreeNode>();
			for(TreeNode node : preLevel){
				if(node.left != null){
					thisLevel.add(node.left);
				}
				if(node.right != null){
					thisLevel.add(node.right);
				}
			}
			preLevel = thisLevel;
		}
		
		return rel;
		
    }
}
