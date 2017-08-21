package set.a22;

import common.TreeNode;

public class Solution222_SE {
	int height(TreeNode root) {
        return root == null ? 0 : 1 + height(root.left);
    }
    public int countNodes(TreeNode root) {
        int nodes = 0, h = height(root);
        while (root != null) {
            if (height(root.right) == h - 1) {
                nodes += 1 << h - 1;
                root = root.right;
            } else {
                nodes += 1 << h - 2;
                root = root.left;
            }
            h--;
        }
        return nodes;
    }
}
