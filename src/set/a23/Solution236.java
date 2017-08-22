package set.a23;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution236 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode rel = null;
		List<List<TreeNode>> listP = new ArrayList<List<TreeNode>>();
		List<List<TreeNode>> listQ = new ArrayList<List<TreeNode>>();
		
		searchNode(root, p, new ArrayList<TreeNode>(), listP);
		searchNode(root, q, new ArrayList<TreeNode>(), listQ);
		
		for(List<TreeNode> pathP : listP){
			for(List<TreeNode> pathQ : listQ){
				
			}
		}
		return rel;
    }
	
	private boolean searchNode(TreeNode node, TreeNode target, List<TreeNode> list, List<List<TreeNode>> relList) {
		if(node == null) return false;
		
		list.add(node);
		
		if(node.val == target.val){
			relList.add(new ArrayList<TreeNode>(list));
			return true;
		}
		
		boolean rel = searchNode(node.left, target, list, relList);
		if(!rel) rel = searchNode(node.right, target, list, relList);
		
		list.remove(list.size() - 1);
		
		return rel;
	}
}
