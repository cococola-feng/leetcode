package set.a04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution049 {
	public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> rel = new ArrayList<List<String>>();
       Map<String, List<String>> map = new HashMap<String, List<String>>();
       
       for(String str : strs){
    	   String featrue = getFeatrue(str);
    	   
    	   if(!map.containsKey(featrue)){
    		   map.put(featrue, new ArrayList<String>());
    	   }
    	   
    	   map.get(featrue).add(str);
       }
       
       for(List<String> list : map.values()){
    	   rel.add(list);
       }
       
       return rel;
    }
	
	private String getFeatrue(String str){
		char[] array = str.toCharArray();
		Arrays.sort(array);
		return new String(array);
	}
}
