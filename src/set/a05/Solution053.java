package set.a05;

public class Solution053 {
	public int maxSubArray(int[] nums) {
		int index = 0, max = nums[0], pre = nums[0];
        while(++index < nums.length) max = Math.max(max, pre = Math.max(nums[index], pre + nums[index]));
        return max;
    }
}
