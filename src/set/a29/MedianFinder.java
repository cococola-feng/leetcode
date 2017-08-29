package set.a29;

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
	
	private Queue<Integer> largerQueue = null;
	private Queue<Integer> smallerQueue = null;
    /** initialize your data structure here. */
    public MedianFinder() {
    	largerQueue = new PriorityQueue<Integer>();
    	smallerQueue = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
    	if(largerQueue.size() == 0){
    		largerQueue.add(num);
    		return;
    	}
    	
    	if(num > largerQueue.peek()){
    		largerQueue.add(num);
    	}else{
    		smallerQueue.add(-num);
    	}
    	
    	if(largerQueue.size() > smallerQueue.size()){
    		smallerQueue.add(-largerQueue.poll());
    	}
    	
    	if(smallerQueue.size() > largerQueue.size() + 1){
    		largerQueue.add(-smallerQueue.poll());
    	}
    }
    
    public double findMedian() {
    	if(smallerQueue.size() == largerQueue.size()){
    		return ((double)largerQueue.peek() - (double)smallerQueue.peek()) / 2.0;
    	}else if(smallerQueue.size() > largerQueue.size()){
    		return -(double)smallerQueue.peek();
    	}else{
    		return (double)largerQueue.peek();
    	}
    }
}
