package set.a20;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import common.ListNode;

public class SolutionSet20Test {

//	@Test
	public void test206() {
		ListNode node = ListNode.create(new int[]{1});
		Solution206 s = new Solution206();
		ListNode rel = s.reverseList(node);
		ListNode.print(rel);
	}
	
//	@Test
	public void test207() {
		int[][] depends = new int[][]{{0, 1}, {1, 0}};
		
		Solution207 s = new Solution207();
		System.out.println(s.canFinish(2, depends));
	}
	
//	@Test
	public void test209() {
		int[] arr = new int[] {2,3,1,2,4,3};
		Solution209 s = new Solution209();
		int count = s.minSubArrayLen(7, arr);
		System.out.println(count);
	}
	
	@Test
	public void test210() {
		int[][] depends = new int[][]{{1,0}, {2,0}, {3,1}, {3,2}};
		Solution210 s = new Solution210();
		int[] rel = s.findOrder(4, depends);
		System.out.println(Arrays.toString(rel));
		
	}

}
