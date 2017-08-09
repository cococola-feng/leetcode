package set.a12;

import java.util.List;

import common.TreeNode;

public class Solution129 {
	private int sum = 0;
	public int sumNumbers(TreeNode root) {
		if(root == null) return sum;
		calculate(root, "");
        return sum;
    }
	
	private void calculate(TreeNode root, String parentValue) {
		if(root.left == null && root.right == null){
			sum += Integer.parseInt(parentValue+root.val);
		}else{
			if(root.left != null) calculate(root.left, parentValue + root.val);
			if(root.right != null) calculate(root.right, parentValue + root.val);
		}
	}
}
