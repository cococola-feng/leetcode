package set.a23;

import java.util.Arrays;

public class Solution238 {
	public int[] productExceptSelf(int[] nums) {
        long product = 1;
        boolean containsZero = false;
        boolean containsSecondZero = false;
        
        for(int i : nums){
        	if(i != 0){
        		product *= (long)i;
        	}else{
        		if(!containsZero){
        			containsZero = true;
        		}else{
        			containsSecondZero = true;
        		}
        	}
        }
        
        if(containsSecondZero){
        	Arrays.fill(nums, 0);
        	return nums;
        }
        
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 0){
        		nums[i] = (int)product;
        	}else{
        		if(containsZero){
        			nums[i] = 0;
        		}else{
        			nums[i] = (int)(product / (long)nums[i]);
        		}
        	}
        }
        
        return nums;
    }
}
