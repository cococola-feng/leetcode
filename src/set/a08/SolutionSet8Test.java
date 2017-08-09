package set.a08;

import java.util.List;

import org.junit.Test;

public class SolutionSet8Test {

//	@Test
	public void test081() {
		Solution081 s = new Solution081();
		int[] nums = new int[]{1, 1, 1, 1, 3};
		System.out.println(s.search(nums, 3));
	}
	
//	@Test
	public void test084() {
		Solution084 s = new Solution084();
		int[] nums = new int[] {0, 2, 1, 2};
		System.out.println(s.largestRectangleArea(nums));
	}
	
//	@Test
	public void test089() {
		Solution089 s = new Solution089();
		List<Integer> list = s.grayCode(3);
		for(int i : list){
			System.out.println(i);
		}
	}
	
	@Test
	public void test090() {
		Solution090 s = new Solution090();
		int[] nums = new int[]{1, 2, 2};
		List<List<Integer>> rel = s.subsetsWithDup(nums);
		for(List<Integer> list : rel){
			System.out.println(list);
		}
	}
	

}
