package set.a11;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> rel = new ArrayList<List<Integer>>();
		if(root == null) return rel;
		
		findPath(root, sum, new ArrayList<Integer>(), rel);
		
		return rel;
    }
	
	private void findPath(TreeNode root, int sum, List<Integer> list, List<List<Integer>> rel) {
        list.add(root.val);
        sum -= root.val;
        
        if(sum == 0 && root.left == null && root.right == null){
        	rel.add(new ArrayList<Integer>(list));
        	list.remove(list.size() - 1);
        	return;
        }
        
        if(sum > 0){
        	if(root.left != null)
        		findPath(root.left, sum, list, rel);
        	
        	if(root.right != null)
        		findPath(root.right, sum, list, rel);
        }
        list.remove(list.size() - 1);
    }
}
