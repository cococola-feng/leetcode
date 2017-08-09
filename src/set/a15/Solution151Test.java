package set.a15;

import static org.junit.Assert.*;

import org.junit.Test;

public class Solution151Test {

//	@Test
	public void test() {
		Solution151 s = new Solution151();
		System.out.println(s.reverseWords("   a   b "));
	}
	
//	@Test
	public void test152() {
		Solution152 s = new Solution152();
//		System.out.println(s.maxProduct(new int[]{2, 3, -2, 4})); // 6
		System.out.println(s.maxProduct(new int[]{-4, -3, -2})); // 12
	}
	
//	@Test
	public void test153() {
		Solution153 s = new Solution153();
//		System.out.println(s.findMin(new int[]{4, 5, 6, 7, 0, 1, 2})); // 0
		System.out.println(s.findMin(new int[]{2, 3, 4, 5, 1}));
	}

	@Test
	public void test154() {
		Solution154 s = new Solution154();
//		System.out.println(s.findMin(new int[]{1, 1, 1}));
//		System.out.println(s.findMin(new int[]{2, 3, 4, 5, 1}));
//		System.out.println(s.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
//		System.out.println(s.findMin(new int[]{1, 3, 3})); 
//		System.out.println(s.findMin(new int[]{1, 3, 1, 1}));
//		System.out.println(s.findMin(new int[]{3, 3, 1, 3}));
		System.out.println(s.findMin(new int[]{3, 3, 3, 1}));
	}
}
