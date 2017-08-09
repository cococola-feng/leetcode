package set.a06;

import java.util.List;

import org.junit.Test;

import common.ListNode;

public class SolutionSet6Test {

//	@Test
	public void test061() {
		Solution061 s = new Solution061();
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		ListNode rel = s.rotateRight(head, 1);
		System.out.println(rel.val);
	}
	
	@Test
	public void test068(){
		Solution068 s = new Solution068();
//		String[] array = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
//		String[] array = new String[]{""};
		String[] array = new String[]{"Listen","to","many,","speak","to","a","few."};
		List<String> rel = s.fullJustify(array, 6);
		for(String line : rel){
			System.out.println("\""+line+"\"");
		}
	}

}
