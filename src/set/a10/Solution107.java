package set.a10;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> rel = new ArrayList<List<Integer>>();
        
        if(root == null){
        	return rel;
        }
        
        List<TreeNode> preLevel = new ArrayList<TreeNode>();
        preLevel.add(root);
        
        search(preLevel, rel);
        
        return rel;
    }
	
	private void search (List<TreeNode> preLevel, List<List<Integer>> rel){
		List<TreeNode> thisLevel = new ArrayList<TreeNode>();
		
		for(TreeNode node : preLevel){
			if(node.left != null){
				thisLevel.add(node.left);
			}
			if(node.right != null){
				thisLevel.add(node.right);
			}
		}
		if(thisLevel.size() > 0){
			search(thisLevel, rel);
		}
		
		List<Integer> valList = new ArrayList<Integer>();
		for(TreeNode node : preLevel){
			valList.add(node.val);
		}
		rel.add(valList);
	}
}
