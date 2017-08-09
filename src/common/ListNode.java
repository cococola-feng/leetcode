package common;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode(int x) {
		val = x;
	}

	public static void print(ListNode head) {
		while (head != null) {
			System.out.println(head.val);
			head = head.next;
		}
	}
	
	public static ListNode create(int[] array){
		ListNode res = null;
		ListNode tail = null;
		if(array != null){
			for(int i : array){
				ListNode node = new ListNode(i);
				if(res == null){
					res = node;
				}
				if(tail != null){
					tail.next = node;
				}
				tail = node;
			}
		}
		return res;
	}
	
	public String toString() {
		return ""+val;
	}
}
