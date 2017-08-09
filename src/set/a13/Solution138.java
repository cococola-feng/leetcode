package set.a13;

import java.util.HashMap;
import java.util.Map;

import common.RandomListNode;

public class Solution138 {
	public RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) return null;
		  
		Map<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
		RandomListNode node = head;
		
		while(node != null){
			map.put(node, new RandomListNode(node.label));
			node = node.next;
		}
		
		node = head;
		while(node != null){
			map.get(node).next = map.get(node.next);
			map.get(node).random = map.get(node.random);
			node = node.next;
		}
		
		return map.get(head);
    }
}
