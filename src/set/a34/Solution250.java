package set.a34;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution250 {
	public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nums1Map = new HashMap<Integer, Integer>();
        List<Integer> resList = new ArrayList<Integer>();
        
        for(int num : nums1){
        	Integer value = nums1Map.get(num);
        	value = value == null ? 0 : value;
        	nums1Map.put(num, value + 1);
        }
        
        for(int num : nums2){
        	Integer value = nums1Map.get(num);
        	if(value != null){
        		resList.add(num);
        		if(value == 1){
        			nums1Map.remove(num);
        		}else{
        			nums1Map.put(num, value - 1);
        		}
        	}
        }
        
        int[] res = new int[resList.size()];
        for(int i = 0; i < resList.size(); i++){
        	res[i] = resList.get(i);
        }
        
        return res;
    }
}
