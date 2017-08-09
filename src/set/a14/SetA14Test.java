package set.a14;

import org.junit.Test;

import common.ListNode;
import common.Point;

public class SetA14Test {

//	@Test
	public void test143() {
		Solution143 s = new Solution143();
		ListNode head = ListNode.create(new int[]{1,2,3,4});
		s.reorderList(head);
		ListNode.print(head);
	}
	
//	@Test
	public void test143_Fast() {
		Solution143_Fast s = new Solution143_Fast();
		ListNode head = ListNode.create(new int[]{1,2,3,4,5});
		s.reorderList(head);
		ListNode.print(head);
	}
	
//	@Test
	public void testLRU() {
		LRUCache lru = new LRUCache(2);
		lru.put(1, 1);
		lru.put(2, 2);
		System.out.println(lru.get(1));
		lru.put(3, 3);
		System.out.println(lru.get(2));
	}
//	@Test
	public void test146() {
		ListNode head = ListNode.create(new int[]{5, 3, 4, 1, 2});
		Solution146 s = new Solution146();
		head = s.insertionSortList(head);
		ListNode.print(head);
	}
//	@Test
	public void test149_1() {
		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 1);
		Point p4 = new Point(1, 3);
		
		Point[] points = new Point[]{p1, p2, p3, p4};
		
		Solution149 s = new Solution149();
		System.out.println(s.maxPoints(points));
	}
	
	@Test
	public void test149_2() {
		Point p1 = new Point(3, 10);
		Point p2 = new Point(0, 2);
		Point p3 = new Point(0, 2);
		Point p4 = new Point(3, 10);
		
		Point[] points = new Point[]{p1, p2, p3, p4};
		
		Solution149 s = new Solution149();
		System.out.println(s.maxPoints(points));
	}

}
