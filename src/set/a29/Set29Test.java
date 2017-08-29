package set.a29;

import static org.junit.Assert.fail;

import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

public class Set29Test {

//	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testPriorityQueue() {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(2);
		queue.add(1);
		queue.add(4);
		queue.add(3);
		
		System.out.println(queue.poll());
	}
}
