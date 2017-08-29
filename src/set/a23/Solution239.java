package set.a23;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Solution239 {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if(nums == null || nums.length == 0 || k == 0) return new int[0];
		
        Map<Integer, Integer> windowMap = new HashMap<Integer, Integer>();
        TreeSet<Integer> windowSet = new TreeSet<Integer>();
        int[] rel = new int[nums.length - k + 1];
        int relIndex = 0;
        
        for(int i = 0; i < k; i++){
        	Integer value = windowMap.get(nums[i]);
        	if(value == null){
        		windowMap.put(nums[i], 1);
        		windowSet.add(nums[i]);
        	}else{
        		windowMap.put(nums[i], value + 1);
        	}
        }
        
        rel[relIndex++] = windowSet.last();
        
        for(int i = k; i < nums.length; i++){
        	//Remove i - k
        	Integer value = windowMap.get(nums[i - k]);
        	if(value == 1){
        		windowMap.remove(nums[i - k]);
        		windowSet.remove(nums[i - k]);
        	}else{
        		windowMap.put(nums[i - k], value - 1);
        	}
        	
        	//Add nums[i]
        	value = windowMap.get(nums[i]);
        	if(value == null){
        		windowMap.put(nums[i], 1);
        		windowSet.add(nums[i]);
        	}else{
        		windowMap.put(nums[i], value + 1);
        	}
        	
        	//Add the max value
        	rel[relIndex++] = windowSet.last();
        }
        
        return rel;
    }
}
