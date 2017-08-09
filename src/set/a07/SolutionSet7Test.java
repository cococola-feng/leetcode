package set.a07;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class SolutionSet7Test {

//	@Test
	public void test071() {
		Solution071 s = new Solution071();
//		System.out.println(s.simplifyPath("/a/./b/../../c/"));
//		System.out.println(s.simplifyPath("/.."));
//		System.out.println(s.simplifyPath("///"));
	}
	
//	@Test
	public void test072() {
		Solution072 s = new Solution072();
		System.out.println(s.minDistance("word", "watch"));
	}

	@Test
	public void test073() {
		Solution075 s = new Solution075();
		int[] nums = new int[]{1,0};
		s.sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}
