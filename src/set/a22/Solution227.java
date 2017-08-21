package set.a22;

import java.util.Collections;
import java.util.Stack;

public class Solution227 {
	public int calculate(String s) {
        if(s == null || s.length() == 0) return 0;
        
        char[] array = s.replace(" ", "").toCharArray();
        Stack<Integer> numbers = new Stack<Integer>();
        Stack<Character> operations = new Stack<Character>();
        StringBuffer numBuffer = new StringBuffer();
        
        for(char ch : array) {
        	if(Character.isDigit(ch)) {
        		numBuffer.append(ch);
        		continue;
        	}
        	
        	operations.add(ch);
        	if(numBuffer.length() > 0){
        		numbers.add(Integer.parseInt(numBuffer.toString()));
        		numBuffer.delete(0, numBuffer.length());
        	}
        }
        if(numBuffer.length() > 0){
        	numbers.add(Integer.parseInt(numBuffer.toString()));
        }
        
        Collections.reverse(numbers);
        Collections.reverse(operations);
        
        myCalculate(numbers, operations, true);
        
        return numbers.peek();
    }
	
	private void myCalculate(Stack<Integer> numbers, Stack<Character> operations, boolean isMain) {
		while(!operations.isEmpty()){
			char ch = operations.pop();
			if(ch == '+' || ch == '-'){
				if(!isMain){
					operations.push(ch);
					return;
				}
				int a = numbers.pop();
				if(!operations.isEmpty() && (operations.peek() == '*' || operations.peek() == '/')){
					myCalculate(numbers, operations, false);
				}
				int b = numbers.pop();
				numbers.push(ch == '+' ? a + b : a - b);
			}else{
				int a = numbers.pop();
				int b = numbers.pop();
				numbers.push(ch == '*' ? a * b : a / b);
			}
		}
	}
}
