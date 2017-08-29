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
		
		int max = 0;
		for(List<TreeNode> pathP : listP){
			for(List<TreeNode> pathQ : listQ){
				int tmpCount = 0;
				TreeNode tmpNode = null;
				for(int i = 0; i < pathP.size() && i < pathQ.size(); i++){
					if(pathP.get(i).val == pathQ.get(i).val){
						tmpNode = pathP.get(i);
						tmpCount++;
					}
				}
				if(tmpCount > max){
					max = tmpCount;
					rel = tmpNode;
				}
			}
		}
		return rel;
    }
	
	private boolean searchNode(TreeNode node, TreeNode target, List<TreeNode> list, List<List<TreeNode>> relList) {
		if(node == null) return false;
		
		list.add(node);
		
		if(node == target){
			relList.add(new ArrayList<TreeNode>(list));
			return true;
		}
		
		boolean rel = searchNode(node.left, target, list, relList);
		if(!rel) rel = searchNode(node.right, target, list, relList);
		
		list.remove(list.size() - 1);
		
		return rel;
	}
}
