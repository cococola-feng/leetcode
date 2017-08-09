package set.a01;

import java.util.Arrays;

public class Solution014 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs == null || strs.length < 1){
    		return "";
    	}
    	
        while(strs.length > 1){
        	strs = filterCommonPrefix(strs);
        }
        return strs[0];
    }
    
    private String[] filterCommonPrefix(String[] strs) {
    	int len = strs.length;
    	String[] rel = new String[(len + 1) / 2];
    	int index = 0;
    	
    	for(int i = 1; i <= len; i+=2){
    		rel[index++] = commonPrefix(strs, i - 1, i);
    	}
    	
    	return rel;
    }
    
    private String commonPrefix(String[] strs, int s, int t){
    	if(t >= strs.length){
    		return strs[s];
    	}
    	
    	StringBuffer rel = new StringBuffer();
    	for(int i = 0; i < strs[s].length() && i < strs[t].length(); i++){
    		if(strs[s].charAt(i) == strs[t].charAt(i)){
    			rel.append(strs[s].charAt(i));
    		}else{
    			break;
    		}
    	}
    	
    	return rel.length() == 0 ? "" : rel.toString();
    }
}
