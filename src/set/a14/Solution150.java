package set.a14;

import java.util.Stack;

public class Solution150 {
	public int evalRPN(String[] tokens) {
		if (tokens == null) {
			return 0;
		}

		Stack<Integer> stack = new Stack<Integer>();
		
		for(String token : tokens){
			if(isOperator(token)){
				int y = stack.pop();
				int x = stack.pop();
				
				int rel = compute(x, y, token);
				stack.push(rel);
			}else{
				stack.push(Integer.parseInt(token));
			}
		}
		
		return stack.peek();
	}

	private boolean isOperator(String str) {
		return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
	}

	private int compute(int x, int y, String operator){
		if (operator == null || operator.length() != 1) {
			return -1;
		}

		char ch = operator.charAt(0);
		switch (ch) {
		case '+':
			return x + y;
		case '-':
			return x - y;
		case '*':
			return x * y;
		case '/':
			return x / y;
		}
		
		return -1;
	}
}
