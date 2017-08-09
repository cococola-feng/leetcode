package set.a17;

import java.util.ArrayList;
import java.util.List;

import common.TreeNode;

public class BSTIterator {
	
	private List<Integer> list = new ArrayList<Integer>();
	private int index = 0;
	
	public BSTIterator(TreeNode root) {
        midTraverse(root);
        index = 0;
    }
	
	private void midTraverse(TreeNode root){
		if(root != null){
			midTraverse(root.left);
			list.add(root.val);
			midTraverse(root.right);
		}
	}

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return list.size() > index;
    }

    /** @return the next smallest number */
    public int next() {
        return list.get(index++);
    }
	
}
