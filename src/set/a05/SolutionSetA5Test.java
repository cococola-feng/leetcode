package set.a05;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionSetA5Test {

//	@Test
	public void test051() {
		Solution051 s = new Solution051();
		List<List<String>> rel = s.solveNQueens(4);
		for(List<String> list : rel){
			for(String str: list){
				System.out.println(str);
			}
			System.out.println("----------------------");
		}
		
	}
	
//	@Test
	public void test052() {
		Solution052 s = new Solution052();
		System.out.println(s.totalNQueens(4));
	}
	
//	@Test
	public void test054(){
		int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		Solution054 s = new Solution054();
		System.out.println(s.spiralOrder(matrix));
	}
	
//	@Test
	public void test055(){
		int[] nums1 = new int[]{2,3,1,1,4};
		int[] nums2 = new int[]{3,2,1,0,4};
		
		Solution055 s = new Solution055();
		System.out.println(s.canJump(nums1));
		System.out.println(s.canJump(nums2));
	}
	
//	@Test
	public void test059(){
		Solution059 s = new Solution059();
		int[][] rel = s.generateMatrix(5);
		for(int[] line : rel){
			System.out.println(Arrays.toString(line));
		}
	}

	@Test
	public void test060(){
		Solution060 s = new Solution060();
		System.out.println(s.getPermutation(3, 4));
	}
}
