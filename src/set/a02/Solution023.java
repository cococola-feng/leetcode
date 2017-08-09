package set.a02;

import common.ListNode;

public class Solution023 {
	public ListNode mergeKLists(ListNode[] lists) {
		return partition(lists, 0, lists.length - 1);
	}

	private ListNode partition(ListNode[] lists, int i, int j) {
		if (i == j) {
			return lists[i];
		}
		
		if (i < j){
			int m = (i + j)/2;
			ListNode l1 = partition(lists, i, m);
			ListNode l2 = partition(lists, m + 1, j);
			return merge(l1, l2);
		}
		
		return null;
	}

	private ListNode merge(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			l1.next = merge(l1.next, l2);
			return l1;
		} else {
			l2.next = merge(l1, l2.next);
			return l2;
		}
	}
	/*
	 * private static int SOMEDAY = 0; private static int FOREVER = 0; private
	 * static int love = 0;
	 * 
	 * 
	 * 
	 * 
	 * public static void main (String[] args){
	 * 
	 * 
	 * 
	 * for(int day = SOMEDAY; day < FOREVER; day++) { love++; } //情不知所起，一往而深
	 * 
	 * for(int day = SOMEDAY; day < FOREVER; day++); { love++; } //死了這條心吧，永遠不會愛你
	 * 
	 * 
	 * 
	 * }
	 */
}
