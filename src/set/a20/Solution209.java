package set.a20;

public class Solution209 {
	public int minSubArrayLen(int s, int[] nums) {
		if(nums == null || nums.length == 0) return 0;
		
        int i = 0, j = 0, sum = nums[0], count = Integer.MAX_VALUE;
        
        while(true){
        	if(sum >= s){
        		count = Math.min(count, (j - i + 1));
        		sum -= nums[i];
        		i++;
        	}else{
        		j++;
        		if(j < nums.length) sum += nums[j];
        		else break;
        	}
        }
        
        return count > nums.length ? 0 : count;
    }
}
