package set.a23;

import java.util.Stack;

public class Solution232 {
	class MyQueue {

		private Stack<Integer> stack = null;
	    /** Initialize your data structure here. */
	    public MyQueue() {
	        stack = new Stack<Integer>();
	    }
	    
	    /** Push element x to the back of queue. */
	    public void push(int x) {
	        stack.push(x);
	    }
	    
	    /** Removes the element from in front of queue and returns that element. */
	    public int pop() {
	        if(stack.isEmpty()) return -1;
	        
	        Stack<Integer> reverseStack = new Stack<Integer>();
	        while(!stack.isEmpty()){
	        	int top = stack.pop();
	        	reverseStack.push(top);
	        }
	        
	        int rel = reverseStack.pop();
	        
	        while(!reverseStack.isEmpty()){
	        	int top = reverseStack.pop();
	        	stack.push(top);
	        }
	        
	        return rel;
	    }
	    
	    /** Get the front element. */
	    public int peek() {
	    	if(stack.isEmpty()) return -1;
	        
	        Stack<Integer> reverseStack = new Stack<Integer>();
	        while(!stack.isEmpty()){
	        	int top = stack.pop();
	        	reverseStack.push(top);
	        }
	        
	        int rel = reverseStack.peek();
	        
	        while(!reverseStack.isEmpty()){
	        	int top = reverseStack.pop();
	        	stack.push(top);
	        }
	        
	        return rel;
	        
	    }
	    
	    /** Returns whether the queue is empty. */
	    public boolean empty() {
	        return stack.isEmpty();
	    }
	}
}
