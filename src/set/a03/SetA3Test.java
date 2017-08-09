package set.a03;

import java.security.SignatureException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SetA3Test {

//	@Test
	public void test031() {
//		int[] nums = new int[]{2, 1, 6, 5, 4, 3};
		int[] nums = new int[]{1, 1};
		Solution031 s = new Solution031();
		s.nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}
	
//	@Test
	public void test033() {
//		int[] nums = new int[]{4, 5, 6, 1, 2, 3};
//		int[] nums = new int[]{0,1,2,3};
//		int[] nums = new int[]{3,1,2};
		int[] nums = new int[]{3,1};
//		int[] nums = new int[]{2,3,4,5,6,7,8,1};
		int target = 1;
		Solution033 s = new Solution033();
		int rel = s.search(nums, target);
		System.out.println(rel);
	}
	
//	@Test
	public void test037() {
		String str = "..9748...7.........2.1.9.....7...24..64.1.59..98...3.....8.3.2.........6...2759..";
		int len = 9;
		char[][] board = new char[len][len];
		int index = 0;
		
		for(int i = 0; i < len; i++){
			for(int j =0; j < len; j++){
				board[i][j] = str.charAt(index++);
			}
		}
		
		for(int i = 0; i < len; i++){
			System.out.println(Arrays.toString(board[i]));
		}
		
		Solution037 s = new Solution037();
		s.solveSudoku(board);
		
	}
	
//	@Test
	public void test038() {
		Solution038 s = new Solution038();
		for(int i = 1; i < 7; i++){
			System.out.println(s.countAndSay(i));
		}
	}
	
//	@Test
	public void test039(){
		Solution039 s = new Solution039();
		int[] candidates = new int[]{2, 3, 6, 7};
		List<List<Integer>> rel = s.combinationSum(candidates, 7);
		
		for(List<Integer> list : rel){
			System.out.println(list.toString());
		}
	}
	
	@Test
	public void test040(){
		Solution040 s = new Solution040();
		int[] candidates = new int[]{10, 1, 2, 7, 6, 1, 5};
		
		List<List<Integer>> rel = s.combinationSum2(candidates, 8);
		
		for(List<Integer> list : rel){
			System.out.println(list.toString());
		}
	}


}
