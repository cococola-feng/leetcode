package set.a25;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class Solution257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<String>();
        if(root == null) return res;
        
        if(root.left == null && root.right == null){
        	res.add("" + root.val);
        	return res;
        }
        
        List<String> leftPath = binaryTreePaths(root.left);
        List<String> rightPath = binaryTreePaths(root.right);
        
        for(String path : leftPath){
        	res.add(root.val + "->" + path);
        }
        
        for(String path: rightPath){
        	res.add(root.val + "->" + path);
        }
        
        return res;
    }
}
