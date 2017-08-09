package set.a0;

import java.util.Arrays;

import org.junit.Test;

public class SetATest{

	
//	@Test
	public void test001() {
		int[] array = new int[]{3, 2, 4};
		int[] rel = null;
		Solution001 p001 = new Solution001();
		rel = p001.twoSum(array, 6);
		System.out.println(Arrays.toString(rel));
	}

//	@Test
	public void test003() {
		System.out.println(new Solution003().lengthOfLongestSubstring("abba"));
	}
	
//	@Test
	public void test005() {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < 2; i++){
			sb.append('a');
		}
		System.out.println(new Solution005().longestPalindrome(sb.toString()));
	}
	
//	@Test
	public void test006() {
		System.out.println(new Solution006().convert("AB", 2));
	}
	
//	@Test
	public void test007() {
		System.out.println(new Solution007().reverse(-123));
		
	}
	
//	@Test
	public void test008() {
		Solution008 s = new Solution008();
		System.out.println(s.myAtoi("-2147483649"));
	}
	
//	@Test
	public void test009() {
		Solution009 s = new Solution009();
		System.out.println(s.isPalindrome(1000021));
	}
	
	@Test
	public void test010() {
		Solution010 s = new Solution010();
		System.out.println(s.isMatch("aa","a"));
		System.out.println(s.isMatch("aa","aa"));
		System.out.println(s.isMatch("aaa","aa"));
		System.out.println(s.isMatch("aa", "a*"));
		System.out.println(s.isMatch("aa", ".*"));
		System.out.println(s.isMatch("ab", ".*"));
		System.out.println(s.isMatch("aab", "c*a*b"));
	}
	
	
	
	
}
