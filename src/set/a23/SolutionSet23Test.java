package set.a23;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.TreeSet;

import org.junit.Test;

import common.ListNode;

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
	
//	@Test
	public void testSolution234() {
		Solution234 s = new Solution234();
		ListNode head = ListNode.create(new int[]{1,2});
		System.out.println(s.isPalindrome(head));
	}
	
//	@Test
	public void testHashSet() {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		System.out.println(set.first());
	}
	
//	@Test
	public void testSolution239() {
		int[] array = new int[]{1,3,-1,-3,5,3,6,7};
		Solution239 s = new Solution239();
		System.out.println(Arrays.toString(s.maxSlidingWindow(array, 3)));
		array = new int[] {1,3,1,2,0,5};
		System.out.println(Arrays.toString(s.maxSlidingWindow(array, 3)));
	}
	
//	@Test
	public void testDeque() {
		Deque<Integer> q = new ArrayDeque<Integer>();
		q.offer(1);
		q.offer(3);
		q.offer(2);
		System.out.println(q.pollLast());
	}
	
	@Test
	public void testSolution240() {
		int[][] matrix = new int[][]{
			  {1,   4,  7, 11, 15},
			  {2,   5,  8, 12, 19},
			  {3,   6,  9, 16, 22},
			  {10, 13, 14, 17, 24},
			  {18, 21, 23, 26, 30}
			};
			
		Solution240_Failed s = new Solution240_Failed();
		s.searchMatrix(matrix, 5);

	}

}
