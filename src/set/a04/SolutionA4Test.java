package set.a04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SolutionA4Test {

//	@Test
	public void test041() {
		int[] nums = new int[]{3, 4, -1, 1};
		Solution041 s = new Solution041();
		System.out.println(s.firstMissingPositive(nums));
	}
	
//	@Test
	public void test042() {
		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
		Solution042 s = new Solution042();
		System.out.println(s.trap(nums));
	}
	
//	@Test
	public void test043() {
		Solution043 s = new Solution043();
//		System.out.println(s.add("123456789123456789", ""));
//		System.out.println(s.multiply("11", "11"));
		System.out.println(s.multiply("9999", "0"));
	}
	
//	@Test
	public void test044() {
		Solution044 s = new Solution044();
		System.out.println("false vs " + s.isMatch("aa", "a"));
		System.out.println("true vs " + s.isMatch("aa", "aa"));
		System.out.println("false vs " + s.isMatch("aaa", "aa"));
		System.out.println("true vs " + s.isMatch("aa", "*")); 
		
		System.out.println("true vs " + s.isMatch("aa", "a*"));
		System.out.println("true vs " + s.isMatch("ab", "?*"));
		System.out.println(". false vs " + s.isMatch("aab", "c*a*b"));
		System.out.println("false vs " + s.isMatch("zacabz", "*a?b")); //false
		//i == s.length and j < p.length - 1 and p.charAt(j) == '*
		System.out.println("true vs " + s.isMatch("c","*?*")); //true '*' represents zero or more character
		System.out.println("true vs " + s.isMatch("ho", "ho**"));//true
		System.out.println("false vs " + s.isMatch("babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab","***bba**a*bbba**aab**b"));
		
	}
	
//	@Test
	public void test045(){
		int[] nums = {2, 3, 1, 1, 4};
		Solution045 s = new Solution045();
		System.out.println(s.jump(nums));
	}
	
//	@Test
	public void test046(){
		int[] nums = {1, 2, 3};
		Solution046 s = new Solution046();
		List<List<Integer>> rel = s.permute(nums);
		for(List<Integer> permute : rel){
			System.out.println(permute.toString());
		}
	}
	
//	@Test
	public void testSize() {
		List<Integer> list = new 
				ArrayList<Integer>(10);
		list.add(5, 5);
		list.add(100,10);
		System.out.println(list.size());
	}
	
//	@Test
	public void test047() {
		int[] nums = {1, 2, 1, 2};
		Solution047 s = new Solution047();
		List<List<Integer>> rel = s.permuteUnique(nums);
		for(List<Integer> permute : rel){
			System.out.println(permute.toString());
		}
	}
	
//	@Test
	public void test048() {
		int[][] nums = {{1,2,3},{4,5,6},{7,8,9}};
		Solution048 s = new Solution048();
		s.rotate(nums);
		for(int[] lines : nums){
			System.out.println(Arrays.toString(lines));
		}
	}
	
	@Test
	public void test050(){
		Solution050 s = new Solution050();
		long time1 = System.currentTimeMillis();
		System.out.println(Math.pow(0.1, Integer.MAX_VALUE));
		long time2 = System.currentTimeMillis();
		System.out.println(s.myPow(0.1, Integer.MAX_VALUE));
		long time3 = System.currentTimeMillis();
		
		
		System.out.println(time2 - time1);
		System.out.println(time3 - time2);
	}

}
