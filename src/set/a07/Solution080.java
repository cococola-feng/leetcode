package set.a07;

import java.util.Arrays;

public class Solution080 {
	public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;
        int pre = 0;
        boolean twoMore = true;
        boolean oneMore = false;
        
        while(i < nums.length){
        	if(twoMore){
        		twoMore = false;
        		oneMore = true;
        		pre = nums[i];
        		nums[j++] = nums[i++];
        	}else if(oneMore){
        		if(nums[i] == pre){
        			oneMore = false;
        			nums[j++] = nums[i++];
        		}else{
        			twoMore = true;
        			oneMore = false;
        		}
        	}else{
        		if(nums[i] == pre){
        			i++;
        		}else{
        			twoMore = true;
        		}
        	}
        }
        
        return j;
    }
}
