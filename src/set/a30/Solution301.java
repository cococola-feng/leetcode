package set.a30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution301 {
	/**
	 * "()())()" -> ["()()()", "(())()"]
	 *"(a)())()" -> ["(a)()()", "(a())()"]
	 *")(" -> [""]
	 */
	
	public List<String> removeInvalidParentheses(String s) {
        List<String> res = new ArrayList<String>();
        
        int begin = 0, end = s.length() - 1;
        
        while(begin < s.length() && s.charAt(begin) == ')'){
        	begin++;
        }
        
        while(end >= 0 && s.charAt(end) == '('){
        	end--;
        }
        
        s = end >= begin ? s.substring(begin, end + 1) : "";
        
        if(s.length() == 0){
        	res.add("");
        	return res;
        }
        
        int countLeft = 0, countRight = 0;
        
        for(char ch : s.toCharArray()){
        	if(ch == '('){
        		countLeft++;
        	}else if(ch == ')'){
        		countRight++;
        	}
        }
        
        int count = countLeft - countRight;
        
        Set<String> resSet = new HashSet<String>();
        findInvalidParentheses(s, 0, count, resSet);
        
        res.addAll(resSet);
        
        return res;
    }
	
	private void findInvalidParentheses(String parentheses, int index, int count, Set<String> rel){
		if(index > parentheses.length()){
			return;
		}
		
		if(count == 0){
			int validCount = 0;
			for(char ch : parentheses.toCharArray()){
				if(ch == '('){
					validCount++;
				}else if(ch == ')'){
					validCount--;
				}
				if(validCount<0){
					break;
				}
			}
			if(validCount < 0){
				parentheses = parentheses.replaceAll("[\\(\\)]", "");
			}
			
			rel.add(parentheses);
			
			return;
		}
		
		char targetChar = count > 0 ? '(' : ')';
		
		index = parentheses.indexOf(targetChar, index);
		
		if(index >= 0){
			findInvalidParentheses(parentheses, index + 1, count, rel);
			findInvalidParentheses(new StringBuffer(parentheses).deleteCharAt(index).toString(), index, count < 0 ? count + 1 : count - 1, rel);		
		}
		
	}
}
