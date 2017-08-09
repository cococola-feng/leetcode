package set.a14;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	private Map<Integer, DoubleLinkedNode> dict = null;
	private DoubleLinkedNode head = null;
	private DoubleLinkedNode tail = null;
	private int capacity = 0;
	
    public LRUCache(int capacity) {
        dict = new HashMap<Integer, DoubleLinkedNode>(capacity);
        head = new DoubleLinkedNode(-1, -1);
        tail = new DoubleLinkedNode(-1, -1);
        head.next = tail;
        tail.pre = head;
        this.capacity = capacity;
    }
    
    public int get(int key) {
        int value = -1;
        
        if(dict.containsKey(key)){
        	DoubleLinkedNode node = dict.get(key);
        	value = node.value;
        	
        	DoubleLinkedNode.removeNode(node);
        	DoubleLinkedNode.addNodeAfter(node, head);
        }
        
        return value;
    }
    
    public void put(int key, int value) {
    	DoubleLinkedNode node = null;
    	
    	if(dict.containsKey(key)){
    		node = dict.get(key);
    		DoubleLinkedNode.removeNode(node);
    		node.value = value;
    	}else{
    		node = new DoubleLinkedNode(key, value);
    	}
    	
    	DoubleLinkedNode.addNodeAfter(node, head);
    	dict.put(key, node);
    	
    	if(dict.size() > capacity){
    		node = tail.pre;
    		dict.remove(node.key);
    		DoubleLinkedNode.removeNode(node);
    	}
    }
	
	
	
	
	private static class DoubleLinkedNode{
		private int key;
		private int value;
		private DoubleLinkedNode pre;
		private DoubleLinkedNode next;
		
		private DoubleLinkedNode(int key, int value){
			this.key = key;
			this.value = value;
		}
		
		private static void addNodeAfter(DoubleLinkedNode node, DoubleLinkedNode preNode){
			if(preNode != null && node != null){
				node.next = preNode.next;
				node.pre = preNode;
				preNode.next.pre = node;
				preNode.next = node;
			}
		}
		
		private static void removeNode(DoubleLinkedNode node){
			DoubleLinkedNode preNode = null;
			DoubleLinkedNode nextNode = null;
			
			if(node == null)
				return;
			
			preNode = node.pre;
			nextNode = node.next;
			
			if(preNode == null || nextNode == null)
				return;
			
			preNode.next = nextNode;
			nextNode.pre = preNode;
		}
		
		public String toString() {
			return "<" + key + ", " + value + ">";
		}
	}
}
