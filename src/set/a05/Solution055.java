package set.a05;

public class Solution055 {
	public boolean canJump(int[] nums) {
		int end = 0, index = -1;
		while(++index <= end && index < nums.length) end = Math.max(end, index + nums[index]);
		return index==nums.length;
    }
}
