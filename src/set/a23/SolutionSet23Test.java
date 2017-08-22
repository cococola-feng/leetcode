package set.a23;

import org.junit.Test;

import common.ListNode;
import set.a22.Solution223;

public class SolutionSet23Test {

//	@Test
	public void testSolution233() {
		Solution233 s = new Solution233();
		System.out.println("1: " + s.countDigitOne(101));
		
	}
//	@Test
	public void countDigitOne() {
		int n = 101;
		int count = 0;

		for (long k = 1; k <= n; k *= 10) {
			long r = n / k, m = n % k;
			// sum up the count of ones on every place k
			count += (r + 8) / 10 * k + (r % 10 == 1 ? m + 1 : 0);
		}

		System.out.println("2: " + count);
	}
	
	@Test
	public void testSolution234() {
		Solution234 s = new Solution234();
		ListNode head = ListNode.create(new int[]{1,2});
		System.out.println(s.isPalindrome(head));
	}

}
