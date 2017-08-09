package set.a15;

import java.util.LinkedList;
import java.util.Stack;

public class MinStack {

    /** initialize your data structure here. */
	private Stack<Integer> stack = null;
	private int min = Integer.MAX_VALUE;
	
    public MinStack() {
    	stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        if(x <= min){  //Think about why = is necessary
    		stack.push(min);
        	min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
    	if(stack.pop() == min){
    		min = stack.pop();
    	}
    }
    
    public int top() {
    	return stack.peek();
    }
    
    public int getMin() {
    	return min;
    }
}
