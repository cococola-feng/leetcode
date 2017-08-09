package set.a19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import common.TreeNode;

public class Solution199 {
	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> rel = new ArrayList<Integer>();
		if (root == null)
			return rel;

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode splite = new TreeNode(-1);
		TreeNode lastNode = null; // last node of this level
		
		queue.add(root);
		queue.add(splite);
		
		while(!queue.isEmpty()){
			TreeNode node = queue.poll();
			
			if(node == splite){
				rel.add(lastNode.val);
				if(queue.isEmpty()){
					break;
				}else{
					queue.add(node);
				}
			}else{
				lastNode = node;
				if(node.left != null){
					queue.add(node.left);
				}
				if(node.right != null){
					queue.add(node.right);
				}
			}
		}

		return rel;
	}
}
