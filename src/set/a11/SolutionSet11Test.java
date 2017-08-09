package set.a11;

import java.util.List;

import org.junit.Test;

import common.TreeNode;

public class SolutionSet11Test {

//	@Test
	public void test114() {
		Solution114 s = new Solution114();
		TreeNode root = TreeNode.create(new int[]{1,2,5,3,4,-1,6}, 0);
		s.flatten(root);
		TreeNode.preorderTraverse(root);
	}
	
//	@Test
	public void test115() {
		Solution115 s = new Solution115();
		int rel = s.numDistinct("abbcc", "abc");
		System.out.println(rel);
	}
	
//	@Test
	public void test118() {
		Solution118 s = new Solution118();
		List<List<Integer>> list = s.generate(5);
		for(List<Integer> elem : list){
			System.out.println(elem);
		}
	}

	@Test
	public void test119() {
		Solution119 s = new Solution119();
		List<Integer> list = s.getRow(3);
		System.out.println(list);
	}
}
