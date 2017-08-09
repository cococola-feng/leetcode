package set.a07;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution071 {
	public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        
        List<String> elems = splitString(path);
        for(String elem : elems){
        	if(elem.length() > 0){
        		if(elem.equals("..")){
        			if(stack.size() > 0){
        				stack.pop();
        			}
        		}else if(!elem.equals(".")){
        			stack.push(elem);
        		}
        	}
        }
        
        StringBuilder rel = new StringBuilder();
        rel.append("/");
        if(stack.size() > 0){
	        for(String elem : stack){
	        	rel.append(elem);
	        	rel.append("/");
	        }
        }else if(elems.size() > 0){
        	rel.append("/");
        }
        rel.deleteCharAt(rel.length() - 1);
        return rel.toString();
    }
	
	private List<String> splitString(String str){
		List<String> rel = new ArrayList<String>();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) == '/'){
				rel.add(sb.toString());
				sb.delete(0, sb.length());
			}else{
				sb.append(str.charAt(i));
			}
		}
		rel.add(sb.toString());
		rel.remove(0);
		return rel;
	}
}
