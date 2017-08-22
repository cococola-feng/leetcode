package set.a22;

import java.util.ArrayList;
import java.util.List;

public class Solution229_Failed {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> rel = new ArrayList<Integer>();
		
		if(nums == null || nums.length == 0) return rel;
		int candidate0 = 0, candidate1 = 1;
		int count0 = 0, count1 = 0;
		
        for(int num : nums){
        	if(num == candidate0){
        		count0++;
        	}else if(num == candidate1){
        		count1++;
        	}else{
        		count0--;
        		count1--;
        	}
        	
        	if(count0 <= 0){
        		candidate0 = num;
        	}else if(count1 <= 0){
        		candidate1 = num;
        	}
        }
        
        count0 = count1 = 0;
        for(int num : nums){
        	if(num == candidate0) count0++;
        	if(num == candidate1) count1++;
        }
        
        if(count0 >= nums.length / 3) rel.add(candidate0);
        if(count1 >= nums.length / 3) rel.add(candidate1);
        
        return rel;
    }
}
