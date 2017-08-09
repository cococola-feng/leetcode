package set.a14;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution144 {
	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		reverseTraverse(root, res);
		return res;
    }
	
	private void reverseTraverse(TreeNode root, List<Integer> list){
		if(root != null){
			list.add(root.val);
			reverseTraverse(root.left, list);
			reverseTraverse(root.right, list);
		}
	}
}
