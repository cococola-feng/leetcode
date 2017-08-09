package set.a10;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> rel = new ArrayList<List<Integer>>();
		
		if(root == null){
			return rel;
		}
		
		List<TreeNode> preLevel = new ArrayList<TreeNode>();
		preLevel.add(root);
		boolean asc = true;
		
		while(preLevel.size() > 0){
			List<Integer> list = new ArrayList<Integer>();
			for(TreeNode node : preLevel){
				if(asc){
					list.add(node.val);
				}else{
					list.add(0, node.val);
				}
			}
			asc = !asc;
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
