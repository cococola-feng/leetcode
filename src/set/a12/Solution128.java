package set.a12;

import java.util.HashMap;
import java.util.Map;

public class Solution128 {
	public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        int max = 0;
        for(int value : nums){
        	if(countMap.containsKey(value)) continue;
        	int left = countMap.containsKey(value - 1) ? countMap.get(value - 1) : 0;
        	int right = countMap.containsKey(value + 1) ? countMap.get(value + 1) : 0;
        	int sum = left + right + 1;
        	countMap.put(value, sum);
        	countMap.put(value - left, sum);
        	countMap.put(value + right, sum);
        	max = Math.max(max, sum);
        }
        return max;
    }
}
