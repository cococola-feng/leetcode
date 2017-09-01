package set.a29;

import java.util.Arrays;

public class Solution300 {
	public int lengthOfLIS(int[] nums) {
		int max = 0;
		
		if(nums == null || nums.length == 0) {
			return max;
		}
		
		int[] count = new int[nums.length];
		Arrays.fill(count, 1);
		
		for(int i = 0; i < nums.length; i++){
			for(int j = i - 1; j >= 0; j--){
				if(nums[j] < nums[i]){
					count[i] = Math.max(count[i], count[j] + 1);
				}
			}
			max = Math.max(max, count[i]);
		}
		
		return max;
    }
}
