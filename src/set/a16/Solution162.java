package set.a16;

public class Solution162 {
	public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE, maxIndex = -1;
        
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] >= max){
        		max = nums[i];
        		maxIndex = i;
        	}
        }
        
        return maxIndex;
    }
}
