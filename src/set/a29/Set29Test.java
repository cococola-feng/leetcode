package set.a29;

import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Test;

import common.TreeNode;

public class Set29Test {

//	@Test
	public void test() {
		fail("Not yet implemented");
	}

//	@Test
	public void testPriorityQueue() {
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(2);
		queue.add(1);
		queue.add(4);
		queue.add(3);
		
		System.out.println(queue.poll());
	}
	
//	@Test
	public void testArraysCopyofRange() {
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++){
			arr[i] = i;
		}
		
		arr = Arrays.copyOfRange(arr, 0, 5);
		
		System.out.println(Arrays.toString(arr));
	}
	
//	@Test
	public void testCodec_Another() {
		TreeNode node0 = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		TreeNode node6 = new TreeNode(6);
		TreeNode node7 = new TreeNode(7);
		
		node0.left = node1;
		node0.right = node2;
		node1.left = node3;
		node2.left = node4;
		node2.right = node5;
		node4.right = node6;
		node6.right = node7;
		
		Codec_Another a = new Codec_Another();
		System.out.println(a.serialize(node0));
		
		Codec b = new Codec();
		String data = b.serialize(node0);
		System.out.println(data);
		
		TreeNode root = b.deserialize(data);
		System.out.println(b.serialize(root));
		
	}
	
//	@Test
	public void testSolution299() {
		Solution299 s = new Solution299();
		System.out.println(s.getHint("1123", "0111"));
	}
	
	@Test
	public void testsolution300() {
		Solution300 s = new Solution300();
		int[] nums = new int[]{10, 9, 2, 5, 3, 7, 101, 18};
		System.out.println(s.lengthOfLIS(nums));
	}
}
