package set.a03;

public class Solution038 {
	public String countAndSay(int n) {
        if (n < 0) {
        	return "";
        }
        
        String rel = "1";
        
        for (int i = 1; i < n; i ++){
        	StringBuilder sb = new StringBuilder();
        	
        	int index = 0;
        	
        	while (index < rel.length()) {
        		int count = 0;
        		char ch = rel.charAt(index);
        		
        		while(index < rel.length() && rel.charAt(index) == ch){
        			index++;
        			count++;
        		}
        		
        		sb.append(count);
        		sb.append(ch - '0');
        		
        	}
        	
        	rel = sb.toString();
        }
        
        return rel;
    }
}
