package set.a22;

import static org.junit.Assert.*;

import org.junit.Test;

import common.TreeNode;

public class SolutionSet22Test {

//	@Test
	public void testSolution221() {
		Solution221 s = new Solution221();
		char[][] matrix = new char[][]{{1, 1, 1, 1,}, {1, 1, 1, 0}, {1, 1, 1, 0}, {1, 0, 0, 0}};
		System.out.println(s.maximalSquare(matrix));
	}
	
//	@Test
	public void testSolution222() {
		Solution222 s = new Solution222();
		// Test Case {1} {1, 2, 3, 4, 5} {1, 2, 3, 4, 5, 6} {1, 2, 3, 4} {1, 2, 3} {}
		TreeNode root = TreeNode.construct(new int[]{1, 2, 3, 4, 5, 6, 7});
		System.out.println(s.countNodes(root));
	}
	
//	@Test
	public void testSolution222_SE() {
		Solution222_SE s = new Solution222_SE();
		TreeNode root = TreeNode.construct(new int[]{1, 2, 3});
		System.out.println(s.countNodes(root));
	}
	
//	@Test
	public void testSolution222Performance() {
		int[] arr = new int[200];
		for(int i = 0; i < arr.length; i++){
			arr[i] = i + 1;
		}
		TreeNode root = TreeNode.construct(arr);
		
		Solution222 s1 = new Solution222();
		Solution222_SE s2 = new Solution222_SE();
		
		long startTime = System.currentTimeMillis();
		System.out.println(s1.countNodes(root));
		System.out.println(System.currentTimeMillis() - startTime);
		
		startTime = System.currentTimeMillis();
		System.out.println(s2.countNodes(root));
		System.out.println(System.currentTimeMillis() - startTime);
		
	}
	
//	@Test
	public void testSolution223() {
		Solution223 s = new Solution223();
		System.out.println(s.computeArea(-2, -2, 2, 2, -3, 1, -1, 3));
	}
	
//	@Test
	public void testSolution224() {
		Solution224 s = new Solution224();
		System.out.println(s.calculate("1 + 1"));
		System.out.println(s.calculate(" 2-1 + 2 "));
		System.out.println(s.calculate("(1+(4+5+2)-3)+(6+8)"));
		System.out.println(s.calculate(" 2- (1 - 2)"));
	}

	@Test
	public void testSolution227() {
		Solution227 s = new Solution227();
		System.out.println(s.calculate("3+2*2"));
		System.out.println(s.calculate(" 3/2 "));
		System.out.println(s.calculate(" 3+5 / 2 "));
	}
}
