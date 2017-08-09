package set.a01;

import java.util.Stack;

public class Solution020 {
	public boolean isValid(String s) {
        Stack<Character> stack1= new Stack<Character>();
        Stack<Character> stack2= new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++){
        	stack1.push(s.charAt(i));
        }
        
        while(stack1.size() != 0){
        	char c = stack1.pop();
        	
        	if (c == ')' || c == ']' || c == '}'){
        		stack2.push(c);
        	}else{
        		if(stack2.size() == 0){
        			return false;
        		}
        		
        		char d = stack2.pop();
        		
        		if (c == '(' && d != ')' || c == '[' && d != ']' || c == '{' && d != '}'){
        			return false;
        		}
        	}
        }
        
        return stack2.size() == 0;
    }
}
