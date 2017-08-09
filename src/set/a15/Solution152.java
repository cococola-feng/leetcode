package set.a15;

public class Solution152 {
	public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0){
        	return 0;
        }
        
        int max, min, rel;
        max = min = rel = nums[0];
        
        for(int i = 1; i < nums.length; i++){
        	int copyMax = max;
        	max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
        	min = Math.min(Math.min(copyMax * nums[i], min * nums[i]), nums[i]);
        	rel = Math.max(max, rel);
        }
        
        return rel;
    }
}
