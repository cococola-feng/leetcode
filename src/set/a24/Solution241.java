package set.a24;

import java.util.ArrayList;
import java.util.List;

public class Solution241 {
	 public List<Integer> diffWaysToCompute(String input) {
		 List<Integer> res = new ArrayList<Integer>();
		 for(int i = 0; i < input.length(); i ++){
			 char ch = input.charAt(i);
			 if(ch == '+' || ch == '-' || ch == '*'){
				 String before = input.substring(0, i);
				 String after = input.substring(i + 1);
				 List<Integer> beforeRes = diffWaysToCompute(before);
				 List<Integer> afterRes = diffWaysToCompute(after);
				 for(int beforeNum : beforeRes){
					 for(int afterNum : afterRes){
						 switch(ch){
						 case '+':
							 res.add(beforeNum + afterNum);
							 break;
						 case '-':
							 res.add(beforeNum - afterNum);
							 break;
						 case '*':
							 res.add(beforeNum * afterNum);
							 break;
						 }
					 }
				 }
			 }
		 }
		 if(res.size() == 0){
			 res.add(Integer.parseInt(input));
		 }
		 return res;
	 }
}
