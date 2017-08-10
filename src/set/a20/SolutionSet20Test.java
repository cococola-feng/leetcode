package set.a20;

import static org.junit.Assert.*;

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
	
	@Test
	public void test207() {
		int[][] depends = new int[][]{{0, 1}, {1, 0}};
		
		Solution207 s = new Solution207();
		System.out.println(s.canFinish(2, depends));
	}

}
