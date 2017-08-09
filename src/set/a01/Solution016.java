package set.a01;

import java.util.Arrays;

public class Solution016 {
	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);

		int min = Integer.MAX_VALUE;
		int val = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				
				if( sum < target){
					left++;
				}else{
					right--;
				}
				
				if ( Math.abs(sum - target) < min ){
					min = Math.abs(sum - target);
					val = sum;
				}
			}
		}
		
		return val;

	}
}
