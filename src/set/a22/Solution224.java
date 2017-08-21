package set.a22;

import java.util.Collections;
import java.util.Stack;

public class Solution224 {
	public int calculate(String s) {
		s = s.replace(" ", "") + "\0";
		Stack<Integer> numbers = new Stack<Integer>();
		Stack<Character> operations = new Stack<Character>();
		
		char[] array = s.toCharArray();
		StringBuffer numBuffer = new StringBuffer();
		for(char c : array){
			if(c >= '0' && c <= '9'){
				numBuffer.append(c - '0');
				continue;
			}
			
			operations.push(c);
			
			if(numBuffer.length() > 0){
				numbers.push(Integer.parseInt(numBuffer.toString()));
				numBuffer.delete(0, numBuffer.length());
			}
		}
		
		Collections.reverse(numbers);
		Collections.reverse(operations);
		
		calculate(numbers, operations);
		
		return  numbers.peek();
    }
	private void calculate(Stack<Integer> numbers, Stack<Character> operations) {
		while(!operations.isEmpty()) {
			char c = operations.pop();
			if(c == '-' || c == '+'){
				int a = numbers.pop();
				if(!operations.isEmpty() && operations.peek() == '('){
					operations.pop();
					calculate(numbers, operations);
				}
				int b = numbers.pop();
				numbers.push(c == '-' ? a - b : a + b);
			}else if(c == '('){
				calculate(numbers, operations);
			}else if(c == ')'){
				break;
			}
		}
	}
}
