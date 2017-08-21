package set.a22;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	
	private Queue<Integer> queue = null;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<Integer>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
    	int rel = 0;
        Queue<Integer> copy = new LinkedList<Integer>();
        while(!queue.isEmpty()){
        	rel = queue.poll();
        	if(queue.isEmpty()){
        		queue = copy;
        		break;
        	}else{
        		copy.add(rel);
        	}
        }
        return rel;
    }
    
    /** Get the top element. */
    public int top() {
        int rel = pop();
        push(rel);
        return rel;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
