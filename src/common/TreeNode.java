package common;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;

	public TreeNode(int x) {
		val = x;
	}

	public static TreeNode create(int[] nums, int index) {
		TreeNode node = null;
		if (index >= 0 && index < nums.length && nums[index] != -1) {
			node = new TreeNode(nums[index]);
			node.left = create(nums, (index + 1) * 2 - 1);
			node.right = create(nums, (index + 1) * 2);
		}

		return node;
	}

	public static void preorderTraverse(TreeNode root) {
		if (root == null)
			return;
		System.out.println(root.val);
		preorderTraverse(root.left);
		preorderTraverse(root.right);
	}
	
	public static TreeNode construct(int[] array){
		if(array == null || array.length == 0) return null;
		return constructbyArray(array, 0);
	}
	
	private static TreeNode constructbyArray(int[] array, int index){
		TreeNode rel = null;
		if(index < array.length){
			rel = new TreeNode(array[index]);
			rel.left = constructbyArray(array, (index + 1) * 2 - 1);
			rel.right = constructbyArray(array, (index + 1) * 2);
		}
		return rel;
	}
}
