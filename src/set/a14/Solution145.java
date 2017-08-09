package set.a14;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution145 {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		reverseTraverse(root, res);
		return res;
    }
	
	private void reverseTraverse(TreeNode root, List<Integer> list){
		if(root != null){
			reverseTraverse(root.left, list);
			reverseTraverse(root.right, list);
			list.add(root.val);
		}
	}
}
