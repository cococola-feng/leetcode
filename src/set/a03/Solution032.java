package set.a03;

import java.util.Stack;

public class Solution032 {
	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		
        int max=0;
        int pre = -1;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
            	stack.push(i);            
            }else {
                if (stack.isEmpty()){
                	pre = i;
                }else{
                    stack.pop();
                     
                    if(stack.isEmpty()){
                    	max=Math.max(max, i - pre);
                    }else{
                    	max=Math.max(max, i - stack.peek());
                    }
                }
            }
        }
        
        return max;
    }
}
