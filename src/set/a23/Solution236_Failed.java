package set.a23;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution236_Failed {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode rel = null;
		List<TreeNode> listP = new ArrayList<TreeNode>();
		List<TreeNode> listQ = new ArrayList<TreeNode>();
		
		searchNode(root, p, listP);
		searchNode(root, q, listQ);
		
		for(int i = 0; i < listP.size() && i < listQ.size(); i++){
			if(listP.get(i).val == listQ.get(i).val){
				rel = listP.get(i);
			}else{
				break;
			}
		}
		return rel;
    }
	
	private boolean searchNode(TreeNode node, TreeNode target, List<TreeNode> list) {
		if(node == null) return false;
		
		list.add(node);
		
		if(node.val == target.val) return true;
		
		boolean rel = searchNode(node.left, target, list);
		if(!rel) rel = searchNode(node.right, target, list);
		
		if(!rel) list.remove(list.size() - 1);
		
		return rel;
	}
}
